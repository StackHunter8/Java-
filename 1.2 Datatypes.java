// // in java we can easily convert the datatype having the short range two teh datatype having the large range.

// class Datatypes{

//     public static void main(String []args){
//         // char a = "String";
//         // System.out.println(a);
//         // you cannot store the datatype with the larger range into the short range one ...doing this causses this error
//         // incompatible types: String cannot be converted to char
//         // char a = "String";

//         // int b = 'a';
//         // System.out.println(b); this prints the ascii val of a;

//         int a = 10;
//         char b = 'A';
//         float c = 10.5f;
//         double d = 10.5;
//         String s = "Hello";
        
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
//         System.out.println(s);




        

//     }
// }
 
// 1. Data types and its ranges ...
// | Data Type |          Size | Example             |
// | --------- | ------------: | ------------------- |
// | `byte`    |         8-bit | `byte x = 10;`      |
// | `short`   |        16-bit | `short x = 1000;`   |
// | `int`     |        32-bit | `int x = 100000;`   |
// | `long`    |        64-bit | `long x = 100000L;` |
// | `float`   |        32-bit | `float x = 10.5f;`  |
// | `double`  |        64-bit | `double x = 10.5;`  |
// | `char`    |        16-bit | `char c = 'A';`     |
// | `boolean` | JVM-dependent | `boolean b = true;` |


// 2. The first important concept: Widening Conversion
// Suppose we have:

// int x = 10;
// float y = x;

// This works.

// Why?

// Because float can represent a much larger range of values than int.

// Conceptually:
// byte
//   ↓
// short
//   ↓
// int
//   ↓
// long
//   ↓
// float
//   ↓
// double

// This is called widening conversion.

// Java can perform it automatically:

// int x = 10;
// long y = x;
// float z = y;
// double a = z;

// No explicit casting is required.


// 3. Narrowing Conversion

// Now try:

// double x = 10.5;
// int y = x;

// ❌ This doesn't compile.

// Java doesn't automatically convert double → int because information can be lost.

// You have to explicitly tell Java:

// "I know I'm losing information. Convert it anyway."

// Using casting:

// double x = 10.5;
// int y = (int) x;

// Now:

// x = 10.5
// y = 10

// The decimal portion is discarded, not rounded.

// 4. char and int are interesting ⭐

// A char internally represents a Unicode code unit, so it can participate in numeric conversions.

// For example:

// char c = 'A';
// int x = c;

// System.out.println(x);

// Output:

// 65

// Because 'A' has Unicode value 65.

// The reverse:

// int x = 66;
// char c = (char)x;

// System.out.println(c);

// Output:

// B

// This is particularly useful in string and character-based DSA problems.

// 5. One thing you should NOT assume

// You might think:

// int → float → double

// means float can represent every possible int value exactly.

// That's not true.

// float has a wider range than int, but it has less precision for many integer values.

// For example, sufficiently large integers can lose exact precision when converted to float.

// This becomes important later when dealing with numerical problems.


// 6.Explicit casting syntax

// The general syntax is:

// targetType variable = (targetType) value;

// Example:

// double d = 25.75;

// int x = (int)d;
// 25.75 → 25

// Another:

// long l = 1000;

// int x = (int)l;
// 7. A very important DSA issue: integer division 🔥

// Look at:

// int a = 5;
// int b = 2;

// System.out.println(a / b);

// Output:

// 2

// Not:

// 2.5

// Because both operands are integers, so Java performs integer division.

// But:

// double result = (double)a / b;

// gives:

// 2.5

// This is extremely important in DSA.

// For example, when calculating an average:

// int sum = 10;
// int count = 4;

// double average = sum / count;

// ❌ You get:

// 2.0

// because sum / count happens as integer division before assignment to double.

// Instead:

// double average = (double) sum / count;

// ✅

// Result:

// 2.5
// 8. One more thing: overflow

// Consider:

// int a = 2_000_000_000;
// int b = 2_000_000_000;

// int result = a + b;

// You might expect:

// 4,000,000,000

// But int cannot store that value.

// Its maximum is:

// 2,147,483,647

// So you can get integer overflow.

// A common DSA solution is:

// long result = (long)a + b;

// This is another reason understanding data types is important before starting DSA.