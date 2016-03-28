package jp.co.myself.javase7.chap7;

import java.io.FileNotFoundException;
import java.io.IOException;

class Super {
	void method() throws IOException {
		
	}
}

class SubA extends Super {
	void method() {
		
	}
}

class SubB extends Super {
	void method() throws FileNotFoundException {
		
	}
}

/*
// throwsを持つメソッドをオーバライドする場合は、同じ例外クラスかサブクラスでなければならない。
class SubC extends Super {
	void method() throws Exception {
		
	}
}
*/

/*
class SubD extends Super {
	void method() throws ClassNotFoundException {
		
	}
}
*/

// 例外クラスのRuntimeException及びそのサブクラスであれば、オーバライド可能。
class SubE extends Super {
	void method() throws RuntimeException {
		
	}
}

public class Sample7_8 {
	
	public static void main(String[] args) {
		
	}
	
}
