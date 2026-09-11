// What are operators in java?
// --Operators are symbols that tell Java to perform an operation on values.


// Java operators can broadly be divided into:

// Arithmetic operators
// Relational operators
// Logical operators
// Assignment operators
// Unary operators
// Ternary operator
// Bitwise operators
// Shift operators

// 1. Arithmetic Operators

// These are the ones you'll use constantly.

// Operator	         Meaning	              Example
// +	               Addition	                   10 + 3 → 13
// -	               Subtraction	               10 - 3 → 7
// *	               Multiplication              10 * 3 → 30
// /	               Division	                   10 / 3 → 3
// %	               Remainder	               10 % 3 → 1

// checking even/odd
// extracting digits
// cyclic patterns
// divisibility
// array/index calculations

// 2. Relational Operators

// These compare two values.

// | Operator | Meaning                  |
// | -------- | ------------------------ |
// | `==`     | equal to                 |
// | `!=`     | not equal to             |
// | `>`      | greater than             |
// | `<`      | less than                |
// | `>=`     | greater than or equal to |
// | `<=`     | less than or equal to    |

// 3. Logical Operators

// These combine boolean conditions.

// AND &&

// Both conditions must be true.

// int age = 22;

// System.out.println(age >= 18 && age <= 60);

// Both are true:

// true && true → true
// --------------------------------------------
// OR ||

// At least one condition must be true.

// true || false → true
// false || false → false

// ------------------------------------------------
// NOT !

// Reverses the boolean value.

// boolean x = true;

// System.out.println(!x);

// Output:

// false


// 4.Assignment Operators

// Basic assignment:

// int x = 10;

// Here = means:

// assign the value on the right to the variable on the left.

// There are also compound assignment operators:
// x += 5;
// x -= 5;
// x *= 5;
// x /= 5;
// x %= 5;


// 5. Unary Operators 🔥

// Unary operators work on one operand.

// Increment ++
// int x = 5;

// x++;

// Now:

// x = 6
// Decrement --
// x--;

// decreases by 1.

// But there's an important concept:

// Pre-increment vs Post-increment

// This is VERY important.

// Post-increment
// int x = 5;
// int y = x++;

// First use x, then increment.

// So:

// y = 5
// x = 6
// Pre-increment

// int x = 5;
// int y = ++x;

// First increment, then use.

// So:

// x = 6
// y = 6

// Remember:

// x++ → use first, increase later
// ++x → increase first, use later

// 6. Ternary Operator

// The ternary operator is a short form of if-else.

// Syntax:

// condition ? valueIfTrue : valueIfFalse;

// Example:

// int a = 10;
// int b = 20;

// int max = (a > b) ? a : b;

// System.out.println(max);

// Output:

// 20

// It's very useful for simple conditions.


// 7.Bitwise Operators in Java

// Bitwise operators work on the individual bits of an integer.

// Before learning the operators, you need to understand what a bit is.

// 1. What is a bit?

// A computer stores integer values in binary.

// Binary uses only:

// 0 and 1

// For example:

// 5 = 101

// Because:

// 1 × 4 + 0 × 2 + 1 × 1
// = 4 + 0 + 1
// = 5

// Similarly:

// 3 = 011

// So if we have:

// 5 = 101
// 3 = 011

// A bitwise operator works directly on these 1s and 0s.

// 2. Why do we need Bitwise Operators?

// Suppose:

// int a = 5;
// int b = 3;

// Normally, when we write:

// a + b

// Java performs normal arithmetic.

// But:

// a & b

// means:

// Compare the individual bits of a and b.

// So:

// 5 = 101
// 3 = 011
// ---------
//      001

// Therefore:

// 5 & 3

// gives:

// 1
// 3. Main Bitwise Operators

// Java has these important bitwise operators:

// Operator	Name	Meaning
// &	Bitwise AND	Both bits must be 1
// `	`	Bitwise OR
// ^	Bitwise XOR	Bits must be different
// ~	Bitwise NOT	Flips every bit

// There are also shift operators:

// <<
// >>
// >>>

// We'll understand those separately after the four main ones.

// 4. Bitwise AND &

// The & operator compares two bits.

