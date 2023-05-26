package net.Anans1.miscmiss;

import com.mojang.logging.LogUtils;
import net.Anans1.miscmiss.entityInit.EntityInit;
import net.Anans1.miscmiss.entityInit.MissileEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static net.Anans1.miscmiss.miscmiss.MODID;
import static net.minecraftforge.common.MinecraftForge.EVENT_BUS;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MODID)
public class miscmiss
{
    // Directly reference a slf4j logger
    public static final String MODID = "miscmiss";
    private static final Logger LOGGER = LogUtils.getLogger();

    public miscmiss()
    {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        EVENT_BUS.register(this);

        EntityInit.ENTITY_TYPES.register(EVENT_BUS);


    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}
