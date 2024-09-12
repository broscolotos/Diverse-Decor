package me.broscolotos.diversedecor.core.handler;

/**
 *
 *  oreDictHandler by -hariesh
 *
 *  This file gives your blocks OreDictionary compatibility!
 *
 *  Register your blocks to oredict to make them work with machines and other mods!
 *
 *  Use Format:
 *      OreDictionary.registerOre("oreDictTag", new ItemStack(BlockIDs.blockname.block) );
 *
 *  Note: If your block has metadata use new ItemStack(BlockIDs.blockname.block, 1, metadata) at the end instead for it to work
 *
 *  Any questions just ping me or dm me on the discord!
 *
 *  -hariesh
 *
 */

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler {

    public static void registerOreDict() {

        //OreDictionary.registerOre("ingotIron", new ItemStack(ItemIDs.bulb.item));//for testing

        //FoxBlocks.blockLogger.info("oreDict compatibility Post Init at com.bidahochi.BlockMod.core.handler.oreDictHandler");

    }
}
