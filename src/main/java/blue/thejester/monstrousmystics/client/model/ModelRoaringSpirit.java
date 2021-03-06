package blue.thejester.monstrousmystics.client.model;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

/**
 * ModelRoaringSpirit - Anna Erisian
 * Created using Tabula 7.1.0
 */
public class ModelRoaringSpirit extends AdvancedModelBase {
    private final ModelAnimator animator;
    public AdvancedModelRenderer Body;
    public AdvancedModelRenderer ArmR;
    public AdvancedModelRenderer Tail;
    public AdvancedModelRenderer ArmL;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer ArmR2;
    public AdvancedModelRenderer ArmL2;
    public AdvancedModelRenderer TailMiddle;
    public AdvancedModelRenderer TailBottom;
    public AdvancedModelRenderer OrnamentUR;
    public AdvancedModelRenderer OrnamentLR;
    public AdvancedModelRenderer OrnamentMR;
    public AdvancedModelRenderer OrnamentUL;
    public AdvancedModelRenderer OrnamentLL;
    public AdvancedModelRenderer OrnamentML;
    public AdvancedModelRenderer OrnamentTR;
    public AdvancedModelRenderer OrnamentTL;

    public ModelRoaringSpirit() {
        animator = ModelAnimator.create();
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.TailMiddle = new AdvancedModelRenderer(this, 28, 29);
        this.TailMiddle.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.TailMiddle.addBox(-3.5F, 0.0F, 0.0F, 7, 4, 2, 0.0F);
        this.setRotateAngle(TailMiddle, 0.31869712141416456F, 0.0F, 0.0F);
        this.OrnamentLR = new AdvancedModelRenderer(this, 0, 45);
        this.OrnamentLR.mirror = true;
        this.OrnamentLR.setRotationPoint(3.0F, -2.0F, -4.0F);
        this.OrnamentLR.addBox(0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 0, 20);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-3.0F, -7.0F, -4.0F, 6, 7, 8, 0.0F);
        this.ArmR = new AdvancedModelRenderer(this, 30, 0);
        this.ArmR.mirror = true;
        this.ArmR.setRotationPoint(6.0F, 2.0F, 0.0F);
        this.ArmR.addBox(-1.0F, -2.0F, -2.0F, 4, 16, 4, 0.0F);
        this.setRotateAngle(ArmR, -1.6231562043547265F, 0.10000736613927509F, -0.10000736613927509F);
        this.OrnamentLL = new AdvancedModelRenderer(this, 0, 45);
        this.OrnamentLL.setRotationPoint(-4.0F, -2.0F, -4.0F);
        this.OrnamentLL.addBox(0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.Body = new AdvancedModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Body.addBox(-5.0F, 0.0F, -2.0F, 10, 15, 5, 0.0F);
        this.setRotateAngle(Body, 0.18203784098300857F, 0.0F, 0.0F);
        this.ArmL = new AdvancedModelRenderer(this, 30, 0);
        this.ArmL.setRotationPoint(-6.0F, 2.0F, 0.0F);
        this.ArmL.addBox(-3.0F, -2.0F, -2.0F, 4, 16, 4, 0.0F);
        this.setRotateAngle(ArmL, -1.6231562043547265F, -0.10000736613927509F, 0.10000736613927509F);
        this.OrnamentUL = new AdvancedModelRenderer(this, 0, 35);
        this.OrnamentUL.setRotationPoint(-4.0F, -7.6F, -4.0F);
        this.OrnamentUL.addBox(0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.OrnamentMR = new AdvancedModelRenderer(this, 18, 35);
        this.OrnamentMR.mirror = true;
        this.OrnamentMR.setRotationPoint(3.0F, -4.7F, -4.0F);
        this.OrnamentMR.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        this.Tail = new AdvancedModelRenderer(this, 28, 20);
        this.Tail.mirror = true;
        this.Tail.setRotationPoint(0.0F, 15.0F, -1.8F);
        this.Tail.addBox(-4.0F, 0.0F, 0.0F, 8, 6, 3, 0.0F);
        this.TailBottom = new AdvancedModelRenderer(this, 28, 35);
        this.TailBottom.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.TailBottom.addBox(-2.5F, 0.0F, 0.0F, 5, 4, 2, 0.0F);
        this.setRotateAngle(TailBottom, 0.4553564018453205F, 0.0F, 0.0F);
        this.OrnamentTR = new AdvancedModelRenderer(this, 36, 35);
        this.OrnamentTR.mirror = true;
        this.OrnamentTR.setRotationPoint(-0.2F, -8.0F, -4.0F);
        this.OrnamentTR.addBox(0.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F);
        this.OrnamentTL = new AdvancedModelRenderer(this, 18, 46);
        this.OrnamentTL.setRotationPoint(-2.2F, -8.0F, -4.0F);
        this.OrnamentTL.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        this.ArmL2 = new AdvancedModelRenderer(this, 30, 0);
        this.ArmL2.setRotationPoint(-6.0F, 6.2F, 0.0F);
        this.ArmL2.addBox(-3.0F, -2.0F, -2.0F, 4, 16, 4, 0.0F);
        this.setRotateAngle(ArmL2, -1.3962634015954636F, 0.0F, 0.10000736613927509F);
        this.OrnamentML = new AdvancedModelRenderer(this, 18, 35);
        this.OrnamentML.setRotationPoint(-4.0F, -4.7F, -4.0F);
        this.OrnamentML.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        this.ArmR2 = new AdvancedModelRenderer(this, 30, 0);
        this.ArmR2.mirror = true;
        this.ArmR2.setRotationPoint(6.0F, 6.2F, 0.0F);
        this.ArmR2.addBox(-1.0F, -2.0F, -2.0F, 4, 16, 4, 0.0F);
        this.setRotateAngle(ArmR2, -1.3962634015954636F, 0.0F, -0.10000736613927509F);
        this.OrnamentUR = new AdvancedModelRenderer(this, 0, 35);
        this.OrnamentUR.mirror = true;
        this.OrnamentUR.setRotationPoint(3.0F, -7.6F, -4.0F);
        this.OrnamentUR.addBox(0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F);
        this.Tail.addChild(this.TailMiddle);
        this.Head.addChild(this.OrnamentLR);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.ArmR);
        this.Head.addChild(this.OrnamentLL);
        this.Body.addChild(this.ArmL);
        this.Head.addChild(this.OrnamentUL);
        this.Head.addChild(this.OrnamentMR);
        this.Body.addChild(this.Tail);
        this.TailMiddle.addChild(this.TailBottom);
        this.Head.addChild(this.OrnamentTR);
        this.Head.addChild(this.OrnamentTL);
        this.Body.addChild(this.ArmL2);
        this.Head.addChild(this.OrnamentML);
        this.Body.addChild(this.ArmR2);
        this.Head.addChild(this.OrnamentUR);

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
