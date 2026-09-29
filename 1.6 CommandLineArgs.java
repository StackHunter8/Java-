1. What is a Command Line Argument?

A command line argument is a value that we give to a Java program when we start/run the program.

For example, suppose we have:

class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}

Compile it:

javac Main.java

Then run it with:

java Main Parnika

Here:

java Main Parnika
         ↑
    command line argument

The value Parnika is given to the program at the time of execution.

The output will be:

Parnika
2. Where does Parnika go?

This is the most important concept.

When you run:

java Main Parnika

Java takes:

Parnika

and puts it inside the args array.

Conceptually:

java Main Parnika
          ↓
       args[]
          ↓
    ┌────────────┐
    │ "Parnika"  │
    └────────────┘
       args[0]

So:

args[0]

contains:

"Parnika"
3. Why is args an array?

Because you can give multiple arguments.

For example:

java Main Parnika 22 India

Now Java stores them like this:

args[0] → "Parnika"
args[1] → "22"
args[2] → "India"

So:

System.out.println(args[0]);
System.out.println(args[1]);
System.out.println(args[2]);

produces:

Parnika
22
India
Important:

The arguments are stored as Strings.

Even though 22 looks like a number:

args[1]

contains:

"22"

not:

22
4. Why String[] args?

Let's break it apart:

String[] args
String

Each command line argument is initially stored as a String.

[]

Means it is an array.

args

This is simply the reference variable name.

So:

String[] args

means:

args is a reference variable that refers to an array of Strings.

You could technically write:

public static void main(String[] abc)

and it would still work.

Then you'd use:

abc[0]

instead of:

args[0]

args is simply the conventional name.

5. What is args.length?

Suppose you run:

java Main Parnika 22 India

There are 3 arguments.

Therefore:

args.length

is:

3

Remember:

args[0] → first argument
args[1] → second argument
args[2] → third argument

args.length → total number of arguments

And just like normal arrays, indexing starts from 0.

6. Command Line Arguments vs Scanner

This is an important comparison.

Scanner
Scanner sc = new Scanner(System.in);

String name = sc.nextLine();

The program starts first and then asks the user for input.

Run program
     ↓
Program asks for input
     ↓
User types input
Command Line Arguments
java Main Parnika

The input is provided while starting the program.

Argument provided
       ↓
Program starts
       ↓
main() receives args

So:

Scanner → input during program execution

Command line arguments → input provided when launching the program

7. But what if I want an integer?

Here's an important point.

Suppose:

java Main 25

Then:

args[0]

is:

"25"

It is a String.

If you want an int:

int age = Integer.parseInt(args[0]);

Now:

"25"
   ↓
Integer.parseInt()
   ↓
25

So:

class Main {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);

        System.out.println(age);
    }
}

Run:

java Main 25

Output:

25
8. Multiple arguments example

Suppose:

java Main Parnika 22 87.5

Then:

args[0] = "Parnika"
args[1] = "22"
args[2] = "87.5"

We can convert the numeric values:

String name = args[0];

int age = Integer.parseInt(args[1]);

double marks = Double.parseDouble(args[2]);

Now:

name  → "Parnika"
age   → 22
marks → 87.5
9. One very important error ⚠️

Suppose you run:

java Main Parnika

There is only:

args[0]

If you try:

System.out.println(args[1]);

Java will throw:

ArrayIndexOutOfBoundsException

because args[1] doesn't exist.

Visualize:

args

index:     0
           ↓
        Parnika

Trying:

args[1]

means you're asking for something outside the array.

10. The complete mental model 🧠

When you run:

java Main Parnika 22 India

think:

             Command line
                  ↓
      java Main Parnika 22 India
                  ↓
              main(args)
                  ↓
        ┌───────────────────┐
args →  │ 0 │ 1 │ 2         │
        ├───────────────────┤
        │ P │22 │India       │
        └───────────────────┘
          ↓   ↓    ↓
       args[0][1] [2]

And remember:

Command line arguments are always received as Strings and stored in the String[] args array.

Once this is clear, we'll do a few very small examples and dry runs, then I'll give you your 10-question assignment (Easy → Moderate → High).

Let's understand what happens inside main()

Consider:

class Main {
    public static void main(String[] args) {

        System.out.println(args.length);
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}

Now run:

java Main Parnika 22
Step 1 — JVM starts main()

The JVM creates/provides the command-line argument array conceptually like:

args
 ↓
┌───────────────┐
│ "Parnika"     │ ← index 0
│ "22"          │ ← index 1
└───────────────┘

Therefore:

args.length

→ 2

args[0]

→ "Parnika"

args[1]

→ "22"

So output:

2
Parnika
22
🧠 One thing I want you to notice

Even though we typed:

java Main Parnika 22

Java does not automatically understand 22 as an integer.

It receives:

"22"

That's why this:

int age = args[1];

❌ doesn't compile.

But this:

int age = Integer.parseInt(args[1]);

✅ works.

Quick dry run for you

What will this program print?

class Main {
    public static void main(String[] args) {

        System.out.println(args.length);
        System.out.println(args[0] + args[1]);

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(a + b);
    }
}

Run:

java Main 10 20

Tell me the exact output line by line, and I'll check it.

o/p
2
1020
30
