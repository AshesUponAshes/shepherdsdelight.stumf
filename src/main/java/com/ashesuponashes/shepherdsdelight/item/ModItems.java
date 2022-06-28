package com.ashesuponashes.shepherdsdelight.item;

import com.ashesuponashes.shepherdsdelight.block.ModBlocks;
import com.ashesuponashes.shepherdsdelight.shepherdsdelight;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;



public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, shepherdsdelight.MOD_ID);

    public static final RegistryObject<Item> RAW_CHARQUE = ITEMS.register("raw_charque",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.RAW_CHARQUE)));
    public static final RegistryObject<Item> RAW_CHARQUE_STRIPS = ITEMS.register("raw_charque_strips",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.RAW_CHARQUE_STRIPS)));
    public static final RegistryObject<Item> ROAST_CHARQUE = ITEMS.register("roast_charque",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.ROAST_CHARQUE)));
    public static final RegistryObject<Item> ROAST_CHARQUE_STRIPS = ITEMS.register("roast_charque_strips",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.ROAST_CHARQUE_STRIPS)));
    public static final RegistryObject<Item> RAW_EQUIN = ITEMS.register("raw_equin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.RAW_EQUIN)));
    public static final RegistryObject<Item> RAW_EQUIN_CHUNK = ITEMS.register("raw_equin_chunk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.RAW_EQUIN_CHUNK)));
    public static final RegistryObject<Item> RAW_EQUIN_RIBS = ITEMS.register("raw_equin_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.RAW_EQUIN_RIBS)));
    public static final RegistryObject<Item> EQUIN_STEAK = ITEMS.register("equin_steak",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.EQUIN_STEAK)));
    public static final RegistryObject<Item> EQUIN_STEAK_CHUNK = ITEMS.register("equin_steak_chunk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.EQUIN_STEAK_CHUNK)));
    public static final RegistryObject<Item> SMOKED_RIBS = ITEMS.register("smoked_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.SMOKED_RIBS)));
    public static final RegistryObject<Item> RAW_GOAT_LEG = ITEMS.register("raw_goat_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.RAW_GOAT_LEG)));
    public static final RegistryObject<Item> SMOKED_GOAT_LEG = ITEMS.register("smoked_goat_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.SMOKED_GOAT_LEG)));
    public static final RegistryObject<Item> GHAST_TENDRIL = ITEMS.register("ghast_tendril",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).fireResistant().food(ModFoods.GHAST_TENDRIL)));
    public static final RegistryObject<Item> GHAST_FILLET = ITEMS.register("ghast_fillet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).fireResistant().food(ModFoods.GHAST_FILLET)));
    public static final RegistryObject<Item> GHAST_FIRE_SAC = ITEMS.register("ghast_fire_sac",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).fireResistant()));

    public static final RegistryObject<Item> SAUSAGE = ITEMS.register("sausage",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.SAUSAGE)));
    public static final RegistryObject<Item> SMOKED_SAUSAGE = ITEMS.register("smoked_sausage",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.SMOKED_SAUSAGE)));
    public static final RegistryObject<Item> WEEPING_LOAF = ITEMS.register("weeping_loaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.WEEPING_LOAF)));
    public static final RegistryObject<Item> RICE_CAKE = ITEMS.register("rice_cake",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.RICE_CAKE)));
    public static final RegistryObject<Item> UNCOOKED_MEATLOAF = ITEMS.register("raw_meatloaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.RAW_MEATLOAF)));
    public static final RegistryObject<Item> COOKED_MEATLOAF = ITEMS.register("cooked_meatloaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.COOKED_MEATLOAF)));
    public static final RegistryObject<Item> MEAT_SAUCE = ITEMS.register("meat_sauce",
            () -> new ConsumableItem(new Item.Properties().food(ModFoods.MEAT_SAUCE).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));
    public static final RegistryObject<Item> SHROOMLIGHT_SAUCE = ITEMS.register("shroomlight_sauce",
            () -> new ConsumableItem(new Item.Properties().food(ModFoods.SHROOMLIGHT_SAUCE).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));
    public static final RegistryObject<Item> MOLTEN_CHEESE = ITEMS.register("molten_cheese",
            () -> new ConsumableItem(new Item.Properties().food(ModFoods.MOLTEN_CHEESE).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));

    public static final RegistryObject<Item> MILK_CHEESE = ITEMS.register("milk_cheese",
            () -> new BlockItem(ModBlocks.MILK_CHEESE.get(), (new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB))));
    public static final RegistryObject<Item> MILK_CHEESE_SLICE = ITEMS.register("milk_cheese_slice",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.CHEESE_WEDGE)));
    public static final RegistryObject<Item> RED_CHEESE = ITEMS.register("red_cheese",
            () -> new BlockItem(ModBlocks.RED_CHEESE.get(), (new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB))));
    public static final RegistryObject<Item> RED_CHEESE_SLICE = ITEMS.register("red_cheese_slice",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.CHEESE_WEDGE)));
    public static final RegistryObject<Item> BLUE_CHEESE = ITEMS.register("blue_cheese",
            () -> new BlockItem(ModBlocks.BLUE_CHEESE.get(), (new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB))));
    public static final RegistryObject<Item> BLUE_CHEESE_SLICE = ITEMS.register("blue_cheese_slice",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.CHEESE_WEDGE)));

    public static final RegistryObject<Item> MUSHROOM_PIE = ITEMS.register("mushroom_pie",
            () -> new BlockItem(ModBlocks.MUSHROOM_PIE.get(), (new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB))));
    public static final RegistryObject<Item> MUSHROOM_PIE_SLICE = ITEMS.register("mushroom_pie_slice",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.CHEESECAKE_SLICE)));
    public static final RegistryObject<Item> SHROOMLIGHT_CHEESECAKE = ITEMS.register("shroomlight_cheesecake",
            () -> new BlockItem(ModBlocks.SHROOMLIGHT_CHEESECAKE.get(), (new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB))));
    public static final RegistryObject<Item> SHROOMLIGHT_CHEESECAKE_SLICE = ITEMS.register("shroomlight_cheesecake_slice",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.CHEESECAKE_SLICE)));

    public static final RegistryObject<Item> BONE_BROTH_TEA = ITEMS.register("bone_broth_tea",
            () -> new DrinkableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE).food(ModFoods.BONE_BROTH)));

    public static final RegistryObject<Item> SALAD_WITH_CURDS = ITEMS.register("salad_with_curds",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(ModFoods.SALAD_CURDS)));
    public static final RegistryObject<Item> SAUSAGE_STEW = ITEMS.register("sausage_stew",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(ModFoods.SAUSAGE_STEW)));
    public static final RegistryObject<Item> LLAMA_STEW = ITEMS.register("llama_stew",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(ModFoods.LLAMA_STEW)));
    public static final RegistryObject<Item> EQUIN_NOODLES = ITEMS.register("equin_noodles",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(ModFoods.EQUIN_NOODLES)));
    public static final RegistryObject<Item> FRENCH_ONION = ITEMS.register("french_onion",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(ModFoods.FRENCH_ONION)));
    public static final RegistryObject<Item> MAC_CHEESE = ITEMS.register("mac_cheese",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(ModFoods.MAC_CHEESE)));
    public static final RegistryObject<Item> POUTINE = ITEMS.register("poutine",
            () -> new ConsumableItem(new Item.Properties().food(ModFoods.POUTINE).stacksTo(16).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));
    public static final RegistryObject<Item> FIRESTARTER_STEW = ITEMS.register("firestarter_stew",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(ModFoods.FIRESTARTER_STEW)));
    public static final RegistryObject<Item> TWISTED_CHOWDER = ITEMS.register("twisted_chowder",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(ModFoods.TWISTED_CHOWDER)));
    public static final RegistryObject<Item> WARTS_AND_CURDS = ITEMS.register("warts_and_curds",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(ModFoods.WARTS_AND_CURDS)));

    public static final RegistryObject<Item> CHARQUE_CACTUS_ROAST = ITEMS.register("charque_cactus_roast",
            () -> new ConsumableItem(new Item.Properties().food(ModFoods.CHARQUE_CACTUS_ROAST).stacksTo(16).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));
    public static final RegistryObject<Item> STEAK_PLATTER = ITEMS.register("steak_platter",
            () -> new ConsumableItem(new Item.Properties().food(ModFoods.STEAK_PLATTER).stacksTo(16).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));
    public static final RegistryObject<Item> FUNGUS_FRITTERS = ITEMS.register("fungus_fritters",
            () -> new ConsumableItem(new Item.Properties().food(ModFoods.FUNGUS_FRITTERS).stacksTo(16).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));
    public static final RegistryObject<Item> SHROOMLIGHT_NUGGETS = ITEMS.register("shroomlight_nuggets",
            () -> new ConsumableItem(new Item.Properties().food(ModFoods.SHROOMLIGHT_NUGGETS).stacksTo(16).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));
    public static final RegistryObject<Item> SAUSAGE_WARTS_PASTA = ITEMS.register("sausage_warts_pasta",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(ModFoods.SAUSAGE_WARTS_PASTA)));
    public static final RegistryObject<Item> NETHER_PASTA = ITEMS.register("nether_pasta",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(ModFoods.NETHER_PASTA)));

    public static final RegistryObject<Item> MOZZASTICKS = ITEMS.register("mozzasticks",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.MOZZASTICKS)));

    public static final RegistryObject<Item> LLAMA_BURGER = ITEMS.register("llama_burger",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.LLAMA_BURGER)));
    public static final RegistryObject<Item> STEAMED_SANDWICH = ITEMS.register("steamed_sandwich",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.STEAMED_SANDWICH)));
    public static final RegistryObject<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.GRILLED_CHEESE)));
    public static final RegistryObject<Item> CHEESESTEAK = ITEMS.register("cheesesteak",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.CHEESESTEAK)));
    public static final RegistryObject<Item> RICE_BURGER = ITEMS.register("rice_burger",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.RICE_BURGER)));
    public static final RegistryObject<Item> SOUR_RICE_BURGER = ITEMS.register("sour_burger",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.SOUR_BURGER)));
    public static final RegistryObject<Item> HOGLIN_SANDWICH_WRAP = ITEMS.register("hoglin_sandwich_wrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.HOGLIN_WRAP)));
    public static final RegistryObject<Item> SHROOMLIGHT_SANDWICH = ITEMS.register("shroomlight_sandwich",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.SHROOMLIGHT_SANDWICH)));
    public static final RegistryObject<Item> SAUCY_SAUSAGE = ITEMS.register("saucy_sausage",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.SAUCY_SAUSAGE)));
    public static final RegistryObject<Item> COD_SUSHI_WRAP = ITEMS.register("cod_sushi_wrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.COD_SUSHI_WRAP)));
    public static final RegistryObject<Item> GHAST_SUSHI_WRAP = ITEMS.register("ghast_sushi_wrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(ModFoods.GHAST_SUSHI_WRAP)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
