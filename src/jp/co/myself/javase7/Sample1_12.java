package jp.co.myself.javase7;

enum Card2 {
	SPADES(3),
	CLUBS(1),
	DIMAMONS(4),
	HEARTS(2);
	
	private int a;
	
	Card2(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
}
public class Sample1_12 {
	
	public static void main(String[] args) {
		Card2 card = Card2.SPADES;
		System.out.println(card);
		System.out.println(card.getA());
		for (Card2 obj : Card2.values()) {
			System.out.println(obj + " ");
		}
	}
}
