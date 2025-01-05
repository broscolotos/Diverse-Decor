package me.broscolotos.diversedecor.core;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.fvtm.ModelCustomArmor;

public class ClientProxy extends CommonProxy {

    @Override
    public boolean isClient() {
        return true;
    }

    public static String configDirectory;

    public static final ModelCustomArmor armorItemRenderer = new ModelCustomArmor();

    public static final BlockModel decorationItemRenderer = new BlockModel();

    @Override
    public void loadConfig(FMLPreInitializationEvent event) {
        configDirectory = event.getModConfigurationDirectory().getAbsolutePath();
    }

}
