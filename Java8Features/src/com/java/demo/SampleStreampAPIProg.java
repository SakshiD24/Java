package com.java.demo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class SampleStreampAPIProg {

	public static void main(String[] args) {
		
		
		
		//find distinct square of the elements present in array in sorted order
		/*
		Integer arr[] = {3,1,2,1,5,3,5,3};
		
			List<Integer> list = Arrays.asList(arr);
							
			list.stream()
				.sorted()
				.map(x->x*x)
				.distinct()
				.collect(Collectors.toList())
				.forEach(System.out::println);
				
				*/
		
			
		// Get count, min, max, sum, and the average for numbers	
		Integer arr2[] = {29, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		List<Integer> list2 = Arrays.asList(arr2);
		
			int min= list2.stream()
				 .min((i,j)->i.compareTo(j))
				 .get();
			System.out.println("min no. in an array "+min);
			
			
			int max= list2.stream()
					 .min((i,j)->-i.compareTo(j)) 
					 .get();
				System.out.println("max no. in an array "+max);
				
			OptionalDouble avg=list2.stream()
					.mapToInt(n->n.intValue())
					.average();
			System.out.println("avg "+avg);
			
			
			int sum = list2.stream()
					.mapToInt(v->v.intValue())
					.sum();
			System.out.println("sum "+sum);
			
			int count = (int) list2.stream().count();
			System.out.println("count "+count);
			
			
			IntSummaryStatistics allInOne = list2.stream()
					.mapToInt(v->v.intValue())
					.summaryStatistics();
			System.out.println("summaryStatistics "+allInOne);
			
			
		

		

	}

}
