package com.ashesuponashes.shepherdsdelight.block;

import com.ashesuponashes.shepherdsdelight.item.SDItems;
import com.ashesuponashes.shepherdsdelight.shepherdsdelight;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.block.PieBlock;
import vectorwing.farmersdelight.common.block.StrawBaleBlock;

import java.util.function.Supplier;

public class SDBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, shepherdsdelight.MOD_ID);

    public static final RegistryObject<Block> WEEPING_VINES_BLOCK = BLOCKS.register("weeping_vines_block",
            () -> new StrawBaleBlock(Block.Properties.copy(Blocks.NETHER_WART_BLOCK)));

    public static final RegistryObject<Block> MUSHROOM_PIE = BLOCKS.register("mushroom_pie",
            () -> new PieBlock(Block.Properties.copy(Blocks.CAKE), SDItems.MUSHROOM_PIE_SLICE));
    
    public static final RegistryObject<Block> SHROOMLIGHT_CHEESECAKE = BLOCKS.register("shroomlight_cheesecake",
            () -> new PieBlock(Block.Properties.copy(Blocks.CAKE).lightLevel(p_60954_ -> 15), SDItems.SHROOMLIGHT_CHEESECAKE_SLICE));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return SDItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));

    }

    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
