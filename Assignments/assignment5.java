// Q1. What is I/O?

// Explain:

// What does Input mean?
// What does Output mean?
// Give one Java example of each.

// answer 
//     input is anything that the java receives from the keyboard output is anything that java shows on console after executing the program. 
//     Enter input = 22 here 22 is the input. output = System.out.println("heloo")




// Q2. What is System.in?

// Explain what this statement means:

// System.in

// Also tell me:

// What is System?
// What is in?
// What is the type of in?
// What is System.in generally connected to?

// answer
//     1.System is a class
// 2.in is the static field in the system class
// 3.InputStream
// 4 . System.in isan reference of InputStream generally connected to keyboard/standard input when you're running a normal console program.


// Q3. Scanner basics

// What will this code do?

// Scanner sc = new Scanner(System.in);
// int age = sc.nextInt();
// System.out.println(age);

// Explain step-by-step what happens when the user enters:

// 22

// When the user enters `22` through the keyboard, the input is received through `System.in`, which is an `InputStream`.

// ```java
// Scanner sc = new Scanner(System.in);
// ```

// creates a Scanner object and passes `System.in` to it as the input source.

// Then:

// ```java
// int age = sc.nextInt();
// ```

// Scanner reads the input and interprets it as an `int`, so `age` becomes `22`.

// Finally:

// ```java
// System.out.println(age);
// ```

// uses `System.out` and `println()` to display `22` on the console.

// **Flow:**

// ```text
// Keyboard → System.in → Scanner → nextInt() → age = 22 → System.out.println()
// ```


// Q4. Identify the parts

// Break this statement into its individual components:

// Scanner sc = new Scanner(System.in);

// Explain:

// Scanner
// sc
// new
// Scanner(System.in)
// System.in

// Answer 

// Scanner is the class 
// sc  is the reference variable
// new keyword is used to create the Object of the Scanner class.
// Scanner(System.in) here the input stream System.in is passed to the Scanner constructor
// System.in here it represents the input stream collected through the keyboard.


// Q5. next() vs nextLine()

// Suppose the user enters:

// Hello World

// What will these return?

// sc.next();

// and

// sc.nextLine();

// Explain the difference.

// Answer
// sc.next will return Hello.
// sc.nextLine() will retuen Hello World.

// difference:
// sc.next() → reads the next token/word, stopping at whitespace.
// sc.nextLine() → reads the entire line, including spaces.

// Q6. Find the output
// Scanner sc = new Scanner(System.in);

// int a = sc.nextInt();
// int b = sc.nextInt();

// System.out.println(a + b);

// Input:

// 10 20

// What is the output?
// 30


// Q7. Scanner data types

// Write the appropriate Scanner method for each:

// Data type	Scanner method
// int	?
// long	?
// double	?
// float	?
// boolean	?
// String — one word	?
// String — complete line	?

// answer 
// 1.nextInt()
// 2.nextLong()
// 3.nextDouble()
// 4.nextFloat()
// 5.nextBoolean()
// 6.next()
// 7.nextLine()

// Q8. Scanner newline problem ⭐

// What will happen here?

// Scanner sc = new Scanner(System.in);

// int age = sc.nextInt();
// String name = sc.nextLine();

// System.out.println(age);
// System.out.println(name);

// Input:

// 22
// Parnika

// Will name contain "Parnika"?

// Explain why or why not.

// Answer 
//    nextInt() reads 22 but leaves the newline (\n) in the input buffer. Then nextLine() encounters that remaining newline and returns the empty string.
//    User types:
// 22\nParnika\n

// nextInt()
//    ↓
// reads: 22
// leaves: \n

// nextLine()
//    ↓
// sees: \n
//    ↓
// returns: ""

// Q9. Fix Q8

// Rewrite the code so that both values are correctly read:

// 22
// Parnika

// Expected output:

// 22
// Parnika


// Answer

// Scanner sc = new Scanner(System.in);

// int age = sc.nextInt();
// sc.nextLine();    // consumes the leftover \n
// String name = sc.nextLine();

// System.out.println(age);
// System.out.println(name);


// Q10. Scanner calculation

// Write a program that takes:

// Enter first number: 10
// Enter second number: 5

// and prints:

// Sum = 15
// Difference = 5
// Product = 50
// Division = 2.0

// Use Scanner.
// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number :");
//         int a = sc.nextInt();
//         System.out.println("Enter second number :");
//         int b = sc.nextInt();

//         System.out.println("Sum = " + (a+b));
//         System.out.println("Difference = " + (a-b));
//         System.out.println("Product = " + ( a*b));
//         System.out.println("Division = "+ (a/b));
//      }
// }

// Q11. BufferedReader basics

// Complete this code:

// import java.io.*;

// class Main {
//     public static void main(String[] args) throws IOException {

//         BufferedReader br =
//             _______________________________;

//         String name = _______________________;

//         System.out.println(name);
//     }
// }

// The user should be able to enter a complete line such as:

// Parnika Pise

// Answer

// import java.io.*;

// class Main {
//     public static void main(String[] args) throws IOException {

//         BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

//         String name = br.readLine();

//         System.out.println(name);
//     }
// }

// Q12. Why parsing?

// Consider:

// BufferedReader br =
//     new BufferedReader(
//         new InputStreamReader(System.in)
//     );

// int age = Integer.parseInt(br.readLine());

// Why do we need:

// Integer.parseInt()

// instead of simply:

// int age = br.readLine();

// Answer 
// because bufferedreader gives output in string only and if we want a input to store or print in a particular datatype then we need to parse it according to the datatype.
// suppose input is 22 then  br.readLine(); will give "22" as output and also it can cause exceeption of incompatible types string cannot be converted to int whereeas Integer.parseInt(br.readLine()); will convert string to int and then it will stored the value in age.