// Rule:
// 1 & 1 = 1
// 1 & 0 = 0
// 0 & 1 = 0
// 0 & 0 = 0

// In simple words:

// AND gives 1 only when BOTH are 1.

// Think:

// 1 AND 1 → YES
// anything else → NO
// Example
// int a = 5;
// int b = 3;

// System.out.println(a & b);

// Convert to binary:

// 5 = 101
// 3 = 011

// Now compare:

//   1 0 1
// & 0 1 1
// -------
//   0 0 1

// 001 is 1.

// Therefore:

// 5 & 3 = 1
// 5. Bitwise OR |

// The OR operator follows:

// 1 | 1 = 1
// 1 | 0 = 1
// 0 | 1 = 1
// 0 | 0 = 0

// In simple words:

// OR gives 0 only when BOTH are 0.

// Example:

// int a = 5;
// int b = 3;

// System.out.println(a | b);

// Binary:

// 5 = 101
// 3 = 011

// Perform OR:

//   1 0 1
// | 0 1 1
// -------
//   1 1 1

// 111 in decimal is:

// 4 + 2 + 1 = 7

// Therefore:

// 5 | 3 = 7
// 6. Bitwise XOR ^ ⭐ VERY IMPORTANT

// XOR means:

// Exclusive OR

// The rule is:

// 1 ^ 1 = 0
// 1 ^ 0 = 1
// 0 ^ 1 = 1
// 0 ^ 0 = 0

// The easiest way to remember:

// Same → 0
// Different → 1

// Example
// int a = 5;
// int b = 3;

// System.out.println(a ^ b);

// Binary:

// 5 = 101
// 3 = 011

// Compare:

//   1 0 1
// ^ 0 1 1
// -------
//   1 1 0

// 110 is:

// 4 + 2 = 6

// So:

// 5 ^ 3 = 6
// 🧠 Remember XOR
// Same     → 0
// Different → 1

// This becomes extremely important in DSA.

// For example, XOR has a very useful property:

// x ^ x = 0

// and:

// x ^ 0 = x

// For example:

// 5 ^ 5 = 0
// 5 ^ 0 = 5

// This is why XOR is used in problems like:

// "Find the number that appears only once while every other number appears twice."

// We'll study that later.

// 7. Bitwise NOT ~

// This one is slightly tricky.

// ~ means:

// Flip every bit.

// So:

// 0 → 1
// 1 → 0

// For example, conceptually:

// ~101

// becomes:

// 010

// But there is an important catch.

// Java's int uses 32 bits.

// So when you write:

// int a = 5;
// System.out.println(~a);

// Java isn't actually storing just:

// 101

// It uses 32 bits:

// 00000000 00000000 00000000 00000101

// Now ~ flips all 32 bits:

// 11111111 11111111 11111111 11111010

// This represents:

// -6

// Therefore:

// ~5

// gives:

// -6
// Important formula

// For an integer:

// ~x = -(x + 1)

// So:

// ~5 = -(5 + 1)
//    = -6

// And:

// ~10 = -(10 + 1)
//      = -11

// This formula is very useful for exams and coding questions.

// 8. Truth table — VERY IMPORTANT

// Memorize this:

// AND
// A	B	A & B
// 0	0	0
// 0	1	0
// 1	0	0
// 1	1	1
// OR
// A	B	A | B
// 0	0	0
// 0	1	1
// 1	0	1
// 1	1	1
// XOR
// A	B	A ^ B
// 0	0	0
// 0	1	1
// 1	0	1
// 1	1	0
// Easy memory trick 🎯
// AND → Both must be 1
// OR  → Any one can be 1
// XOR → Different = 1
// NOT → Flip
// 9. Let's compare all three with one example

// Take:

// 5 = 101
// 3 = 011
// AND
//   101
// & 011
// -----
//   001

// = 1
// OR
//   101
// | 011
// -----
//   111

// = 7
// XOR
//   101
// ^ 011
// -----
//   110

// = 6

// So:

// 5 & 3  → 1
// 5 | 3  → 7
// 5 ^ 3  → 6
// ~5     → -6
// 10. Bitwise operators vs Logical operators ⚠️

