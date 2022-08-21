package com.ashesuponashes.shepherdsdelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.FoodValues.*;

public class SDFoods {

    public static final FoodProperties RAW_CHARQUE = (new FoodProperties.Builder().meat()).nutrition(2).saturationMod(0.2f).build();
    public static final FoodProperties RAW_CHARQUE_STRIPS = (new FoodProperties.Builder().fast().meat()).nutrition(1).saturationMod(0.2f).build();
    public static final FoodProperties ROAST_CHARQUE = (new FoodProperties.Builder().meat()).nutrition(6).saturationMod(0.7f).build();
    public static final FoodProperties ROAST_CHARQUE_STRIPS = (new FoodProperties.Builder().fast().meat()).nutrition(3).saturationMod(0.6f).build();
    public static final FoodProperties GHAST_TENDRIL = (new FoodProperties.Builder().meat()).nutrition(6).saturationMod(0.4F).effect(new MobEffectInstance(MobEffects.CONFUSION, 240, 0), 0.4F).build();
    public static final FoodProperties GHAST_FILLET = (new FoodProperties.Builder().fast().meat()).nutrition(3).saturationMod(0.4F).build();
    public static final FoodProperties RAW_EQUIN = (new FoodProperties.Builder().meat()).nutrition(3).saturationMod(0.2F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1.0F).build();
    public static final FoodProperties RAW_EQUIN_CHUNK = (new FoodProperties.Builder().meat().fast()).nutrition(1).saturationMod(0.2F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1.0F).build();
    public static final FoodProperties RAW_EQUIN_RIBS = (new FoodProperties.Builder().meat()).nutrition(6).saturationMod(0.5F).build();
    public static final FoodProperties EQUIN_STEAK = (new FoodProperties.Builder().meat()).nutrition(7).saturationMod(0.7F).build();
    public static final FoodProperties EQUIN_STEAK_CHUNK = (new FoodProperties.Builder().fast().meat()).nutrition(4).saturationMod(0.7F).build();
    public static final FoodProperties SMOKED_RIBS = (new FoodProperties.Builder().meat()).nutrition(10).saturationMod(0.9F).build();
    public static final FoodProperties RAW_GOAT_LEG = (new FoodProperties.Builder().meat()).nutrition(6).saturationMod(0.4F).build();
    public static final FoodProperties SMOKED_GOAT_LEG = (new FoodProperties.Builder().meat()).nutrition(9).saturationMod(0.8F).build();
    public static final FoodProperties FUGU = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6f).build();
    public static final FoodProperties CURED_PUFFERFISH = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2f).build();
    public static final FoodProperties CUT_FUGU = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.6f).build();
    public static final FoodProperties CURED_PUFFERFISH_CUT = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2f).effect(new MobEffectInstance(MobEffects.HUNGER, 150, 1), 1.0F).build();

    public static final FoodProperties SAUSAGE = (new FoodProperties.Builder().meat()).nutrition(5).saturationMod(0.4f).build();
    public static final FoodProperties SMOKED_SAUSAGE = (new FoodProperties.Builder().meat()).nutrition(8).saturationMod(0.7f).build();
    public static final FoodProperties SAUCY_SAUSAGE = (new FoodProperties.Builder().meat()).nutrition(10).saturationMod(0.7f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800, 0), 1.0F).build();
    public static final FoodProperties FERMENTED_SAUSAGE = (new FoodProperties.Builder().meat()).nutrition(10).saturationMod(0.7f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F).build();
    public static final FoodProperties RAW_MEATLOAF = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 1.0F).effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 1.0F).build();
    public static final FoodProperties COOKED_MEATLOAF = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), SHORT_DURATION, 0), 1.0F).build();
    public static final FoodProperties MEAT_SAUCE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.4F).build();

    public static final FoodProperties SHROOMLIGHT_SAUCE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties WEEPING_LOAF = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.5F).effect(new MobEffectInstance(MobEffects.CONFUSION, 240, 0), 0.3F).build();
    public static final FoodProperties RICE_CAKE = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();

    public static final FoodProperties SHROOMLIGHT_NUGGETS = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.6F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 0.3F).build();
    public static final FoodProperties SAUSAGE_STEW = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.9F).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties SAUSAGE_WARTS_PASTA = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800, 0), 1.0F).build();
    public static final FoodProperties GHAST_SUSHI_WRAP = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.7F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1600, 0), 1.0F).build();
    public static final FoodProperties TWISTED_CHOWDER = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), SHORT_DURATION, 0), 1.0F).effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 0.5F).build();
    public static final FoodProperties FIRESTARTER_STEW = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), LONG_DURATION, 0), 1.0F).effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1.0F).build();
    public static final FoodProperties CHARQUE_CACTUS_ROAST = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.9F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties STEAK_PLATTER = (new FoodProperties.Builder()).nutrition(14).saturationMod(0.9F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 800, 0), 1.0F).build();
    public static final FoodProperties BONE_BROTH = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.6F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, SHORT_DURATION, 0), 1.0F).build();
    public static final FoodProperties WARTS_AND_CURDS = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.5F).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 0.7F).build();
    public static final FoodProperties SALAD_CURDS = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.6F).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F).build();
    public static final FoodProperties LLAMA_STEW = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.9F).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties POUTINE = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.7F).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F).build();
    public static final FoodProperties MOZZASTICKS = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.5F).build();
    public static final FoodProperties FRENCH_ONION = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.7F).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties CHEESECAKE_SLICE = (new FoodProperties.Builder().fast()).nutrition(3).saturationMod(0.4F).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0F).build();
    public static final FoodProperties EQUIN_NOODLES = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties NETHER_PASTA = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.7F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 0.3F).build();
    public static final FoodProperties MAC_CHEESE = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.7F).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties PUFFERFISH_SALAD = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.6F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), SHORT_DURATION, 0), 1.0F).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F).build();
    public static final FoodProperties FUGU_NOODLES = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).build();

    public static final FoodProperties TWISTED_RUM = (new FoodProperties.Builder().meat()).nutrition(0).saturationMod(0).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, SHORT_DURATION, 0), 1.0F).build();
    public static final FoodProperties FIREBALL = (new FoodProperties.Builder().meat()).nutrition(0).saturationMod(0).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1.0F).build();

    public static final FoodProperties LLAMA_BURGER = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 0.8F).build();
    public static final FoodProperties SHROOMLIGHT_SANDWICH = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.7F).effect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0), 0.8F).build();
    public static final FoodProperties CHEESESTEAK = (new FoodProperties.Builder()).nutrition(11).saturationMod(0.8F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 200, 0), 0.8F).build();
    public static final FoodProperties STEAMED_SANDWICH = (new FoodProperties.Builder()).nutrition(11).saturationMod(0.8F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 0.8F).build();
    public static final FoodProperties RICE_BURGER = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 0.8F).build();
    public static final FoodProperties SOUR_BURGER = (new FoodProperties.Builder()).nutrition(11).saturationMod(0.8F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 0.8F).build();

    public static final FoodProperties NETHER_STIR_FRY = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.9F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties STRIDER_SANDWICH = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.7F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 0.8F).build();
    public static final FoodProperties HOGLIN_WRAP = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 0.8F).build();


}
