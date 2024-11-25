package ddfexcraft.tmt.slim;

import net.minecraft.util.Vec3;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

import java.io.Serializable;


/**
 * basically the same as Vec3D, but a float. Usually used for storing rotations.
 * @author Ferdinand
 */


public class Vec3f implements Serializable {

    public static final float radianF = (float) Math.PI / 180.0f;
    public float x;
    public float y;
    public float z;

    public Vec3f(){
        x = 0;
        y = 0;
        z = 0;
    }

    public Vec3f(double xVec, double yVec, double zVec) {
        this((float)xVec, (float)yVec, (float)zVec);
    }

    public Vec3f(Vec3 v){
        x = (float)v.xCoord;
        y = (float)v.yCoord;
        z = (float)v.zCoord;
    }
    public Vec3f(Vec3f v){
        x = v.x;
        y = v.y;
        z = v.z;
    }

    public Vec3f(float f, float g, float h){
        x = f;
        y = g;
        z = h;
    }

    public Vec3f(float[] v){
        x = v[0];
        y = v[1];
        z = v[2];
    }

    public Vec3f crossProduct(Vec3f p_72431_1_) {
        return new Vec3f(this.y * p_72431_1_.z - this.z * p_72431_1_.y, this.z * p_72431_1_.x - this.x * p_72431_1_.z, this.x * p_72431_1_.y - this.y * p_72431_1_.x);
    }

    public Vec3f scale(float scale){
        return new Vec3f(this.x * scale, this.y * scale, this.z * scale);
    }

    public Vec3f scale(float scaleX, float scaleY, float scaleZ){
        return new Vec3f(this.x * scaleX, this.y * scaleY, this.z * scaleZ);
    }

    public Vec3f subtract(float x, float y, float z){
        return this.addVector(-x, -y, -z);
    }

    public Vec3f add(Vec3f vec){
        return this.addVector(vec.x, vec.y, vec.z);
    }

    //todo: this probably broke everything, undo
    public Vec3f addVector(float x, float y, float z){
        this.x +=x;
        this.y +=y;
        this.z +=z;
        return this;
    }

    public Vec3f addVector(double x, double y, double z){
        this.x +=x;
        this.y +=y;
        this.z +=z;
        return this;
    }

    public Vec3f subtract(Vec3f vec){
        return new Vec3f(x -vec.x,
        y -vec.y,
        z -vec.z);
    }


    public Vec3f normalize(){
        double d0 = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        return d0 < 1.0E-4D ? new Vec3f() : new Vec3f(this.x / d0, this.y / d0, this.z / d0);
    }

    public float dotProduct(Vec3f vec){
        return this.x * vec.x + this.y * vec.y + this.z * vec.z;
    }


    public float dot2D(Vec3f other){
        return this.x * other.x + this.z * other.z;
    }

    public static Vec3f direction(float... arr){
        double l = length(arr[0], arr[1], arr[2]); return new Vec3f(arr[0] / l, arr[1] / l, arr[2] / l);
    }

    public static Vec3f direction(Vec3f vec){
        double l = length(vec.x, vec.y, vec.z); return new Vec3f(vec.x / l, vec.y / l, vec.z / l);
    }

    //based on fvtm rail entity stuff
    public Vec3f distance(Vec3f dest, float am){
        Vec3f vec = new Vec3f((x + dest.x) * 0.5, (y + dest.y) * 0.5, (z + dest.z) * 0.5);
        vec = direction(vec.x - x, vec.y - y, vec.z - z);
        return new Vec3f(x + (vec.x * am), y + (vec.y * am), z + (vec.z * am));
    }

    public Vec3f distance(Vec3f dest, double am){
        Vec3f vec = new Vec3f((x + dest.x) * 0.5, (y + dest.y) * 0.5, (z + dest.z) * 0.5);
        vec = direction(vec.x - x, vec.y - y, vec.z - z);
        return new Vec3f(x + (vec.x * am), y + (vec.y * am), z + (vec.z * am));
    }
    public Vec3f distance(float[] dest, float am){
        Vec3f vec = new Vec3f((x + dest[0]) * 0.5, (y + dest[1]) * 0.5, (z + dest[2]) * 0.5);
        vec = direction(vec.x - x, vec.y - y, vec.z - z);
        return new Vec3f(x + (vec.x * am), y + (vec.y * am), z + (vec.z * am));
    }

