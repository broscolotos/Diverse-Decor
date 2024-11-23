package ddfexcraft.tmt.slim;

import net.minecraft.client.model.PositionTextureVertex;

public class TexturedVertex {

	public Vec3f vector3F;
	public float textureX;
	public float textureY;

	public TexturedVertex(float x, float y, float z, float u, float v){
		this(new Vec3f(x, y, z), u, v);
	}

	public TexturedVertex(float x, float y, float z){
		this(new Vec3f(x, y, z), 0,0);
	}

	public TexturedVertex(TexturedVertex vert){
		this(vert.vector3F, vert.textureX, vert.textureY);
	}

	@Deprecated
	public TexturedVertex(PositionTextureVertex vertex, float u, float v){
		vector3F = new Vec3f(vertex.vector3D);
		textureX = u;
		textureY = v;
	}

	public TexturedVertex(Vec3f vector, float u, float v){
		vector3F = new Vec3f(vector.xCoord, vector.yCoord, vector.zCoord);
		textureX = u;
		textureY = v;
	}

	public TexturedVertex setTexturePosition(float p_78240_1_, float p_78240_2_) {
		return new TexturedVertex(vector3F, p_78240_1_, p_78240_2_);
	}

	public void setUV(float u, float v){
		textureX=u;
		textureY=v;
	}

	public String dumpInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Vector Values: (X: ");
		sb.append(vector3F.xCoord);
		sb.append(", Y: ");
		sb.append(vector3F.yCoord);
		sb.append(", Z: ");
		sb.append(vector3F.zCoord);
		sb.append(") | TextureX Value: ");
		sb.append(textureX);
		sb.append(",  TextureY Value: ");
		sb.append(textureY);
		sb.append(".");
		return sb.toString();
	}

	
}
