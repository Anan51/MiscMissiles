package net.Anans1.miscmiss;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.DispenserBlockEntity;
import net.minecraft.world.level.block.entity.DropperBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Map;

public class MissileLauncherBlock extends DispenserBlock {
    public MissileLauncherBlock(Properties p_52664_) {
        super(p_52664_);
    }
    private static final Map<Item, DispenseItemBehavior> DISPENSER_REGISTRY = Util.make(new Object2ObjectOpenHashMap<>(), (p_52723_) -> {
        p_52723_.defaultReturnValue(new DefaultDispenseItemBehavior());
    });

    public static void registerBehavior(ItemLike p_52673_, DispenseItemBehavior p_52674_) {
        DISPENSER_REGISTRY.put(p_52673_.asItem(), p_52674_);
    }

    public InteractionResult use(BlockState p_52693_, Level p_52694_, BlockPos p_52695_, Player p_52696_, InteractionHand p_52697_, BlockHitResult p_52698_) {
        if (p_52694_.isClientSide) {
            return net.minecraft.world.InteractionResult.SUCCESS;
        } else {
            BlockEntity blockentity = p_52694_.getBlockEntity(p_52695_);
            if (blockentity instanceof DispenserBlockEntity) {
                p_52696_.openMenu((DispenserBlockEntity)blockentity);
                if (blockentity instanceof DropperBlockEntity) {
                    p_52696_.awardStat(Stats.INSPECT_DROPPER);
                } else {
                    p_52696_.awardStat(Stats.INSPECT_DISPENSER);
                }
            }

            return net.minecraft.world.InteractionResult.CONSUME;
        }
    }
}
