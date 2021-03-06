package blue.thejester.monstrousmystics.entity.tier2;

import blue.thejester.monstrousmystics.MonstrousMystics;
import blue.thejester.monstrousmystics.client.render.RenderEndergeist;
import blue.thejester.monstrousmystics.client.render.RenderSparkSkeleton;
import blue.thejester.monstrousmystics.entity.EntityJesterMob;
import blue.thejester.monstrousmystics.entity.ai.AnimatedSpellAIFactory;
import blue.thejester.monstrousmystics.entity.ai.EntityAIStrafe;
import electroblob.wizardry.event.SpellCastEvent;
import electroblob.wizardry.packet.PacketNPCCastSpell;
import electroblob.wizardry.packet.WizardryPacketHandler;
import electroblob.wizardry.registry.Spells;
import electroblob.wizardry.registry.WizardryPotions;
import electroblob.wizardry.util.SpellModifiers;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static electroblob.wizardry.registry.Spells.banish;


public class EntityEndergeist extends EntityJesterMob {
    private static final ResourceLocation LOOT_TABLE = new ResourceLocation(MonstrousMystics.MODID, "entities/endergeist");
    private static final String NAME = "endergeist";
    private int attackTimer;

    public static final Animation SHOOT_ANIMATION = Animation.create(11);
    public static final Animation SHOOT_ANIMATION_LONG = Animation.create(22);
    private static final Animation[] ANIMATIONS = {SHOOT_ANIMATION, SHOOT_ANIMATION_LONG};

    public EntityEndergeist(World worldIn) {
        super(worldIn);
        this.setSize(0.6f, 1.95f);
        this.experienceValue = 6;
    }

    public static void registerSelf(int id) {
        ResourceLocation entity_name = new ResourceLocation(MonstrousMystics.MODID, NAME);
        EntityRegistry.registerModEntity(entity_name, EntityEndergeist.class, NAME, id,
                MonstrousMystics.instance, 64, 3, true,
                0xd3d0b6, 0xe8e058);
    }

    @SideOnly(Side.CLIENT)
    public static void registerOwnRenderer() {
        RenderingRegistry.registerEntityRenderingHandler(EntityEndergeist.class, RenderEndergeist.FACTORY);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, AnimatedSpellAIFactory.repeatingHalfHealthAttackSpell(this, SHOOT_ANIMATION, 10, Spells.life_drain));
        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1.0, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, false));
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData priordata) {
        IEntityLivingData livingdata = super.onInitialSpawn(difficulty, priordata);
        setEquipmentBasedOnDifficulty(difficulty);
        return livingdata;
    }

    protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
        //do not call super - mm creatures should not be armored
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if(this.attackTimer > 0) {
            this.attackTimer--;
        }
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23D);
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
        SpellModifiers mods = new SpellModifiers();
        if( super.attackEntityAsMob(entityIn) && entityIn instanceof EntityLivingBase && !MinecraftForge.EVENT_BUS.post(new SpellCastEvent.Pre(SpellCastEvent.Source.NPC, banish, this, mods))) {

            if(banish.cast(world, this, EnumHand.MAIN_HAND, 0, (EntityLivingBase) entityIn, mods)){

                MinecraftForge.EVENT_BUS.post(new SpellCastEvent.Post(SpellCastEvent.Source.NPC, banish, this, mods));

                // Sends a packet to all players in dimension to tell them to spawn particles.
                IMessage msg = new PacketNPCCastSpell.Message(getEntityId(), entityIn.getEntityId(),
                        EnumHand.MAIN_HAND, banish, mods);
                WizardryPacketHandler.net.sendToDimension(msg, world.provider.getDimension());
            }
            return true;
        }
        return false;
    }

    @Override
    protected ResourceLocation getLootTable() {
        return LOOT_TABLE;
    }

    @Override
    public float getEyeHeight() {
        return 1.74f;
    }

    @Override
    public Animation[] getAnimations() {
        return ANIMATIONS;
    }
}
