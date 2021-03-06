package blue.thejester.monstrousmystics.client.model;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

/**
 * ModelSpiritLord - Anna Erisian
 * Created using Tabula 7.1.0
 */
public class ModelSpiritLord extends AdvancedModelBase {
    private final ModelAnimator animator;
    public AdvancedModelRenderer Body;
    public AdvancedModelRenderer ArmR;
    public AdvancedModelRenderer Tail;
    public AdvancedModelRenderer ArmL;
    public AdvancedModelRenderer SpinesR;
    public AdvancedModelRenderer SpinesL;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Band1;
    public AdvancedModelRenderer Band2;
    public AdvancedModelRenderer Band3;
    public AdvancedModelRenderer TailMiddle;
    public AdvancedModelRenderer TailBottom;
    public AdvancedModelRenderer Band1_1;
    public AdvancedModelRenderer Band2_1;
    public AdvancedModelRenderer Band3_1;
    public AdvancedModelRenderer Spine;
    public AdvancedModelRenderer Spine_1;
    public AdvancedModelRenderer Spine_2;
    public AdvancedModelRenderer Spine_3;
    public AdvancedModelRenderer Spine_4;
    public AdvancedModelRenderer Spine_5;
    public AdvancedModelRenderer Spine_6;
    public AdvancedModelRenderer Spine_7;
    public AdvancedModelRenderer OrnamentUR;
    public AdvancedModelRenderer OrnamentLR;
    public AdvancedModelRenderer OrnamentMR;
    public AdvancedModelRenderer OrnamentUL;
    public AdvancedModelRenderer OrnamentLL;
    public AdvancedModelRenderer OrnamentML;
    public AdvancedModelRenderer OrnamentTRF;
    public AdvancedModelRenderer OrnamentTLF;
    public AdvancedModelRenderer OrnamentTRB;
    public AdvancedModelRenderer OrnamentTLB;

