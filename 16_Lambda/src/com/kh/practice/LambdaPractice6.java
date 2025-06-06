package com.kh.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaPractice6 {
	public static void main(String[] args){ 
		List<String> names = Arrays.asList("Jin", "Suga", "RM", "J-Hope", "V"); 
		 
		Comparator<String> comp = getComparator("length"); 
		names.sort(comp); 
		System.out.println(names);    //  길이순  정렬 
		 
		comp = getComparator("reverse"); 
		names.sort(comp); 
		System.out.println(names);    //  알파벳  역순  정렬   
	} 
	
	public static Comparator<String> getComparator(String mode) { 
		//코드  구현 
		switch(mode) {
		case "length": return (x, y) -> x.length()-y.length();
		case "reverse": return (x, y) -> y.compareTo(x);
		default: throw new RuntimeException("제공하지 않는 정렬방식입니다.");
		}
	} 
}