// This is VERY important because you have already learned logical operators.

// You have:

// &&
// ||
// !

// These are logical operators.

// Whereas:

// &
// |
// ^
// ~

// are bitwise operators.

// Logical AND
// true && false

// Result:

// false

// It works with boolean conditions.

// Bitwise AND
// 5 & 3

// Result:

// 1

// It works on the bits of integer values.

// So:

// && → logical AND
// &  → bitwise AND

// || → logical OR
// |  → bitwise OR

// Don't confuse them.

// 11. Why is & sometimes used with boolean?

// Java also allows:

// boolean a = true;
// boolean b = false;

// System.out.println(a & b);

// Output:

// false

// But there is an important difference:

// &&

// is short-circuit logical AND, while

// &

// can perform a boolean AND without short-circuiting.

// For now, since you're learning DSA fundamentals, remember:

// Integers → think bitwise
// boolean  → think logical

// We'll come back to the short-circuit difference later.

// 12. A very important DSA example — checking even/odd ⭐

// Bitwise AND has a famous use.

// Consider:

// 1 = 001
// 2 = 010
// 3 = 011
// 4 = 100
// 5 = 101
// 6 = 110
// 7 = 111

// Look at the last bit:

// Odd numbers → last bit = 1
// Even numbers → last bit = 0

// Therefore:

// n & 1

// can tell us whether n is odd or even.

// Example:

// int n = 5;

// System.out.println(n & 1);

// Binary:

// 5 = 101
// 1 = 001

//   101
// & 001
// -----
//   001

// Result:

// 1

// So 5 is odd.

// For:

// int n = 6;
// 6 = 110
// 1 = 001

//   110
// & 001
// -----
//   000

// Result:

// 0

// So 6 is even.

// Therefore:
// if ((n & 1) == 0)
//     System.out.println("Even");
// else
//     System.out.println("Odd");

// You'll see this technique frequently in DSA.

// 13. Another important use — checking whether a bit is ON/OFF

// Suppose:

// number = 13

// Binary:

// 13 = 1101

// Suppose we want to check a particular bit.

// We can use a mask.

// For example:

// 1101
// 0001
// ----
// 0001

// This tells us that the last bit is 1.
  
//   8.Shift Operator

// 1. First: What does "shift" mean?

// Remember that an integer is stored in binary.

// For example:

// 5 = 101

// If we shift these bits to the left:

// 101
//  ↓↓↓
// 1010

// We've moved every bit one position to the left.

// If we shift to the right:

// 101
//  ↓↓↓
// 10

// We've moved every bit one position to the right.

// That's literally what shift means.

// 2. Left Shift <<

// Syntax:

// number << positions

// It means:

// Move the bits of number to the left by the specified number of positions.

// For example:

// int x = 5;

// System.out.println(x << 1);

// First:

// 5 = 101

// Now shift left by 1:

// 101
// ↓
// 1010

// 1010 in decimal:

// 1 × 8 + 0 × 4 + 1 × 2 + 0 × 1
// = 8 + 2
// = 10

// Therefore:

// 5 << 1 = 10
// 3. What happens to the empty space?

// This is important.

// Suppose:

// 101

// We shift left by 1:

// 1010

// A 0 is added on the right.

// So:

// 101 << 1

// conceptually becomes:

// 1010

// Similarly:

// 101 << 2

// becomes:

// 10100

// So left shifting by n positions adds n zero bits on the right.

// 4. Left shift and multiplication ⭐

// For suitable integer values, left shift is equivalent to multiplying by powers of 2.

// x << 1 = x × 2
// x << 2 = x × 4
// x << 3 = x × 8
// x << 4 = x × 16

// Why?

// Because every position in binary represents a power of 2.

// Example:

// 5 = 101

// Shift left once:

// 1010 = 10

// That's:

// 5 × 2 = 10

// Shift twice:

// 10100 = 20

// That's:

// 5 × 4 = 20

// So:

// System.out.println(5 << 1);  // 10
// System.out.println(5 << 2);  // 20
// System.out.println(5 << 3);  // 40
// 5. Formula for <<

// For normal positive values where overflow isn't involved:

// x << n = x × 2ⁿ

