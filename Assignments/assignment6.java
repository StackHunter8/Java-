// Q1. Basic Arguments

// What will be the output?

// class Main {
//     public static void main(String[] args) {
//         System.out.println(args.length);
//         System.out.println(args[0]);
//     }
// }

// Run with:

// java Main Parnika

// Q2

// What is the exact output?

// class Main {
//     public static void main(String[] args) {
//         System.out.println(args[0]);
//         System.out.println(args[1]);
//         System.out.println(args.length);
//     }
// }

// Run with:

// java Main Java DSA

// o/p
// Java
// DSA 
// 2


// Q3 What will this print?

// class Main {
//     public static void main(String[] args) {
//         System.out.println(args[0] + args[1]);
//     }
// }

// Run:

// java Main 10 20

// Give me the exact output.

// o/p

// 1020

// Q4 Write a Java program that accepts two numbers through command-line arguments and prints their sum.

// Example:

// java Main 15 25

// Expected output:

// Sum = 40

// Write the complete code yourself.

// class Main{
//     public static void main(String args []){
//          int a = Integer.parseInt(args[0]);
//          int b = Integer.parseInt(args[1]);
         
//         System.out.println("Sum = " + (a + b));
//     }
// }

// class Main{
//     public static void main(String args []){
       
         
//         System.out.println("Sum = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
//     }
// }

// Q5 — Moderate

// Write a program that accepts the birth year through command-line arguments and calculates the approximate age.

// Example:

// java Main 2004

// Assume the current year is 2026.

// Expected:

// Age = 22

// Write the complete code.

// class Main{
//     public static void main(String args[]){
//         int birth_year = Integer.parseInt(args[0]);
//         int current_year = 2026;
//         int age = current_year - birth_year;
//         // for(int i = birth_year;i<current_year;i++){
//         //     age++;
//         // } 
//         System.out.println("Age = " + age);
//     }
// }

// Q6 — Moderate

// Predict the exact three lines of output:

// class Main {
//     public static void main(String[] args) {

//         int a = Integer.parseInt(args[0]);
//         int b = Integer.parseInt(args[1]);

//         System.out.println(args[0] + args[1]);
//         System.out.println(a + b);
//         System.out.println(a * b);
//     }
// }

// Run:

// java Main 5 4

// What is the output?

// o/p
// 54
// 9
// 20

// Q7 — Moderate

// Now let's test your debugging skills.

// What happens when this program is executed?

// class Main {
//     public static void main(String[] args) {

//         System.out.println(args[0]);
//         System.out.println(args[1]);
//     }
// }

// Run:

// java Main Hello

// Tell me:

// What happens?
// Why does it happen?
// What exception/error do you get?

// Answer

// error will occur 
// because the arguments passed on command line is 1 and thus the length of the args array is 1 thats why the error gets occue when we try to access args[1]
// ArrayIndexOutOfBounds error

// Q8 — High

// Now let's combine command-line arguments + parsing + if-else.

// Write a Java program that accepts three integers through command-line arguments and prints the largest number.

// Example:

// java Main 25 78 42

// Expected:

// Maximum = 78
// Requirement:

// Use if-else logic.

// Write the complete code yourself.

// class Main{
//     public static void main(String args[]){
//         int num1 = Integer.parseInt(args[0]);
//         int num2 = Integer.parseInt(args[1]);
//         int num3 = Integer.parseInt(args[2]);
//         int max = num1;

//         // if(max<num2){
//         //      max=num2;

//         //      if(max<num3){
//         //         max = num3;
//         //      }
//         // }


//         if (num2 > max) {
//             max = num2;
//         }

//         if (num3 > max) {
//             max = num3;
//         }
//         System.out.println("Maximum = " + max);
//     }
// }

// High

// Q9 Write a Java program that accepts three marks through command-line arguments and calculates their average.

// Example:

// java Main 80 75 95

// Expected:

// Average = 83.333...

// ⚠️ Important: Make sure you don't accidentally perform integer division.

// class Main{
//     public static void main(String [] args){
//         int num1 = Integer.parseInt(args[0]); 
//         int num2 = Integer.parseInt(args[1]); 
//         int num3 = Integer.parseInt(args[2]); 

//         double average = (double) (num1+num2+num3)/args.length;

//         System.out.println("Average = " + average);
//     }
// }

// Q10 — Ultimate Challenge

// Write a program that accepts:

// name age marks

// through command-line arguments.

// For:

// java Main Parnika 22 87.5

// the output should be:

// Name: Parnika
// Age: 22
// Marks: 87.5
// Result: Pass

// Requirements:

// args[0] → name
// Convert args[1] → int
// Convert args[2] → double
// Print all three
// Marks >= 40 → Pass
// Marks < 40 → Fail

// Write the complete code yourself.

class Main{
    public static void main(String args[]){
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double marks = Double.parseDouble(args[2]);

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + marks);

        if(marks >= 40){
            System.out.println("Result : Pass");
        }else{
            System.out.println("Result : Fail");

        }
        

    }
}


🏆 Command Line Arguments — Assignment Result
Question	Level	Score
Q1	Easy	10/10
Q2	Easy	10/10
Q3	Easy	10/10
Q4	Moderate	10/10
Q5	Moderate	10/10
Q6	Moderate	10/10
Q7	Moderate	10/10
Q8	High	10/10
Q9	High	10/10
Q10	High	10/10
Final: 100/100 💯🔥

More importantly, you demonstrated that you understand:

Command line
     ↓
String[] args
     ↓
args[0], args[1], ...
     ↓
String values
     ↓
parseInt / parseDouble
     ↓
Actual numeric values
     ↓
Arithmetic + conditions

And you successfully used command-line arguments together with loops, arithmetic, parsing, arrays, and if-else logic.

Your Q8 maximum-number solution and Q9 average solution also show that you're starting to think about reusable DSA patterns, not just syntax.

Command Line Arguments = DONE ✅