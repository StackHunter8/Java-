// Q1. What is the output?

// int number = 15;

// if (number > 10) {
//     System.out.println("Greater");
// }
// o/p Greater.

// Also explain what happens if number = 5. -> Since there is no else block, Java simply skips the if block and continues with the next statement.

// Q2 — if-else

// What is the output?

// int number = 12;

// if (number % 2 == 0) {
//     System.out.println("Even");
// } else {
//     System.out.println("Odd");
// }

// Also explain why % is useful here.

// o/p even here modulo returns the remainder of the particular division and as we know the rule to find the even or odd number is totally dependent on remainder .. so if the remainder is zero we can classify the number under even category else it goes to odd category

// Q3 — else-if

// Find the output:

// int marks = 68;

// if (marks >= 90) {
//     System.out.println("A");
// } else if (marks >= 75) {
//     System.out.println("B");
// } else if (marks >= 60) {
//     System.out.println("C");
// } else {
//     System.out.println("D");
// }

// 0/p c

// Q4 — Nested if

// Find the output:

// int age = 21;
// boolean hasID = true;

// if (age >= 18) {
//     if (hasID) {
//         System.out.println("Entry Allowed");
//     } else {
//         System.out.println("ID Required");
//     }
// } else {
//     System.out.println("Underage");
// }

// Then answer:

// What would happen if hasID = false?

// o/p entry allowed 
// if hasId is false then the first if blocck will get excecuted as age is greater than 18 then it will check the condition in the nested if block and there the hasId is false so it will execute the else block and the op will be ID Required.

// Q5 — Multiple Conditions

// Find the output:

// int age = 20;
// boolean hasID = false;

// if (age >= 18 && hasID) {
//     System.out.println("Allowed");
// } else {
//     System.out.println("Not Allowed");
// }

// Explain why the if condition becomes true or false.

// o/p
// Not Allowed
// here age is 20 and its greater than 18 so this becomes true bt hasId is false so as per the and rule true and false is false so the if block doesnt get executed and the code moves to end block and prints not allowed.

// Q6 — switch

// Find the output:

// int day = 3;

// switch (day) {
//     case 1:
//         System.out.println("Monday");
//         break;

//     case 2:
//         System.out.println("Tuesday");
//         break;

//     case 3:
//         System.out.println("Wednesday");
//         break;

//     default:
//         System.out.println("Invalid");
// }

// Also explain the purpose of break.
// 0/p Wednesday 
// once the matching case 3 starts executing, break immediately exits the entire switch statement, so execution doesn't continue into the following cases.

// Q7 — Switch Fall-Through

// This is a tricky one.

// Find the output:

// int x = 2;

// switch (x) {
//     case 1:
//         System.out.println("One");

//     case 2:
//         System.out.println("Two");

//     case 3:
//         System.out.println("Three");

//     default:
//         System.out.println("Default");
// }

// Explain why multiple outputs are produced.

// o/p Two
//     Three
//     Default
// Explaination
// here due to the absence of break statement the code continues to execute teh other cases too as it is not exited from the switch statement.This behavior is called fall-through.


// Q8 — for Loop

// Find the output:

// for (int i = 1; i <= 5; i++) {
//     System.out.println(i);
// }

// Then explain the exact order:

// initialization
// condition
// body
// update
// condition
// ...

// o/p 
// 1
// 2
// 3
// 4 
// 5

// here order is i gets initialized then the condition gets checked and if its true then the body gets ececuted and the i gets updated and again this happens till the condition gets false.

// Q9 — while Loop

// Find the output:

// int i = 5;

// while (i >= 1) {
//     System.out.println(i);
//     i--;
// }

// What will be the final value of i after the loop?

// o/p 
// 5
// 4
// 3
// 2
// 1
// after the loop i = 0

// Q10 — do-while

// Find the output:

// int i = 10;

// do {
//     System.out.println(i);
//     i++;
// } while (i < 5);

// Explain why the output occurs even though i < 5 is false.

// o/p 10
// here o/p occurs because the do while loop execute the do block once before checking the condition.

// Q11 — break

// Find the output:

// for (int i = 1; i <= 10; i++) {

//     if (i == 6) {
//         break;
//     }

//     System.out.println(i);
// }

// Also explain exactly when the loop terminates.

// o/p
// o/p 
// 1
// 2
// 3
// 4
// 5
// and when the i becomes 6 the code enters the if block and as there is break statement the code gets exits from the nearest loop.

// Q12 — continue

// Find the output:

// for (int i = 1; i <= 7; i++) {

//     if (i % 2 == 0) {
//         continue;
//     }

//     System.out.println(i);
// }

// Which numbers are skipped?
// o/p
// 1
// 3
// 5
// 7
// numbers skipped are 2,4,6.

// Q13 — Nested Loop

// Find the output:

// for (int i = 1; i <= 3; i++) {

//     for (int j = 1; j <= 2; j++) {
//         System.out.println(i + " " + j);
//     }
// }

