package com.training;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
public class Handleduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> agelist =Arrays.asList(45,55,65,78,55,45,72);

Set<Integer> filtered = new HashSet<>();

List<Integer> list = agelist.stream().filter( e -> !filtered.add(e)).collect(toList());//filtered.add is a boolean which

System.out.println(list);
	}

}
