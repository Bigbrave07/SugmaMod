package com.Bigbrave.SugmaMod.item;

import com.Bigbrave.SugmaMod.SugmaMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = SugmaMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab SUGMA_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        SUGMA_TAB = event.registerCreativeModeTab(new ResourceLocation(SugmaMod.MODID, "sugma_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.COCK.get())).title(Component.translatable("creativemodetab.sugma_tab")));
    }
}
