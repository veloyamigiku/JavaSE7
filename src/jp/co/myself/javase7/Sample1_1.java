package jp.co.myself.javase7;

public class Sample1_1 {
	
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int day = 0;
		System.out.print(year + " 年" + month + " 月は、");
		switch (month) {
		default:
			System.out.println(" 不正な月です。");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			System.out.println(day + " 日です");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			System.out.println(day + " 日です");
			break;
		case 2:
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
				day = 29;
			} else {
				day = 28;
			}
			System.out.println(day + " 日です");
			break;
		}
	}
}
