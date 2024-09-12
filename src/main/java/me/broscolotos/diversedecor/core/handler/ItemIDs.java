package me.broscolotos.diversedecor.core.handler;

import net.minecraft.item.Item;

public enum ItemIDs {

    bulb("bulb", "bulb", "bulb")
    ;

    public Item item;
    public String className;
    public String iconName;
    public String itemName;

    ItemIDs(String itemClassName, String iconName, String itemName) {
        this.className = itemClassName;
		this.iconName = iconName;
		this.itemName = itemName;
    }
}
