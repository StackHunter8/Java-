// // 1. Create and Display an Object

// // Create a class Student with:

// // name
// // age

// // Create an object of Student using the new keyword, assign values, and print them.


// Code 
// class Demo{
//     public static void main(String []args){
//             Student s1 = new Student();
//             s1.name = "Parnika";
//             s1.age = 22;

//             System.out.println("Name :" + s1.name + " Age :" + s1.age);
//     }
// }

// class Student{
//     String name;
//     int age;
// }


// 2. Multiple Objects

// Create a class Car with:

// brand
// price

// Create two different objects of Car and assign different values to each.

// Print both objects' information.

// code

// class Demo{


//         public static void main(String []args){
//             Car c = new Car();
//             c.brand = "Lamborgini";
//             c.price = 1700000000;

//             Car c1 = new Car();
//             c1.brand = "Defender";
//             c1.price = 10000000;

//             System.out.println("Car 1: " + c.brand + " " + c.price);
//             System.out.println("Car 2: " + c1.brand + " " + c1.price);
//         }
// }

// class Car{
//         String brand;
//         int price;

// }


// 3. Reference vs Object

// Consider:

// class Demo {
//     int x = 10;
// }

// public class Main {
//     public static void main(String[] args) {
//         Demo d1;
//         Demo d2 = new Demo();
//         Demo d3 = null;
//     }
// }

// Answer:

// Which variables are reference variables? --> d1,d2,d3.
// Which statement actually creates an object?--> Demo d2 = new Demo();
// Which variable currently refers to an object?--> d2
// Which variable contains null?--> --> d3
// Does d1 refer to an object? --> No


// 🟡 Medium — 4 Questions
// 4. Object Creation Using a Constructor

// Create a class Employee having:

// id
// name
// salary

// Create a parameterized constructor and create an object like:

// Employee e1 = new Employee(101, "Amit", 45000);

// Display all the employee details.

// Concept: Object creation + constructors


// class Employee{
//         int id;
//         String name;
//         long salary;

//         public Employee(int id ,String name,long salary){

//                 this.id = id;
//                 this.name = name;
//                 this.salary = salary;
//         }

// }

// class Main{
//         public static void main(String [] args){
//                 Employee emp = new Employee(101,"Parnika",30000);
//                 System.out.println( emp.id + " " + emp.name + " " + emp.salary + ".");
//         }
// }


// 5. What Happens When Two References Point to One Object?

// Consider:

// class Student {
//     String name;
// }

// public class Main {
//     public static void main(String[] args) {

//         Student s1 = new Student();
//         s1.name = "Rahul";

//         Student s2 = s1;

//         s2.name = "Amit";

//         System.out.println(s1.name);
//         System.out.println(s2.name);
//     }
// }
// Your task:

// Predict the output without running the program.

// Then explain:

// How many objects were created? --> one
// How many reference variables exist? --> two
// Do s1 and s2 point to the same object? --> yes
// Why does changing s2.name affect s1.name? -->because first object is created and it gets stored in s1 then a name is assigned to the instance variable name and then the entire s1 that contains instance of student class is stored in s2 ..so here both the reference variables are pointing to the same object as they share the common address of the object ..and also for s2 varibale there is no new instance created of the Student class and thats the reason they share the same address and thus the changes made in s2.name get reflected in s1.name

// Concept: References and objects ⭐


// 6. Create Objects Using a Method

// Create a class:

// class Student {
//     String name;
//     int marks;
// }

// Create a method:

// static Student createStudent()

// The method should create a Student object, initialize its values, and return the object.

// Then:

// Student s = createStudent();

// Print the student's details.

// class Student{
//         String name;
//         int marks;
//       public Student(String name,int marks){
//         this.name = name;
//         this.marks = marks;
//       }
       
// }

// class Main{
//         public static void main(String args[]){

//                 Student s1 = createStudent();
//                 System.out.println(" Student name : " + s1.name + " Student Marks : "+ s1.marks);
//         }
//                 static Student createStudent(){
//                         Student s = new Student("Parnika",90);
                      
//                 return s;
//                   } 
// }


// 7. Object Creation Without Direct Initialization

// Create a class BankAccount with:

// accountNumber
// holderName
// balance

// Create an object first:

// BankAccount account = new BankAccount();

// Then initialize its values using a separate method:

// setDetails(...)

// Finally display the details.

// Concept: Default constructor, object initialization, methods


// class BankAccount{
//         int accountNumber;
//         String holderName;
//         long balance;

//         public void setAccountNumber(int accountNumber){
//                 this.accountNumber = accountNumber;
//         }

