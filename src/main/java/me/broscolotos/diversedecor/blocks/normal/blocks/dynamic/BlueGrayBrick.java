package me.broscolotos.diversedecor.blocks.normal.blocks.dynamic;

import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.block.material.Material;

public class BlueGrayBrick extends DynamicBlock {
    public BlueGrayBrick(Material mat) {
        super(mat);
        setBlockName("blue_gray_bricks");
        setBlockTextureName(DiverseDecor.MODID+":bricks/blue gray/bluegray_brick");
        setTextAmt(3);
    }

}
