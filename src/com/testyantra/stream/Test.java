package com.testyantra.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee(1,"mukilan","tester",10000),
				new Employee(2,"mohan","hr",30000),
				new Employee(3,"harish","tester",50000),
				new Employee(4,"suresh","developer",40000),
				new Employee(5,"nalish","hr",40000));
		
		Stream<Employee> stream = asList.stream();
		
		Comparator<Employee> com = (o1,o2)->{
			return (int) (o1.getSalary()-o2.getSalary());
		};
		Optional<Employee> max2 = stream.max(com);
		System.out.println(max2);
		
		asList.parallelStream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
	}

}
