package jp.co.myself.javase7.chap6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	private String name;
	private Integer id;
	public Employee(String name, Integer id) {
		this.name = name;
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}

class MyRule implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getId().compareTo(o2.getId());
	}
	
}

public class Sample6_20 {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("taro", 20);
		Employee e2 = new Employee("tomoko", 10);
		Employee e3 = new Employee("hiromi", 50);
		ArrayList<Employee> ary = new ArrayList<>();
		ary.add(e1);
		ary.add(e2);
		ary.add(e3);
		System.out.println("ArrayListのインデックス順での表示");
		print(ary);
		System.out.println("MyRuleで定義したidの昇順での表示");
		Collections.sort(ary, new MyRule());
		print(ary);
	}
	
	public static void print(ArrayList<Employee> ary) {
		for (Employee e : ary) {
			System.out.println(e.getId() + " " + e.getName());
		}
	}
	
}
