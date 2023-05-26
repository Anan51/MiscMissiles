package net.Anans1.miscmiss.itemInit;

import net.Anans1.miscmiss.missiles.items.MissileItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraftforge.registries.ForgeRegistries.Keys.ITEMS;

public class ItemInit {
    public static final RegistryObject<Item> MISSILE_ITEM = ITEMS.register("missile",
            () -> new MissileItem(new Item.Properties().tab(ModCreativeTab.instance)));


}
