package net.Anans1.miscmiss.missiles;

import net.Anans1.miscmiss.EntityInit;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class NukeItem extends ArrowItem {
    public NukeItem(Properties props) {
        super(props);
    }

    @Override
    public AbstractArrow createArrow(Level world, ItemStack ammoStack, LivingEntity shooter) {
        return new NukeEntity(EntityInit.NUKE_MISSILE.get(), shooter, world);
    }
}