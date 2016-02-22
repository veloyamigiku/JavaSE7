package jp.co.myself.javase7;

class Test {
	int num;
	
	@Override
	public boolean equals(Object o) {
		if ((o instanceof Test) && (((Test)o).num == this.num)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return num * 5;
	}
	
}

public class Sample1_18 {

}
