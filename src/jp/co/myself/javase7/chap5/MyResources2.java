package jp.co.myself.javase7.chap5;

import java.util.ListResourceBundle;

public class MyResources2 extends ListResourceBundle {
	
	@Override
	protected Object[][] getContents() {
		Long data1 = 10000L;
		Integer data2 = 500;
		int[] data3 = {10, 20, 30};
		Object[][] contents = {
				{"data1", data1},
				{"data2", data2},
				{"data3", data3}
		};
		return contents;
	}
	
}
