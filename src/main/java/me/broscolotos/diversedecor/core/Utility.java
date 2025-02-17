package me.broscolotos.diversedecor.core;

import me.broscolotos.diversedecor.core.handler.BlockIDs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.world.World;

public class Utility {

    public static BlockIDs getBlockFromString(String name) {
        if (name.contains("_doubleslab")) {
            name = name.replace("_doubleslab","");
        }
        if (name.contains("_slab")) {
            name = name.replace("_slab","");
        }
        if (name.contains("_stair")) {
            name = name.replace("_stair","");
        }
        if (name.contains("tile.")) {
            name = name.replace("tile.","");
        }
        name = name.replaceAll("[0-9]","");
        for (BlockIDs block : BlockIDs.values()) {
            if (name.equalsIgnoreCase(block.blockName)) {
                return block;
            }
        }
        return null;
    }

    public static boolean isFence(World worldObj, int x, int y, int z, Block block) {

        int damage = block.getDamageValue(worldObj, x, y, z);
        return block instanceof BlockFence
                || (block.getUnlocalizedName().equalsIgnoreCase("tile.immersiveEngineering.metalDecoration") && damage == 0)
                || (block.getUnlocalizedName().equalsIgnoreCase("tile.immersiveEngineering.woodenDecoration") && damage == 1)
                || block.getUnlocalizedName().equalsIgnoreCase("tile.blockCarpentersBarrier")
                || block.getUnlocalizedName().equalsIgnoreCase("tile.railcraft.post.metal")
                || block.getUnlocalizedName().equalsIgnoreCase("tile.railcraft.post.metal.platform")
                || (block.getUnlocalizedName().equalsIgnoreCase("tile.railcraft.post")) && (damage == 0 || damage == 2 || damage == 4 || damage == 6);
    }
}