// Example:

// 7 << 3

// Calculate:

// 7 × 2³
// = 7 × 8
// = 56

// Therefore:

// System.out.println(7 << 3);

// Output:

// 56
// 6. Let's visualize it

// Take:

// 6 = 110
// 6 << 1
// 110
//  ↓
// 1100
// 1100 = 12

// So:

// 6 << 1 = 12
// 6 << 2
// 110
//  ↓↓
// 11000
// 11000 = 24

// So:

// 6 << 2 = 24
// 6 << 3
// 110
//  ↓↓↓
// 110000
// 110000 = 48

// So:

// 6 << 3 = 48
// 7. Right Shift >>

// Now let's go in the opposite direction.

// Syntax:

// number >> positions

// It means:

// Move the bits toward the right.

// Example:

// int x = 20;

// System.out.println(x >> 1);

// Convert 20 to binary:

// 20 = 10100

// Shift right by 1:

// 10100
//  ↓
// 01010

// The leading zero doesn't matter:

// 1010

// And:

// 1010 = 10

// Therefore:

// 20 >> 1 = 10
// 8. Right shift and division ⭐

// For positive integers:

// x >> 1 ≈ x / 2
// x >> 2 ≈ x / 4
// x >> 3 ≈ x / 8

// More precisely, for non-negative integers:

// x >> n = floor(x / 2ⁿ)

// Example:

// 20 >> 1

// means:

// 20 / 2
// = 10

// And:

// 20 >> 2

// means:

// 20 / 4
// = 5

// So:

// System.out.println(20 >> 1); // 10
// System.out.println(20 >> 2); // 5
// 9. What happens to the bits that fall off?

// Suppose:

// 20 = 10100

// Shift right by 2:

// 10100
//   ↓↓
// 00101

// The two bits on the right:

// 00

// are shifted out/discarded.

// Result:

// 00101 = 5

// So:

// 20 >> 2 = 5
// 10. A VERY important difference: >> vs >>>

// This is where many beginners get confused.

// Java has:

// >>>

// called the unsigned right shift operator.

// While:

// >>

// is called the signed right shift or arithmetic right shift.

// The difference becomes important with negative numbers.

// Before that, we need to understand how Java stores negative integers.

// 11. Java int uses 32 bits

// An int occupies:

// 32 bits

// For example, 5 is represented conceptually as:

// 00000000 00000000 00000000 00000101

// But negative numbers are represented using two's complement.

// You don't need to master two's complement yet, but you need one important fact:

// The leftmost bit is the sign bit.

// 0 → positive
// 1 → negative

// For example, a negative number starts with:

// 1............... 
// 12. Signed right shift >>

// When we use:

// >>

// Java preserves the sign.

// That means:

// Positive number

// Zeros are inserted from the left.

// Negative number

// Ones are inserted from the left.

// This is called sign extension.

// 13. Example with positive number

// Take:

// 20 = 00010100

// Conceptually using 8 bits:

// 00010100

// Now:

// 20 >> 2

// Shift right:

// 00010100
//     ↓↓
// 00000101

// Result:

// 5

// No surprise.

// 14. Example with a negative number

// Take:

// int x = -8;
// System.out.println(x >> 1);

// The binary representation of -8 in 32-bit two's complement starts:

// 11111111 11111111 11111111 11111000

// Now:

// -8 >> 1

// Because >> preserves the sign, Java fills the left side with 1s:

// 11111111 11111111 11111111 11111100

// That represents:

// -4

// Therefore:

// -8 >> 1 = -4

// So for negative numbers, >> behaves approximately like division by 2, with Java's integer rounding behavior.

// 15. Unsigned right shift >>>

// Now:

// x >>> n

// means:

// Shift bits to the right and always fill the empty positions on the left with 0.

// It does not care whether the number is positive or negative.

// For example:

// int x = -8;

// System.out.println(x >>> 1);

// The original bits:

// 11111111 11111111 11111111 11111000

// After >>> 1:

// 01111111 11111111 11111111 11111100

// Notice the difference:

// >>:

// 11111111 11111111 11111111 11111100
// ^
// 1 inserted

// >>>:

