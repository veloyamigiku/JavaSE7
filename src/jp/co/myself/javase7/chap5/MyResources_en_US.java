package jp.co.myself.javase7.chap5;

import java.util.ListResourceBundle;

public class MyResources_en_US extends ListResourceBundle {
	
	@Override
	protected Object[][] getContents() {
		Object[][] contents = {{"send", "send"},
								{"cancel", "cancel"}};
		return contents;
	}

}
