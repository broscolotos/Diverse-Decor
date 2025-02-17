package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ddfexcraft.tmt.slim.Vec3f;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.items.armor.GenericArmor;
import net.minecraftforge.client.MinecraftForgeClient;


public class ItemHandler {

    @SideOnly(Side.CLIENT)
    public static void initItemRegisterClient(FMLInitializationEvent e) {
        //helmet
        ItemIDs.testhat.item = new GenericArmor(DiverseDecor.instance.armor,0,0, EnumCosmetics.capotain.model, "capotain");
        ItemIDs.conehat.item = new GenericArmor(DiverseDecor.instance.armor,0,0, EnumCosmetics.coneHat.model, "traffic_cone");
        ItemIDs.ashBaseballHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0, EnumCosmetics.ashBaseballHat.model,"baseball hat/ash");
        ItemIDs.foxyGrandpaBaseballHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0, EnumCosmetics.foxyGrandpaBaseballHat.model,"baseball hat/foxy grandpa");
        ItemIDs.strawHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0, EnumCosmetics.strawHat.model,"straw hat/cyan");;
        ItemIDs.vrGoggles.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0, EnumCosmetics.vrGoggles.model, "vr goggles");
        ItemIDs.bearHat.item = new GenericArmor(DiverseDecor.instance.armor, 0,0,EnumCosmetics.bearHat.model,"bear hat");
        ItemIDs.santaHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0, EnumCosmetics.santaHat.model, "santa hat");
        ItemIDs.santaHatSideways.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0, EnumCosmetics.santaHatSideways.model, "santa hat sideways");
        ItemIDs.deerHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0, EnumCosmetics.deerHat.model, "deer hat");
        ItemIDs.beanieHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0, EnumCosmetics.beanieHat.model, "beanie/red_beanie");

        //chestplate
        ItemIDs.shoulderTrain.item = new GenericArmor(DiverseDecor.instance.armor, 0, 1, EnumCosmetics.shoulderTrain.model,"wooden train", new Vec3f(2.5f, 2.5f, 2.5f), new Vec3f(0.375f,0.625f,0));
        ItemIDs.umbrella.item = new GenericArmor(DiverseDecor.instance.armor,0,1,EnumCosmetics.umbrella.model,"umbrella", new Vec3f(0.7f,0.7f,0.7f), new Vec3f(0.125f,0.5f,0));
        ItemIDs.cowboyHat.item = new GenericArmor(DiverseDecor.instance.armor, 0,0,EnumCosmetics.cowboyHat.model, "cowboy hat");
        register();
    }

    @SideOnly(Side.SERVER)
    public static void initItemRegisterServer(FMLInitializationEvent e) {
        //helmet
        ItemIDs.testhat.item = new GenericArmor(DiverseDecor.instance.armor,0,0);
        ItemIDs.conehat.item = new GenericArmor(DiverseDecor.instance.armor,0,0);
        ItemIDs.ashBaseballHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0);
        ItemIDs.foxyGrandpaBaseballHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0);
        ItemIDs.strawHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0);
        ItemIDs.vrGoggles.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0);
        ItemIDs.bearHat.item = new GenericArmor(DiverseDecor.instance.armor, 0,0);
        ItemIDs.cowboyHat.item = new GenericArmor(DiverseDecor.instance.armor, 0,0);
        ItemIDs.santaHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0);
        ItemIDs.santaHatSideways.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0);
        ItemIDs.deerHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0);
        ItemIDs.beanieHat.item = new GenericArmor(DiverseDecor.instance.armor, 0, 0);

        //chesplate
        ItemIDs.umbrella.item = new GenericArmor(DiverseDecor.instance.armor,0,1);
        ItemIDs.shoulderTrain.item = new GenericArmor(DiverseDecor.instance.armor,0, 1);
        register();
    }


    private static void register(){
        for (ItemIDs items : ItemIDs.values()) {
            if (items.item != null) {
                items.item.setUnlocalizedName(DiverseDecor.MODID + ":" + items.name());
                GameRegistry.registerItem(items.item, items.name());
                if (DiverseDecor.proxy.isClient()) {
                    MinecraftForgeClient.registerItemRenderer(items.item, ddebf.tim.items.CustomItemModel.instance);
                }
            }
        }
        //GameRegistry.registerItem(ItemIDs.bulb.item, ItemIDs.bulb.name());
    }
}
