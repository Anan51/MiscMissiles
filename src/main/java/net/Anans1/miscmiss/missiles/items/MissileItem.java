package net.Anans1.miscmiss.missiles.items;

import net.Anans1.miscmiss.entityInit.MissileEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.Anans1.miscmiss.entityInit.EntityInit;

public class MissileItem extends ArrowItem {
    public MissileItem(Properties props) {
        super(props);
    }

    @Override
    public AbstractArrow createArrow(Level world, ItemStack ammoStack, LivingEntity shooter) {
        return new MissileEntity(EntityInit.MISSILE.get(), shooter, world);
    }

}

