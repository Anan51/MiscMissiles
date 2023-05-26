package net.Anans1.miscmiss.entityInit;

import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.network.NetworkHooks;
import net.minecraft.world.entity.player.Player;
public class MissileEntity extends AbstractArrow {
    public MissileEntity(EntityType<MissileEntity> entityType, Level world) {
        super(entityType, world);
    }

    public MissileEntity(EntityType<MissileEntity> entityType, double x, double y, double z, Level world) {
        super(entityType, x, y, z, world);
    }

    public MissileEntity(EntityType<MissileEntity> entityType, LivingEntity shooter, Level world) {
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
        this.level.explode(this, this.getX(), this.getY(), this.getZ(), 4.0f, true, Explosion.BlockInteraction.BREAK);

    }

    @Override
    protected void onHitBlock(BlockHitResult ray) {
        super.onHitBlock(ray);
        this.level.explode(this, this.getX(), this.getY(), this.getZ(), 4.0f, true, Explosion.BlockInteraction.BREAK);
    }

    @Override
    protected void tickDespawn() {
        if (this.inGroundTime > 0.1) {
            this.discard();
        }
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}


