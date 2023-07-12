package net.Anans1.miscmiss;

import com.mojang.logging.LogUtils;
import net.Anans1.miscmiss.client.render.BasicMissileRenderer;
import net.Anans1.miscmiss.missiles.BasicMissileItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

import static net.Anans1.miscmiss.miscmiss.MODID;
import static net.minecraftforge.common.MinecraftForge.EVENT_BUS;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MODID)
public class miscmiss
{
    // Directly reference a slf4j logger
    public static final String MODID = "miscmiss";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static class ModCreativeTab extends CreativeModeTab {
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.REDSTONE_BLOCK);
        }
        public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "miscmiss");


    }


    public miscmiss()
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);




        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        EVENT_BUS.register(this);
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        EntityInit.ENTITY_TYPES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        GeckoLib.initialize();

    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}
