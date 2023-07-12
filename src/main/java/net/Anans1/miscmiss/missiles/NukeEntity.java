package net.Anans1.miscmiss.missiles;

import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.network.NetworkHooks;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

public class NukeEntity extends AbstractArrow implements IAnimatable {
    private final AnimationFactory factory = GeckoLibUtil.createFactory(this);
    public NukeEntity(EntityType<NukeEntity> entityType, Level world) {
        super(entityType, world);
    }

    public NukeEntity(EntityType<NukeEntity> entityType, double x, double y, double z, Level world) {
        super(entityType, x, y, z, world);

    }

    public NukeEntity(EntityType<NukeEntity> entityType, LivingEntity shooter, Level world) {
        super(entityType, shooter, world);

    }
    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }
    @Override
    protected void onHitEntity(EntityHitResult ray) {
        super.onHitEntity(ray);
        // this, x, y, z, explosionStrength, setsFires, breakMode
        this.level.explode(this, this.getX(), this.getY(), this.getZ(), 4000.0f, true, Explosion.BlockInteraction.DESTROY);
        this.discard();
    }
    @Override
    protected void onHitBlock(BlockHitResult ray) {
        super.onHitBlock(ray);
        BlockState theBlockYouHit = this.level.getBlockState(ray.getBlockPos());
        this.level.explode(this, this.getX(), this.getY(), this.getZ(), 4000.0f, true, Explosion.BlockInteraction.DESTROY);
        this.discard();
    }

    @Override
    protected void tickDespawn() {
        if (this.inGroundTime > 1){
            this.discard();
        }
    }
    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    public void shoot(double x, double y, double z, float velocity, float inaccuracy) {
        Entity shooter = this.getOwner();
        if (!(shooter instanceof EntityBlock)) {
            return;
        }
        super.shoot(x, y, z, velocity, 0);

    }

    @Override
    public void registerControllers(AnimationData data) {

    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}


