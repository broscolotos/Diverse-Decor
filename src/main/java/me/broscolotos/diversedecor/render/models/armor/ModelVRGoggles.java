//FMT-Marker DFM-1.0
//Creator: sokejoke

package me.broscolotos.diversedecor.render.models.armor;


import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelVRGoggles extends ModelCustomArmor {

	private int textureX = 32;
	private int textureY = 32;

	public ModelVRGoggles(){
		headModel = new ModelRendererTurbo[7];
		//
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[0].addBox(-4, -6, -6, 8, 3, 2, 0f);
		headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[1] = new ModelRendererTurbo(this, 10, 8, textureX, textureY);
		headModel[1].addBox(-4.01f, -5, -5, 0, 1, 9, 0f);
		headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		headModel[2].addBox(-4, -5, 4.01f, 8, 1, 0, 0f);
		headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[3] = new ModelRendererTurbo(this, 27, 0, textureX, textureY);
		headModel[3].addBox(-0.5f, -8, -4.01f, 1, 2, 0, 0f);
		headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[4] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
		headModel[4].addBox(4.01f, -5, -5, 0, 1, 9, 0f);
		headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[5] = new ModelRendererTurbo(this, 13, 0, textureX, textureY);
		headModel[5].addBox(-0.5f, -8.01f, -4, 1, 0, 8, 0f);
		headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);

		headModel[6] = new ModelRendererTurbo(this, 24, 0, textureX, textureY);
		headModel[6].addBox(-0.5f, -8, 4.01f, 1, 3, 0, 0f);
		headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);

		cacheRotations();
	}

}
