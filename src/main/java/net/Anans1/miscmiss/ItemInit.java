package net.Anans1.miscmiss;

import net.Anans1.miscmiss.missiles.BasicMissileItem;
import net.Anans1.miscmiss.missiles.NukeItem;
import net.Anans1.miscmiss.missiles.PotionMissileItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

import static net.Anans1.miscmiss.BlockInit.BLOCKS;
import static net.Anans1.miscmiss.miscmiss.MODID;
import static net.minecraftforge.registries.ForgeRegistries.ITEMS;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final RegistryObject<Item> BASIC_MISSILE = ITEMS.register("basic_missile",
            () -> new BasicMissileItem(new Item.Properties().tab(miscmiss.ModCreativeTab.instance)));
    public static final RegistryObject<Item> POTION_MISSILE = ITEMS.register("potion_missile",
            () -> new PotionMissileItem(new Item.Properties().tab(miscmiss.ModCreativeTab.instance)));

    public static final RegistryObject<Item> NUKE_MISSILE = ITEMS.register("nuke_missile",
            () -> new NukeItem(new Item.Properties().tab(miscmiss.ModCreativeTab.instance)));


}
