package me.broscolotos.diversedecor;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import me.broscolotos.diversedecor.core.CommonProxy;
import me.broscolotos.diversedecor.core.handler.*;
import me.broscolotos.diversedecor.entities.EntityChair;
import me.broscolotos.diversedecor.plugins.fmp.ForgeMultiPart;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Mod(modid = DiverseDecor.MODID, version = DiverseDecor.VERSION, name = DiverseDecor.NAME, dependencies = "after:ForgeMultipart")
public class DiverseDecor {


    public static final String MODID = "diversedecor";
    public static final String NAME = "DiverseDecor";
    public static final String VERSION = "0.3.3";
    public static CreativeTabs diverseDecorCreativeTab, diverseDecorBlockTab, diverseDecorSubBlocksTab, diverseDecorCosmeticsTab;
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
            public Item getTabIconItem() { return Item.getItemFromBlock(BlockIDs.picnicTable.block); }
            public String getTranslatedTabLabel() { return "Diverse Decor"; }
            public boolean hasSearchBar() { return true; }
        }.setBackgroundImageName("item_search.png");

        diverseDecorBlockTab = new CreativeTabs("Diverse Decor Blocks") {
            @Override
            public Item getTabIconItem() { return Item.getItemFromBlock(BlockIDs.blockBrickOrange.block); }
            public String getTranslatedTabLabel() { return "DD Blocks"; }
            public boolean hasSearchBar() { return true; }
        }.setBackgroundImageName("item_search.png");


        diverseDecorSubBlocksTab = new CreativeTabs("Diverse Decor Sub-blocks") {
            @Override
            public Item getTabIconItem() { return Item.getItemFromBlock(GameRegistry.findBlock(DiverseDecor.MODID, BlockIDs.blockBrickOrange.blockName.toLowerCase() + "0_stair")); }
            public String getTranslatedTabLabel() { return "DD Sub-blocks"; }
            public boolean hasSearchBar() { return true; }
        }.setBackgroundImageName("item_search.png");

        diverseDecorCosmeticsTab = new CreativeTabs("Diverse Cosmetics") {
            @Override
            public Item getTabIconItem() { return ItemIDs.testhat.item; }
            public String getTranslatedTabLabel() { return "DD Cosmetics"; }
        }.setBackgroundImageName("item_search.png");

        BlockHandler.initBlockRegister(event);
        proxy.handleRegistry(event);
        OreDictHandler.registerOreDict();

        MinecraftForge.EVENT_BUS.register(new me.broscolotos.diversedecor.core.handler.EventHandler());

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
