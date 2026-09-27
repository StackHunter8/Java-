// Input OutPut in java

Think of every Java program like this:

        INPUT
          ↓
     Your Program
          ↓
        OUTPUT

For example:

You type: 25
     ↓
Java receives 25
     ↓
Java calculates 25 × 2
     ↓
Java prints: 50

That's all Input/Output (I/O) means.

lets understand output first 
 you might have seen System.out.println("hello")

 here System is a class and insisdse that class there is a field called out that s static and its type is PrintStream.
 in short all the methods in the Printstream are accessible to us such as print(),println(),printf(),etc

 in the case of output the flow is java to  screen.
 System is a class that gives us some useful things related to the computer/system.

 print() continue to print all the data on same line
 println() move to next line after printing the data.

 Input in java

 here the flow is from keyboard to java.
 while taking thee input System.in plays a very crucial role.
 suppose there is Enter your age and i typed 22 then that 22 gets stored in System.in.
 System.in is nothing bt  a standard input source.

 when we enter the agfe java does not give uh directly int age =22;
 the data comes from a stream..A stream is nothing bt a flow of data..just like the flow of a river.
 Similarly, data flows:

// Keyboard → Java

// That's why Java uses the word stream.

// Input stream:

// Keyboard
//    ↓
//    ↓
//    ↓
// Java

here Java has a class name InputStream.it plays crucial role in taking the input.
it is strored as final static InputStream in = .....inside the System class.
System.in = standard input stream, usually connected to the keyboard.

we can take input from the user through 2 ways..

1. with the help of Scanner class.
2.with  the help of Buffer reader.

1.Scanner Class

-You might have written:

Scanner sc = new Scanner(System.in);

Let's understand this very slowly.

There are two things:

Scanner
System.in

Scanner is a class.

System.in is the input source.

So you're basically telling Scanner:

"Scanner, take your input from System.in."

Like this:

Keyboard
   ↓
System.in
   ↓
Scanner
   ↓
Your program

why do we need Scanner class?
-we need it coz scanner makes it easy to take the input in a expected data type ..here we dont need to explicitely convert it to the expected typeand also System.in alone isn't convenient for us.

Suppose you type:

25

We want to say:

int age = 25;

Scanner makes this easy:

Scanner sc = new Scanner(System.in);

int age = sc.nextInt();

Scanner does the work of reading and converting the input for us.

lets understand the meaning of 

Scanner sc = new Scanner(System.in)

here Scanner is the class ,
sc is the reference variable
by using new we indicate java to create the object of the Scanner class 
and System.in inside the () means we pass the value stored in System.in to the constructor of the scanner class .
and after this the scanner methods comes like nextInt(),next(),etc they convert the value in System.in to the respected datatype .
for eg the method sc.nextInt() is used then the data will get converted ito int and also it will get stored as int.
eg int age = sc.nextInt();

Flow:

Keyboard
   ↓
22
   ↓
System.in
   ↓
Scanner
   ↓
nextInt()
   ↓
int age
   ↓
22


Scanner's important methods

Let's understand them one by one.

nextInt()

Reads an integer.

int age = sc.nextInt();

Input:

22

Result:

age = 22
nextDouble()

Reads a decimal number.

double salary = sc.nextDouble();

Input:

25000.50

Result:

salary = 25000.50
next()

Reads one word.

Suppose:

Parnika Patil

Then:

String name = sc.next();

gives:

Parnika

because the space separates two words.

nextLine()

Reads the whole line.

String name = sc.nextLine();

Input:

Parnika Patil

Result:

"Parnika Patil"

So:

next()     → one word
nextLine() → complete line

This difference is VERY important.

-----------------------------------------
2.BufferedReader