    public ModelSpiritLord() {
        animator = ModelAnimator.create();
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Spine = new AdvancedModelRenderer(this, 46, 0);
        this.Spine.setRotationPoint(0.0F, -3.8F, -0.4F);
        this.Spine.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Spine, 1.7453292519943295F, 0.0F, 0.0F);
        this.OrnamentTLF = new AdvancedModelRenderer(this, 18, 55);
        this.OrnamentTLF.setRotationPoint(-2.2F, -8.0F, -4.0F);
        this.OrnamentTLF.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.SpinesR = new AdvancedModelRenderer(this, 0, 0);
        this.SpinesR.setRotationPoint(2.1F, 7.0F, 3.0F);
        this.SpinesR.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(SpinesR, 0.0F, 0.16580627893946132F, 0.041887902047863905F);
        this.OrnamentUR = new AdvancedModelRenderer(this, 0, 35);
        this.OrnamentUR.mirror = true;
        this.OrnamentUR.setRotationPoint(3.0F, -7.6F, -4.0F);
        this.OrnamentUR.addBox(0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.Spine_6 = new AdvancedModelRenderer(this, 46, 0);
        this.Spine_6.setRotationPoint(0.0F, 2.6F, -0.1F);
        this.Spine_6.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Spine_6, 1.48352986419518F, 0.0F, 0.0F);
        this.Band2 = new AdvancedModelRenderer(this, 44, 47);
        this.Band2.setRotationPoint(1.0F, 6.0F, 0.0F);
        this.Band2.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
        this.OrnamentTRB = new AdvancedModelRenderer(this, 24, 55);
        this.OrnamentTRB.mirror = true;
        this.OrnamentTRB.setRotationPoint(-0.2F, -8.0F, 2.0F);
        this.OrnamentTRB.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.SpinesL = new AdvancedModelRenderer(this, 0, 0);
        this.SpinesL.setRotationPoint(-2.1F, 7.0F, 3.0F);
        this.SpinesL.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.setRotateAngle(SpinesL, 0.0F, -0.16580627893946132F, -0.041887902047863905F);
        this.Tail = new AdvancedModelRenderer(this, 32, 20);
        this.Tail.mirror = true;
        this.Tail.setRotationPoint(0.0F, 15.0F, -1.8F);
        this.Tail.addBox(-4.0F, 0.0F, 0.0F, 8, 6, 3, 0.0F);
        this.Band1_1 = new AdvancedModelRenderer(this, 44, 55);
        this.Band1_1.setRotationPoint(-1.0F, 10.5F, 0.0F);
        this.Band1_1.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
        this.Spine_4 = new AdvancedModelRenderer(this, 46, 0);
        this.Spine_4.setRotationPoint(0.0F, -3.8F, -0.4F);
        this.Spine_4.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Spine_4, 1.7453292519943295F, 0.0F, 0.0F);
        this.Spine_7 = new AdvancedModelRenderer(this, 46, 0);
        this.Spine_7.setRotationPoint(0.0F, 6.0F, -0.4F);
        this.Spine_7.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Spine_7, 1.3962634015954636F, 0.0F, 0.0F);
        this.Band3_1 = new AdvancedModelRenderer(this, 44, 39);
        this.Band3_1.setRotationPoint(-1.0F, 1.5F, 0.0F);
        this.Band3_1.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
        this.OrnamentTRF = new AdvancedModelRenderer(this, 24, 55);
        this.OrnamentTRF.mirror = true;
        this.OrnamentTRF.setRotationPoint(-0.2F, -8.0F, -4.0F);
        this.OrnamentTRF.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.Spine_1 = new AdvancedModelRenderer(this, 46, 0);
        this.Spine_1.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.Spine_1.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Spine_1, 1.6563174601426187F, 0.0F, 0.0F);
        this.OrnamentTLB = new AdvancedModelRenderer(this, 18, 55);
        this.OrnamentTLB.setRotationPoint(-2.2F, -8.0F, 2.0F);
        this.OrnamentTLB.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.ArmR = new AdvancedModelRenderer(this, 30, 0);
        this.ArmR.mirror = true;
        this.ArmR.setRotationPoint(6.0F, 2.0F, 0.0F);
        this.ArmR.addBox(-1.0F, -2.0F, -2.0F, 4, 16, 4, 0.0F);
        this.setRotateAngle(ArmR, -0.4553564018453205F, 0.10000736613927509F, -0.10000736613927509F);
        this.TailMiddle = new AdvancedModelRenderer(this, 32, 29);
        this.TailMiddle.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.TailMiddle.addBox(-3.5F, 0.0F, 0.0F, 7, 4, 2, 0.0F);
        this.setRotateAngle(TailMiddle, 0.31869712141416456F, 0.0F, 0.0F);
        this.TailBottom = new AdvancedModelRenderer(this, 32, 35);
        this.TailBottom.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.TailBottom.addBox(-2.5F, 0.0F, 0.0F, 5, 4, 2, 0.0F);
        this.setRotateAngle(TailBottom, 0.4553564018453205F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 0, 20);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-3.0F, -7.0F, -4.0F, 6, 7, 8, 0.0F);
        this.Band1 = new AdvancedModelRenderer(this, 44, 55);
        this.Band1.setRotationPoint(1.0F, 10.5F, 0.0F);
        this.Band1.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
        this.OrnamentLR = new AdvancedModelRenderer(this, 0, 45);
        this.OrnamentLR.mirror = true;
        this.OrnamentLR.setRotationPoint(3.0F, -2.0F, -4.0F);
        this.OrnamentLR.addBox(0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.OrnamentMR = new AdvancedModelRenderer(this, 18, 35);
        this.OrnamentMR.mirror = true;
        this.OrnamentMR.setRotationPoint(3.0F, -4.7F, -4.0F);
        this.OrnamentMR.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        this.OrnamentUL = new AdvancedModelRenderer(this, 0, 35);
        this.OrnamentUL.setRotationPoint(-4.0F, -7.6F, -4.0F);
        this.OrnamentUL.addBox(0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.OrnamentML = new AdvancedModelRenderer(this, 18, 35);
        this.OrnamentML.setRotationPoint(-4.0F, -4.7F, -4.0F);
        this.OrnamentML.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        this.OrnamentLL = new AdvancedModelRenderer(this, 0, 45);
        this.OrnamentLL.setRotationPoint(-4.0F, -2.0F, -4.0F);
        this.OrnamentLL.addBox(0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.ArmL = new AdvancedModelRenderer(this, 30, 0);
        this.ArmL.setRotationPoint(-6.0F, 2.0F, 0.0F);
        this.ArmL.addBox(-3.0F, -2.0F, -2.0F, 4, 16, 4, 0.0F);
        this.setRotateAngle(ArmL, -1.3962634015954636F, -0.10000736613927509F, 0.10000736613927509F);
        this.Spine_3 = new AdvancedModelRenderer(this, 46, 0);
        this.Spine_3.setRotationPoint(0.0F, 6.0F, -0.4F);
        this.Spine_3.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Spine_3, 1.3962634015954636F, 0.0F, 0.0F);
        this.Band3 = new AdvancedModelRenderer(this, 44, 39);
        this.Band3.setRotationPoint(1.0F, 1.5F, 0.0F);
        this.Band3.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
        this.Spine_2 = new AdvancedModelRenderer(this, 46, 0);
        this.Spine_2.setRotationPoint(0.0F, 2.6F, -0.1F);
        this.Spine_2.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Spine_2, 1.48352986419518F, 0.0F, 0.0F);
        this.Spine_5 = new AdvancedModelRenderer(this, 46, 0);
        this.Spine_5.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.Spine_5.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.setRotateAngle(Spine_5, 1.6563174601426187F, 0.0F, 0.0F);
        this.Band2_1 = new AdvancedModelRenderer(this, 44, 47);
        this.Band2_1.setRotationPoint(-1.0F, 6.0F, 0.0F);
        this.Band2_1.addBox(-2.5F, -1.5F, -2.5F, 5, 3, 5, 0.0F);
        this.Body = new AdvancedModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Body.addBox(-5.0F, 0.0F, -2.0F, 10, 15, 5, 0.0F);
        this.setRotateAngle(Body, 0.18203784098300857F, 0.0F, 0.0F);
        this.SpinesR.addChild(this.Spine);
        this.Head.addChild(this.OrnamentTLF);
        this.Body.addChild(this.SpinesR);
        this.Head.addChild(this.OrnamentUR);
        this.SpinesL.addChild(this.Spine_6);
        this.ArmR.addChild(this.Band2);
        this.Head.addChild(this.OrnamentTRB);
        this.Body.addChild(this.SpinesL);
        this.Body.addChild(this.Tail);
        this.ArmL.addChild(this.Band1_1);
        this.SpinesL.addChild(this.Spine_4);
        this.SpinesL.addChild(this.Spine_7);
        this.ArmL.addChild(this.Band3_1);
        this.Head.addChild(this.OrnamentTRF);
        this.SpinesR.addChild(this.Spine_1);
        this.Head.addChild(this.OrnamentTLB);
        this.Body.addChild(this.ArmR);
        this.Tail.addChild(this.TailMiddle);
        this.TailMiddle.addChild(this.TailBottom);
        this.Body.addChild(this.Head);
        this.ArmR.addChild(this.Band1);
        this.Head.addChild(this.OrnamentLR);
        this.Head.addChild(this.OrnamentMR);
        this.Head.addChild(this.OrnamentUL);
        this.Head.addChild(this.OrnamentML);
        this.Head.addChild(this.OrnamentLL);
        this.Body.addChild(this.ArmL);
        this.SpinesR.addChild(this.Spine_3);
        this.ArmR.addChild(this.Band3);
        this.SpinesR.addChild(this.Spine_2);
        this.SpinesL.addChild(this.Spine_5);
        this.ArmL.addChild(this.Band2_1);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }
}
