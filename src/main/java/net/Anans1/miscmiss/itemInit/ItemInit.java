package net.Anans1.miscmiss.itemInit;

import net.Anans1.miscmiss.miscmiss;
import net.Anans1.miscmiss.missiles.items.MissileItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, miscmiss.MODID);
    public static final RegistryObject<Item> MISSILE_ITEM = ITEMS.register("missile",
            () -> new MissileItem(new Item.Properties().tab(ModCreativeTab.instance)));

    public static class ModCreativeTab extends CreativeModeTab {
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }
        public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "assets");

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MISSILE_ITEM.get());
        }
    }
}
