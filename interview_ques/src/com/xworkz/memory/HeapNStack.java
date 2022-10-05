package com.xworkz.memory;

public class HeapNStack {

	//https://howtodoinjava.com/java/garbage-collection/java-memory-model/
}

//Java memory model : 1.heap, 2.stack, 3.Method rea, 4.native method stack, 5. PC register
//heap ---

// runtime data area, we store instances (objects) and arrays.
// it may not be contiguous.
// heap size depends on system configuration. fixed or dynamic.
//Related error thrown by JVM outOfMemoryError when heap is full.


//stack ---

//for each thread stack frame will be created.stack frame will hold temporary results, 
//local variables,reference variables,method calls.After a method returns it pops out the method call
//stack will be contiguous.
//may be fixed or dynamic in size.
//related error when thread needs more memory. thrown by JVM StackOverflowError.
//stack permits random access and follow LIFO
//and the variable will be removed once the thread completes it's execution.

//Method area ---

//stores class structure, like method code, constructors, runtime constant pool, method data
//, static variables, special methods used in class, interface initialization
//not fixed in size.
//garbage collection is optional here (frequency less compared to heap).
//it may not be contiguous.

//native method stack -- 

//methods needed to run the java application related to OS and written in c

//PC register : program counter  holds the address information of next instruction. each thread will have it's own 
//Program counter