-BufferedReader is a Java class designed to read text efficiently.
- it is inheritwed from Reader class.

    The important word is:

    buffer

    Imagine you're collecting water.

    Instead of going to the tap every time you need one drop:

    tap → one drop
    tap → one drop
    tap → one drop

    you collect some water in a bucket:

    tap
    ↓
    bucket
    ↓
    use water from bucket

    The bucket is like a buffer.

    Similarly:

    Input source
        ↓
    Buffer
        ↓
    Java program
    So BufferedReader temporarily keeps input so it can be read efficiently.

 -Buffered reader understands only characters but System.in carreied a InputStream and the data in it is in bytes so in order to read the data InputStreamReader is required.
 -the InputStreamReader simply converts the data from bytes to characters so that the BufferedReader can read it..InputStreamReader converts byte-based input into character-based input.
 -also the bufferedReader stores and prints the data in string only.
 -so if we want the data in particular datatype then we need to convert it explicitely to that datatype.   

 Syntax 

 BufferedReader br =
    new BufferedReader(
        new InputStreamReader(System.in)
    );

    Read it from inside → outside.

Step 1
System.in

Keyboard input.

Step 2
new InputStreamReader(System.in)

Convert the incoming bytes into characters.

Step 3
new BufferedReader(
    new InputStreamReader(System.in)
)

Put a buffer around that character reader.

So:

Keyboard
   ↓
System.in
   ↓
InputStreamReader
   ↓
BufferedReader
   ↓
Your program.

there are two types of constructors in Buffered Reader classs

1.BufferedReader(Reader rd) - used to create a buffered reader character input stream that uses default size for an input buffer

2.BufferedReader(Reader rd,int size)- used to create a buffered reader character input stream that uses specified size for an input buffer.

while accepting integers as input some exceptions might occur.

BufferedReader mainly gives us:

readLine()

Example:

String name = br.readLine();

If the user enters:

Parnika Patil

then:

name = "Parnika Pise"

Important difference: Scanner vs BufferedReader

Suppose user enters:

25

With Scanner:

int age = sc.nextInt();

Scanner directly gives:

int

With BufferedReader:

String age = br.readLine();

you get:

"25"

Notice the difference:

Scanner:
25 → int 25

BufferedReader:
25 → String "25"

So with BufferedReader we have to convert it.

int age = Integer.parseInt(br.readLine());

Flow:

"25"
 ↓
Integer.parseInt()
 ↓
25


What is parseInt()?

This is very important.

Integer.parseInt("25");

means:

Convert the String "25" into the integer 25.

Why do we need it?

Because:

"25"

and

25

are NOT the same thing.

First one is:

String

Second one is:

int

Other parsing methods

Same concept as your earlier data-type conversions.

String → int
Integer.parseInt("25");
String → long
Long.parseLong("25000");
String → double
Double.parseDouble("25.5");
String → float
Float.parseFloat("25.5");

hierarchy of buffered reader 

             Object
                |
             Reader
             /    \
            /      \
 InputStreamReader  BufferedReader

 here all the merthods in object and reader class are available and accessible to inputstream reader and buffered reader class..

 the inputstream reader and bufffereed reader are subclasses of reader class that is they extends reader class  and the reader class extends object class.


--------------------------------------------------------------------------------------------------------------------------------------
 hierarchy of Scanner class

 Scanner is different.

Don't think:

Scanner → InputStream

That's WRONG.

Scanner does not inherit from InputStream.

Scanner is its own class.

Very simplified:

Object
   ↓
Scanner

Scanner uses an input source.

That's why:

new Scanner(System.in)

works.

We're giving Scanner the input source.


Just understand the flow.

Scanner
                 Scanner
                    ↑
                    |
Keyboard → System.in
                    |
                    ↓
               Scanner reads
                    |
              nextInt()
              next()
              nextLine()
BufferedReader
Keyboard
   ↓
System.in
   ↓
InputStream
   ↓
InputStreamReader
   ↓
BufferedReader
   ↓
readLine()


Why are there so many classes?

This is the part that initially confuses everyone.

You may think:

"Why can't Java just give me one class called Input?"

