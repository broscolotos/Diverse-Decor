package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
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
        /*ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");//does this work?
        for (ItemStack dyepurple : dyePurple) { GameRegistry.addRecipe(new ItemStack(BlockIDs.tile2x2.block, 6, 15), " S ", "SDS", " S ", Character.valueOf('S'), new ItemStack(ItemIDs.ceramic.item, 1), Character.valueOf('D'), dyepurple);
            GameRegistry.addRecipe(new ItemStack(BlockIDs.tile4.block, 6, 15), "S S", "SDS", "S S", Character.valueOf('S'), new ItemStack(ItemIDs.ceramic.item, 1), Character.valueOf('D'), dyepurple);
        }*/

        for (ItemStack dye : dyeOrange) {
            GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.blockBrickOrange.block, 1, 0), Blocks.brick_block, dye);
        }
        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.blockBrickOrange.block, 1, 1), new ItemStack(BlockIDs.blockBrickOrange.block, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.blockBrickOrange.block, 1, 2), new ItemStack(BlockIDs.blockBrickOrange.block, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.blockBrickOrange.block, 1, 0), new ItemStack(BlockIDs.blockBrickOrange.block, 1, 2));

        DiverseDecor.blockLogger.info("Recipe's registered.");
    }
}
