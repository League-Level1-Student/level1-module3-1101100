package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Backpack backpack = new Backpack();
		Pencil pencil = new Pencil();
		Ruler ruler = new Ruler();
		Textbook textbook = new Textbook();
		
		backpack.putInBackpack(pencil);
		backpack.putInBackpack(textbook);
		backpack.putInBackpack(ruler);
		
		
		backpack.packAndCheck();
	}
}
