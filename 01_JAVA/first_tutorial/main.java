/*
every file in  java is a class itself ,
class → Capital 
access modifiers → public , private , protected
public → can be accessed from anywhere
private → can be accessed only from the same class
protected → can be accessed from the same package and from the sub classes
default → can be accessed from the same package
java is platform independent > write once run anywhere>
because of JVM (java virtual machine)
*/

//public means that this class can be accessed from anywhere
//class named group of properties and methods
//main is the name of the class and file name should be same as class name

// package first_tutorial;
// package is a folder in java,

//use "." instead of "/" in java

import java.util.Scanner;

public class main {
  // this is the Main function of C++

  // this public makes this function accessible from anywhere
  // static -> we are running this function without creating an object of our
  // {file name} class
  // but main is the enrty point of our program so we need to run it without
  // creating an object
  // void -> this function is not returning anything,its used to give return types
  // of function
  // (String[] args)=> this is the command line argument of the function

  public static void main(String[] args) {
    // this is the print function of Java
    System.out.println("First Java Program");

    // how will this run?
    // javac main.java -> javac is in jdk (java development kit) its a compiler
    // java main → java is in jre (java runtime environment) its a interpreter
    // java main
    // output → First Java Program
    // ".java"=> ".class" → "byte code" → "JVM" → "output
    // ".class" is the byte code of the ".java" file
    // "JVM" is the java virtual machine which converts the byte code to the
    // machine code

    // javac is having a path variable in the system
    // so we can run it from anywhere

    // System -> is a class in java,its like prebuiled class with some functions in
    // it , like stl in c++
    // out -> is a object of System class, its having a stream of data
    // println -> is a function of out object

    System.out.println("Viggh");

    // how to take input in java
    // scanner class alowing to take input from the user
    // ip is its object , we are creating an object of scanner class
    // passing the system.in as a parameter to the scanner class
    // system.in is a input stream,
    Scanner ip = new Scanner(System.in);
    System.out.println("Enter your name");
    System.out.println("Your name is " + ip.nextLine());

    // Primitive Data Types
    // java -> 8 primitive data types

    // int > 4 bytes
    int rollno = 18;
    // float > 4 bytes>why f? because by default it will be double,values are not
    // accurate in float

    float marks = 18.5f;
    // double> 8 bytes
    double marks2 = 88908089018.5;
    // char> 2 bytes
    char letter = 'A';
    // boolean> 1 byte
    boolean isAdult = true;
    // Long> 8 bytes>why L? because by default it will be int
    long marks3 = 88908089018L;

    // wrapper classes> these are the classes which are used to wrap the primitive,
    // to add more functionality to them
    // Integer
    Integer rno = 18;
    rno.intValue();

    // Non Primitive Data Types
    // String => can be broken into characters,but caracters can't be broken further
    String name = "Viggh";

    // identifiers and literals
    // identifiers are the names given to the variables,functions,classes,etc
    // literals are the values given to the variables,functions,classes,etc
    // eg: name is an identifier and "Viggh" is a literal

    // normal summation program
    System.out.println("Enter two numbers");
    int a = ip.nextInt();
    int b = ip.nextInt();
    System.out.println("The result is :" + (a + b));

    // type conversion and type casting
    // type conversion
    // automatic type conversion
    // byte>short>int>long>float>double
    // eg:
    int x = 4;
    float y = x;
    System.out.println(y);
    // here x is converted to float automatically
    // now how int to float is possible?
    // because float is having more memory than int
    // so it can store the value of int
    // but if we do the opposite
    // float to int
    // then it will give error
    // because int is having less memory than float
    // so it can't store the value of float
    // so we need to do type casting
    int z = (int) y;
    System.out.println(z);
    // here we are converting float to int
    // so we are using (int) before the variable
    // this is called type casting
    // type casting is done by the programmer
    // type casting is done when we are converting the higher memory to lower
    //

    // automatic type promotion in expressions
    // eg:
    int a1 = 257;
    byte b1 = (byte) a1;
    System.out.println(b1);
    // here we are converting int to byte
    // 257 % 256 = 1
    // so the value of b1 will be 1
    // this is called automatic type promotion in expressions
    // this is done by the compiler

    byte b2 = 40;
    byte b3 = 50;
    byte b4 = 100;
    int b5 = (b2 * b3) / b4;
    // here b2*b3 will be 2000 , which is greater than 256
    // so it will give error
    // because byte can't store the value greater than 256
    // so the intermidiate value will be stored as int while doing the
    // calculations,automatically
    System.out.println("b5->" + b5);

    byte _x_ = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;
    double result = (f * _x_) + (i / c) - (d * s);

    System.out.println((f * _x_) + " " + (i / c) + " " + (d * s));
    // here result will given as the highest data type
    System.out.println("result = " + result);

    // While loop
    // while loop is used to execute a block of code repeatedly until the condition
    // print 1 to 10
    int one = 1;
    while (one <= 10) {
      System.out.println(one);
      one++;
    }
    // for loop
    // for loop is used to execute a block of code repeatedly until the condition
    // print 1 to 10
    for (int two = 1; two <= 10; two++) {
      System.out.println(two);
    }
    // do while loop
    // do while loop is used to execute a block of code repeatedly until the
    // condition
    // print 1 to 10
    int three = 1;
    do {
      System.out.println(three);
      three++;
    } while (three <= 10);

  }
}