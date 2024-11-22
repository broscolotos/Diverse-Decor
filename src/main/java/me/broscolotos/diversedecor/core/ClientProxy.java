package me.broscolotos.diversedecor.core;

import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.fvtm.ModelCustomArmor;

public class ClientProxy extends CommonProxy {

    @Override
    public boolean isClient() {
        return true;
    }

    public static final ModelCustomArmor armorItemRenderer = new ModelCustomArmor();

    public static final BlockModel decorationItemRenderer = new BlockModel();

}
