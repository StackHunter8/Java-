// what are Objects?
//     --Objects are nothing but the blueprint of the classes.
//     --objects contains the pointer to the speacial structure,the instance variables ,contructor of that particular class and all the  methods belonging to that class.
//     --The object creation totally depends on what type does the method that we are going to call on the reference of the class/object belongs to.
//     --if the method is static and needs to be called then the object can be created by two ways 1. by the class name and the method name 2.by creating the reference variable .
//     --if the method is non static then the object gets created only with the help of reference variables.

//  what are classes? 
//     -- classes is nothing but a term that all together holds the contructor,instance variables, and the methods that are declared inside the classes.


class Codex{
    public static void main(String [] args){
        // Demo.fun();//1st way 
        // Demo.gun();// this gives error as  error: non-static method gun() cannot be referenced from a static context Demo.gun();
      //  this happend because there is a special place for static methods and the static variables in java ...when you create the object or call any method the first thing happens is the call to static block where all these static methods and the variables are stored.Also the static methods and the variables are the part of the class and not of the object.the instance methods are the part of object and thus they need to get called trough the object creatrion . 
      
      
        Demo d = new Demo();//2nd way 
        // d.fun();
        d.gun();
    }
}

class Demo{
    static void fun(){
        System.out.println("in static fun method ");
    }

    void gun(){
        System.out.println("In non static gun method ");

    }
}