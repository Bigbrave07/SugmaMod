package com.Bigbrave.SugmaMod;

import com.Bigbrave.SugmaMod.block.ModBlocks;
import com.Bigbrave.SugmaMod.item.ModCreativeModeTabs;
import com.Bigbrave.SugmaMod.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SugmaMod.MODID)
public class SugmaMod
{
    public static final String MODID = "sugmamod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SugmaMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.COCK);
            event.accept(ModItems.TOILET_PAPER);
        }
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.COCK_BLOCK);
        }
        if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.COCK_ORE);
            event.accept(ModBlocks.DEEPSLATE_COCK_ORE);
            event.accept(ModBlocks.ENDSTONE_COCK_ORE);
            event.accept(ModBlocks.NETHERRACK_COCK_ORE);
        }

        if(event.getTab() == ModCreativeModeTabs.SUGMA_TAB) {
            event.accept(ModItems.COCK);
            event.accept(ModItems.TOILET_PAPER);
            event.accept(ModBlocks.COCK_BLOCK);
            event.accept(ModBlocks.COCK_ORE);
            event.accept(ModBlocks.DEEPSLATE_COCK_ORE);
            event.accept(ModBlocks.ENDSTONE_COCK_ORE);
            event.accept(ModBlocks.NETHERRACK_COCK_ORE);
        }
    }


    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
