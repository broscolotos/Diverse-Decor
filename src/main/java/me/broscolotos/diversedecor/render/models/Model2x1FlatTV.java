//FMT-Marker FVTM-1.5
package me.broscolotos.diversedecor.render.models;

import ddfexcraft.fvtm.BlockModel;
import ddfexcraft.fvtm.TurboList;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class Model2x1FlatTV extends BlockModel {

	public Model2x1FlatTV(){
		super();
		textureX = 128;
		textureY = 32;
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 30, 14, 1)
			.setRotationPoint(-15, -15, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 62, 15, textureX, textureY).addBox(0, 0, 0, 32, 16, 1)
			.setRotationPoint(-16, -16, 1).setRotationAngle(0, 0, 0)
		);
		groups.add(group0);
		//
	}

}
