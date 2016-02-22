package jp.co.myself.javase7.chap1;

class Foo5 {
	
	@Override
	protected void finalize() throws Throwable {
		
	}
	
}

class Bar2 extends Foo5 {
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
	
}
public class Sample1_15 {

}
