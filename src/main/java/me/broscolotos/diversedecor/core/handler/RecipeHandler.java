package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.blocks.decoration.DecorationBlock;
import me.broscolotos.diversedecor.blocks.itemblocks.GenericItemBlock;
import me.broscolotos.diversedecor.blocks.itemblocks.GenericSlabItemBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.standard.BaseSlabBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.standard.BaseStairBlock;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;

/***************************************
 *
 *  recipeHandler  by -hariesh
 *
 *  For any recipe that involved unique blocks from the mod or minecraft use BlockIDs or Blocks
 *
 *  For any recipe that involved generic items such as dye, ingots, or other, please use OreDictionary ArrayStacks by
 *  making an ArrayList from line 40 onwards using format:
 *          ArrayList<ItemStack> nameOfItem = OreDictionary.getOres("oreDictTag");
 *
 *  Please stick to formatting and Proper Naming Conventions for ease of code!
 *
 *
 *  How to do Recipies:
 *
 *  For Shapeless Recipies what you are doing is saying the block output (block your crafting) and a list of items that can make it
 *
 *  Use format:
 *      GameRegistry.AddShapelessRecipe(new ItemStack(BlockIDs.<insertBlockForCrafting>.block, 1), {Start list of blocks that make up recipe, using Blocks.## or New ItemStack(BlockIDs.##.block, 1) or OreDictList); }
 *
 *  For Shaped Recipies, what you are to do is set where each block should be and what block they are
 *
 *  Crafting Grid:
 *      {ABC}
 *      {DEF}
 *      {GHI}
 *
 *  Imagine where the items for recipe should go in that grid on the table and use this format:
 *      GameRegistry.AddRecipe(new ItemStack(BlockIDs.<insertBlockForCrafting>.block, 1), "ABC", "DEF", "GHI", Character.valueOf('<insert position here>'), {new ItemStack(BlockIDs.blockname.block, 1)/Blocks.Blockname} );
 *
 *      Note: Add a
 *          Character.valueOf('#'), {new ItemStack(BlockIDs.blockname.block, 1)/Blocks.Blockname}
 *      for each item in the grid.
 *
 *      Note: For the empty spots in the grid use a spacebar " " instead of a character to represent no block needed
 *
 *      Note: You can use any Character in the grid, etc X, or S or whatever, but its easier to use the format above but I wont judge!
 *
 *  If you have any further Questions, just DM or Ping me and I can help you through!
 *
 *   -hariesh
 *
 ****************************/

public class RecipeHandler {

    private static ArrayList<ItemStack> multiNameOreDict(String ... names){
        ArrayList<ItemStack> entries = new ArrayList<ItemStack>();
        for (String name : names){
            entries.addAll(OreDictionary.getOres(name));
        }
        return entries;
    }

    public static void initBlockRecipes() {

        ArrayList<ItemStack> dyeOrange = OreDictionary.getOres("dyeOrange");
        ArrayList<ItemStack> dyeBrown = OreDictionary.getOres("dyeBrown");
        ArrayList<ItemStack> dyeGray = OreDictionary.getOres("dyeGray");
        ArrayList<ItemStack> dyeBlue = OreDictionary.getOres("dyeBlue");
        ArrayList<ItemStack> dyeLightGray = OreDictionary.getOres("dyeLightGray");
        ArrayList<ItemStack> dyeWhite = OreDictionary.getOres("dyeWhite");
        ArrayList<ItemStack> dyePink = OreDictionary.getOres("dyePink");
        ArrayList<ItemStack> dyeYellow = OreDictionary.getOres("dyeYellow");
        ArrayList<ItemStack> dyeBlack = OreDictionary.getOres("dyeBlack");
        ArrayList<ItemStack> dyeGreen = OreDictionary.getOres("dyeGreen");

        /*ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");//does this work?
        for (ItemStack dyepurple : dyePurple) { GameRegistry.addRecipe(new ItemStack(BlockIDs.tile2x2.block, 6, 15), " S ", "SDS", " S ", Character.valueOf('S'), new ItemStack(ItemIDs.ceramic.item, 1), Character.valueOf('D'), dyepurple);
            GameRegistry.addRecipe(new ItemStack(BlockIDs.tile4.block, 6, 15), "S S", "SDS", "S S", Character.valueOf('S'), new ItemStack(ItemIDs.ceramic.item, 1), Character.valueOf('D'), dyepurple);
        }*/

        for (ItemStack dye : dyeOrange) {
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockBrickOrange.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockLargeBrickGranite.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.stonebrick, 'D', dye);
        }
        for (ItemStack dye : dyeBrown) {
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockBrickBrown.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', dye);
        }
        for (ItemStack dye : dyeGray) {
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockBrickBlack.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 4), "BBB", "BDB", "BBB", 'B', Blocks.stone, 'D', dye);
        }
        for (ItemStack dye : dyeBlue) {
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockBrickBlueGray.block, 8, 0), "BBB", "BDB", "BBB", 'B', BlockIDs.blockBrickBlack.block, 'D', dye);
        }
        for (ItemStack dye : dyeLightGray) {
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockBrickLightGray.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', dye);
        }
        for (ItemStack dye : dyeWhite) {
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockBrickWhite.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.stone, 'D', dye);

            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 0), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 1), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 1), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 2), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 2), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 3), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 3), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 4), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 4), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 5), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 5), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 6), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 6), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 7), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 7), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 8), 'D', dye);

        }
        for (ItemStack dye : dyeBlack) {
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block,8,8),"BBB","BDB","BBB", 'B', Blocks.stone, 'D', dye);

            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 1), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 0), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 2), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 1), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 3), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 2), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 4), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 3), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 5), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 4), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 6), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 5), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 7), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 6), 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 8), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 7), 'D', dye);

        }
        for (ItemStack dye : dyePink) {
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockBrickRose.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.brick_block, 'D', dye);
        }
        for (ItemStack dye : dyeYellow) {
            GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockStone.block, 8, 9), "BBB", "BDB", "BBB", 'B', new ItemStack(BlockIDs.blockStone.block, 1, 0), 'D', dye);
        }

        ItemStack stack = new ItemStack(GameRegistry.findBlock("ImmersiveEngineering","storage"), 1, 7);
        for (ItemStack dye : dyeGreen) {
            if (stack.getItem() != null) {
                GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockColoredSteel.block, 8, 0), "BBB", "BDB", "BBB", 'B', stack, 'D', dye);
            } else {
                GameRegistry.addShapedRecipe(new ItemStack(BlockIDs.blockColoredSteel.block, 8, 0), "BBB", "BDB", "BBB", 'B', Blocks.iron_block, 'D', dye);
            }
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
            if (block.hasSlabStair) {
                for (int i=0;i<block.MaxMetadata;i++) {
                    GameRegistry.addShapedRecipe(new ItemStack(GameRegistry.findBlock(DiverseDecor.MODID, block.blockName.toLowerCase() + i + "_stair"), 4, 0), "B  ", "BB ", "BBB", 'B', new ItemStack(block.block, 1, i));
                    GameRegistry.addShapedRecipe(new ItemStack(GameRegistry.findBlock(DiverseDecor.MODID,block.blockName.toLowerCase() + (byte)(i) + "_slab"), 6, 0), "   ", "   ", "BBB", 'B', new ItemStack(block.block, 1, i));
                }
            }
        }


        DiverseDecor.blockLogger.info("Recipes registered.");
    }
}