Because Java separates responsibilities.

For example:

InputStream
    ↓
Handles byte-based input

InputStreamReader
    ↓
Converts bytes → characters

BufferedReader
    ↓
Reads characters efficiently

Scanner
    ↓
Conveniently parses tokens/numbers

Scanner is like a waiter

You tell Scanner:

sc.nextInt();

Scanner says:

"You want an integer? I'll get it."

You say:

sc.nextDouble();

Scanner:

"You want a double? I'll get it."

You say:

sc.next();

Scanner:

"You want one word? I'll get it."

That's why Scanner is easy.

33. BufferedReader is more basic

BufferedReader basically says:

"I'll give you the line. You decide what it means."

For example:

String input = br.readLine();

You get:

"25"

Then you decide:

int n = Integer.parseInt(input);

So:

Scanner
→ more convenient

BufferedReader
→ more control / generally faster for large input.


One important Scanner problem

Remember this:

int age = sc.nextInt();
String name = sc.nextLine();

This can cause a problem.

Why?

Input:

22
Parnika

Internally:

22\nParnika\n

nextInt() takes:

22

but leaves:

\n

Then nextLine() sees:

\n

and thinks:

"Oh, the line has ended."

So you may get an empty String.

Fix:

int age = sc.nextInt();
sc.nextLine();

String name = sc.nextLine();

The first nextLine() consumes the leftover newline.

One final comparison

Suppose the input is:

22
Parnika Patil
85.5
Scanner
Scanner sc = new Scanner(System.in);

int age = sc.nextInt();

sc.nextLine();

String name = sc.nextLine();

double marks = sc.nextDouble();

Very convenient.

BufferedReader
BufferedReader br =
    new BufferedReader(
        new InputStreamReader(System.in)
    );

int age = Integer.parseInt(br.readLine());

String name = br.readLine();

double marks = Double.parseDouble(br.readLine());

Here every input initially comes as a String.

--------------------------------------
The one diagram I want you to remember
                    JAVA INPUT
                        |
                ┌───────┴───────┐
                ↓               ↓
             Scanner        BufferedReader
                |               |
                |          InputStreamReader
                |               |
                ↓               ↓
             System.in ←──── System.in
                |
             Keyboard

             And for inheritance:

                              Object
                    |
                  Reader
                 /      \
                /        \
 InputStreamReader      BufferedReader


                 Object
                    |
                 Scanner

system class hierarchy

                 System class
                     |
          ┌──────────┼──────────┐
          ↓          ↓          ↓
         in         out        err
          |          |          |
          ↓          ↓          ↓
   InputStream   PrintStream  PrintStream
          |          |          |
          ↓          ↓          ↓
       read()     println()   println()

   So when you write:

Scanner sc = new Scanner(System.in);

you're literally passing the InputStream referred to by System.in to the Scanner constructor.

Keyboard
   ↓
System.in
   ↓
InputStream
   ↓
Scanner
   ↓
nextInt()
next()
nextLine()

This is the key connection between System.in and Scanner.


✅ "BufferedReader inherits from Reader and uses System.in indirectly through InputStreamReader."

And:

✅ "Scanner uses System.in as its input source; it does not inherit from InputStream."

| Class               | Relationship with `System.in`                       |
| ------------------- | --------------------------------------------------- |
| `BufferedReader`    | Uses it indirectly through `InputStreamReader`      |
| `Scanner`           | Uses it directly by receiving it in its constructor |
| `InputStreamReader` | Converts `InputStream` → character stream           |


What actually happens

When you write:

Scanner sc = new Scanner(System.in);

this happens:

1. System.in
      ↓
2. Passed as an argument to Scanner's constructor
      ↓
3. Scanner stores/uses that input stream
      ↓
4. Later, when you call sc.nextInt(), sc.nextLine(), etc.
      ↓
5. Scanner reads input from System.in
❌ The part that is incorrect

You said:

