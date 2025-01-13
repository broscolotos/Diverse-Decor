//FMT-Marker FVTM-1.5
package me.broscolotos.diversedecor.render.models;

import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.fvtm.TurboList;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelCashRegister extends BlockModel {

	public ModelCashRegister(){
		super();
		textureX = 64;
		textureY = 64;
		addToCreators("sokejoke");
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 12, 4, 12)
			.setRotationPoint(-6, -4, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 37, 20, textureX, textureY).addBox(0, 0, 0, 3, 6, 6)
			.setRotationPoint(3, -10, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 11, 29, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(4, -9, -4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 6, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(4, -10, -5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 39, 7, textureX, textureY).addBox(0, 0, 0, 1, 2, 10)
			.setRotationPoint(-6.5f, -3, -5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 37, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-7, -2.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 32, 33, textureX, textureY).addBox(0, 0, 0, 3, 4, 4)
			.setRotationPoint(3, -8, -5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 17, textureX, textureY).addBox(0, 0, 0, 8, 1, 10)
			.setRotationPoint(-5, -5, -5).setRotationAngle(0, 0, 0)
		);
		groups.add(group0);
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 6, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(2.5f, -8.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(1, -8, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(0.5f, -7, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(2.5f, -7.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(2, -6.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(1.5f, -5.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-4, -5.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-4, -5.5f, -2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-4, -5.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-3.25f, -5.5f, -2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-3.25f, -5.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-2.5f, -5.5f, -2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-2.5f, -5.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-1.75f, -5.5f, -2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-1.75f, -5.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-3.25f, -5.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-2.5f, -5.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-1.75f, -5.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-4, -5.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-4, -5.5f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-4, -5.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-3.25f, -5.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-3.25f, -5.5f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-3.25f, -5.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-2.5f, -5.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 6, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-2.5f, -5.5f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-2.5f, -5.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-1.75f, -5.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-1.75f, -5.5f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-1.75f, -5.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
		//
	}

}
