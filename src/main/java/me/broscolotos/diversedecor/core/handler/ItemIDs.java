package me.broscolotos.diversedecor.core.handler;

import net.minecraft.item.Item;

public enum ItemIDs {

    //bulb("bulb", "bulb", "bulb"),
    testhat("testhat","testhat","testhat"),
    conehat("conehat","conehat","conehat"),
    umbrella("umbrella","umbrella","umbrella"),
    ashBaseballHat("ashBaseballHat","ashBaseballHat","ashBaseballHat"),
    foxyGrandpaBaseballHat("foxyGrandpaBaseballHat","foxyGrandpaBaseballHat","foxyGrandpaBaseballHat"),

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

    public static boolean isItemHere(String name) {
        for (ItemIDs item: ItemIDs.values()) {
            if(item.itemName.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
