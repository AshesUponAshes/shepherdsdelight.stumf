package com.ashesuponashes.shepherdsdelight;

import com.ashesuponashes.shepherdsdelight.block.SDBlocks;
import com.ashesuponashes.shepherdsdelight.item.SDItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(shepherdsdelight.MOD_ID)
public class shepherdsdelight {
    public static final String MOD_ID = "shepherdsdelight";


    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public shepherdsdelight() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        SDItems.register(eventBus);
        SDBlocks.register(eventBus);
        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}