// 01111111 11111111 11111111 11111100
// ^
// 0 inserted

// That produces a large positive integer.

// 16. The most important difference

// Remember this table:

// Operator	Direction	What gets inserted?
// <<	Left	0 on right
// >>	Right	Sign bit on left
// >>>	Right	Always 0 on left

// Or even simpler:

// <<
// Move left → 0 comes from right

// >>
// Move right → preserve sign

// >>>
// Move right → 0 comes from left
// 17. >> vs >>> with positive numbers

// This is important:

// For positive numbers, >> and >>> generally produce the same result.

// Example:

// int x = 20;

// System.out.println(x >> 2);
// System.out.println(x >>> 2);

// Both give:

// 5

// Why?

// Because positive numbers already have 0 as the sign bit.

// So whether Java:

// preserves the sign

// or:

// inserts 0

// the result is the same.

// 18. >> vs >>> with negative numbers

// This is where they differ.

// Take:

// int x = -8;
// x >> 1

// Preserves sign:

// 11111111 11111111 11111111 11111100

// Result:

// -4
// x >>> 1

// Adds zero:

// 01111111 11111111 11111111 11111100

// Result:

// 2147483644

// So:

// -8 >> 1

// gives:

// -4

// while:

// -8 >>> 1

// gives:

// 2147483644

// That's a HUGE difference.

// 19. Why is >>> result so huge?

// This is a very common question.

// Remember:

// int = 32 bits

// -8:

// 11111111 11111111 11111111 11111000

// After >>> 1:

// 01111111 11111111 11111111 11111100

// Now the first bit is:

// 0

// So the number is positive.

// And almost every remaining bit is 1.

// That's why the number is extremely large:

// 2147483644
// 20. Shift amount — another important rule ⚠️

// Suppose:

// int x = 10;

// You might write:

// x << 40

// But an int has 32 bits.

// Java doesn't literally shift an int by 40 positions.

// For int, Java uses only the lowest 5 bits of the shift amount.

// Effectively:

// 40 % 32 = 8

// So:

// x << 40

// acts like:

// x << 8

// Similarly:

// x >> 40

// acts like:

// x >> 8

// because:

// 40 % 32 = 8

// For long, which has 64 bits, the shift amount is effectively taken modulo 64.

// This is an exam/interview-level detail. You don't need to memorize every edge case yet, but remember that Java does not treat an int shift count as an unrestricted number of positions.

// 21. What about negative shift amounts?

// This is another interesting Java behavior.

// You might think:

// 5 << -1

// would be an error.

// But Java doesn't directly throw an error because the shift distance is masked.

// For an int, the shift count is effectively reduced to the low 5 bits.

// So:

// -1

// has the low 5 bits corresponding to:

// 31

// Therefore:

// 5 << -1

// effectively behaves like:

// 5 << 31

// This is generally not something you should intentionally write. Just remember:

// Shift amounts in Java have special masking behavior.

// 22. Shift operators don't modify the original variable

// This is important.

// Suppose:

// int x = 5;

// x << 1;

// Does x become 10?

// No.

// Just like:

// x + 5;

// doesn't modify x.

// You need:

// x = x << 1;

// or:

// x <<= 1;

// Then x becomes 10.

// Example:

// int x = 5;

// System.out.println(x << 1);
// System.out.println(x);

// Output:

// 10
// 5
// 23. Compound shift assignment operators

// Java also provides:

// <<=
// >>=
// >>>=

// For example:

// int x = 5;

// x <<= 1;

// means:

// x = x << 1;

// So:

// x = 5
// x <<= 1
// x = 10

// Similarly:

// x >>= 1;

// means:

// x = x >> 1;

// And:

// x >>>= 1;

// means:

// x = x >>> 1;
// 24. Shift vs multiplication/division

// You may hear:

// x << 1 = x * 2
// x >> 1 = x / 2

// This is useful for understanding bit manipulation, but don't blindly replace every multiplication/division with shifts.

// For example, with overflow, negative values, and language semantics, the equivalence has limitations.

// For normal positive values:

// x << n = x × 2ⁿ

// and:

// x >> n = floor(x / 2ⁿ)

// are good rules.