// Q13. BufferedReader integer input

// Write a program using BufferedReader that reads:

// 25

// and stores it in:

// int age;

// Then prints:

// Age = 25


// import java.io.*;

// class Main{
//     public static void main(String [] args)throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int age = Integer.parseInt(br.readLine());
//         System.out.println("Age = "+ age);
//     }
// }

// Q14. Trace the flow ⭐

// Explain the following statement in detail:

// BufferedReader br =
//     new BufferedReader(
//         new InputStreamReader(System.in)
//     );

// Your explanation should include all three:

// System.in
// InputStreamReader
// BufferedReader

// and explain why InputStreamReader is needed between System.in and BufferedReader.

// ans 
// here System.in represnts standard input stream and this stream is in bytes ...buffered reader onluy reads charcters and is not able to read the byte so InputStreamReader is required for the conversion of bytes to char.buffered reaader indirectly access System.in through InputStreamReader.
// InputStreamReader is the bridge that converts byte-based input from System.in into characters that BufferedReader can read.




// Q15. Inheritance test

// Draw the inheritance relationship for:

// Object
// Reader
// InputStreamReader
// BufferedReader
// Scanner

// Then answer:

// Does BufferedReader extend InputStream?

// Does Scanner extend InputStream?

// Does InputStreamReader extend Reader?


        //                       object
        //                         /\
        //                        /  \
        //                 Reader     Scanner
        //                   /\
        //                  /  \
        //  InputStreamReader    BufferedReader


        //  Does BufferedReader extend InputStream? - no
        //  Does Scanner extend InputStream? - no
        //  Does InputStreamReader extend Reader? yes


// Q16. Inheritance vs using an object ⭐

// Explain why this statement is wrong:

// "BufferedReader inherits System.in."

// Then explain the correct relationship between:

// BufferedReader
// InputStreamReader
// System.in

// Answer 

// BufferedReader does not inherit System.in. BufferedReader inherits from Reader and indirectly uses System.in through InputStreamReader. InputStreamReader acts as a bridge that converts byte-based input into characters that BufferedReader can read.

// Q17. Scanner vs BufferedReader

// Create a table comparing:

// Feature	                                              Scanner  	    BufferedReader
// Package                                                	util         io
// Reads input from                                     	System.in    Reader
// Directly reads int?                                    	yes              no
// readLine() available?	                                no               yes
// Needs parsing for integer?	                            no               yes
// Generally easier for beginners?	                        yes              no


// Q18 🔥

// Predict the exact output:

// Scanner sc = new Scanner(System.in);

// System.out.print("Enter name: ");
// String name = sc.nextLine();

// System.out.print("Enter age: ");
// int age = sc.nextInt();

// System.out.println(name);
// System.out.println(age + 5);

// Input:

// Parnika Pise
// 22

// o/p Parnika Pise 
//     27

Q19 ⭐⭐⭐

Now explain the complete input journey for:

BufferedReader br =
    new BufferedReader(
        new InputStreamReader(System.in)
    );

int age = Integer.parseInt(br.readLine());

If the user enters:

25

Complete this:

Keyboard → ? → ? → ? → 25

And explain what happens at each stage.

Keyboard
   ↓
System.in
   ↓
InputStream
   ↓  bytes
InputStreamReader
   ↓  characters
BufferedReader
   ↓
readLine()
   ↓
"25"  (String)
   ↓
Integer.parseInt()
   ↓
25  (int)

Q20 — Ultimate Question 🔥🔥

Explain the difference between these two:

Scanner sc = new Scanner(System.in);

and

BufferedReader br =
    new BufferedReader(
        new InputStreamReader(System.in)
    );

Explain why:

Scanner → System.in

but:

BufferedReader
      ↓
InputStreamReader
      ↓
System.in

Also use these three terms correctly:

inheritance, object passing/using, and method calling.

### 1. Scanner

```java
Scanner sc = new Scanner(System.in);
```

* `Scanner` is a class.
* `sc` is a reference variable.
* `new` creates a Scanner object.
* `System.in` is passed to the Scanner constructor as the **input source**.
* Later, methods like `nextInt()`, `next()`, and `nextLine()` are called on the Scanner object.

```text
Scanner → uses System.in
```

---

### 2. BufferedReader

```java
BufferedReader br =
    new BufferedReader(
        new InputStreamReader(System.in)
    );
```

The input passes through multiple objects:

```text
System.in
    ↓
InputStreamReader
    ↓
BufferedReader
```

* `System.in` provides byte-based input.
* `InputStreamReader` converts bytes into characters.
* `BufferedReader` reads the character stream and provides methods such as `readLine()`.

---

### 3. Inheritance vs using

**Inheritance:**

```text
Object
  ↓
Reader
  ↓
BufferedReader
```

`BufferedReader` **is-a** `Reader`.

```text
Object
  ↓
Reader
  ↓
InputStreamReader
```

`InputStreamReader` **is-a** `Reader`.

**Using:**

`InputStreamReader` **uses** `System.in`.

`Scanner` also **uses** `System.in`.

Neither Scanner nor BufferedReader inherits `System.in`.

---

### 4. Method calling

After creating the objects, we call their methods:

```java
sc.nextInt();
```

Scanner's `nextInt()` method reads and interprets input as an integer.

```java
br.readLine();
```

BufferedReader's `readLine()` method reads a complete line and returns it as a String.

### Final flow

```text
Scanner:

System.in → Scanner → nextInt()/nextLine()


BufferedReader:

System.in → InputStreamReader → BufferedReader → readLine()
```

**Key idea:**

> Inheritance means **IS-A** relationship.
> Passing/using an object means **USES/HAS-A** relationship.
> Calling a method means asking an object to perform an operation.
