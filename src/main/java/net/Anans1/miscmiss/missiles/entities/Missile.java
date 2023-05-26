package net.Anans1.miscmiss.missiles.entities;

import net.Anans1.miscmiss.entityInit.MissileEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
public class Missile extends AbstractArrow {
    public Missile(EntityType<MissileEntity> entityType, Level world) {
        super(entityType, world);
    }

    public Missile(EntityType<MissileEntity> entityType, double x, double y, double z, Level world) {
        super(entityType, x, y, z, world);
    }

    public Missile(EntityType<MissileEntity> entityType, LivingEntity shooter, Level world) {
        super(entityType, shooter, world);
    }

    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }
}


