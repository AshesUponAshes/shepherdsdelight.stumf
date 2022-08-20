package com.ashesuponashes.shepherdsdelight.item;

import com.brewinandchewin.common.item.BoozeItem;
import com.brewinandchewin.core.registry.BCEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class FireballItem extends BoozeItem {
    public FireballItem(int potency, int duration, Properties properties) {
        super(potency, duration, properties);
    }

    public void affectConsumer(ItemStack stack, Level level, LivingEntity consumer) {
        LivingEntity livingEntity = consumer;
        MobEffectInstance FireResistanceEffect = consumer.getEffect((MobEffect) MobEffects.FIRE_RESISTANCE);
        if (consumer.hasEffect((MobEffect) MobEffects.FIRE_RESISTANCE)) {
            consumer.addEffect(new MobEffectInstance((MobEffect) MobEffects.FIRE_RESISTANCE, FireResistanceEffect.getDuration() + this.duration * 300), consumer);
        } else if (!consumer.hasEffect((MobEffect) MobEffects.FIRE_RESISTANCE)) {
            consumer.addEffect(new MobEffectInstance((MobEffect) MobEffects.FIRE_RESISTANCE, this.duration * 300), consumer);
        }
        if (consumer.hasEffect((MobEffect) BCEffects.TIPSY.get())) {
            MobEffectInstance tipsyEffect = consumer.getEffect((MobEffect) BCEffects.TIPSY.get());
            consumer.addEffect(new MobEffectInstance((MobEffect) BCEffects.TIPSY.get(), tipsyEffect.getDuration() + this.duration * 1000, tipsyEffect.getAmplifier() + this.potency), consumer);
        } else if (!consumer.hasEffect((MobEffect) BCEffects.TIPSY.get())) {
            consumer.addEffect(new MobEffectInstance((MobEffect) BCEffects.TIPSY.get(), this.duration * 1000, this.potency - 1), consumer);
        }
    }
}