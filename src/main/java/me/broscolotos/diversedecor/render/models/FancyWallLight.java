//FMT-Marker FVTM-1.5
package me.broscolotos.diversedecor.render.models;

import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.fvtm.TurboList;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class FancyWallLight extends BlockModel {

	public FancyWallLight(){
		super();
		textureX = 64;
		textureY = 64;
		addToCreators("broscolotos");
		//
		TurboList Lamp4 = new TurboList("Lamp4");
		Lamp4.add(new ModelRendererTurbo(Lamp4, 16, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.25f, 6.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(16.75f, 4.25f, -2).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 29, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.25f, 1.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 34, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.25f, 6.75f, -2).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 28, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, 4.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 9, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.75f, 6.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 41, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(11.25f, 4.25f, -2).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 53, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.75f, 1.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 27, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(10.75f, 6.75f, -2).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 20, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 0, 5, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(10.25f, 4.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 46, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, 6.75f, -2.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 21, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 6.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 55, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(12, 4.25f, -2.75f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 38, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(11.5f, 4.25f, -3.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 47, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, 1.25f, -3.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 55, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, 6.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 50, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(12, 6.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 55, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(12, 4.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 25, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 0, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, 4.25f, 2.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 36, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, 1.25f, 3.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 45, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.5f, 7, -0.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 5, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.5f, 6.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.5f, 6.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 40, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, 6.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 35, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, 6.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(11, 7.5f, -3).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(10, 1, -4).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 30, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 4, 2).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 55, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.5f, 1.5f, 2.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 50, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11, 4, 2).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 25, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, 1.5f, 2.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 20, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 4, -3).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 15, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.5f, 1.5f, -3.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 10, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11, 4, -3).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 45, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, 1.5f, -3.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 33, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, 0, -3.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 19, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11, -1, -3).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 39, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, -2, -2.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(11, -2.5f, -3).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 5, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.5f, -4, -0.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0.5f, 0.5f, -0.25f, 0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(13.25f, 6, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 55, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, 5.25f, -1).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 40, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0.5f, 0.5f, -0.25f, 0.5f, 0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(13.25f, 4.75f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 59, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, -0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f)
			.setRotationPoint(13.5f, 4.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 54, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, 9.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 49, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, 9.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 24, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, 9.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 19, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, 9.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 11, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -4, -1).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3, -4.5f, -1).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(2, -4.5f, -1).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 19, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6, -5, -1).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 41, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5, -5, -1).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 25, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, -5.5f, -1).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(9, -5.5f, -1).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 14, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(9, -2.5f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 9, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(8, -3, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 17, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(7.5f, -2.5f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 12, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(7, -2, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 7, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(6.5f, -1.5f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 23, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(6, -1.5f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 58, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(5.5f, 0.5f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(3.5f, 1, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 28, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(3, 1.5f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 59, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(2.5f, 2.5f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 28, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(2, 3.5f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(1, 4, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 38, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0.5f, 3.5f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 19, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(0, 2, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(0.5f, 1.5f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(1, 1, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 58, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(5.5f, -2, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(4.5f, -2.5f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 58, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(4, -2, -0.25f).setRotationAngle(0, 0, 0)
		);
		Lamp4.add(new ModelRendererTurbo(Lamp4, 33, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 6, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, -3, 0, -6, -3, 0, -6, -3, 0, 0, -3, 0)
			.setRotationPoint(0, -2, 0).setRotationAngle(0, 0, 0)
		);
		groups.add(Lamp4);
		//
	}

}
