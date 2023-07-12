package net.Anans1.miscmiss;

import net.Anans1.miscmiss.missiles.BasicMissileEntity;
import net.Anans1.miscmiss.missiles.NukeEntity;
import net.Anans1.miscmiss.missiles.PotionMissileEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.Anans1.miscmiss.miscmiss.MODID;

public class EntityInit {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);
    public static final RegistryObject<EntityType<BasicMissileEntity>> BASIC_MISSILE = ENTITY_TYPES.register("basic_missile",
            () -> EntityType.Builder.of((EntityType.EntityFactory<BasicMissileEntity>) BasicMissileEntity::new, MobCategory.MISC)
                    .sized(1F, 1F)
                    .build(new ResourceLocation(MODID, "basic_missile").toString()));

    public static final RegistryObject<EntityType<PotionMissileEntity>> POTION_MISSILE = ENTITY_TYPES.register("potion_missile",
            () -> EntityType.Builder.of((EntityType.EntityFactory<PotionMissileEntity>) PotionMissileEntity::new, MobCategory.MISC)
                    .sized(1F, 1F)
                    .build(new ResourceLocation(MODID, "potion_missile").toString()));

    public static final RegistryObject<EntityType<NukeEntity>> NUKE_MISSILE = ENTITY_TYPES.register("nuke_missile",
            () -> EntityType.Builder.of((EntityType.EntityFactory<NukeEntity>) NukeEntity::new, MobCategory.MISC)
                    .sized(1F, 1F)
                    .build(new ResourceLocation(MODID, "nuke_missile").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
