package jp.co.myself.javase7.chap4;

public class EmployeeTO {
	
	private String id;
	
	private String name;
	
	public EmployeeTO() {
		
	}
	
	public EmployeeTO(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
