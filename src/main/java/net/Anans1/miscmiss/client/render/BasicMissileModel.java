package net.Anans1.miscmiss.client.render;

import net.Anans1.miscmiss.missiles.BasicMissileEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import static net.Anans1.miscmiss.miscmiss.MODID;

public class BasicMissileModel extends AnimatedGeoModel<BasicMissileEntity> {

    @Override
    public ResourceLocation getModelLocation(BasicMissileEntity object) {
        return new ResourceLocation(MODID, "geo/basic_missile.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BasicMissileEntity object) {
        return new ResourceLocation(MODID, "textures/entity/basic_missile.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BasicMissileEntity animatable) {
        return new ResourceLocation(MODID, "animations/basic_missile.animation.json");
    }
}
