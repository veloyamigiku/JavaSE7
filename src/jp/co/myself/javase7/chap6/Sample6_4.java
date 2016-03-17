package jp.co.myself.javase7.chap6;

import java.util.HashSet;

class Foo2 {
	private String str;
	public Foo2(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return str + " ";
	}

	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
	@Override
	public int hashCode() {
		return str.hashCode();
	}
	
}

public class Sample6_4 {
	public static void main(String[] args) {
		HashSet<Foo2> set = new HashSet<Foo2>();
		Foo2 f1 = new Foo2("AAA"); set.add(f1);
		Foo2 f2 = new Foo2("BBB"); set.add(f2);
		Foo2 f3 = new Foo2("CCC"); set.add(f3);
		Foo2 f4 = new Foo2("AAA"); set.add(f4);
		System.out.println("size : " + set.size());
		for (Foo2 f : set) {
			System.out.print(f);
		}
	}
}
