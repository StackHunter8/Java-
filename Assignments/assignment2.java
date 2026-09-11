// Data types in java

// Q1. Widening Conversion

// Write a Java program that:

// Creates a byte variable with value 10.
// Converts it to short.
// Converts the short to int.
// Converts the int to long.
// Converts the long to float.
// Converts the float to double.
// Prints all six values.

// Concepts: Widening conversion, implicit casting


// class Main{
//     public static void main(String args[]){
//         byte b = 10;
//         short s = b;
//         int i = s;
//         long l = i;
//         float f = l;
//         double d = f;

//         System.out.println(b);
//         System.out.println(s);
//         System.out.println(i);
//         System.out.println(l);
//         System.out.println(f);
//         System.out.println(d);
//     }
// }


// Q2. Narrowing Conversion

// What will be the output of this program?

// class Main {
//     public static void main(String[] args) {

//         double d = 25.75;

//         int x = (int)d;
//         long y = (long)d;

//         System.out.println(x);//--> o/p 25
//         System.out.println(y);//--> 0/p 25
//     }
// }

// Also answer:

// Why is explicit casting required? -->1 explicit casting is required coz we are narrowing the variable from the datatype of larger scope to the lower scope..it means we are explicitely trying to fit that value in that particular datatype though we loose precission...and unlike implicit the jvm does not internally perform this convertions so there is a need of explicit conversions
// Where did .75 go? --> int and long ignores the decimal values and they only consider the number that is truncated..
// Is the value rounded or truncated?--> truncated

// Concepts: Explicit casting, narrowing

// Q3. Character Conversion

// Predict the output:

// public class Main {
//     public static void main(String[] args) {

//         char c = 'A';

//         int x = c;
//         char y = (char)(x + 2);

//         System.out.println(x);
//         System.out.println(y);
//     }
// }

// Then explain:
// Why can char be assigned to int without explicit casting?-->it is done because char has its unique code language and when the variable of type char is stored in datatype int it points to the numeric value of that variable that is based on the unique code of that value as per char symbols....and when the data type char is prnted it simply prints the symbol rather than its numeric value..and also char has lesser range than int

// What does (char)(x + 2) do?-->here the numeric value of a is stored in int before and that is 65 here 65 +2 is done and 67 is then casted back to char so now it becomes c and not 67..


// Concepts: char ↔ int, Unicode values

// Q4. Integer Division Trap ⭐

// Predict the output:

// public class Main {
//     public static void main(String[] args) {

//         int a = 5;
//         int b = 2;

//         double x = a / b;
//         double y = (double)a / b;

//         System.out.println(x);
//         System.out.println(y);
//     }
// }

// Answer:

// What is the value of x?
// What is the value of y?
// Why are they different even though both are double?

// Concept: Integer division + type promotion

// Q5. Mixed Data Types

// Predict the output:

// public class Main {
//     public static void main(String[] args) {

//         int a = 10;
//         double b = 3.5;

//         double result = a + b;

//         System.out.println(result);
//     }
// }

// Then determine the type of the expression:

// a + b

// Is it:

// int
// float
// double --> yes

// Explain why. --> The expression itself is already evaluated as a double before it is assigned to result.
// expression always hold the type that is greater between the two.
// int + double   → double
// int + float    → float
// long + double  → double
// int + long     → long

// Concept: Automatic type promotion

// Q6. Casting During Arithmetic

// Write a program that takes:

// int a = 10;
// int b = 4;

// and calculates their average as a double.

// Your output should be:

// Average: 7.0

// Then modify the values to:

// a = 10
// b = 3

// and make sure the output is:

// Average: 6.5

// Restriction: Don't simply write:

// double average = 6.5;

// You must calculate it using a and b.

// Concept: Casting + integer division

// class Main{
//     public static void main(String [] args){
//         int a = 10;
//         int b = 4;

//         double average = (double) (a + b)/2;
//         System.out.println("Average : " + average);

//         b = 3;
//         average = (double) (a+b)/2; 
//          System.out.println("Average : " + average);
//     }
// }

// Q7. Predict the Output — Mixed Conversions 🔥

// Without executing:

// public class Main {
//     public static void main(String[] args) {

//         byte b = 10;
//         short s = 20;
//         int i = 30;

