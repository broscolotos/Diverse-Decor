package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.render.models.armor.ModelHatTest;
import me.broscolotos.diversedecor.render.models.armor.ModelTrafficConeHat;
import me.broscolotos.diversedecor.items.armor.DiverseHelmet;

public class ItemHandler {

    public static void initItemRegister(){

        ItemIDs.testhat.item = new DiverseHelmet(ItemIDs.testhat.iconName, DiverseDecor.instance.armor,0,0, new ModelHatTest(), "hattest");
        ItemIDs.conehat.item = new DiverseHelmet(ItemIDs.conehat.iconName, DiverseDecor.instance.armor,0,0, new ModelTrafficConeHat(), "traffic_cone");
        //ItemIDs.bulb.item=new bulb();

/*        for (ItemIDs items : ItemIDs.values()) {
            items.item.setCreativeTab(DiverseDecor.diverseDecorCreativeTab);

            items.item.setUnlocalizedName(DiverseDecor.MODID + ":" + items.itemName);
            GameRegistry.registerItem(items.item, items.name());

        }*/

        register();
    }

    private static void register(){
        for (ItemIDs items : ItemIDs.values()) {
            if (items.item != null) {
                items.item.setUnlocalizedName(DiverseDecor.MODID + ":" + items.name());
                GameRegistry.registerItem(items.item, items.name());
            }
        }
        //GameRegistry.registerItem(ItemIDs.bulb.item, ItemIDs.bulb.name());
    }
}
