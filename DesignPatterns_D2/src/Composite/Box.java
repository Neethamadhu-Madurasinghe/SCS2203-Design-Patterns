package Composite;

import java.util.ArrayList;

public class Box implements Item{
    private ArrayList<Item> itemList = new ArrayList<Item>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    @Override
    public int getValue() {
        int totalValue = 0;

        for(Item item: itemList) {
            totalValue += item.getValue();
        }

        return totalValue;
    }
}
