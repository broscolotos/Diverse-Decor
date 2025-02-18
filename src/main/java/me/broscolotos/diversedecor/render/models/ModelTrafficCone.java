//FMT-Marker FVTM-1.5
package me.broscolotos.diversedecor.render.models;

import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.fvtm.TurboList;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelTrafficCone extends BlockModel {

	public ModelTrafficCone(){
		super();
		textureX = 64;
		textureY = 32;
		addToCreators("sokejoke");
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 12, 1, 12)
			.setRotationPoint(-6, -1, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 14, textureX, textureY).addBox(1, 0, 0, 8, 5, 8)
			.setRotationPoint(-5, -6, -4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 37, 0, textureX, textureY).addBox(0, 0, 0, 6, 5, 6)
			.setRotationPoint(-3, -11, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 45, 12, textureX, textureY).addBox(0, 0, 0, 4, 5, 4)
			.setRotationPoint(-2, -16, -2).setRotationAngle(0, 0, 0)
		);
		groups.add(group0);
		//
	}

}
