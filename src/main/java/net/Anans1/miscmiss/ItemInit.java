package net.Anans1.miscmiss;

import net.Anans1.miscmiss.missiles.BasicMissileItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.Anans1.miscmiss.miscmiss.MODID;
import static net.minecraftforge.registries.ForgeRegistries.ITEMS;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final RegistryObject<Item> TEST = ITEMS.register("test",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASIC_MISSILE = ITEMS.register("basic_missile",
            () -> new BasicMissileItem(new Item.Properties().tab(miscmiss.ModCreativeTab.instance)));
}
