package com.xworkz.memory;

public class GarbageCollec {

	// GC eliminates the need to de-allocate memory (memory management)
	//and therefore avoids memory leaks.
	//GC will be called during the life time of program.
	//JVM decides to perform garbage collection. (automated)
	//garbage collection follows some algorithm ex. mark and sweep.(basic algorithm
	//step 1: it marks the live objects first. step 2: and removing unused objects)
	//till java 8, parallel GC was default algorithm.
	//from java 9 onwards G1 was default algorithm.
	
	//System.gc(); java.lang
	//this gives suggestion to JVM to initiate garbage collection cycle.
	
	//it can called to prevent possible memory leaks during profiling of the app.
}
