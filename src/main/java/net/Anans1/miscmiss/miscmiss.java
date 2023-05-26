package net.Anans1.miscmiss;

import com.mojang.logging.LogUtils;
import net.Anans1.miscmiss.missiles.entity.homingMissile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

import static net.Anans1.miscmiss.miscmiss.MODID;

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
        MinecraftForge.EVENT_BUS.register(this);


    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}
