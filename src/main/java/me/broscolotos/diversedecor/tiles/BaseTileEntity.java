package me.broscolotos.diversedecor.tiles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class BaseTileEntity extends TileEntity {
    public int dir=0;

    public BaseTileEntity(int dir) {
        super();
        this.dir = dir;
    }

    public BaseTileEntity() {

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
    }

    @Override
    public void readFromNBT(NBTTagCompound tag)
    {
        super.readFromNBT(tag);
        dir = tag.getInteger("direction");
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
}
