package me.broscolotos.diversedecor.core;

import me.broscolotos.diversedecor.core.handler.BlockIDs;

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
}
