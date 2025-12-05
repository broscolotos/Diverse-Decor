//FMT-Marker FVTM-1.5
package me.broscolotos.diversedecor.render.models;

import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.fvtm.TurboList;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelYieldSign extends BlockModel {

	public ModelYieldSign(){
		super();
		textureX = 32;
		textureY = 32;
		addToCreators("sokejoke");
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 14, 2, 1)
			.setRotationPoint(-7, 1, -9).setRotationAngle(0, 0, 0)
		);
		groups.add(group0);
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 4, textureX, textureY).addBox(0, 0, 0, 12, 2, 1)
			.setRotationPoint(-6, 3, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 8, textureX, textureY).addBox(0, 0, 0, 10, 2, 1)
			.setRotationPoint(-5, 5, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 12, textureX, textureY).addBox(0, 0, 0, 8, 2, 1)
			.setRotationPoint(-4, 7, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 16, textureX, textureY).addBox(0, 0, 0, 6, 2, 1)
			.setRotationPoint(-3, 9, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 12, textureX, textureY).addBox(0, 0, 0, 4, 2, 1)
			.setRotationPoint(-2, 11, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 8, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-1, 13, -9).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
		//
	}

}
