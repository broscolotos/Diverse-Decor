package me.broscolotos.diversedecor;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import me.broscolotos.diversedecor.core.CommonProxy;
import me.broscolotos.diversedecor.core.handler.*;
import me.broscolotos.diversedecor.entities.EntityChair;
import me.broscolotos.diversedecor.plugins.fmp.ForgeMultiPart;
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

    /* Mod instance */
    @Mod.Instance(MODID)
    public static DiverseDecor instance;


    @SidedProxy(clientSide = "me.broscolotos.diversedecor.core.ClientProxy", serverSide = "me.broscolotos.diversedecor.core.CommonProxy")
    public static CommonProxy proxy;

    public ItemArmor.ArmorMaterial armor = EnumHelper.addArmorMaterial("helm", 5, new int[] {1,2, 3, 4}, 25);
    @EventHandler
    public void preInit(FMLPreInitializationEvent preEvent){
        proxy.loadConfig(preEvent);
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

        BlockHandler.initBlockRegister(event);
        if (proxy.isClient()) {
            ItemHandler.initItemRegisterClient(event);
        } else {
            ItemHandler.initItemRegisterServer(event);
        }
        OreDictHandler.registerOreDict();

        if (Loader.isModLoaded("ForgeMultipart")) {
            ForgeMultiPart.registerBlocks();
        }
        RecipeHandler.initBlockRecipes();
        EntityRegistry.registerModEntity(EntityChair.class, "EntityChair", 0, DiverseDecor.instance, 80, 1, false);
    }

    @EventHandler
    public void PostLoad(FMLPostInitializationEvent PostLoad) {
    }
}
