package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.items.armor.DiverseHelmet;


public class ItemHandler {

    @SideOnly(Side.CLIENT)
    public static void initItemRegisterClient(FMLInitializationEvent e) {
        ItemIDs.testhat.item = new DiverseHelmet(ItemIDs.testhat.iconName, DiverseDecor.instance.armor,0,0, EnumHats.testHat.model, "hattest");
        ItemIDs.conehat.item = new DiverseHelmet(ItemIDs.conehat.iconName, DiverseDecor.instance.armor,0,0, EnumHats.coneHat.model, "traffic_cone");
        register();
    }

    @SideOnly(Side.SERVER)
    public static void initItemRegisterServer(FMLInitializationEvent e) {
        ItemIDs.testhat.item = new DiverseHelmet(ItemIDs.testhat.iconName, DiverseDecor.instance.armor,0,0, "hattest");
        ItemIDs.conehat.item = new DiverseHelmet(ItemIDs.conehat.iconName, DiverseDecor.instance.armor,0,0, "traffic_cone");
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