    public double length(){
        return Math.sqrt(x * x + y * y + z * z);
    }


    public double length2d(){
        return Math.sqrt(x * x + z * z);
    }

    public static double length(float... arr){
        return Math.sqrt(arr[0] * arr[0] + arr[1] * arr[1] + arr[2] * arr[2]);
    }

    public static double length(Vec3f vec){
        return Math.sqrt(vec.x * vec.x + vec.y * vec.y + vec.z * vec.z);
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        else if(!(obj instanceof Vec3f)){
            return false;
        }
        else{
            Vec3f vec3d = (Vec3f)obj;
            return Float.compare(vec3d.x, this.x) != 0 ? false : (Float.compare(vec3d.y, this.y) != 0 ? false : Float.compare(vec3d.z, this.z) == 0);
        }
    }

    public int hashCode(){
        long j = Float.floatToIntBits(this.x);
        int i = (int)(j ^ j >>> 32);
        j = Float.floatToIntBits(this.y);
        i = 31 * i + (int)(j ^ j >>> 32);
        j = Float.floatToIntBits(this.z);
        i = 31 * i + (int)(j ^ j >>> 32);
        return i;
    }

    public float distance(Vec3f vec){
        float d0 = vec.x - this.x;
        float d1 = vec.y - this.y;
        float d2 = vec.z - this.z;
        return (float)Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
    }

    public float distance2d(Vec3f vec){
        return Math.abs(this.x - vec.x)+Math.abs(this.z - vec.z);
    }

    @Override
    public String toString(){
        return String.format("Vec3f[ %s, %s, %s ]", x, y, z);
    }


    //this could be moved to vec3f
    public Vec3f getRelativeVector(Vec3f vec){
        Matrix4f mat = new Matrix4f();
        mat.m00 = vec.x; mat.m10 = vec.y; mat.m20 = vec.z;
        Matrix4f.rotate(z * 3.14159265F / 180, new Vector3f(1F, 0F, 0F), mat, mat);
        Matrix4f.rotate(y * 3.14159265F / 180, new Vector3f(0F, 0F, 1F), mat, mat);
        Matrix4f.rotate(x * 3.14159265F / 180, new Vector3f(0F, 1F, 0F), mat, mat);
        return new Vec3f(mat.m00, mat.m10, mat.m20);
    }

    public Vec3f rotatePoint(float pitch, float yaw, float roll) {
        float cos,sin,x= this.x,y= this.y,z= this.z;
        //rotate pitch
        if (pitch != 0.0F) {
            cos = (float)Math.cos(pitch*radianF);
            sin = (float)Math.sin(pitch*radianF);

            this.x = (y * sin) + (x * cos);
            this.y = (y * cos) - (x * sin);
        }
        //rotate yaw
        if (yaw != 0.0F) {
            cos = (float)Math.cos(yaw*radianF);
            sin = (float)Math.sin(yaw*radianF);

            this.x = (x * cos) - (z * sin);
            this.z = (x * sin) + (z * cos);
        }
        //rotate roll
        if (roll != 0.0F) {
            cos = (float)Math.cos(roll*radianF);
            sin = (float)Math.sin(roll*radianF);

            this.y = (z * cos) - (y * sin);
            this.z = (z * sin) + (y * cos);
        }
        return this;
    }

    public Vec3f rotateOnYaw(float yaw) {
        float cos,sin,x= this.x,z= this.z;
        //rotate yaw
        if (yaw != 0.0F) {
            cos = (float)Math.cos(yaw*radianF);
            sin = (float)Math.sin(yaw*radianF);

            this.x = (x * cos) - (z * sin);
            this.z = (x * sin) + (z * cos);
        }
        return this;
    }
}
