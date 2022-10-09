package com.xworkz.stringdemoex;

public class StringConstatnPool {

}
//String pool is nothing but a storage area in Java heap where string literals are stored.
//By default, it is empty and privately maintained by the Java String class.
//The String Constant Pool is a special area used for the storage of string literals.
// before Java 7, the string pool was part of the Permanent Generation memory area.
//after 7 that they moved it to heap 
//We know that string literals are created in the String pool, and string objects are 
//with new keyword are created in the heap memory area.
//internally uses hashmap.

//IMP. String pool is an example of the Flyweight Design Pattern.

//Flyweight pattern is primarily used to reduce the number of objects created and 
//to decrease memory usage and increased performance. 
//This type of design pattern comes under structural pattern as this pattern provides 
//ways to decrease object count thus improving the object structure of application.

//Flyweight pattern tries to reuse already existing similar kind objects by storing 
//them and creates new object when no matching object is found. 

//Advantages of SCP

//1. Immutable
//As stated earlier, the string pool allows being string immutable. 
//increase the performance and decrease the memory load.

//2. Thread safe
//as String literals are stored in SCP, they are thread safe.

//Disadvantages

//1. Sensitive data in memory for a long time

//sensitive data like password can be stored for a long time
//as SCP got special permission from garbage collector, GC won't visit SCP as a normal frequency
//compared to other memory zone.
//sensitive data remains in the SCP for long time, this can be prone to unwanted usage.
//to avoid this in order to store password use char[]

//2. Possible outOfMemoryERROR
// SCP is a small memory zone, if we keep on storing many String literals, this leads to 
//outOfMemoryERROR

//the unreferenced String literals will be garbage collected during JVM shutdown


//