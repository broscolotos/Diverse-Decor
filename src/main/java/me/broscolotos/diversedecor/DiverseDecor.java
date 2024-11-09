package me.broscolotos.diversedecor;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import me.broscolotos.diversedecor.core.handler.*;
import me.broscolotos.diversedecor.plugins.fmp.ForgeMultiPart;
import me.broscolotos.diversedecor.core.register.BlockRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = DiverseDecor.MODID, version = DiverseDecor.VERSION, name = DiverseDecor.NAME, dependencies = "after:ForgeMultipart")
public class DiverseDecor {


    public static final String MODID = "diversedecor";
    public static final String NAME = "DiverseDecor";
    public static final String VERSION = "1.0.0";
    public static CreativeTabs diverseDecorCreativeTab, diverseDecorBlockTab, diverseDecorCosmeticsTab;
    public static Logger blockLogger = LogManager.getLogger("DiverseDecor");

    /* TrainCraft instance */
    @Mod.Instance(MODID)
    public static DiverseDecor instance;

    public ItemArmor.ArmorMaterial armor = EnumHelper.addArmorMaterial("helm", 5, new int[] {1}, 25);
    @EventHandler
    public void preInit(FMLPreInitializationEvent PreEvent){

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        blockLogger.info("Divserse Decor starting");
        diverseDecorCreativeTab = new CreativeTabs("Divserse Decor") {
            public Item getTabIconItem() {
                return Item.getItemFromBlock(BlockIDs.picnicTable.block);
            }
            public String getTranslatedTabLabel() {
                return "Diverse Decor";
                }
        };

        diverseDecorBlockTab = new CreativeTabs("Diverse Decor Blocks") {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(BlockIDs.blockBrickOrange.block);
            }
            public String getTranslatedTabLabel() {
                return "Diverse Decor Blocks";
            }
        };

        diverseDecorCosmeticsTab = new CreativeTabs("Diverse Cosmetics") {
            @Override
            public Item getTabIconItem() {
                return ItemIDs.testhat.item;
            }
            public String getTranslatedTabLabel() {
                return "Diverse Cosmetics";
            }
        };

        BlockRegistry.registerBlocks();
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
