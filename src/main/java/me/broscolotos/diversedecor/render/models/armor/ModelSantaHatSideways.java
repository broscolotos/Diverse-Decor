//FMT-Marker DFM-1.0
//Creator: sokejoke

package me.broscolotos.diversedecor.render.models.armor;


import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelSantaHatSideways extends ModelCustomArmor {

	private int textureX = 64;
	private int textureY = 32;

	public ModelSantaHatSideways(){
		headModel = new ModelRendererTurbo[5];
		//
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		headModel[0].addBox(0, 0, 0, 10, 4, 10, 0f);
		headModel[0].setRotationPoint(-5.0f, -9.0f, -5.0f);

		headModel[1] = new ModelRendererTurbo(this, 25, 15, textureX, textureY);
		headModel[1].addBox(0, 0, 0, 3, 3, 3, 0f);
		headModel[1].setRotationPoint(5.0f, -12.0f, -1.5f);

		headModel[2] = new ModelRendererTurbo(this, 0, 15, textureX, textureY);
		headModel[2].addBox(0, 0, 0, 8, 4, 8, 0f);
		headModel[2].setRotationPoint(-2.5f, -12.5f, -4.0f);
		headModel[2].rotateAngleZ = -0.41887903f;

		headModel[3] = new ModelRendererTurbo(this, 41, 0, textureX, textureY);
		headModel[3].addBox(0, 0, 0, 5, 5, 6, 0f);
		headModel[3].setRotationPoint(3.0f, -13.8f, -3.0f);
		headModel[3].rotateAngleZ = -1.2217305f;

		headModel[4] = new ModelRendererTurbo(this, 41, 12, textureX, textureY);
		headModel[4].addBox(0, 0, 0, 3, 4, 4, 0f);
		headModel[4].setRotationPoint(3.0f, -13.5f, -2.0f);
		headModel[4].rotateAngleZ = -0.55850536f;

		flipRotations();
		cacheRotations();
	}

}
