package net.Anans1.miscmiss.client.render;

import net.Anans1.miscmiss.missiles.BasicMissileEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

import static net.Anans1.miscmiss.miscmiss.MODID;

public class BasicMissileRenderer extends ArrowRenderer<BasicMissileEntity> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(MODID, "textures/entity/basic_missile.png");

    public BasicMissileRenderer(EntityRendererProvider.Context manager) {
        super(manager);
    }

    public ResourceLocation getTextureLocation(BasicMissileEntity arrow) {
        return TEXTURE;
    }
}


