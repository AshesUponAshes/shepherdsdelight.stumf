package com.ashesuponashes.shepherdsdelight.event;

import com.ashesuponashes.shepherdsdelight.event.loot.EquinHorseAdditionModifier;
import com.ashesuponashes.shepherdsdelight.event.loot.EquinRibsHorseAdditionModifier;
import com.ashesuponashes.shepherdsdelight.event.loot.RawCharqueFromLlamaAdditionModifier;
import com.ashesuponashes.shepherdsdelight.shepherdsdelight;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = shepherdsdelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {


    @SubscribeEvent
    public static void registerModifierSerializers

            (@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                   event) {
        event.getRegistry().registerAll(
                new RawCharqueFromLlamaAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(shepherdsdelight.MOD_ID, "charque_from_llama")),
                new EquinHorseAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(shepherdsdelight.MOD_ID, "equin_from_horse")),
                new EquinRibsHorseAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(shepherdsdelight.MOD_ID, "equin_ribs_from_horse"))
        );
    }
}
