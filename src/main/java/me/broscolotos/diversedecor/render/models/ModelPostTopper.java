//FMT-Marker FVTM-1.5
package me.broscolotos.diversedecor.render.models;

import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.fvtm.TurboList;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelPostTopper extends BlockModel {

	public ModelPostTopper(){
		super();
		textureX = 16;
		textureY = 16;
		addToCreators("broscolotos");
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 9, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1.5f, 6, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1.25f, 5.5f, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-0.5f, 5, -0.5f).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
		//
	}

}
