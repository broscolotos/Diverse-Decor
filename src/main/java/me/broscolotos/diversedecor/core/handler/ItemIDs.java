package me.broscolotos.diversedecor.core.handler;

import net.minecraft.item.Item;

public enum ItemIDs {

    //bulb("bulb", "bulb", "bulb"),
    testhat("testhat"),
    conehat("conehat"),
    umbrella("umbrella"),
    ashBaseballHat("ashBaseballHat"),
    foxyGrandpaBaseballHat("foxyGrandpaBaseballHat"),
    strawHat("strawHat"),
    vrGoggles("vrGoggles"),
    bearHat("bearHat"),
    shoulderTrain("shoulderTrain"),
    cowboyHat("cowboyHat"),
    santaHat("santaHat"),
    santaHatSideways("santaHatSideways"),
    deerHat("deerHat"),
    beanieHat("beanieHat"),
    constructionHelmet("constructionHelmet"),
    hotdogHat("hotdogHat"),
    blackHeadphones("blackHeadphones"),
    pinkKittyHeadphones("pinkKittyHeadphones"),

    ;

    public Item item;
    public String itemName;

    ItemIDs(String itemName) {
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
