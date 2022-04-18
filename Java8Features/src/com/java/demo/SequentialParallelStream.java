package com.java.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SequentialParallelStream {
	public static void main(String[] args) {
		
	
	 List<Integer> myList = new ArrayList<>();
	 
     for(int i=0; i<100; i++) {
    	 myList.add(i);
     }
      
     
     Stream<Integer> highNums = myList.parallelStream().filter(p -> p > 90);
     //using lambda in forEach
     highNums.forEach(p -> System.out.println("High Nums parallel="+p));
      
     Stream<Integer> highNumsSeq = myList.stream().filter(p -> p > 90);
     highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
     
     
     /*
      * myList.parallelStream()
    		 .filter(p -> p > 90)
    		 .forEach(System.out::println);
     //using lambda in forEach
     //highNums.forEach(p -> System.out.println("High Nums parallel="+p));
      
      myList.stream()
      .filter(p -> p > 90)
      .forEach(System.out::println);
      */
	}

}