//         public int getAccountNumber(){
//                 return accountNumber;
//         }

//         public void setHolderName(String holderName){
//                 this.holderName = holderName;
//         }
//         public String getHolderName(){
//                 return holderName;
//         }

//         public void setBalance(long balance){
//                 this.balance = balance;
//         }
//         public long getBalance(){
//                 return balance;
//         }

// }

// class Main{
//         public static void main(String args[]){
//                 BankAccount b = new BankAccount();
//                 setDetails(b);
//                 int accountNumber = b.getAccountNumber();
//                 String name = b.getHolderName() ;
//                 long balance = b.getBalance();

                
//                 System.out.println(accountNumber + " " + name + " " + balance);
//         }

//         static void  setDetails(BankAccount b){
//                 b.setAccountNumber(27);
//                 b.setHolderName("Nika");
//                 b.setBalance(100000000);
//         }
// }



// // --Hard
// 8. How Many Objects Are Created?

// Without executing the code, determine the number of objects created:

// class Test {
//     int x;

//     Test() {
//         x = 10;
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Test t1 = new Test();
//         Test t2 = new Test();
//         Test t3 = t1;
//         Test t4 = new Test();

//         t3.x = 50;

//         System.out.println(t1.x);
//         System.out.println(t2.x);
//         System.out.println(t3.x);
//         System.out.println(t4.x);
//     }
// }

// Answer:

// Number of objects created? --> three
// Number of reference variables?--> four
// Output?--> 50 10 50 10
// Which references point to the same object?--> t1 and t3
// How many objects are eligible for garbage collection? --> zero

// garbage collector works when there is no reference variable pointing to object ..for eg object created and storted in t1 reference variable and then the t1 is made null then in this senario there is noreference variaable pointing to the object..thus the garbage collector comes and collects that object..

// Concept: Object vs reference ⭐⭐⭐


// 9. Object Creation + Array of Objects

// Create a class:

// class Student {
//     String name;
//     int marks;
// }

// Create an array capable of storing 5 Student references:

// Student[] students = new Student[5];

// Then create 5 Student objects and store them in the array.

// Display all students.

// Important:

// Understand the difference between:

// Student[] students = new Student[5];

// and:

// students[0] = new Student();

// Your task is to explain what each statement creates.

// Concept: Arrays of objects ⭐⭐⭐

// DSA relevance: Extremely high.

class Student {
    String name;
    int marks;

    public Student(String name,int marks){
        this.name= name;
        this.marks= marks;
    }
}


class Main{
        public static void main(String [] args){
                Student[] students = new Student[5];// here the array of length 5 is created and the Student is the reference type, and each element of the array can store a reference to a Student object.. also  students is a reference to an array object whose elements are of type Student...

                students[0] = new Student("Parnika",90);//here the first obj is created of Student and the values are inserted..the students[0] denotes the first position of the array.and here only 1 object is created.
                students[1] = new Student("Niraj",95);
                students[2] = new Student("kaustubh",80);
                students[3] = new Student("Ashwini",70);
                students[4] = new Student("Nika",100);

                for(int i = 0;i < students.length;i++){
                        System.out.println(students[i].name + " : "+ students[i].marks);
                }
        }
}


// 10. Reference Reassignment Challenge 🔥

// Predict the output without executing:

// class Demo {
//     int value;

//     Demo(int value) {
//         this.value = value;
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Demo d1 = new Demo(10);
//         Demo d2 = new Demo(20);

//         d1 = d2;

//         d2.value = 50;

//         System.out.println(d1.value);
//         System.out.println(d2.value);
//     }
// }

// Then answer:

// How many objects were created? -->two
// What happens to the original object containing 10? -->  d1 is re initialized to reference variable d2 and thus now d1 and d2 both point to the sec object..
// What object does d1 refer to after d1 = d2? --> d1 refers to the 2nd obj 
// Why does d1.value become 50? --> as both d1 and d2 aree pointing to same object then the changes made by using  the d2 reference variable are reflected in the object and as d1 also points the same object it also reads the value as 50
// Is the original Demo(10) object still accessible? --> no the first object is not accessible because d1 is now pointng to the sec obj created and thus the first obj doesnt have any reference variable pointing towards it and thus it becomes elligible for garbage collection

// Concept: Reference reassignment + garbage collection ⭐⭐⭐




// 🏆 Object Creation Topic: Completed

// You've now covered:

// new keyword
// Reference variables
// Constructors
// Multiple objects
// Objects as method return values
// Passing objects to methods
// Arrays of objects
// Reference sharing
// Reference reassignment
// Garbage collection

