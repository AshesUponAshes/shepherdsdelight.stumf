package com.ashesuponashes.shepherdsdelight.block;

import com.ashesuponashes.shepherdsdelight.item.ModCreativeModeTab;
import com.ashesuponashes.shepherdsdelight.item.ModItems;
import com.ashesuponashes.shepherdsdelight.shepherdsdelight;
import joptsimple.internal.AbbreviationMap;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.block.PieBlock;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, shepherdsdelight.MOD_ID);

    public static final RegistryObject<Block> MILK_CASK = registerBlock("milk_cask",
            () -> new MilkCaskBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0F, 3.0F)), ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB);

    public static final RegistryObject<Block> RED_MILK_CASK = registerBlock("red_milk_cask",
            () -> new MilkCaskBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0F, 3.0F)), ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB);

    public static final RegistryObject<Block> BLUE_MILK_CASK = registerBlock("blue_milk_cask",
            () -> new MilkCaskBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0F, 3.0F)), ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB);

    public static final RegistryObject<Block> MILK_CHEESE_CASK = registerBlock("milk_cheese_cask",
            () -> new CheeseCaskBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0F, 3.0F)), ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB);

    public static final RegistryObject<Block> RED_CHEESE_CASK = registerBlock("red_cheese_cask",
            () -> new CheeseCaskBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0F, 3.0F)), ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB);

    public static final RegistryObject<Block> BLUE_CHEESE_CASK = registerBlock("blue_cheese_cask",
            () -> new CheeseCaskBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.0F, 3.0F)), ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB);

    public static final RegistryObject<Block> MILK_CHEESE = BLOCKS.register("milk_cheese",
            () -> new PieBlock(Block.Properties.copy(Blocks.CAKE),  ModItems.MILK_CHEESE_SLICE));

    public static final RegistryObject<Block> RED_CHEESE = BLOCKS.register("red_cheese",
            () -> new PieBlock(Block.Properties.copy(Blocks.CAKE), ModItems.RED_CHEESE_SLICE));

    public static final RegistryObject<Block> BLUE_CHEESE = BLOCKS.register("blue_cheese",
            () -> new PieBlock(Block.Properties.copy(Blocks.CAKE), ModItems.BLUE_CHEESE_SLICE));

    public static final RegistryObject<Block> MUSHROOM_PIE = BLOCKS.register("mushroom_pie",
            () -> new PieBlock(Block.Properties.copy(Blocks.CAKE), ModItems.MUSHROOM_PIE_SLICE));
    
    public static final RegistryObject<Block> SHROOMLIGHT_CHEESECAKE = BLOCKS.register("shroomlight_cheesecake",
            () -> new PieBlock(Block.Properties.copy(Blocks.CAKE).lightLevel(p_60954_ -> 15), ModItems.SHROOMLIGHT_CHEESECAKE_SLICE));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));

    }

    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
