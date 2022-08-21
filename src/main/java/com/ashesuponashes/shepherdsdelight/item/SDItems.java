package com.ashesuponashes.shepherdsdelight.item;

import com.ashesuponashes.shepherdsdelight.block.SDBlocks;
import com.ashesuponashes.shepherdsdelight.shepherdsdelight;
import com.brewinandchewin.common.item.BoozeItem;
import com.brewinandchewin.core.registry.BCItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;


public class SDItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, shepherdsdelight.MOD_ID);

    public static final RegistryObject<Item> WEEPING_VINES_BLOCK = ITEMS.register("weeping_vines_block",
            () -> new BlockItem(SDBlocks.WEEPING_VINES_BLOCK.get(), (new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB))));

    public static final RegistryObject<Item> RAW_CHARQUE = ITEMS.register("raw_charque",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.RAW_CHARQUE)));
    public static final RegistryObject<Item> RAW_CHARQUE_STRIPS = ITEMS.register("raw_charque_strips",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.RAW_CHARQUE_STRIPS)));
    public static final RegistryObject<Item> ROAST_CHARQUE = ITEMS.register("roast_charque",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.ROAST_CHARQUE)));
    public static final RegistryObject<Item> ROAST_CHARQUE_STRIPS = ITEMS.register("roast_charque_strips",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.ROAST_CHARQUE_STRIPS)));
    public static final RegistryObject<Item> RAW_EQUIN = ITEMS.register("raw_equin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.RAW_EQUIN)));
    public static final RegistryObject<Item> RAW_EQUIN_CHUNK = ITEMS.register("raw_equin_chunk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.RAW_EQUIN_CHUNK)));
    public static final RegistryObject<Item> RAW_EQUIN_RIBS = ITEMS.register("raw_equin_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.RAW_EQUIN_RIBS)));
    public static final RegistryObject<Item> EQUIN_STEAK = ITEMS.register("equin_steak",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.EQUIN_STEAK)));
    public static final RegistryObject<Item> EQUIN_STEAK_CHUNK = ITEMS.register("equin_steak_chunk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.EQUIN_STEAK_CHUNK)));
    public static final RegistryObject<Item> SMOKED_RIBS = ITEMS.register("smoked_ribs",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.SMOKED_RIBS)));
    public static final RegistryObject<Item> RAW_GOAT_LEG = ITEMS.register("raw_goat_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.RAW_GOAT_LEG)));
    public static final RegistryObject<Item> SMOKED_GOAT_LEG = ITEMS.register("smoked_goat_leg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.SMOKED_GOAT_LEG)));
    public static final RegistryObject<Item> GHAST_TENDRIL = ITEMS.register("ghast_tendril",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).fireResistant().food(SDFoods.GHAST_TENDRIL)));
    public static final RegistryObject<Item> GHAST_FILLET = ITEMS.register("ghast_fillet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).fireResistant().food(SDFoods.GHAST_FILLET)));
    public static final RegistryObject<Item> GHAST_FIRE_SAC = ITEMS.register("ghast_fire_sac",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).fireResistant()));
    public static final RegistryObject<Item> CURED_PUFFERFISH = ITEMS.register("cured_pufferfish",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.CURED_PUFFERFISH)));
    public static final RegistryObject<Item> CURED_PUFFERFISH_CUT = ITEMS.register("cured_pufferfish_cut",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.CURED_PUFFERFISH_CUT)));
    public static final RegistryObject<Item> CURED_COOKED_PUFFERFISH = ITEMS.register("cooked_fugu",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.FUGU)));
    public static final RegistryObject<Item> CURED_COOKED_CUT_PUFFERFISH = ITEMS.register("cooked_fugu_cut",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.CUT_FUGU)));

    public static final RegistryObject<Item> SAUSAGE = ITEMS.register("sausage",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.SAUSAGE)));
    public static final RegistryObject<Item> SMOKED_SAUSAGE = ITEMS.register("smoked_sausage",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.SMOKED_SAUSAGE)));
    public static final RegistryObject<Item> FERMENTED_SAUSAGE = ITEMS.register("fermented_sausage",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.FERMENTED_SAUSAGE)));
    public static final RegistryObject<Item> SAUCY_SAUSAGE = ITEMS.register("saucy_sausage",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.SAUCY_SAUSAGE)));
    public static final RegistryObject<Item> WEEPING_LOAF = ITEMS.register("weeping_loaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.WEEPING_LOAF)));
    public static final RegistryObject<Item> RICE_CAKE = ITEMS.register("rice_cake",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.RICE_CAKE)));
    public static final RegistryObject<Item> UNCOOKED_MEATLOAF = ITEMS.register("raw_meatloaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.RAW_MEATLOAF)));
    public static final RegistryObject<Item> COOKED_MEATLOAF = ITEMS.register("cooked_meatloaf",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.COOKED_MEATLOAF)));
    public static final RegistryObject<Item> MEAT_SAUCE = ITEMS.register("meat_sauce",
            () -> new ConsumableItem(new Item.Properties().food(SDFoods.MEAT_SAUCE).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));
    public static final RegistryObject<Item> SHROOMLIGHT_SAUCE = ITEMS.register("shroomlight_sauce",
            () -> new ConsumableItem(new Item.Properties().food(SDFoods.SHROOMLIGHT_SAUCE).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));

    public static final RegistryObject<Item> MUSHROOM_PIE = ITEMS.register("mushroom_pie",
            () -> new BlockItem(SDBlocks.MUSHROOM_PIE.get(), (new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB))));
    public static final RegistryObject<Item> MUSHROOM_PIE_SLICE = ITEMS.register("mushroom_pie_slice",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.CHEESECAKE_SLICE)));
    public static final RegistryObject<Item> SHROOMLIGHT_CHEESECAKE = ITEMS.register("shroomlight_cheesecake",
            () -> new BlockItem(SDBlocks.SHROOMLIGHT_CHEESECAKE.get(), (new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB))));
    public static final RegistryObject<Item> SHROOMLIGHT_CHEESECAKE_SLICE = ITEMS.register("shroomlight_cheesecake_slice",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.CHEESECAKE_SLICE)));

    public static final RegistryObject<Item> MOZZASTICKS = ITEMS.register("mozzasticks",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.MOZZASTICKS)));
    public static final RegistryObject<Item> LLAMA_BURGER = ITEMS.register("llama_burger",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.LLAMA_BURGER)));
    public static final RegistryObject<Item> STEAMED_SANDWICH = ITEMS.register("steamed_sandwich",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.STEAMED_SANDWICH)));
    public static final RegistryObject<Item> CHEESESTEAK = ITEMS.register("cheesesteak",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.CHEESESTEAK)));
    public static final RegistryObject<Item> RICE_BURGER = ITEMS.register("rice_burger",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.RICE_BURGER)));
    public static final RegistryObject<Item> SOUR_RICE_BURGER = ITEMS.register("sour_burger",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.SOUR_BURGER)));
    public static final RegistryObject<Item> SHROOMLIGHT_SANDWICH = ITEMS.register("shroomlight_sandwich",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.SHROOMLIGHT_SANDWICH)));
    public static final RegistryObject<Item> GHAST_SUSHI_WRAP = ITEMS.register("ghast_sushi_wrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.GHAST_SUSHI_WRAP)));

    public static final RegistryObject<Item> SALAD_WITH_CURDS = ITEMS.register("salad_with_curds",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.SALAD_CURDS), true));
    public static final RegistryObject<Item> SAUSAGE_STEW = ITEMS.register("sausage_stew",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.SAUSAGE_STEW), true));
    public static final RegistryObject<Item> LLAMA_STEW = ITEMS.register("llama_stew",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.LLAMA_STEW), true));
    public static final RegistryObject<Item> EQUIN_NOODLES = ITEMS.register("equin_noodles",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.EQUIN_NOODLES), true));
    public static final RegistryObject<Item> FRENCH_ONION = ITEMS.register("french_onion",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.FRENCH_ONION), true));
    public static final RegistryObject<Item> MAC_CHEESE = ITEMS.register("mac_cheese",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.MAC_CHEESE), true));
    public static final RegistryObject<Item> POUTINE = ITEMS.register("poutine",
            () -> new ConsumableItem(new Item.Properties().food(SDFoods.POUTINE).stacksTo(16).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB), true));
    public static final RegistryObject<Item> FIRESTARTER_STEW = ITEMS.register("firestarter_stew",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.FIRESTARTER_STEW), true));
    public static final RegistryObject<Item> TWISTED_CHOWDER = ITEMS.register("twisted_chowder",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.TWISTED_CHOWDER), true));
    public static final RegistryObject<Item> WARTS_AND_CURDS = ITEMS.register("warts_and_curds",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.WARTS_AND_CURDS), true));

    public static final RegistryObject<Item> PUFFERFISH_SALAD = ITEMS.register("pufferfish_salad",
            () -> new ConsumableItem(new Item.Properties().food(SDFoods.PUFFERFISH_SALAD).stacksTo(16).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB), true));
    public static final RegistryObject<Item> CHARQUE_CACTUS_ROAST = ITEMS.register("charque_cactus_roast",
            () -> new ConsumableItem(new Item.Properties().food(SDFoods.CHARQUE_CACTUS_ROAST).stacksTo(16).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB), true));
    public static final RegistryObject<Item> STEAK_PLATTER = ITEMS.register("steak_platter",
            () -> new ConsumableItem(new Item.Properties().food(SDFoods.STEAK_PLATTER).stacksTo(16).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB), true));
    public static final RegistryObject<Item> FUGU_NOODLES = ITEMS.register("fugu_noodles",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.FUGU_NOODLES), true));
    public static final RegistryObject<Item> SHROOMLIGHT_NUGGETS = ITEMS.register("shroomlight_nuggets",
            () -> new ConsumableItem(new Item.Properties().food(SDFoods.SHROOMLIGHT_NUGGETS).stacksTo(16).craftRemainder(Items.BOWL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB), true));
    public static final RegistryObject<Item> SAUSAGE_WARTS_PASTA = ITEMS.register("sausage_warts_pasta",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.SAUSAGE_WARTS_PASTA), true));
    public static final RegistryObject<Item> NETHER_PASTA = ITEMS.register("nether_pasta",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.NETHER_PASTA), true));

    public static final RegistryObject<Item> BONE_BROTH_TEA = ITEMS.register("bone_broth_tea",
            () -> new DrinkableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE).food(SDFoods.BONE_BROTH), true, false));
    public static final RegistryObject<Item> CRIMSON_ALE = ITEMS.register("crimson_ale",
            () -> new BoozeItem(1, 8, (new Item.Properties()).stacksTo(16).craftRemainder(BCItems.TANKARD.get()).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));
    public static final RegistryObject<Item> TWISTED_RUM = ITEMS.register("twisted_rum",
            () -> new BoozeItem(2, 10, (new Item.Properties()).stacksTo(16).craftRemainder(BCItems.TANKARD.get()).food(SDFoods.TWISTED_RUM).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));

    public static final RegistryObject<Item> FIREBALL = ITEMS.register("fireball",
            () -> new FireballItem(1, 10, (new Item.Properties()).stacksTo(16).craftRemainder(BCItems.TANKARD.get()).food(SDFoods.FIREBALL).tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB)));
    public static final RegistryObject<Item> NETHER_STIR_FRY = ITEMS.register("nether_stir_fry",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).stacksTo(16).craftRemainder(Items.BOWL).food(SDFoods.NETHER_STIR_FRY), true));
    public static final RegistryObject<Item> STRIDER_MEAT_ROLL = ITEMS.register("strider_meat_roll",
            () -> new ConsumableItem(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.STRIDER_SANDWICH)));
    public static final RegistryObject<Item> HOGLIN_SANDWICH = ITEMS.register("hoglin_sandwich_wrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHEPHERDS_DELIGHT_TAB).food(SDFoods.HOGLIN_WRAP)));

    public static final RegistryObject<Item> SD_LOGO = ITEMS.register("sd_logo",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}