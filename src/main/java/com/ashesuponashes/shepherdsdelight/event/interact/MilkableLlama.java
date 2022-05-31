package com.ashesuponashes.shepherdsdelight.event.interact;

import com.ashesuponashes.shepherdsdelight.shepherdsdelight;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = shepherdsdelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MilkableLlama {

    @SubscribeEvent
    public static void onPlayerInteract(PlayerInteractEvent.@NotNull EntityInteract event) {
        ItemStack stack = event.getItemStack();
        if (stack.is(Items.BUCKET) && event.getTarget() instanceof LivingEntity entity && !entity.isBaby()) {
            Item filled = null;
            if (entity instanceof Llama) {
                filled = Items.MILK_BUCKET;
            }
            if (filled != null) {
                Player player = event.getPlayer();
                player.playSound(SoundEvents.GOAT_MILK, 1.0F, 1.0F);
                ItemStack filledStack = ItemUtils.createFilledResult(stack, player, filled.getDefaultInstance());
                player.setItemInHand(event.getHand(), filledStack);
                event.setCancellationResult(InteractionResult.sidedSuccess(event.getWorld().isClientSide));
            }
        }
    }
}