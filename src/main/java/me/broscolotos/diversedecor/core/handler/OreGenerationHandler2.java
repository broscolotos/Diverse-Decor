package me.broscolotos.diversedecor.core.handler;

/**
 *  oreGenerationHandler by -hariesh
 *
 *  This file is responsible for making ores below spawn in the world
 *  This file lets you tweak the spawn rate, where the block will spawn, what block it will spawn in and how often
 *
 *  You can also add an ore block to each dimension, the End, Overworld or the Nether
 *
 *  To add an ore to the overworld,  look under generateOverworld
 *
 *  Use format:
 *      generateOre(BlockIDs.blockname.block, world, rand, x, z, minveinsize, maxveinsize, chanceofspawning , minYlevel, maxYlevel, blockToSpawnInto);
 *
 *  I suggest you dont touch anything in this folder as you probably wont be adding too many ores anyway
 *
 *  Any questions feel free to ping or dm me on the discord!
 *
 *  -hariesh
 *
 */


import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class OreGenerationHandler2 implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case 1:
                generateEnd(world, random, chunkX, chunkZ);
                break;
            case 0:
                generateOverworld2(world, random, chunkX, chunkZ);
                break;
            case -1:
                generateNether(world, random, chunkX, chunkZ);
                break;
        }
    }

    public void generateEnd(World world, Random rand, int x, int z) {

    }

    public void generateOverworld2(World world, Random rand, int x, int z){
        //generateOre(BlockIDs.soapStoneMagmatic.block, world, rand, x, z, 1, 3, 121, 1, 85, BlockIDs.soapStone.block);
    }
    public void generateOverworld(World world, Random rand, int x, int z){
    }

    public void generateNether(World world, Random rand, int x, int z){
     }


    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chance, int minY, int maxY, Block generateIn) {
        int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize);
        int heightRange = maxY - minY;
        WorldGenMinable gen = new WorldGenMinable(block, veinSize, generateIn);

        for (int i = 0 ; i < chance; i++) {
            int xRand = chunkX * 16 + random.nextInt(16);
            int yRand = random.nextInt(heightRange) + minY;
            int zRand = chunkZ * 16 + random.nextInt(16);
            gen.generate(world, random, xRand, yRand, zRand);
        }
    }

}
