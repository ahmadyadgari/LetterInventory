package driver;

import inventory.LetterInventory;

public class Driver {

    public static void main(String[] args) {
        LetterInventory inv = new LetterInventory("washingtonstate");
        System.out.println(inv);

        System.out.println(inv.get('e'));
        System.out.println(inv.get('j'));

        int temp = 1 << 4;
        System.out.println("testing memory: " + temp);
    }
}

