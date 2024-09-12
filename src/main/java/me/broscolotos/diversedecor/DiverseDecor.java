package me.broscolotos.diversedecor;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import me.broscolotos.diversedecor.core.handler.*;
import me.broscolotos.diversedecor.plugins.fmp.ForgeMultiPart;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = DiverseDecor.MODID, version = DiverseDecor.VERSION, name = DiverseDecor.NAME, dependencies = "after:ForgeMultipart")
public class DiverseDecor {
    public static final String MODID = "diversedecor";
    public static final String NAME = "DiverseDecor";
    public static final String VERSION = "1.0.0";
    public static CreativeTabs diverseDecorCreativeTab;
    public static Logger blockLogger = LogManager.getLogger("DiverseDecor");

    @EventHandler
    public void preInit(FMLPreInitializationEvent PreEvent){

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        blockLogger.info("Divserse Decor starting");

        diverseDecorCreativeTab = new CreativeTabs("Divserse Decor") {
            /*public Item getTabIconItem() {
                return  Item.getItemFromBlock(BlockIDs.tHanos.block); }*/
            public Item getTabIconItem() {
                return null;
            }
            public String getTranslatedTabLabel() {
                return "Diverse Decor";
                }
        };
        BlockHandler.initBlockRegister(event);

        ItemHandler.initItemRegister();
        RecipeHandler.initBlockRecipes();
        OreDictHandler.registerOreDict();


        if (Loader.isModLoaded("ForgeMultipart")) {
            ForgeMultiPart.registerBlocks();
        }
    }

    @EventHandler
    public void PostLoad(FMLPostInitializationEvent PostLoad) {
    }
}
