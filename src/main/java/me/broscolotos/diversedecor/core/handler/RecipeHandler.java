package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.ArrayList;

public class RecipeHandler {

    private static ArrayList<ItemStack> multiNameOreDict(String ... names){
        ArrayList<ItemStack> entries = new ArrayList<ItemStack>();
        for (String name : names){
            entries.addAll(OreDictionary.getOres(name));
        }
        return entries;
    }

    public static void initBlockRecipes() {

        String dyeOrange = "dyeOrange";
        String dyeBrown = "dyeBrown";
        String dyeGray = "dyeGray";
        String dyeBlue = "dyeBlue";
        String dyeLightGray = "dyeLightGray";
        String dyeWhite = "dyeWhite";
        String dyePink = "dyePink";
        String dyeYellow = "dyeYellow";
        String dyeBlack = "dyeBlack";
        String dyeGreen = "dyeGreen";
        String dyeRed = "dyeRed";

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockBrickOrange.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', dyeOrange));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockLargeBrickGranite.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.stonebrick, 'D', dyeOrange));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockBrickBrown.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', dyeBrown));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockBrickBlack.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', dyeGray));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockBrickBlueGray.block, 8, 0), "BBB", "BDB", "BBB", 'B', BlockIDs.blockBrickBlack.block, 'D', dyeBlue));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockBrickLightGray.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', dyeLightGray));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemIDs.materialItem.item, 8, 0), " D ", "DDD", " D ", 'D', dyeWhite));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemIDs.materialItem.item, 8, 1), " D ", "DDD", " D ", 'D', dyeBlack));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockBrickWhite.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', dyeWhite));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.stone, 'D', dyeWhite));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 4), "BBB", "BDB", "BBB", 'B', Blocks.stone, 'D', dyeGray));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 8), "BBB", "BDB", "BBB", 'B', Blocks.stone, 'D', dyeBlack));

        //:0 needs :1 w/ bleach
        //:1 needs :0 w/ dark and :2 w/ bleach
        //:2 needs :1 w/ dark and :3 w/ bleach
        //...
        //:8 needs :7 w/ bleach

        for (int i=0; i<=8; i++) {
            if (i < 8)
                GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, i), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, i+1), 'D', new ItemStack(ItemIDs.materialItem.item, 1, 0));
            if (i > 0)
                GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, i), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, i-1), 'D', new ItemStack(ItemIDs.materialItem.item, 1, 1));
        }

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockBrickRose.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', dyePink));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 9), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 0), 'D', dyeYellow));

        if (!OreDictionary.getOres("blockSteel").isEmpty()) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockColoredSteel.block, 8, 0), "BBB", "BDB", "BBB", 'B', "blockSteel", 'D', dyeGreen));

            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockColoredSteel.block, 8, 1), "BBB", "BDB", "BBB", 'B', "blockSteel", 'D', dyeRed));
        } else {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockColoredSteel.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.iron_block, 'D', dyeGreen));

            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockIDs.blockColoredSteel.block, 8, 1), "BBB", "BDB", "BBB", 'B', Blocks.iron_block, 'D', dyeRed));
        }
        for (int i=0; i<BlockIDs.blockColoredSteel.MaxMetadata; i++) {
            OreDictionary.registerOre("blockSteel", new ItemStack(BlockIDs.blockColoredSteel.block, 1, i));
        }

        GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockBrickMessyTan.block, 8, 0), "BBB", "BDB", "BBB", 'B', BlockIDs.blockBrickNeutral.block, 'D', Blocks.dirt);
        GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockBrickPale.block, 8, 0), "BBB", "B B", "BBB", 'B', BlockIDs.blockBrickWhite.block);
        GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockTurf.block, 3, 0), " G ", " C ", " D ", 'G', Blocks.grass, 'C', Blocks.cobblestone, 'D', Blocks.dirt);
        GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockPolishedStone.block, 8, 0), "BBB", "BWB", "BBB", 'B', Blocks.stone, 'W', Items.water_bucket);
        GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockVerticalBrickPale.block, 4, 0), "BB", "BB", 'B', new ItemStack(BlockIDs.blockCement.block, 1, 0));
        GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockCement.block, 9, 2), "BBB", "BBB", "BBB", 'B', new ItemStack(BlockIDs.blockCement.block, 1, 0));
        GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockBrickNormal.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', Blocks.dirt);

        GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockSlate.block, 9, 0), "BBB", "BBB", "BBB", 'B', Blocks.stone);
        for (int i=0; i<BlockIDs.blockSlate.MaxMetadata;i++) {
            int next = i+1 >= BlockIDs.blockSlate.MaxMetadata ? 0 : i+1;
            GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.blockSlate.block, 1, next), new ItemStack(BlockIDs.blockSlate.block, 1, i));
        }
        GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockLargeBrickGranite.block, 4, 1), "BB", "BB", 'B', new ItemStack(BlockIDs.blockSlate.block, 1, 7));

        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.blockBrickInlay.block, 1, 0), new ItemStack(BlockIDs.blockBrickNormal.block, 1, 0));

        for (BlockIDs block : BlockIDs.values()) {
            if (block.hasBools[0]) {
                for (int i=0;i<block.MaxMetadata;i++) {
                    GameRegistry.addShapedRecipe(new ItemStack(GameRegistry.findBlock(DiverseDecor.MODID, block.blockName.toLowerCase() + i + "_stair"), 4, 0), "B  ", "BB ", "BBB", 'B', new ItemStack(block.block, 1, i));
                }
            }
            if (block.hasBools[1]) {
                for (int i=0;i<block.MaxMetadata;i++) {
                    GameRegistry.addShapedRecipe(new ItemStack(GameRegistry.findBlock(DiverseDecor.MODID,block.blockName.toLowerCase() + (byte)(i) + "_slab"), 6, 0), "BBB", 'B', new ItemStack(block.block, 1, i));
                }
            }
            if (block.hasBools[2]) {
                for (int i = 0; i < block.MaxMetadata; i++) {
                    GameRegistry.addShapedRecipe(new ItemStack(GameRegistry.findBlock(DiverseDecor.MODID, block.blockName.toLowerCase() + (byte) (i) + "_wall"), 6, 0), "BBB", "BBB", 'B', new ItemStack(block.block, 1, i));
                }
            }
            if (block.hasBools[3]) {
                for (int i = 0; i < block.MaxMetadata; i++) {
                    GameRegistry.addShapedRecipe(new ItemStack(GameRegistry.findBlock(DiverseDecor.MODID, block.blockName.toLowerCase() + (byte) (i) + "_fence"), 3, 0), "B B", "B B", 'B', new ItemStack(block.block, 1, i));
                }
            }
            if (block.hasBools[4]) {
                for (int i = 0; i < block.MaxMetadata; i++) {
                    GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findBlock(DiverseDecor.MODID, block.blockName.toLowerCase() + (byte) (i) + "_fence_gate"), 1, 0), new ItemStack(GameRegistry.findBlock(DiverseDecor.MODID, block.blockName.toLowerCase() + (byte) (i) + "_fence"), 1, 0));
                    GameRegistry.addShapelessRecipe(new ItemStack(GameRegistry.findBlock(DiverseDecor.MODID, block.blockName.toLowerCase() + (byte) (i) + "_fence"), 1, 0), new ItemStack(GameRegistry.findBlock(DiverseDecor.MODID, block.blockName.toLowerCase() + (byte) (i) + "_fence_gate"), 1, 0));
                }

            }
        }


        DiverseDecor.blockLogger.info("Recipes registered.");
    }
}
