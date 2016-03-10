package jp.co.myself.javase7.chap4;

public class EmployeeDAO {
	
	public EmployeeDAO() {
	}
	
	public void create(EmployeeTO emp) {
		System.out.println("EmployeeDAO : create()");
	}
	
	public EmployeeTO find(String id) {
		System.out.println("EmployeeDAO : find()");
		EmployeeTO empTO = null;
		return empTO;
	}
	
	public void update(EmployeeTO empTO) {
		System.out.println("EmployeeDAO : update()");
	}
	
	public void delete(EmployeeTO empTO) {
		System.out.println("EmployeeDAO : delete()");
	}
}