//         int result = b + s + i;

//         System.out.println(result);
//     }
// }

// Then answer:

// What is the output? --> 60
// What is the type of b + s + i? --> int 
// Why isn't the result a byte or short? --> because expressions of byte short and int are converted into int only while execution..
// byte + byte   → int
// byte + short  → int
// short + short → int
// char + char   → int
// byte + int    → int
// short + int   → int

// Concept: Binary numeric promotion

// Q8. Overflow Challenge 🔥

// Predict the output: --> int cannot hold negative value error coz after the addition the no becomes 4000000 thats why 

// public class Main {
//     public static void main(String[] args) {

//         int a = 2_000_000_000;
//         int b = 2_000_000_000;

//         int result = a + b;

//         System.out.println(result);
//     }
// }

// Then modify the program so that it correctly produces:

// 4000000000

// Important: Don't change the values of a and b.

// Concept: Integer overflow + long conversion


//  class Main {
//     public static void main(String[] args) {

//         int a = 2_000_000_000;
//         int b = 2_000_000_000;

//         long result =(long) a + b;

//         System.out.println(result);
//     }
// }    

// Q9. Tricky Casting 🔥🔥

// Predict the output of each statement:

// public class Main {
//     public static void main(String[] args) {

//         double a = 10.99;
//         int b = (int)a;

//         int c = 130;
//         byte d = (byte)c;

//         char e = 'A';
//         int f = e + 5;

//         System.out.println(b);
//         System.out.println(d);
//         System.out.println(f);
//     }
// }

// output 10 
//        -126 -126

// This is an important concept. Let's understand why.

// int c = 130;
// byte d = (byte)c;

// A byte in Java has 8 bits and its range is:

// -128 to 127

// But 130 cannot fit into a byte.

// When you explicitly cast:

// (byte)130
// Java keeps the lower 8 bits of the integer representation.

// Conceptually:

// 130
// ↓
// binary: 10000010

// Interpreting those 8 bits as a signed Java byte gives:

// -126

// So:

// (byte)130 → -126

// 70

// // You must explain why each output occurs, especially:

// // byte d = (byte)c;

// // Don't just give the output.

// // Concepts: Narrowing, overflow during casting, char arithmetic


// Q10. 🔥 DSA-Style Average Problem

// You are given:

// int sum = 475;
// int count = 6;

// Write Java code to calculate the average correctly as a double.

// Expected output:

// Average: 79.16666666666667

// Then answer:

// Part A

// Why is this wrong?

// double average = sum / count; -- here the result gets calculated in integer form in double ..thatis 79
// Part B

// Why does this work?

// double average = (double)sum / count; // because here the sum is converted into double first and then the division takes place in double format it is stored in the double var..
// Part C — Challenge

// Can you calculate the average without changing the datatype of sum and count?

// Concepts: Integer division, casting, arithmetic expressions, DSA-style numerical problems


class Main{
    public static void main(String []args){
        
        int sum = 475;
        int count = 6;
    
        //  double average = (double) sum/count;
         double average = sum/(count*1.0);
         
        
        System.out.println("Average :" + average);
    }
}

// -------------------------------------------------------------------------

// Data Types & Conversion Practice: COMPLETED

// You did really well on this set.

// You've now practiced:

// ✅ Widening conversion
// ✅ Narrowing conversion      
// ✅ Explicit casting
// ✅ char ↔ int
// ✅ Integer division
// ✅ Numeric promotion
// ✅ byte/short → int
// ✅ Overflow
// ✅ int → long before arithmetic
// ✅ Floating-point truncation
// ✅ int → byte overflow
// ✅ DSA-style average calculation
// ⭐ Most important rules to remember
// Widening:
// byte → short → int → long → float → double
//        (automatic)
// Narrowing:
// double → float → long → int → short → byte
//           (explicit casting generally required)

// And the DSA golden rule:

// (double) a / b

// is different from:

// (double)(a / b)

// For example:

// (double)5 / 2       → 2.5 ✅
// (double)(5 / 2)     → 2.0 ❌

// Also remember:

// long result = (long)a + b;  // ✅
// long result = a + b;       // may overflow first ❌

// You've got a solid foundation here. Data Types + Type Conversion → completed. 🎯