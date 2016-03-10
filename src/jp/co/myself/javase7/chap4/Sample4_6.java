package jp.co.myself.javase7.chap4;

public class Sample4_6 {
	
	public static void main(String[] args) {
		EmployeeDAO obj = new EmployeeDAO();
		obj.create(new EmployeeTO("10", "tanaka"));
		obj.find("10");
		obj.update(new EmployeeTO("10", "yamada"));
		obj.delete(new EmployeeTO("20", "sato"));
	}
	
}
