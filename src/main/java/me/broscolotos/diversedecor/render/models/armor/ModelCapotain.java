//FMT-Marker DFM-1.0
//Creator: broscolotos

package me.broscolotos.diversedecor.render.models.armor;


import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelCapotain extends ModelCustomArmor {

	private int textureX = 64;
	private int textureY = 32;

	public ModelCapotain(){
		headModel = new ModelRendererTurbo[3];
		//
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[0].addBox(0, 0, 0, 12, 1, 12, 0f);
		headModel[0].setRotationPoint(-6.0f, -7.0f, -6.0f);

		headModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[1].addShapeBox(0, 0, 0, 4, 4, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, -2, 0, -2, -2, 0, -2, -2, 0, 0, -2, 0);
		headModel[1].setRotationPoint(-1.0f, -9.5f, -4.52f);

		headModel[2] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
		headModel[2].addBox(0, 0, 0, 9, 6, 9, 0f);
		headModel[2].setRotationPoint(-4.5f, -13.0f, -4.5f);

		cacheRotations();
	}

}
