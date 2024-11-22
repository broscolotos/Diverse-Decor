package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.items.armor.GenericArmor;
import net.minecraftforge.client.MinecraftForgeClient;


public class ItemHandler {

    @SideOnly(Side.CLIENT)
    public static void initItemRegisterClient(FMLInitializationEvent e) {
        ItemIDs.testhat.item = new GenericArmor(ItemIDs.testhat.iconName, DiverseDecor.instance.armor,0,0, EnumHats.testHat.model, "hattest");
        ItemIDs.conehat.item = new GenericArmor(ItemIDs.conehat.iconName, DiverseDecor.instance.armor,0,0, EnumHats.coneHat.model, "traffic_cone");
        ItemIDs.umbrella.item = new GenericArmor(ItemIDs.umbrella.iconName, DiverseDecor.instance.armor,0,1,EnumHats.umbrella.model,"umbrella");
        ItemIDs.ashBaseballHat.item = new GenericArmor(ItemIDs.ashBaseballHat.iconName, DiverseDecor.instance.armor, 0, 0, EnumHats.ashBaseballHat.model,"baseball hat/ash");
        ItemIDs.foxyGrandpaBaseballHat.item = new GenericArmor(ItemIDs.foxyGrandpaBaseballHat.iconName, DiverseDecor.instance.armor, 0, 0, EnumHats.foxyGrandpaBaseballHat.model,"baseball hat/foxy grandpa");
        register();
    }

    @SideOnly(Side.SERVER)
    public static void initItemRegisterServer(FMLInitializationEvent e) {
        ItemIDs.testhat.item = new GenericArmor(ItemIDs.testhat.iconName, DiverseDecor.instance.armor,0,0, "hattest");
        ItemIDs.conehat.item = new GenericArmor(ItemIDs.conehat.iconName, DiverseDecor.instance.armor,0,0, "traffic_cone");
        ItemIDs.umbrella.item = new GenericArmor(ItemIDs.umbrella.iconName, DiverseDecor.instance.armor,1,0,"umbrella");
        ItemIDs.ashBaseballHat.item = new GenericArmor(ItemIDs.ashBaseballHat.iconName, DiverseDecor.instance.armor, 0, 0,"baseball hat/ash");
        ItemIDs.foxyGrandpaBaseballHat.item = new GenericArmor(ItemIDs.foxyGrandpaBaseballHat.iconName, DiverseDecor.instance.armor, 0, 0,"baseball hat/foxy grandpa");
        register();
    }


    private static void register(){
        for (ItemIDs items : ItemIDs.values()) {
            if (items.item != null) {
                items.item.setUnlocalizedName(DiverseDecor.MODID + ":" + items.name());
                GameRegistry.registerItem(items.item, items.name());
                MinecraftForgeClient.registerItemRenderer(items.item, ddebf.tim.items.CustomItemModel.instance);
            }
        }
        //GameRegistry.registerItem(ItemIDs.bulb.item, ItemIDs.bulb.name());
    }
}