// Also tell me how many times the inner statement executes.

// o/p 
// 1 1
// 1 2
// 2 1
// 2 2
// 3 1
// 3 2
// the inner statement executes 6 times.

// Q14 — Nested Loop + break

// Find the output:

// for (int i = 1; i <= 3; i++) {

//     for (int j = 1; j <= 3; j++) {

//         if (j == 2) {
//             break;
//         }

//         System.out.println(i + " " + j);
//     }
// }

// Important:

// Does break terminate the outer loop or the inner loop?

// o/p 
// 1 1 
// 2 1
// 3 1
// the break statement breaks the inner loop.

// Q15 — continue + Calculation

// Find the output:

// int sum = 0;

// for (int i = 1; i <= 10; i++) {

//     if (i % 2 == 0) {
//         continue;
//     }

//     sum += i;
// }

// System.out.println(sum);

// Explain which numbers actually get added to sum.

// Q16 — Find Maximum

// Write a Java program using a for loop and if statement to find the largest element in:

// int[] arr = {12, 45, 7, 89, 23, 56};

// Expected output:

// 89
// Constraint

// Don't use Arrays.sort().

// You must solve it using control statements.

// class Main{
//     public static void main(String [] args){
//         int[] arr = {12,45,7,89,23,56};
//         int max = arr[0];
//         for(int i = 0;i<arr.length;i++){
//             if(max < arr[i]){
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }

// Q17 — Count Even and Odd Numbers

// Write a program that counts how many even and odd numbers are present:

// int[] arr = {10, 15, 22, 31, 40, 55, 60};

// Expected output:

// Even = 4
// Odd = 3

// Use:

// for
// if-else
// %

// class Main{
//     public static void main(String [] args){
//      int[] arr = {10, 15, 22, 31, 40, 55, 60};
//      int odd = 0;
//      int even =0;

//      for(int i =0;i<arr.length;i++){
//         if(arr[i]%2==0){
//             even++;
//         }else{
//             odd++;
//         }
//      }
//      System.out.println("Even = " + even);
//      System.out.println("Odd = " + odd);
//     }
// }

// Q18 — First Number Divisible by 7

// Given:

// int[] arr = {10, 15, 22, 31, 44, 49, 63};

// Find the first number divisible by 7.

// Expected output:

// 49
// Requirement

// Once you find it, stop searching immediately.

// Hint:

// Think about which jump statement you should use.

