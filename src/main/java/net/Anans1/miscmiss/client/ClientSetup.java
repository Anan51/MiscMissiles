package net.Anans1.miscmiss.client;

import net.Anans1.miscmiss.miscmiss;
import net.Anans1.miscmiss.entityInit.MissileEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.Anans1.miscmiss.entityInit.EntityInit;
@Mod.EventBusSubscriber(modid = miscmiss.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    @SubscribeEvent
    public static void doSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(EntityInit.MISSILE.get(), MissileEntityRenderer::new);
    }
}
