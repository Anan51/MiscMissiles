package net.Anans1.miscmiss.entityInit;

import net.Anans1.miscmiss.miscmiss;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, miscmiss.MODID);
    public static final RegistryObject<EntityType<MissileEntity>> MISSILE = ENTITY_TYPES.register("missile_entity",
            () -> EntityType.Builder.of((EntityType.EntityFactory<MissileEntity>) MissileEntity::new, MobCategory.MISC).sized(1F, 1F).build("missile_entity"));
}