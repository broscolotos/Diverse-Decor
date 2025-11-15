package me.broscolotos.diversedecor.tiles;

import me.broscolotos.diversedecor.core.Utility;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileRecolorableBlock extends TileEntity {

    private int color;
    private int patternIndex = 0;

    public TileRecolorableBlock() {}

    public void setColor(String color) { this.color = Utility.getColorFromString(color); }
    public int getColor() { return this.color; }

    public void setPatternIndex(int index) { this.patternIndex = index; }
    public int patternIndex() { return this.patternIndex; }

    @Override
    public boolean canUpdate() { return false; }

    @Override
    public void writeToNBT(NBTTagCompound tag) {
        super.writeToNBT(tag);
        tag.setInteger("Color", color);
        tag.setInteger("Base", patternIndex);
    }

    @Override
    public void readFromNBT(NBTTagCompound tag) {
        super.readFromNBT(tag);
        if (tag.hasKey("Color")) {
            color = tag.getInteger("Color");
        }
        if (tag.hasKey("Base")) {
            patternIndex = tag.getInteger("Base");
        }
    }

    @Override
    public S35PacketUpdateTileEntity getDescriptionPacket() {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        writeToNBT(nbttagcompound);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, nbttagcompound);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
        if(pkt == null) {
            return;
        }
        readFromNBT(pkt.func_148857_g());
        markDirty();
    }
}
