// Q1. Arithmetic Operators

// What will be the output?

// int a = 15;
// int b = 4;

// System.out.println(a + b);
// System.out.println(a - b);
// System.out.println(a * b);
// System.out.println(a / b);
// System.out.println(a % b);

// Also explain the difference between / and %.

// o/p
// 19
// 11
// 60
// 3
// 3
// the / returns the quotient and % returns the reemainder
// -----------------------------------------------------------------------------------------------
// Q2. Relational Operators

// What will each statement print?

// int a = 10;
// int b = 20;

// System.out.println(a > b);
// System.out.println(a < b);
// System.out.println(a == b);
// System.out.println(a != b);
// System.out.println(a >= 10);
// System.out.println(b <= 15);

// o/p
// false 
// true
// false
// true
// true
// false
// ---------------------------------------------------------------------------------------------------------------

// Q3. Assignment + Compound Assignment

// What is the final value of x?

// int x = 10;

// x += 5;
// x -= 3;
// x *= 2;
// x /= 4;
// x %= 3;

// System.out.println(x);

// 0/p
// 15
// 12
// 24
// 6
// 0

// ---------------------------------------------------------------------------------------------------------------
// Q4 — Logical Operators
// int age = 22;
// boolean hasID = true;

// System.out.println(age >= 18 && hasID);
// System.out.println(age < 18 && hasID);
// System.out.println(age >= 18 || false);
// System.out.println(!hasID);

// Give me the 4 outputs in order, and 
// briefly tell me what &&, ||, and ! mean.

// o/p
// true
// false
// true
// false
 
// the && operator returns true if both operandss are true else it returns  false the || operator return false if both operands are false else it returns true and ! simply changes true to false and vise versa 

// Q5. Pre-Increment vs Post-Increment 🔥

// What is the output?

// int a = 5;

// System.out.println(a++);
// System.out.println(a);

// System.out.println(++a);
// System.out.println(a);

// Explain exactly when a changes.

// o/p
// 5
// 6
// 7
// 7
// in the first print statement first the value gets print and then the increment happens so the op is 5 and then 6 and in the third statement first increemnt happens so x becomes 7 and then again it prints 7 


// Q6. Ternary Operator

// Convert this if-else into a ternary expression:

// int age = 20;

// if (age >= 18) {
//     System.out.println("Eligible");
// } else {
//     System.out.println("Not Eligible");
// }

// Then write the equivalent using:

// condition ? value1 : value2

class Main{
    public static void main(String [] args){
        int age = 20;
        String value = (age>=18 ) ? "Elligible" : "Not elligible";
        System.out.println(value);
    }
}

// // Q7. Integer Division + Operators ⭐

// // What is the output?

// // int a = 5;
// // int b = 2;

// // System.out.println(a / b);
// // System.out.println((double) a / b);
// // System.out.println((double)(a / b));
// // System.out.println(a * 1.0 / b);

// // Explain why the four answers are not all the same.

// // o/p
// // 2  //coz the division happens and the digits after point get diascarded
// // 2.5  //coz the a gets typecasted into double and as per the rule of typecasting the result inherits the datatype that has wider range among the two operands.
// // 2.0 because first the division takes place and then the result is converted into double and as there are no digits present after 2 they didnt get stored in the result
// // 2.5 due to the multiplication by 1.0


// Q8 — Combined Logical Operators
// int a = 10;
// int b = 5;

// boolean result = a > b && b != 0 && a % b == 0;

// System.out.println(result);

// o/p true

// Q9 — Bitwise + Shift Operators
// int a = 5;
// int b = 3;

// System.out.println(a & b);
// System.out.println(a | b);
// System.out.println(a ^ b);

// System.out.println(a << 1);
// System.out.println(a >> 1);

// Give me the 5 outputs in order.

// 💡 Hint:

// 5 = 101
// 3 = 011

// Use the bitwise rules we learned for &, |, ^, and shifts.

// o/p
// Given:

// int a = 5;  // 101
// int b = 3;  // 011
// 1. a & b
//   101
// & 011
// -----
//   001

// 001 = 1

// 2. a | b
//   101
// | 011
// -----
//   111

// 111 = 7

// 3. a ^ b
//   101
// ^ 011
// -----
//   110

// 110 = 6

// 4. a << 1

// Shift 101 one position left:

// 101 → 1010

// 1010 = 10

// 5. a >> 1

// Shift 101 one position right:

// 101 → 010

// 010 = 2

// ✅ Correct outputs
// 1
// 7
// 6
// 10
// 2
// 🧠 Quick memory trick
// & → both must be 1
// | → at least one must be 1
// ^ → different = 1
// << 1 → roughly × 2
// >> 1 → roughly ÷ 2 for positive numbers

// Q10 — Final Combined Operator Question 🚀

// This one combines assignment, increment, ternary, relational, logical, and %:

// int a = 10;
// int b = 3;

// a += b;
// b++;

// int c = a > b ? a * 2 : b * 2;

// boolean result = c > 20 && a % b == 0;

// System.out.println(a);
// System.out.println(b);
// System.out.println(c);
// System.out.println(result);

// Give me:

// The 4 outputs
// The value of a, b, and c after each important step
// Whether result is true or false

// Take it step-by-step—don't try to calculate everything at once.
// o/p
// 13
// 4
// 26
// false


// ⭐ Bonus Challenge

// This one combines almost everything you've learned so far:

// int a = 5;
// int b = 2;

// int result = ++a * 2 + b-- * 3;

// System.out.println(a);
// System.out.println(b);
// System.out.println(result);

// Find:

// a = ?
// b = ?
// result = ?

// And explain the exact order in which the operators are evaluated.

// o/p 6 here due to pre increment the increment is done by 1 1 as the print statement is after the result where the actual decrement has taken place the value of b is reduced 18 here first the increment of a happend 5 becomes 6 then 6 * 2 becomes 12 then the b remains 2 coz post decrement is used and then 2 *3 = 6 and finally 12 + 6 becomes 18

// 🏆 Final Operators Assignment Score

// 100/100 🎉

// You've now covered the complete Java Operators topic, including the trickier parts like:

// ++a vs a++
// b--
// integer division
// type promotion
// %
// ternary
// logical operators
// bitwise operators
// shifts
// compound assignment
// combined expressions and evaluation order

// Next logical step: learn Operator Precedence & Associativity properly, because that will make expressions like the bonus question much easier to evaluate confidently.