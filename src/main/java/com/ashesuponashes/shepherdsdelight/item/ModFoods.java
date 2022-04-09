package com.ashesuponashes.shepherdsdelight.item;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.FoodValues.LONG_DURATION;

public class ModFoods {
    public static final FoodProperties SAUSAGE = (new FoodProperties.Builder().meat()).nutrition(5).saturationMod(0.4f).build();
    public static final FoodProperties SMOKED_SAUSAGE = (new FoodProperties.Builder().meat()).nutrition(8).saturationMod(0.6f).build();
    public static final FoodProperties RAW_CHARQUE = (new FoodProperties.Builder().meat()).nutrition(2).saturationMod(0.8f).build();
    public static final FoodProperties RAW_CHARQUE_STRIPS = (new FoodProperties.Builder().fast().meat()).nutrition(1).saturationMod(0.4f).build();
    public static final FoodProperties ROAST_CHARQUE = (new FoodProperties.Builder().meat()).nutrition(6).saturationMod(0.8f).build();
    public static final FoodProperties ROAST_CHARQUE_STRIPS = (new FoodProperties.Builder().fast().meat()).nutrition(3).saturationMod(0.4f).build();
    public static final FoodProperties RAW_EQUIN = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.POISON, 300, 0), 1.0F).build();
    public static final FoodProperties RAW_EQUIN_CHUNK = (new FoodProperties.Builder().fast()).nutrition(1).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.POISON, 150, 0), 1.0F).build();
    public static final FoodProperties WEEPING_LOAF = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).effect(new MobEffectInstance(MobEffects.CONFUSION, 150, 0), 0.3F).build();
    public static final FoodProperties RAW_MEATLOAF = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.5F).effect(new MobEffectInstance(MobEffects.POISON, 250, 0), 1.0F).effect(new MobEffectInstance(MobEffects.CONFUSION, 250, 0), 1.0F).build();
    public static final FoodProperties COOKED_MEATLOAF = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties RAW_EQUIN_RIBS = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.4F).build();
    public static final FoodProperties MEAT_SAUCE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.6F).build();
    public static final FoodProperties SHROOMLIGHT_SAUCE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.4F).build();

}
