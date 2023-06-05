package com.Bigbrave.SugmaMod.item;

import com.Bigbrave.SugmaMod.SugmaMod;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SugmaMod.MODID);

    public static final RegistryObject<Item> COCK = ITEMS.register("cock",
            () -> new Item(new Item.Properties().food(Foods.BEEF)));

    public static final RegistryObject<Item> TOILET_PAPER = ITEMS.register("toilet_paper",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