// class Main{
//     public static void main(String [] args){
//         int[] arr = {10, 15, 22, 31, 44, 49, 63};
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]%7 == 0){
//                 System.out.println(arr[i]);
//                 break;
//             }
//         }
//     }
// }

// Q19 — Infinite Loop Trap 🔥

// Consider:

// int i = 1;

// while (i <= 5) {

//     if (i == 3) {
//         continue;
//     }

//     System.out.println(i);
//     i++;
// }

// Answer:

// Will this program terminate?
// What happens when i == 3?
// Why?
// How would you fix it?

// This is a very important interview-style question.


// 1. no this program wont terminate 
// 2. when i == 3 the code enters the if block and the continue statement gets execcuted
// 3.  the continue statement executes  bt the value of i is not updated so it remains 3 only and the loop  executes infinite times
// 4. before continue update the i value 



// 🏆 Q20 — Ultimate Combined Question

// This combines almost everything you've learned.

// Predict the exact output:

// int a = 10;
// int b = 5;
// int count = 0;

// for (int i = 1; i <= 5; i++) {

//     if (i % 2 == 0) {
//         continue;
//     }

//     if (a > b) {
//         count += i;
//     } else {
//         count -= i;
//     }

//     if (count > 5) {
//         break;
//     }
// }

// System.out.println(count);
// You must determine:
// What happens during each iteration?
// Which values of i are skipped?
// When does count change?
// Does break execute?
// Final value of count.

// o/p 
// 1.here in each iteration the i is checkeed if its even or odd and then the variables a and b are checked for greater ones and then the count gets updated..and again the count is checked if its greater than the loop gets break..

// 2. values skipped 2,4
// 3. if a>b condition becomes true count changes.
// 4. yes break executes.
// 5. 9

// ⭐ Bonus Challenge — return

// One final conceptual question:

// public static void test() {

//     for (int i = 1; i <= 5; i++) {

//         if (i == 3) {
//             return;
//         }

//         System.out.println(i);
//     }

//     System.out.println("Done");
// }

// If test() is called:

// test();

// What is the output?

// And explain the difference between:

// break
// continue
// return

// o/p

// when test is called the for loop starts iterating and it prints 
// 1 
// 2 
// and as it becomes 3 code enters the if block and due to return statement the code exits the entire method.
// the difference between break continue and return is when break is used it exits the nearby loop or switch statement when continue is used it skips the current iteration and when return is used it exits the entire method in which the return statement is called.



// 🏆 Control Statements Assignment Completed!

// You completed all 20 questions.

// You covered:

// if ✅
// if-else ✅
// else-if ✅
// nested if ✅
// && conditions ✅
// switch ✅
// switch fall-through ✅
// for loop ✅
// while loop ✅
// do-while ✅
// break ✅
// continue ✅
// nested loops ✅
// infinite-loop debugging ✅
// arrays + control statements ✅
// searching with break ✅
// counting with if-else ✅
// maximum element logic ✅
// combined control flow ✅

// You were especially strong when doing dry runs and tracing variable changes, which is exactly the skill you'll need when you start DSA.

// Overall performance: Excellent — your fundamentals are solid. 🔥


// patterns code

// Q1. Print 5 stars in one row

// *****

// class Main{
//     public static void main(String args[]){
//         for(int i = 0;i<5;i++){
//             System.out.print("*");
//         }
//     }
// }

// Q2. Square pattern

// For n = 4:

// ****
// ****
// ****
// ****

// class Main{
//     public static void main(String [] args){
//         for(int i = 0;i<4;i++){
//             for(int j = 0;j<4;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Q3. Increasing triangle

// For n = 5:

// *
// **
// ***
// ****
// *****

// class Main{
//     public static void main(String [] args){
//         for(int i = 0;i<5;i++){
//             for(int j = 0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Q4. Decreasing triangle

// For n = 5:

// *****
// ****
// ***
// **
// *

// class Main{
//     public static void main(String [] args){
//         int n = 5;
//         for(int i = 0;i<5;i++){
//             for(int j = 0;j<n;j++){
//                 System.out.print("*");
//             }
//             n--;
//             System.out.println();
//         }
//     }
// }

// Q5. Number triangle

// For n = 5:

// 1
// 12
// 123
// 1234
// 12345

// class Main{
//     public static void main(String args[]){
//         int n = 5;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// Q6. Same number in each row

// For n = 5:

// 1
// 22
// 333
// 4444
// 55555

// class Main{
//     public static void main(String []args){
//         int n = 5;
//         int num = 1;
//         for(int i = 1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(num);
//             }
//             num++;
//             System.out.println();
//         }
//     }
// }

// Q7. Repeated number

// For n = 5:

// 11111
// 22222
// 33333
// 44444
// 55555

// class Main{
//     public static void main(String [] args){
//         int n = 5;
//         int num = 1;
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<n;j++){
//                 System.out.print(num);

//             }
//             num++;
//             System.out.println();
//         }
//     }
// }

// Q8. Reverse number triangle

// For n = 5:

// 12345
// 1234
// 123
// 12
// 1

// class Main{
//     public static void main(String []args){
//         int n = 5;
//         int num = 5;
//         for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=num;j++){
//                 System.out.print(j);
//             }
//             num--;
//             System.out.println();
//         }
//     }
// }

// Q9. Reverse counting triangle

// For n = 5:

// 54321
// 4321
// 321
// 21
// 1

// class Main{
//     public static void main(String [] args){
//         int n = 5;
//         int num = 5;
//         for(int i = 0;i<n;i++){
//             for(int j = num;j>0;j--){
//                 System.out.print(j);
//             }
//             num--;
//             System.out.println();
//         }
//     }
// }

// Q10. Continuous numbers

// For n = 4:

// 1
// 23
// 456
// 78910

// class Main{
//     public static void main(String []args){
//         int n = 4;
//         int num=1;
//         for(int i =0;i<n;i++){
//             for(int j =0;j<=i;j++){
//                 System.out.print(num);
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

// 🔴 Level 3 — Nested Loop Thinking

// Q11. Right-aligned triangle

// For n = 5:

//     *
//    **
//   ***
//  ****
// *****

// Hint: You'll need spaces + stars.

// class Main{
//     public static void main(String args[]){
//         int n = 5;
//         int space = n-1;
//         for(int i = 0;i<n;i++){
//             for(int j = space;j>0;j--){
//                 System.out.print(" ");


//             }
//             space --;
//             for(int k = 0;k<=i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Q12. Pyramid

// For n = 5:

//     *
//    ***
//   *****
//  *******
// *********

// class Main{
//     public static void main(String args[]){
//         int n = 5;
//         int space = 4;
//         for(int i = 0;i<n;i++){
//             for(int j = space;j>0;j--){
//                 System.out.print(" ");

//             }
//             space--;
//             for(int k = 0;k<2*i+1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// Q13. Inverted pyramid

// For n = 5:

// *********
//  *******
//   *****
//    ***
//     *


class Main{
    public static void main(String args[]){
        int n = 5;
        int space = 0;
        int stars = 9;
        for(int i = 0;i<n;i++){
            for(int k = 0;k<space;k++){
                System.out.print(" ");
            }
            for(int j = stars;j>0;j--){
                System.out.print("*");

            }
            stars-=2;
            space++;
            System.out.println();
        }
    }
}