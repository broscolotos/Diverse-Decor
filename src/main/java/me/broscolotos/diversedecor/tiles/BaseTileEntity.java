package me.broscolotos.diversedecor.tiles;

import com.sun.org.apache.xpath.internal.operations.Div;
import ddfexcraft.fvtm.BlockModel;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.render.RenderTileEntity;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class BaseTileEntity extends TileEntity {
    public int dir=0;
    public BlockModel model;
    public ResourceLocation texture;

    public BaseTileEntity(int dir) {
        super();
        this.dir = dir;
    }

    public BaseTileEntity() {
        super();
    }

    @Override
    public boolean shouldRenderInPass(int pass) {
        return pass == 0;
    }


    @Override
    public S35PacketUpdateTileEntity  getDescriptionPacket() {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        writeToNBT(nbttagcompound);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, nbttagcompound);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt)
    {
        if(pkt == null)
        {
            return;
        }

        readFromNBT(pkt.func_148857_g());
        markDirty();
    }

    @Override
    public void writeToNBT(NBTTagCompound tag)
    {
        super.writeToNBT(tag);
        tag.setInteger("direction", dir);
        tag.setString("texture", texture.getResourcePath());
    }

    @Override
    public void readFromNBT(NBTTagCompound tag)
    {
        super.readFromNBT(tag);
        dir = tag.getInteger("direction");
        String t = tag.getString("texture");
        if (!t.isEmpty())
            t = t.substring(9);
        t = "textures/" + t;
        texture = new ResourceLocation(DiverseDecor.MODID,t);
        if(worldObj != null && worldObj.isRemote)
        {
            markDirty();
        }
    }

    public BaseTileEntity setFacing(int direction)
    {
        dir = (byte) direction;
        this.markDirty();
        return this;
    }

    public ResourceLocation getTexture() {
        return this.texture;
    }

    public void setTexture(String texture) {
        this.texture = new ResourceLocation(DiverseDecor.MODID, "textures/blocks/" + texture + ".png");
    }
}
