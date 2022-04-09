package com.ashesuponashes.shepherdsdelight.item;

import com.ashesuponashes.shepherdsdelight.shepherdsdelight;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.item.ConsumableItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, shepherdsdelight.MOD_ID);

    public static final RegistryObject<Item> SAUSAGE = ITEMS.register("sausage",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.SAUSAGE)));

    public static final RegistryObject<Item> SMOKED_SAUSAGE = ITEMS.register("smoked_sausage",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.SMOKED_SAUSAGE)));

    public static final RegistryObject<Item> RAW_CHARQUE = ITEMS.register("raw_charque",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.RAW_CHARQUE)));

    public static final RegistryObject<Item> RAW_CHARQUE_STRIPS = ITEMS.register("raw_charque_strips",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.RAW_CHARQUE_STRIPS)));

    public static final RegistryObject<Item> ROAST_CHARQUE = ITEMS.register("roast_charque",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.ROAST_CHARQUE)));

    public static final RegistryObject<Item> ROAST_CHARQUE_STRIPS = ITEMS.register("roast_charque_strips",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.ROAST_CHARQUE_STRIPS)));

    public static final RegistryObject<Item> RAW_EQUIN = ITEMS.register("raw_equin",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.RAW_EQUIN)));

    public static final RegistryObject<Item> RAW_EQUIN_CHUNK = ITEMS.register("raw_equin_chunk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.RAW_EQUIN_CHUNK)));

    public static final RegistryObject<Item> RAW_EQUIN_RIBS = ITEMS.register("raw_equin_ribs",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.RAW_EQUIN_RIBS)));

    public static final RegistryObject<Item> WEEPING_LOAF = ITEMS.register("weeping_loaf",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.WEEPING_LOAF)));

    public static final RegistryObject<Item> UNCOOKED_MEATLOAF = ITEMS.register("raw_meatloaf",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.RAW_MEATLOAF)));

    public static final RegistryObject<Item> COOKED_MEATLOAF = ITEMS.register("cooked_meatloaf",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.COOKED_MEATLOAF)));


    public static final RegistryObject<Item> MEAT_SAUCE = ITEMS.register("meat_sauce",
            () -> new ConsumableItem(new Item.Properties().food(ModFoods.MEAT_SAUCE).craftRemainder(Items.BOWL).tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> SHROOMLIGHT_SAUCE = ITEMS.register("shroomlight_sauce",
            () -> new ConsumableItem(new Item.Properties().food(ModFoods.SHROOMLIGHT_SAUCE).craftRemainder(Items.BOWL).tab(CreativeModeTab.TAB_FOOD)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
