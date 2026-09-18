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

1.for Loop

Basic syntax:

for (initialization; condition; update) {
    // body
}

Example:

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

Output:

1
2
3
4
5
Understand the execution order

This is extremely important:

initialization
      ↓
  condition
      ↓
    true?
   /    \
 yes     no
  ↓       ↓
 body    STOP
  ↓
 update
  ↓
condition

For the example:

i = 1
 ↓
1 <= 5 → true → print 1
 ↓
i++
 ↓
i = 2
 ↓
2 <= 5 → true
 ↓
print 2
...

Eventually:

i = 6
6 <= 5 → false
      ↓
     STOP


2.while Loop

Syntax:

while (condition) {
    // body
}

Example:

int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}

Output:

1
2
3
4
5
Important difference

while is especially useful when you don't know beforehand exactly how many times the loop should execute.

Example:

while (number != 0) {
    ...
}

This is very common in DSA for:

digit extraction
repeated division
processing input until a condition changes
linked-list traversal
simulation problems 

do-while

Syntax:

do {
    // body
} while (condition);

Example:

int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);

Output:

1
2
3
4
5
The BIG difference

while checks the condition before executing.

do-while executes the body first, then checks.

Consider:

int i = 10;

while (i < 5) {
    System.out.println("Hello");
}

Output:

nothing

Because:

10 < 5 → false

The body never executes.

But:

int i = 10;

do {
    System.out.println("Hello");
} while (i < 5);

Output:

Hello

Because the body executes at least once.

Golden rule

while → 0 or more times
do-while → 1 or more times

for vs while vs do-while
| Loop       | Condition checked | Minimum executions | Common use                       |
| ---------- | ----------------- | -----------------: | -------------------------------- |
| `for`      | Before            |                  0 | Known/reasonable iteration count |
| `while`    | Before            |                  0 | Condition-controlled repetition  |
| `do-while` | After             |                  1 | Must execute at least once       |


PART 3 — JUMP STATEMENTS
Now we control the loop's execution directly.

1.break

break means:

Immediately exit the nearest loop or switch.

Example:

for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}

Output:

1
2
3
4

When:

i == 5

break executes.

The loop terminates immediately.

1 → 2 → 3 → 4 → 5
                  ↓
                BREAK
                  ↓
                EXIT
DSA use

Very common when searching:

for (...) {
    if (arr[i] == target) {
        break;
    }
}

Once we find what we need, there's no reason to continue.

2. continue

continue means:

Skip the current iteration and move to the next iteration.

Example:

for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}

Output:

1
2
4
5

At i = 3:

continue
   ↓
skip remaining body
   ↓
next iteration
Difference
break
  ↓
EXIT LOOP COMPLETELY

continue
  ↓
SKIP CURRENT ITERATION
  ↓
CONTINUE LOOP

This distinction is extremely important.

⚠️ continue + while loop

This is a common beginner trap.

Consider:

int i = 1;

while (i <= 5) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
    i++;
}

This creates an infinite loop.

Why?

When i == 3:

continue
 ↓
skip i++
 ↓
i remains 3
 ↓
condition still true
 ↓
continue again
 ↓
...

So with while, always be careful about updating the loop variable before continue.

For example:

while (i <= 5) {

    if (i == 3) {
        i++;
        continue;
    }

    System.out.println(i);
    i++;
}

3. return

return is slightly different.

It exits the current method.

Example:

public static void test() {

    System.out.println("A");

    return;

    // System.out.println("B"); // unreachable
}

Output:

A

When return executes:

method execution
       ↓
    RETURN
       ↓
method ends

If the method returns a value:

static int add(int a, int b) {
    return a + b;
}

return does two things:

exits the method
sends a value back to the caller
int result = add(10, 20);

result becomes 30.

🔥 break vs continue vs return

This is worth memorizing:

break
 ↓
exit loop/switch

continue
 ↓
skip current iteration

return
 ↓
exit entire method

Example:

for (...) {

    if (...) {
        break;
    }

    if (...) {
        continue;
    }

    if (...) {
        return;
    }
}

Their scopes are different.


PART 4 — NESTING

Control statements can be placed inside each other.

For example:

for (int i = 1; i <= 3; i++) {

    if (i % 2 == 0) {
        System.out.println("Even");
    } else {
        System.out.println("Odd");
    }
}

Output:

Odd
Even
Odd

And loops can be nested:

for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 3; j++) {
        System.out.println(i + " " + j);
    }
}

This is called a nested loop.

Nested loops are extremely important in DSA because they appear in:

pattern problems
matrix problems
2D arrays
brute-force solutions
pair/triplet problems
sorting algorithms


PART 5 — INFINITE LOOPS

A loop whose condition never becomes false.

Example:

while (true) {
    System.out.println("Hello");
}

This runs forever unless something inside causes it to exit.

Another:

for (;;) {
    System.out.println("Hello");
}

for (;;) is also an infinite loop.

Usually we combine it with break:

while (true) {

    if (condition) {
        break;
    }
}

PART 6 — LOOP CONTROL WITH MULTIPLE VARIABLES

Java allows:

for (int i = 0, j = 10; i < j; i++, j--) {
    System.out.println(i + " " + j);
}

This can be useful for problems involving two pointers.

You'll encounter this heavily in DSA.


PART 7 — SCOPE OF VARIABLES

This is another important concept.

for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

Here i exists only inside the for loop.

You cannot do:

System.out.println(i); // ❌

outside the loop.

But:

int i;

for (i = 0; i < 5; i++) {
    ...
}

System.out.println(i);

Here i was declared outside, so it remains accessible afterward.

This concept is called variable scope.

PART 8 — A VERY IMPORTANT DSA CONNECTION

Control statements are the foundation of almost every DSA algorithm.

For example, finding the maximum:

int max = arr[0];

for (int i = 1; i < arr.length; i++) {

    if (arr[i] > max) {
        max = arr[i];
    }
}

This single piece of code uses:

for loop
   +
if statement
   +
relational operator
   +
assignment

So the topics you've learned are starting to combine.

Another example: count even numbers.

int count = 0;

for (int i = 0; i < arr.length; i++) {

    if (arr[i] % 2 == 0) {
        count++;
    }
}

Here we combine:

for
if
%
==
++

That's exactly why we're learning these fundamentals before jumping deeply into DSA.

🧠 Complete Control Statement Cheat Sheet
IF
→ execute code when condition is true

IF-ELSE
→ choose between two paths

ELSE-IF
→ choose among multiple conditions

NESTED IF
→ condition inside another condition

SWITCH
→ choose among fixed values

FOR
→ repeat with initialization, condition, update

WHILE
→ repeat while condition remains true

DO-WHILE
→ execute at least once, then check condition

BREAK
→ completely exit nearest loop/switch

CONTINUE
→ skip current iteration

RETURN
→ exit current method, optionally return a value
