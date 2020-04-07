package blue.thejester.monstrousmystics.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelIceSpirit - Anna Erisian
 * Created using Tabula 7.1.0
 */
public class ModelIceSpirit extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer ArmR;
    public ModelRenderer Head;
    public ModelRenderer Tail;
    public ModelRenderer ArmL;
    public ModelRenderer Spine;
    public ModelRenderer Spine_1;
    public ModelRenderer Spine_2;
    public ModelRenderer Spine_3;
    public ModelRenderer Spine_4;
    public ModelRenderer TailBottom;

    public ModelIceSpirit() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Spine_2 = new ModelRenderer(this, 54, 0);
        this.Spine_2.setRotationPoint(0.0F, 8.4F, 1.8F);
        this.Spine_2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Spine_2, -0.17453292519943295F, 0.0F, 0.0F);
        this.ArmL = new ModelRenderer(this, 24, 0);
        this.ArmL.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.ArmL.addBox(-2.0F, -2.0F, -2.0F, 3, 14, 3, 0.0F);
        this.setRotateAngle(ArmL, -1.3962634015954636F, -0.10000736613927509F, 0.10000736613927509F);
        this.Spine_3 = new ModelRenderer(this, 54, 0);
        this.Spine_3.setRotationPoint(0.0F, 10.7F, 1.5F);
        this.Spine_3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Spine_3, -0.3490658503988659F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 36, 0);
        this.Tail.mirror = true;
        this.Tail.setRotationPoint(0.0F, 12.0F, -1.8F);
        this.Tail.addBox(-3.0F, 0.0F, 0.0F, 6, 7, 3, 0.0F);
        this.setRotateAngle(Tail, 0.22759093446006054F, 0.0F, 0.0F);
        this.Spine = new ModelRenderer(this, 54, 0);
        this.Spine.setRotationPoint(0.0F, 1.7F, 1.5F);
        this.Spine.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Spine, 0.3490658503988659F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.setRotateAngle(Body, 0.18203784098300857F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 17);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Spine_1 = new ModelRenderer(this, 54, 0);
        this.Spine_1.setRotationPoint(0.0F, 4.0F, 1.8F);
        this.Spine_1.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(Spine_1, 0.17453292519943295F, 0.0F, 0.0F);
        this.ArmR = new ModelRenderer(this, 24, 0);
        this.ArmR.mirror = true;
        this.ArmR.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.ArmR.addBox(-1.0F, -2.0F, -2.0F, 3, 14, 3, 0.0F);
        this.setRotateAngle(ArmR, -1.3962634015954636F, 0.10000736613927509F, -0.10000736613927509F);
        this.Spine_4 = new ModelRenderer(this, 54, 0);
        this.Spine_4.setRotationPoint(0.0F, 6.1F, 2.0F);
        this.Spine_4.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.TailBottom = new ModelRenderer(this, 36, 10);
        this.TailBottom.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.TailBottom.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(TailBottom, 0.31869712141416456F, 0.0F, 0.0F);
        this.Body.addChild(this.Spine_2);
        this.Body.addChild(this.ArmL);
        this.Body.addChild(this.Spine_3);
        this.Body.addChild(this.Tail);
        this.Body.addChild(this.Spine);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.Spine_1);
        this.Body.addChild(this.ArmR);
        this.Body.addChild(this.Spine_4);
        this.Tail.addChild(this.TailBottom);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}