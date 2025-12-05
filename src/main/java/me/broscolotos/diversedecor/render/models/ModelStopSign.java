//FMT-Marker FVTM-1.5
package me.broscolotos.diversedecor.render.models;

import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.fvtm.TurboList;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelStopSign extends BlockModel {

	public ModelStopSign(){
		super();
		textureX = 64;
		textureY = 32;
		addToCreators("sokejoke");
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 1, 14, 6)
			.setRotationPoint(-9, 1, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 50, 0, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(-9, 2, -4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 45, 0, textureX, textureY).addBox(0, 0, 0, 1, 10, 1)
			.setRotationPoint(-9, 3, -5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 40, 0, textureX, textureY).addBox(0, 0, 0, 1, 8, 1)
			.setRotationPoint(-9, 4, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 35, 0, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-9, 5, -7).setRotationAngle(0, 0, 0)
		);
		groups.add(group0);
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 0, textureX, textureY).addBox(0, 0, 0, 1, 12, 1)
			.setRotationPoint(-9, 2, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 0, textureX, textureY).addBox(0, 0, 0, 1, 10, 1)
			.setRotationPoint(-9, 3, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 0, textureX, textureY).addBox(0, 0, 0, 1, 8, 1)
			.setRotationPoint(-9, 4, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 0, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-9, 5, 6).setRotationAngle(0, 0, 0)
		);
		groups.add(clipboard);
		//
	}

}
