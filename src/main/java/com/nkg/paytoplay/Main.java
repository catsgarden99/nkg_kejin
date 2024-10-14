package com.nkg.paytoplay;

import com.nkg.paytoplay.inits.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("paytoplay")
public class Main {
    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this.getClass());
        bus.addListener(this::CommonSetup);
        bus.addListener(this::ClientSetup);

        Items.ITEMS.register(bus);
    }
    private void CommonSetup(final FMLCommonSetupEvent event) {
    }
    private void ClientSetup(final FMLClientSetupEvent event) {
    }
}
