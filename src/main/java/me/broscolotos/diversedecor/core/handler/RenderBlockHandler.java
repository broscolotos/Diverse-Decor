package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import me.broscolotos.diversedecor.render.*;
import me.broscolotos.diversedecor.tiles.*;

public class RenderBlockHandler {
    public static int transparentRenderID = RenderingRegistry.getNextAvailableRenderId();
    public static void initializeCustomModels() {
        ClientRegistry.bindTileEntitySpecialRenderer(TilePicnicTable.class, new RenderPicnicTable("picnic table/picnic table spruce"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileFancyWallLight.class, new RenderFancyWallLight("lights/wall lights/fancy_lantern"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileFancyWallLightDiagonal.class, new RenderFancyWallLightDiagonal("lights/wall lights/fancy_lantern"));
        ClientRegistry.bindTileEntitySpecialRenderer(TilePostTopper.class, new RenderPostTopper("posts/topper/metal_topper"));
        ClientRegistry.bindTileEntitySpecialRenderer(TilePostCurve.class, new RenderParkPostCurve("posts/park_post_curve_metal"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileTopPostLight.class, new RenderTopPostLight("lights/post lights/top_post_light"));
        ClientRegistry.bindTileEntitySpecialRenderer(TileCashRegister.class, new RenderCashRegister("cash-register"));

        //RenderingRegistry.registerBlockHandler(transparentRenderID, new BlockRenderTransparent(transparentRenderID));
    }
}
