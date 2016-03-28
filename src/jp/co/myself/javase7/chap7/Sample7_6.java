package jp.co.myself.javase7.chap7;

class MyException extends Exception {
	private int age;
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}

public class Sample7_6 {
	
	public static void main(String[] args) {
		int age = -10;
		try {
			checkAge(age);
		} catch (MyException e) {
			System.out.println("不正な値です。age : " + e.getAge());
		}
		
	}
	
	private static void checkAge(int age) throws MyException {
		if (age >= 0) {
			System.out.println("OK");
		} else {
			MyException e = new MyException();
			e.setAge(age);
			throw e;
		}
	}
}
