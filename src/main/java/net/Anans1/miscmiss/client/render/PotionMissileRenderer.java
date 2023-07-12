package net.Anans1.miscmiss.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.Anans1.miscmiss.missiles.BasicMissileEntity;
import net.Anans1.miscmiss.missiles.PotionMissileEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoProjectilesRenderer;

import static net.Anans1.miscmiss.miscmiss.MODID;

public class PotionMissileRenderer extends GeoProjectilesRenderer<PotionMissileEntity> {
    public PotionMissileRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PotionMissileModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(PotionMissileEntity instance) {
        return new ResourceLocation(MODID, "textures/entity/potion_missile.png");
    }
    @Override
    public RenderType getRenderType(PotionMissileEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}