package me.broscolotos.diversedecor.render.models.armor; //Path where the model is located


import ddfexcraft.fvtm.ModelCustomArmor;
import ddfexcraft.tmt.slim.ModelRendererTurbo;

public class ModelHatTest extends ModelCustomArmor //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelHatTest() //Same as Filename
	{
		headModel = new ModelRendererTurbo[2];
		headModel[0] = new ModelRendererTurbo("box1", 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo("box2", 41, 1, textureX, textureY); // Box 1

		headModel[0].addBox(-4.5F, -13F, -4.5F, 9, 6, 9, 0F); // Box 0
		headModel[0].setRotationPoint(0.0F, 0F, 0F);

		headModel[1].addBox(-6F, -7F, -6F, 12, 1, 12, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		cacheRotations();

	}
}