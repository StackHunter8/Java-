                    CONTROL STATEMENTS
                           │
             ┌─────────────┼─────────────┐
             ↓             ↓             ↓
        DECISION        LOOPING        JUMP
        MAKING         STATEMENTS    STATEMENTS
             │             │             │
       ┌─────┼─────┐   ┌───┼────┐    ┌───┼────┐
       ↓     ↓     ↓   ↓   ↓    ↓    ↓   ↓    ↓
      if   switch   ... for while do  break continue return
       │
       ├── if
       ├── if-else
       ├── else-if
       └── nested-if

    1. DECISION-MAKING STATEMENTS

       1. if
            The fundamental idea:
            If a condition is true, execute a particular block of code.
            Syntax 
                if (condition) {
                         statement;
                }

                Example
                int age = 20;

                if (age >= 18) {
                    System.out.println("Adult");
                }

                Execution
                 Java evaluates:

                age >= 18
                20 >= 18
                ↓
                true
                ↓
                execute block

                If the condition is false:

                false
                ↓
                skip block
                ↓
                continue with next statement
                Important rule

                The condition inside if must produce a boolean.

                Valid:

                if (age > 18)
                if (age == 18)
                if (isActive)
                if (a > b && b > 0)

                Invalid:

                if (10)       // ❌
                if (5.5)      // ❌
                if ("hello")  // ❌

                Unlike some languages, Java does not treat 0 as false and 1 as true.

         2. if-else
           - Used when there are exactly two possible paths.
                Syntax 
                if (condition) {
                    // true path
                } else {
                    // false path
                }

                Example:

                int number = 7;

                if (number % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

                Execution:

                7 % 2 == 0
                    ↓
                false
                    ↓
                else
                    ↓
                Odd
                Key concept

                Exactly one of the two blocks executes.

                            condition
                            /       \
                        true       false
                        ↓           ↓
                        IF         ELSE       
        3. else-if
          -Use this when there are multiple mutually exclusive conditions.
            Syntax
                if (condition1) {

                } else if (condition2) {

                } else if (condition3) {

                } else {

                }

            Example:

                    int marks = 82;

                    if (marks >= 90) {
                        System.out.println("A");
                    } else if (marks >= 75) {
                        System.out.println("B");
                    } else if (marks >= 60) {
                        System.out.println("C");
                    } else {
                        System.out.println("D");
                    }

                    Java checks top → bottom.

                    For 82:

                    82 >= 90 → false
                    82 >= 75 → true
                                ↓
                                B

                    After finding the first true condition, Java doesn't check the remaining else-ifs.

                    Very important

                    Consider:

                    int marks = 95;

                    if (marks >= 60) {
                        System.out.println("C");
                    } else if (marks >= 90) {
                        System.out.println("A");
                    }

                    Output:

                    C

                    Why?

                    Because Java doesn't ask:

                    "Which condition is the best?"

                    It asks:

                    "Is this condition true?"

                    The first one is already true.

                    Therefore ordering matters.                

         4. Nested if
            -An if inside another if.
            Syntax
               if (condition1) {

                    if (condition2) {

                    }

                }

            Example:

            int age = 22;
            boolean hasID = true;

            if (age >= 18) {

                if (hasID) {
                    System.out.println("Entry allowed");
                }

            }

            The inner if is checked only if the outer if is true.

            Think:

            age >= 18?
                │
            false ─────→ STOP
                │
            true
                ↓
            hasID?
                │
            false ─────→ STOP
                │
            true
                ↓
            Entry allowed
            Nested if vs &&

            These can sometimes accomplish the same thing.

            Nested:

            if (age >= 18) {
                if (hasID) {
                    System.out.println("Allowed");
                }
            }

            Using &&:

            if (age >= 18 && hasID) {
                System.out.println("Allowed");
            }

            For simple conditions, && is often cleaner.

            But nested if becomes useful when the second decision depends on the first decision and has additional logic. 

        5. switch
            switch is useful when you're comparing one expression against multiple fixed values.

                Example:

                int day = 3;

                switch (day) {

                    case 1:
                        System.out.println("Monday");
                        break;

                    case 2:
                        System.out.println("Tuesday");
                        break;

                    case 3:
                        System.out.println("Wednesday");
                        break;

                    default:
                        System.out.println("Invalid");
                }

                Output:

                Wednesday
                How it works

                Java evaluates:

                switch (day)

                day = 3.

                Then searches for:

                case 3

                and executes its statements.

                ⚠️ break inside switch

                This is extremely important.

                Without break:

                int day = 2;

                switch (day) {

                    case 1:
                        System.out.println("Monday");

                    case 2:
                        System.out.println("Tuesday");

                    case 3:
                        System.out.println("Wednesday");
                }

                Output:

                Tuesday
                Wednesday

                Why?

                Because after entering case 2, Java continues executing subsequent cases.

                This is called fall-through.

                With break:

                case 2:
                    System.out.println("Tuesday");
                    break;

                execution exits the switch.

                default

                default executes when no case matches.

                int day = 10;

                switch (day) {

                    case 1:
                        System.out.println("Monday");
                        break;

                    case 2:
                        System.out.println("Tuesday");
                        break;

                    default:
                        System.out.println("Invalid day");
                }

                Output:

                Invalid day

                default is similar to the else part of an if-else structure.

                switch vs if-else
                Use if-else when:

                Conditions involve ranges or complex expressions:

                if (marks >= 90)
                if (age >= 18 && hasID)
                if (salary > 50000)
                Use switch when:

                One value is being compared against fixed choices:

                day == 1
                day == 2
                day == 3      


PART 2 — LOOPING STATEMENTS 🔄

Now we enter the most important section for DSA.

Loops allow us to execute code repeatedly.

The three main loops:

for
while
do-while