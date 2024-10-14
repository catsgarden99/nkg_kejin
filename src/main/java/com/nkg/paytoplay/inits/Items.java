package com.nkg.paytoplay.inits;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class Items {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "paytoplay");

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
        return ITEMS.register(name, item);
    }

    // coin
    public static final RegistryObject<Item> COIN =
            register("coin", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
