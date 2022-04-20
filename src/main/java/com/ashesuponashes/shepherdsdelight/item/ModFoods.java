package com.ashesuponashes.shepherdsdelight.item;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.FoodValues.*;

public class ModFoods {
    public static final FoodProperties SAUSAGE = (new FoodProperties.Builder().meat()).nutrition(5).saturationMod(0.4f).build();
    public static final FoodProperties SMOKED_SAUSAGE = (new FoodProperties.Builder().meat()).nutrition(8).saturationMod(0.6f).build();
    public static final FoodProperties RAW_CHARQUE = (new FoodProperties.Builder().meat()).nutrition(2).saturationMod(0.8f).build();
    public static final FoodProperties RAW_CHARQUE_STRIPS = (new FoodProperties.Builder().fast().meat()).nutrition(1).saturationMod(0.4f).build();
    public static final FoodProperties ROAST_CHARQUE = (new FoodProperties.Builder().meat()).nutrition(6).saturationMod(0.8f).build();
    public static final FoodProperties ROAST_CHARQUE_STRIPS = (new FoodProperties.Builder().fast().meat()).nutrition(3).saturationMod(0.4f).build();
    public static final FoodProperties RAW_EQUIN = (new FoodProperties.Builder().meat()).nutrition(3).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.POISON, 300, 0), 1.0F).build();
    public static final FoodProperties RAW_EQUIN_CHUNK = (new FoodProperties.Builder().meat().fast()).nutrition(1).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.POISON, 150, 0), 1.0F).build();
    public static final FoodProperties WEEPING_LOAF = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).effect(new MobEffectInstance(MobEffects.CONFUSION, 150, 0), 0.3F).build();
    public static final FoodProperties RAW_MEATLOAF = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.5F).effect(new MobEffectInstance(MobEffects.POISON, 250, 0), 1.0F).effect(new MobEffectInstance(MobEffects.CONFUSION, 250, 0), 1.0F).build();
    public static final FoodProperties COOKED_MEATLOAF = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties RAW_EQUIN_RIBS = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.4F).build();
    public static final FoodProperties MEAT_SAUCE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.6F).build();
    public static final FoodProperties SHROOMLIGHT_SAUCE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties COD_SUSHI_WRAP = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.9F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties COD_SUSHI_ROLL = (new FoodProperties.Builder().fast()).nutrition(4).saturationMod(0.3F).build();
    public static final FoodProperties SHROOMLIGHT_NUGGETS = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.6F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties RAW_GOAT_LEG = (new FoodProperties.Builder().meat()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties EQUIN_STEAK = (new FoodProperties.Builder().meat()).nutrition(7).saturationMod(0.8F).build();
    public static final FoodProperties EQUIN_STEAK_CHUNK = (new FoodProperties.Builder().meat()).nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties SMOKED_RIBS = (new FoodProperties.Builder().meat()).nutrition(10).saturationMod(0.7F).build();
    public static final FoodProperties SMOKED_GOAT_LEG = (new FoodProperties.Builder().meat()).nutrition(12).saturationMod(0.8F).build();
    public static final FoodProperties RICE_CAKE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final FoodProperties SAUCY_SAUSAGE = (new FoodProperties.Builder().meat()).nutrition(10).saturationMod(0.6f).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 150, 0), 0.3F).build();
    public static final FoodProperties SAUSAGE_STEW = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties SAUSAGE_WARTS_PASTA = (new FoodProperties.Builder()).nutrition(14).saturationMod(0.6F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800, 0), 1.0F).build();
    public static final FoodProperties HOGLIN_WRAP = (new FoodProperties.Builder()).nutrition(14).saturationMod(0.6F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 800, 0), 1.0F).build();
    public static final FoodProperties SALMON_SUSHI_WRAP = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.7F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties SALMON_SUSHI_ROLL = (new FoodProperties.Builder().fast()).nutrition(4).saturationMod(0.3F).build();

}
