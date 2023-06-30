package net.Anans1.miscmiss;

import net.Anans1.miscmiss.missiles.BasicMissileEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.Anans1.miscmiss.miscmiss.MODID;

public class EntityInit {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);
    public static final RegistryObject<EntityType<BasicMissileEntity>> BASIC_MISSILE = ENTITY_TYPES.register("basic_missile",
            () -> EntityType.Builder.of((EntityType.EntityFactory<BasicMissileEntity>) BasicMissileEntity::new, MobCategory.MISC).sized(10F, 3F).build("basic_missile"));
}