// But when you're writing normal Java code, write:

// x * 2

// if multiplication is what you mean.

// Use shifts when you're intentionally doing bit manipulation or when the algorithm calls for it.

// 25. Very important DSA connection — powers of 2

// Suppose you want:

// 2⁵

// You can write:

// 1 << 5

// Why?

// Binary:

// 1 = 00001

// Shift left 5:

// 100000

// That's:

// 32

// Therefore:

// 1 << 5

// gives:

// 32

// So:

// 1 << n = 2ⁿ

// This is extremely common in bit manipulation.

// Examples:

// 1 << 0  // 1
// 1 << 1  // 2
// 1 << 2  // 4
// 1 << 3  // 8
// 1 << 4  // 16
// 1 << 5  // 32
// 1 << 6  // 64
// 1 << 7  // 128

// You'll see this a lot in DSA.

// 26. Bit positions

// Let's look at:

// 8 4 2 1

// These correspond to:

// 2³ 2² 2¹ 2⁰

// For:

// 1011

// we have:

// 1  0  1  1
// ↑  ↑  ↑  ↑
// 8  4  2  1

// Therefore:

// 8 + 0 + 2 + 1 = 11

// Now shifting left by one:

// 1011
//  ↓
// 10110

// The bit positions all move one place:

// 2³ → 2⁴
// 2¹ → 2²
// 2⁰ → 2¹

// So the entire number gets multiplied by 2.

// That's the deeper reason << multiplies by powers of 2.

// 27. Another DSA connection — extracting bits

// Suppose:

// int n = 13;

// Binary:

// 1101

// You may eventually want to inspect individual bits.

// For example:

// (n >> 0) & 1

// checks bit 0.

// (n >> 1) & 1

// checks bit 1.

// (n >> 2) & 1

// checks bit 2.

// (n >> 3) & 1

// checks bit 3.

// For:

// 13 = 1101

// the bits are:

// bit 3 → 1
// bit 2 → 1
// bit 1 → 0
// bit 0 → 1

// This combination:

// >> + &

// is one of the most fundamental techniques in bit manipulation.

// We'll study it properly when we reach bit masking.

// 28. A complete example

// Let's put everything together:

// class Main {
//     public static void main(String[] args) {

//         int x = 20;

//         System.out.println(x << 1);
//         System.out.println(x << 2);

//         System.out.println(x >> 1);
//         System.out.println(x >> 2);

//         System.out.println(x >>> 1);
//         System.out.println(x >>> 2);
//     }
// }

// Output:

// 40
// 80
// 10
// 5
// 10
// 5

// Why are >> and >>> the same here?

// Because 20 is positive.

// 29. Negative number example
// class Main {
//     public static void main(String[] args) {

//         int x = -8;

//         System.out.println(x >> 1);
//         System.out.println(x >>> 1);
//     }
// }

// Output:

// -4
// 2147483644

// Because:

// >>  → preserves sign
// >>> → inserts 0
// 🧠 The BIG picture

// You can visualize the three operators like this:

// <<
// 1011 << 1

// 1011
//  ↓↓↓↓
// 10110

// Move left, add 0 on right.

// >>
// 101100 >> 1

// 101100
//  ↓↓↓↓
// 010110

// Move right, preserve the sign.

// >>>

// For positive numbers it looks the same:

// 101100 >>> 1

// For negative numbers:

// 11111111...
//        ↓
// 01111111...

// Move right, always put 0 on the left.

// 🎯 Memorize this table
// Operator	Meaning	Positive number	Negative number
// <<	Left shift	Shift left + 0 on right	Shift left + 0 on right
// >>	Signed right shift	0 enters left	1 enters left
// >>>	Unsigned right shift	0 enters left	0 enters left

// And these formulas:

// x << n  ≈ x × 2ⁿ
// x >> n  ≈ x / 2ⁿ
// 1 << n  = 2ⁿ

// for the usual non-overflow/non-negative cases.

// ⭐ Most important distinction:
// <<   → LEFT
// >>   → RIGHT + preserve SIGN
// >>>  → RIGHT + put ZERO

// If you understand why >> and >>> differ for negative numbers, you've understood the hardest part of shift operators.