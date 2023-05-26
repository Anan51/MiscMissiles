package net.Anans1.miscmiss.entityInit;

import net.Anans1.miscmiss.miscmiss;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class MissileEntityRenderer extends ArrowRenderer<MissileEntity> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(miscmiss.MODID, "textures/entity/Missile.png");

    public MissileEntityRenderer(EntityRendererProvider.Context manager) {
        super(manager);
    }

    public ResourceLocation getTextureLocation(MissileEntity missile) {
        return TEXTURE;
    }
}