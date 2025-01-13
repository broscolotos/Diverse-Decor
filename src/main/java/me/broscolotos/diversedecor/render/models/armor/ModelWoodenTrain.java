//FMT-Marker DFM-1.0
//Creator: broscolotos

package me.broscolotos.diversedecor.render.models.armor;

import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the (Default) FlansMod Exporter of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelWoodenTrain extends ModelCustomArmor {

	private int textureX = 32;
	private int textureY = 16;

	public ModelWoodenTrain(){
		rightArmModel = new ModelRendererTurbo[7];
		//
		rightArmModel[0] = new ModelRendererTurbo(this, 19, 3, textureX, textureY);
		rightArmModel[0].addBox(0, 0, 0, 1, 1, 1, 0f);
		rightArmModel[0].setRotationPoint(-5.5f, -1.0f, -2.0f);

		rightArmModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		rightArmModel[1].addBox(0, 0, 0, 2, 2, 6, 0f);
		rightArmModel[1].setRotationPoint(-7.0f, -2.5f, -3.0f);

		rightArmModel[2] = new ModelRendererTurbo(this, 0, 3, textureX, textureY);
		rightArmModel[2].addBox(0, 0, 0, 1, 1, 1, 0f);
		rightArmModel[2].setRotationPoint(-7.5f, -1.0f, 1.0f);

		rightArmModel[3] = new ModelRendererTurbo(this, 25, 0, textureX, textureY);
		rightArmModel[3].addBox(0, 0, 0, 1, 1, 1, 0f);
		rightArmModel[3].setRotationPoint(-5.5f, -1.0f, 1.0f);

		rightArmModel[4] = new ModelRendererTurbo(this, 11, 0, textureX, textureY);
		rightArmModel[4].addBox(0, 0, 0, 2, 1, 2, 0f);
		rightArmModel[4].setRotationPoint(-7.0f, -3.5f, 1.0f);

		rightArmModel[5] = new ModelRendererTurbo(this, 20, 0, textureX, textureY);
		rightArmModel[5].addBox(0, 0, 0, 1, 1, 1, 0f);
		rightArmModel[5].setRotationPoint(-6.5f, -3.5f, -2.5f);

		rightArmModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		rightArmModel[6].addBox(0, 0, 0, 1, 1, 1, 0f);
		rightArmModel[6].setRotationPoint(-7.5f, -1.0f, -2.0f);

		cacheRotations();
	}

}
