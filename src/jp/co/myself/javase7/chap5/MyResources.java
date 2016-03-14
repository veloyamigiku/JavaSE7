package jp.co.myself.javase7.chap5;

import java.util.ListResourceBundle;

public class MyResources extends ListResourceBundle {
	
	@Override
	protected Object[][] getContents() {
		Object[][] contents = {{"send", "送信",
								"cancel", "取り消し"}};
		return contents;
	}
	
}
