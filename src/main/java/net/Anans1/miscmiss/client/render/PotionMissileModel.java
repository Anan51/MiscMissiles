package net.Anans1.miscmiss.client.render;

import net.Anans1.miscmiss.missiles.BasicMissileEntity;
import net.Anans1.miscmiss.missiles.PotionMissileEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import static net.Anans1.miscmiss.miscmiss.MODID;

public class PotionMissileModel extends AnimatedGeoModel<PotionMissileEntity> {

    @Override
    public ResourceLocation getModelLocation(PotionMissileEntity object) {
        return new ResourceLocation(MODID, "geo/potion_missile.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PotionMissileEntity object) {
        return new ResourceLocation(MODID, "textures/entity/potion_missile.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PotionMissileEntity animatable) {
        return new ResourceLocation(MODID, "animations/potion_missile.animation.json");
    }
}
