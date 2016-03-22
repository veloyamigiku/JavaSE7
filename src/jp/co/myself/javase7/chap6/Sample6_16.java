package jp.co.myself.javase7.chap6;

class Gen3 <T extends Number> {
	private T var;
	public Gen3(T var) {
		this.var = var;
	}
	public void display() {
		System.out.println(var);
	}
}

public class Sample6_16 {
	
	public static void main(String[] args) {
		Gen3<Integer> g1 = new Gen3(100);
		g1.display();
		Gen3<Double> g2 = new Gen3(3.14);
		g2.display();
	}
	
}
