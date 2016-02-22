package jp.co.myself.javase7;

public class Sample1_11 {
	public static void main(String[] args) {
		Card1 card = Card1.SPADE;
		switch (card) {
		case SPADE:
		case CLUBS:
			System.out.println("black");
			break;
		case DIAMONDS:
		case HEARTS:
			System.out.println("red");
			break;
		}
	}
}
