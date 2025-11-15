package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import ddfexcraft.tmt.slim.Vec3f;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.blocks.decoration.*;
import me.broscolotos.diversedecor.blocks.itemblocks.*;
import me.broscolotos.diversedecor.blocks.itemblocks.Recolorable.RecolorableItemBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.*;
import me.broscolotos.diversedecor.blocks.normal.blocks.other.InlayBrickBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.other.TurfBlock;
import me.broscolotos.diversedecor.blocks.normal.blocks.standard.*;
import me.broscolotos.diversedecor.tiles.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;



public class BlockHandler {

    public static void initBlockRegister(FMLInitializationEvent e){

        BlockIDs.picnicTable.block = new DecorationBlock(Material.wood)
                .setName("Picnic Table")
                .setSeatPos(new Vec3f[]{new Vec3f(-0.85,0.4,0), new Vec3f(0.85,0.4,0.0)})
                .setTileEntity(new TilePicnicTable())
                .setTool("axe",1)
                .setItemScale(new Vec3f(0.45, 0.45, 0.45))
                .setItemOffset(new Vec3f(0,0.2,0))
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeWood);
        GameRegistry.registerTileEntity(TilePicnicTable.class, "picnictable.tile");

        BlockIDs.fancyWallLight.block = new DecorationBlock(Material.iron)
                .setName("Fancy Hanging Light")
                .setTileEntity(new TileFancyWallLight())
                .setTool("pickaxe", 1)
                .setItemScale(new Vec3f(1.15, 1.15, 1.15))
                .setItemOffset(new Vec3f(0, 0.375, 0.875))
                .setItemRotation(new Vec3f(0,45,0))
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeMetal)
                .setLightLevel(0.6f);
        GameRegistry.registerTileEntity(TileFancyWallLight.class, "fancywalllight.tile");


        BlockIDs.fancyWallLightDiagonal.block = new DecorationBlock(Material.iron)
                .setName("Fancy Hanging Light Diagonal")
                .setTileEntity(new TileFancyWallLightDiagonal())
                .setTool("pickaxe", 1)
                .setItemScale(new Vec3f(1.15, 1.15, 1.15))
                .setItemOffset(new Vec3f(-0.875, 0.0625, 0))
                .setItemRotation(new Vec3f(0, 0,0))
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeMetal)
                .setLightLevel(0.6f);
        GameRegistry.registerTileEntity(TileFancyWallLightDiagonal.class, "fancywalllightdiagonal.tile");

        BlockIDs.postLight.block = new DecorationBlock(Material.iron)
                .setName("Top Post Light")
                .setTileEntity(new TileTopPostLight())
                .setTool("pickaxe", 1)
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeMetal)
                .setLightLevel(0.6f);
        GameRegistry.registerTileEntity(TileTopPostLight.class, "toppostlight.tile");

        BlockIDs.postCurve.block = new DecorationBlock(Material.iron)
                .setName("Post Curve")
                .setTileEntity(new TilePostCurve())
                .setTool("pickaxe", 1)
                .setItemScale(new Vec3f(1.25,1.25,1.25))
                .setItemOffset(new Vec3f(0,0.375,0.75))
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeMetal);
        GameRegistry.registerTileEntity(TilePostCurve.class, "postcurve.tile");

        BlockIDs.postTopper.block = new DecorationBlock(Material.iron)
                .setName("Post Topper")
                .setTileEntity(new TilePostTopper())
                .setTool("pickaxe",1)
                .setItemScale(new Vec3f(2,2,2))
                .setItemOffset(new Vec3f(0,0.875,0))
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeMetal);
        GameRegistry.registerTileEntity(TilePostTopper.class, "posttopper.tile");

        BlockIDs.cashRegister.block = new DecorationBlock(Material.iron)
                .setName("Cash Register")
                .setTileEntity(new TileCashRegister())
                .setTool("pickaxe",1)
                .setItemOffset(new Vec3f(0,-0.25,0))
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeMetal);
        GameRegistry.registerTileEntity(TileCashRegister.class, "cashregister.tile");

        BlockIDs.flatTV2x1.block = new DecorationBlock(Material.iron)
                .setName("Flatscreen TV (2x1)")
                .setTileEntity(new Tile2x1FlatTV())
                .setTool("pickaxe",1)
                .setItemScale(new Vec3f(0.75,0.75,0.75))
                .setItemRotation(new Vec3f(0,180,0))
                .setItemOffset(new Vec3f(0,-0.375,0))
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeMetal);
        GameRegistry.registerTileEntity(Tile2x1FlatTV.class, "2x1flattv.tile");

        BlockIDs.logChair.block = new LogChairBlock(Material.wood)
                .setName("Log Chair")
                .setTileEntity(new TileLogChair())
                .setSeatPos(new Vec3f[]{new Vec3f(0,0.375,0)})
                .setItemOffset(new Vec3f(0,0.25f,0))
                .bounds(new float[][]{{0.25f, 0, 0f, 0.75f, 0.5f, 1f}})
                .setTool("axe",1)
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeWood);
        GameRegistry.registerTileEntity(TileLogChair.class, "logchair.tile");

        BlockIDs.monitor.block = new DecorationBlock(Material.iron)
                .setName("Monitor")
                .setTileEntity(new TileMonitor())
                .setTool("pickaxe", 1)
                .setItemOffset(new Vec3f(0,-0.375,0))
                .setItemScale(new Vec3f(1.2,1.2,1.2))
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeMetal);
        GameRegistry.registerTileEntity(TileMonitor.class, "monitor.tile");

        BlockIDs.trafficCone.block = new DecorationBlock(Material.rock)
                .setName("Traffic Cone")
                .setTileEntity(new TileTrafficCone())
                .setTool("pickaxe", 1)
                .setItemOffset(new Vec3f(0,-0.5,0))
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeStone);
        GameRegistry.registerTileEntity(TileTrafficCone.class, "trafficcone.tile");

        BlockIDs.trashCanSquare.block = new DecorationBlock(Material.wood)
                .setName("Square Trash Can")
                .setTileEntity(new TileTrashCanSquare())
                .setTool("axe",1)
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeWood);
        GameRegistry.registerTileEntity(TileTrashCanSquare.class, "trashcansquare.tile");

        BlockIDs.trashCanCurved.block = new TrashCanCurvedBlock(Material.wood)
                .setName("Curved Trash Can")
                .setTileEntity(new TileTrashCanCurved())
                .setTool("axe",1)
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeWood);
        GameRegistry.registerTileEntity(TileTrashCanCurved.class, "trashcancurved.tile");

        BlockIDs.wagonWheel.block = new DecorationBlock(Material.wood)
                .setName("Wagon Wheel")
                .setTileEntity(new TileWagonWheel())
                .setTool("axe", 1)
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeWood);
        GameRegistry.registerTileEntity(TileWagonWheel.class, "wagonwheel.tile");

        BlockIDs.barrel.block = new ExtendedDecorationBlock(Material.wood)
                .setName("barrel")
                .setTileEntity(new TileBarrel())
                .setTool("axe", 1)
                .setHardness(1)
                .setResistance(2)
                .setStepSound(Block.soundTypeWood);
        GameRegistry.registerTileEntity(TileBarrel.class, "barrel.tile");


        BlockIDs.blockRecolorable.block = new RecolorableBlock(Material.rock,"recolorable_block", DiverseDecor.MODID + ":generic/colored/colored_block_0",1);

        GameRegistry.registerTileEntity(TileRecolorableBlock.class, "recolorable.tile");

        //dynamic
        BlockIDs.blockBrickOrange.block = new DynamicBlock(Material.rock, "orange_brick", DiverseDecor.MODID+":bricks/orange/orange_brick", 3);
        BlockIDs.blockBrickBrown.block = new DynamicBlock(Material.rock, "brown_brick", DiverseDecor.MODID+":bricks/brown/brown_brick", 4);
        BlockIDs.blockBrickBlueGray.block = new DynamicBlock(Material.rock, "blue_gray_brick", DiverseDecor.MODID+":bricks/blue gray/bluegray_brick", 3);
        BlockIDs.blockBrickLightGray.block = new DynamicBlock(Material.rock, "light_gray_brick", DiverseDecor.MODID+":bricks/light gray/lightgray_brick", 2);
        BlockIDs.blockBrickNeutral.block = new DynamicBlock(Material.rock, "neutral_brick", DiverseDecor.MODID+":bricks/neutral/neutral_brick", 4);

        //pillar
        BlockIDs.blockBrickWhite.block = new DynamicPillarBlock(Material.rock, "white_brick", DiverseDecor.MODID + ":bricks/white/white_brick", 2);

        //normal
        BlockIDs.blockBrickMessyTan.block = new StandardBlock(Material.rock, "dirtytanbrick", DiverseDecor.MODID+":bricks/tan/dirty_tan_brick", 1);
        BlockIDs.blockBrickPale.block = new StandardBlock(Material.rock, "palebrick", DiverseDecor.MODID+":bricks/pale/pale_brick", 1);
        BlockIDs.blockBrickRose.block = new StandardBlock(Material.rock, "rosebrick", DiverseDecor.MODID + ":bricks/rose/rose_brick", 1);
        BlockIDs.blockAgedStucco.block = new StandardBlock(Material.rock, "aged_stucco", DiverseDecor.MODID + ":aged_stucco",1);
        BlockIDs.blockWoodPanel.block = new StandardBlock(Material.wood, "wood_panel", DiverseDecor.MODID + ":woods/wood panels/wood_panel", 10, "axe");
        BlockIDs.blockCement.block = new StandardBlock(Material.rock, "cement", DiverseDecor.MODID + ":stones/cement/cement",3);
        BlockIDs.blockPolishedStone.block = new StandardBlock(Material.rock, "polished_stone", DiverseDecor.MODID + ":stones/polished_stone",1);
        BlockIDs.blockVerticalBrickPale.block = new StandardBlock(Material.rock, "pale_vertical_brick", DiverseDecor.MODID + ":bricks/vertical/pale_vertical_brick", 1);
        BlockIDs.blockBrickBlack.block = new StandardBlock(Material.rock, "black_brick", DiverseDecor.MODID + ":bricks/black/black_brick",1);
        BlockIDs.blockLargeBrickGranite.block = new StandardBlock(Material.rock, "granite_large_brick", DiverseDecor.MODID + ":bricks/large/granite_large_brick", 3);
        BlockIDs.blockSlate.block = new StandardBlock(Material.rock, "slate", DiverseDecor.MODID + ":stones/slate/slate", 10);
        BlockIDs.blockStone.block = new StandardBlock(Material.rock, "colored_block", DiverseDecor.MODID + ":generic/colored/colored_block",10);
        BlockIDs.blockBrickNormal.block = new StandardBlock(Material.rock, "normal_brick", DiverseDecor.MODID + ":bricks/darkmortar/normal", 1);
        BlockIDs.blockColoredSteel.block = new StandardBlock(Material.iron, "colored_steel", DiverseDecor.MODID + ":metal/steel/coloredSteel", 2);
        BlockIDs.blockDirt.block = new StandardBlock(Material.grass, "dirt", DiverseDecor.MODID + ":dirt/dirt", 2);
        BlockIDs.blockMixedBrick.block = new StandardBlock(Material.rock, "mixed_stone_brick", DiverseDecor.MODID + ":stones/mixed_stone_brick", 1);
        //special beans
        BlockIDs.blockTurf.block = new TurfBlock();
        BlockIDs.blockBrickInlay.block = new InlayBrickBlock();
        BlockIDs.blockGlass.block = new TransparentBlock(Material.glass, "glass", DiverseDecor.MODID + ":glass/glass", 4);
        BlockIDs.blockBrickStucco.block = new StandardBlock(Material.rock, "stucco_brick", DiverseDecor.MODID + ":bricks/stucco/stucco_brick", 6);


        for (BlockIDs block : BlockIDs.values()) {
            if (!block.hasItemBlock) {
                GameRegistry.registerBlock(block.block, block.blockName);
            } else {
                GameRegistry.registerBlock(block.block, block.itemBlockClass, block.blockName);
            }
            //register stairs
            if (block.hasBools[0]) {
                for (int i=0; i<block.MaxMetadata; i++) {
                    GameRegistry.registerBlock(new BaseStairBlock(block.blockName.toLowerCase() + i + "_stair", block.block.getMaterial(), block.block, block.tool, (byte)(i)), GenericItemBlock.class, block.blockName.toLowerCase() + i + "_stair");
                }
            }
            //register slabs
            if (block.hasBools[1]) {
                for (int i=0; i<block.MaxMetadata; i++) {
                    GameRegistry.registerBlock(new BaseSlabBlock(true, block.block.getMaterial(), 10f, 2f, block.blockName.toLowerCase() + (byte)(i) + "_doubleslab", block, (byte)(i)), GenericSlabItemBlock.class,  block.blockName.toLowerCase() + (byte)(i) + "_doubleslab"); //register the doubleslab first because the slab needs to reference it when registering.
                    GameRegistry.registerBlock(new BaseSlabBlock(false, block.block.getMaterial(), 10f, 2f, block.blockName.toLowerCase() + (byte)(i) + "_slab", block, (byte)(i)).setCreativeTab(DiverseDecor.diverseDecorSubBlocksTab), GenericSlabItemBlock.class, block.blockName.toLowerCase() + (byte)(i) + "_slab");
                }
            }
            //register walls
            if (block.hasBools[2]) {
                for (int i=0; i<block.MaxMetadata; i++) {
                    GameRegistry.registerBlock(new BaseWallBlock(10f, 2f, block.blockName.toLowerCase() + (byte)(i) + "_wall", block, (byte)(i)).setCreativeTab(DiverseDecor.diverseDecorSubBlocksTab), GenericItemBlock.class, block.blockName.toLowerCase() + (byte)(i) + "_wall");
                }

            }
            //register fences
            if (block.hasBools[3]) {
                for (int i=0; i<block.MaxMetadata; i++) {
                    GameRegistry.registerBlock(new BaseFenceBlock("idkwhatthisdoes", block.block.getMaterial(), 10f, 2f, block.blockName.toLowerCase() + (byte)(i) + "_fence", block, (byte)(i)).setCreativeTab(DiverseDecor.diverseDecorSubBlocksTab), GenericItemBlock.class, block.blockName.toLowerCase() + (byte)(i) + "_fence");
                }

            }
            //register fence gates
            if (block.hasBools[4]) {
                for (int i=0; i<block.MaxMetadata; i++) {
                    GameRegistry.registerBlock(new BaseFenceGateBlock(10f,2f,block.blockName.toLowerCase() + (byte)(i) + "_fence_gate", block, (byte)(i)).setCreativeTab(DiverseDecor.diverseDecorSubBlocksTab), GenericItemBlock.class, block.blockName.toLowerCase() + (byte)(i) + "_fence_gate");
                }
            }
            if (e.getSide().isClient()) {
                if (block.block instanceof DecorationBlock){
                    MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(block.block), ddebf.tim.items.CustomItemModel.instance);
                }
            }
        }
        if(e.getSide().isClient()) {
            RenderBlockHandler.initializeCustomModels();
        }
    }

}
