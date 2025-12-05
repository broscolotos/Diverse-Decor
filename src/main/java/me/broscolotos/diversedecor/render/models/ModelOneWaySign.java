//FMT-Marker FVTM-1.5
package me.broscolotos.diversedecor.render.models;

import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.fvtm.TurboList;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelOneWaySign extends BlockModel {

	public ModelOneWaySign(){
		super();
		textureX = 64;
		textureY = 32;
		addToCreators("sokejoke");
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 22, 8, textureX, textureY).addBox(0, 0, 0, 1, 6, 16)
			.setRotationPoint(-9, 5, -8).setRotationAngle(0, 0, 0)
		);
		groups.add(group0);
		//
	}

}
