package me.broscolotos.diversedecor.blocks.normal.blocks.dynamic;

import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.block.material.Material;

public class LightGrayBrick extends DynamicBlock {
    public LightGrayBrick(Material mat) {
        super(mat);
        setBlockName("light_gray_bricks");
        setBlockTextureName(DiverseDecor.MODID+":bricks/light gray/lightgray_brick");
        setTextAmt(2);
    }

}
