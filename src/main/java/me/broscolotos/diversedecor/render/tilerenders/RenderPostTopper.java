package me.broscolotos.diversedecor.render.tilerenders;

import ddfexcraft.tmt.slim.Tessellator;
import me.broscolotos.diversedecor.render.RenderTileEntity;
import me.broscolotos.diversedecor.render.models.ModelPostTopper;
import me.broscolotos.diversedecor.tiles.TilePostTopper;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderPostTopper extends RenderTileEntity {
    public RenderPostTopper(String texture) {
        setTexture(texture);
        this.model = new ModelPostTopper();
    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        if(!(tileEntity instanceof TilePostTopper)){return;}
        GL11.glPushMatrix();
        Tessellator.bindTexture(texture);
        GL11.glTranslated(x+0.5, y+.625, z+0.5);
        GL11.glRotatef(180F, 1F, 0F, 0F);
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}
