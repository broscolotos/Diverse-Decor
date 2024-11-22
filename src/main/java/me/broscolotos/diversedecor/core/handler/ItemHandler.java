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
        ItemIDs.testhat.item = new GenericArmor(DiverseDecor.instance.armor,0,0, EnumHats.testHat.model, "hattest");
        ItemIDs.conehat.item = new GenericArmor(DiverseDecor.instance.armor,0,0, EnumHats.coneHat.model, "traffic_cone");
        ItemIDs.umbrella.item = new GenericArmor(DiverseDecor.instance.armor,0,1,EnumHats.umbrella.model,"umbrella");
        ItemIDs.ashBaseballHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0, EnumHats.ashBaseballHat.model,"baseball hat/ash");
        ItemIDs.foxyGrandpaBaseballHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0, EnumHats.foxyGrandpaBaseballHat.model,"baseball hat/foxy grandpa");
        ItemIDs.strawHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0, EnumHats.strawHat.model,"straw hat/cyan");
        register();
    }

    @SideOnly(Side.SERVER)
    public static void initItemRegisterServer(FMLInitializationEvent e) {
        ItemIDs.testhat.item = new GenericArmor(DiverseDecor.instance.armor,0,0);
        ItemIDs.conehat.item = new GenericArmor(DiverseDecor.instance.armor,0,0);
        ItemIDs.umbrella.item = new GenericArmor(DiverseDecor.instance.armor,1,0);
        ItemIDs.ashBaseballHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0);
        ItemIDs.foxyGrandpaBaseballHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0);
        ItemIDs.strawHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0);
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
