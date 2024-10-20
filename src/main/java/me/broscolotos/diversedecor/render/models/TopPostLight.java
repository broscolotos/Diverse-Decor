//FMT-Marker FVTM-1.5
package me.broscolotos.diversedecor.render.models;

import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.fvtm.TurboList;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class TopPostLight extends BlockModel {

	public TopPostLight(){
		super();
		textureX = 64;
		textureY = 64;
		addToCreators("broscolotos");
		//
		TurboList Shade = new TurboList("Shade");
		Shade.add(new ModelRendererTurbo(Shade, 0, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.25f, 6.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 26, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(2.75f, 4.25f, -2).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 47, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3.25f, 1.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 40, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.25f, 6.75f, -2).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 50, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(2.75f, 4.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 35, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.25f, 6.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 54, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-2.75f, 4.25f, -2).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 53, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.25f, 1.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 45, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-3.25f, 6.75f, -2).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 47, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 5, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-3.75f, 4.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 0, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.5f, 6.75f, -2.25f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 0, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 6.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 21, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-2, 4.25f, -2.75f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 46, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-2.5f, 4.25f, -3.25f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 38, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, 1.25f, -3.25f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.5f, 6.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 38, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-2, 6.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 55, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-2, 4.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 25, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, 4.25f, 2.25f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 19, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, 1.25f, 3.25f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 0, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.5f, 7, -0.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 57, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, 6.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 52, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, 6.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 21, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, 6.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 35, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, 6.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 19, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-3, 7.5f, -3).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-4, 1, -4).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 47, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2, 4, 2).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 42, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.5f, 1.5f, 2.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 17, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 4, 2).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 12, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.5f, 1.5f, 2.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 7, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2, 4, -3).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 58, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.5f, 1.5f, -3.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 0, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 4, -3).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 58, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.5f, 1.5f, -3.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 33, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.5f, 0, -3.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, -1, -3).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 0, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, -2, -2.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 27, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-3, -2.5f, -3).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.5f, -4, -0.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 16, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1, -5.5f, -1).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 25, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1.5f, -5, -1.5f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 58, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0.5f, 0.5f, -0.25f, 0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.75f, 6, -0.25f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 55, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 5.25f, -1).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 0, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0.5f, 0.5f, -0.25f, 0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.75f, 4.75f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Shade.add(new ModelRendererTurbo(Shade, 35, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f)
			.setRotationPoint(-0.5f, 4.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(Shade);
		//
	}

}
