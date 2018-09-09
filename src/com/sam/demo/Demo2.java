package com.sam.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(20,27,12,2,35,16,27);
		
		Stream<Integer> s1 = values.stream();
        Stream<Integer> s2 = values.stream();
        int ans= 32;
        
//        s1.forEach(i->{s2.forEach(j->{if(ans == i+j) System.out.println("numbers: "+i+" "+j);});});
//        IntStream.iterate(1, i -> i + 2)
//        .limit(8)
//        .forEach(System.out::println);
////        
//        IntStream.rangeClosed(1, 8)
//        .map(i -> 2 * i - 1)
//        .forEach(System.out::println);
        
//        Collections.nCopies(8, 1)
//        .stream()
//        .forEach(i -> System.out.println(i));
        
//        IntStream.generate(() -> 1)
//        .limit(8)
//        .forEach(System.out::println);
        
        values.forEach(i->{
        	IntStream.range(0, values.size()).forEach(j->{
        		if(ans == i+values.get(j)) System.out.println("numbers: "+i+" "+values.get(j));
        	});
        });
        
        System.out.println(values.stream().filter(i->i>10).mapToInt(i->i).sum());

	}
} 