JVM internally executes readLine() of InputStream

No.

InputStream does not have readLine().

Its basic reading method is:

read()

readLine() belongs to BufferedReader.

For example:

BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));

String name = br.readLine();
And another important point

When you do:

new Scanner(System.in)

the input value is NOT immediately passed to the Scanner constructor.

You are passing the input stream/reference (System.in), not the user's actual typed value.

Think of it like this:

System.in
   │
   │  "Here is the pipe through which input will arrive."
   ↓
Scanner
   │
   │  later asks for input
   ↓
sc.nextInt()
   │
   ↓
User types: 25
   │
   ↓
Scanner reads 25 from System.in
   │
   ↓
returns 25

So:

Scanner sc = new Scanner(System.in);

means roughly:

"Scanner, use System.in as your source of input."

Then:

int age = sc.nextInt();

means:

"Scanner, now read an integer from that input source."

Very important distinction
new Scanner(System.in)

➡️ passes the input stream

sc.nextInt()

➡️ reads the actual user input

That's the key concept.

Yes. This is the important part to understand. BufferedReader uses System.in through InputStreamReader.

The complete chain

When you write:

BufferedReader br =
    new BufferedReader(
        new InputStreamReader(System.in)
    );

Java builds this chain:

Keyboard
   ↓
System.in
   ↓
InputStream
   ↓
InputStreamReader
   ↓
BufferedReader
   ↓
br.readLine()

Let's break it down.

Step 1 — System.in

System.in is a reference to the standard input stream:

System.in

Its type is:

InputStream

It deals with bytes.

Step 2 — InputStreamReader(System.in)

Now we pass System.in to InputStreamReader:

InputStreamReader isr =
    new InputStreamReader(System.in);

This is where the connection happens.

Conceptually:

InputStreamReader
       ↑
       |
   System.in

InputStreamReader accepts an InputStream in its constructor.

Its job is essentially:

"Give me byte input from System.in, and I'll convert those bytes into characters."

So:

System.in
  bytes
    ↓
InputStreamReader
  characters
Step 3 — BufferedReader

Then we pass the InputStreamReader to BufferedReader:

BufferedReader br =
    new BufferedReader(isr);

BufferedReader expects a Reader.

And InputStreamReader is a Reader:

Object
   ↓
Reader
   ↓
InputStreamReader

So this is valid:

new BufferedReader(isr);

Now the complete connection is:

System.in
    ↓
InputStreamReader
    ↓
BufferedReader
Step 4 — br.readLine()

Finally:

String name = br.readLine();

BufferedReader reads characters through the InputStreamReader.

The underlying source ultimately goes back to:

Keyboard
   ↓
System.in
   ↓
InputStreamReader
   ↓
BufferedReader
   ↓
readLine()

For example, if you type:

Parnika

the data flows conceptually like:

Keyboard
   ↓
System.in
   ↓
bytes
   ↓
InputStreamReader
   ↓
characters
   ↓
BufferedReader
   ↓
"Parnika"
🔑 The most important thing

BufferedReader doesn't directly know about System.in.

It knows about its Reader:

BufferedReader(Reader in)

And the Reader we give it is:

InputStreamReader

And that InputStreamReader knows about System.in.

So:

BufferedReader → InputStreamReader → System.in

That's why we call it indirectly using System.in.

Whereas Scanner is simpler:

Scanner → System.in

because we directly give System.in to Scanner:

new Scanner(System.in);

This distinction between inheritance, passing objects, and chaining/wrapping objects is actually very important for understanding Java I/O.


in short scanner la apn direct System.in deto ani m te constructor la pass karto Scanner cchya bt BufferReader la tasa nahi karat apn pahile ti input stream i.e System.in InputSTreamReader la deto mg to tya stream la byte to char convert karto and then te Reader class mhnje InputStreamReader cha parent class through buffer reader la access hota...so it is said that System.in is indirectly accessed by BufferReader .
