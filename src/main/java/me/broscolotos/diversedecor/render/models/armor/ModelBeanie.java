//FMT-Marker DFM-1.0
//Creator: sokejoke

package me.broscolotos.diversedecor.render.models.armor;


import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2025 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelBeanie extends ModelCustomArmor {

	private int textureX = 64;
	private int textureY = 32;

	public ModelBeanie(){
		headModel = new ModelRendererTurbo[2];
		//
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[0].addBox(0, 0, 0, 10, 2, 10, 0f);
		headModel[0].setRotationPoint(-5.0f, -7.0f, -5.0f);
		headModel[0].rotateAngleX = -0.08726646f;

		headModel[1] = new ModelRendererTurbo(this, 0, 13, textureX, textureY);
		headModel[1].addBox(0, 0, 0, 9, 3, 9, 0f);
		headModel[1].setRotationPoint(-4.5f, -9.0f, -4.3f);
		headModel[1].rotateAngleX = -0.10471976f;

		cacheRotations();
	}

}
