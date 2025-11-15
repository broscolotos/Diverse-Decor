package me.broscolotos.diversedecor.core;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.fvtm.ModelCustomArmor;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.core.handler.BlockIDs;
import me.broscolotos.diversedecor.core.handler.ItemHandler;
import me.broscolotos.diversedecor.render.ItemRecolorableRender;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {


    @Override
    public void handleRegistry(FMLInitializationEvent event) {
        ItemHandler.initItemRegisterClient(event);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.blockRecolorable.block), new ItemRecolorableRender());
    }

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
