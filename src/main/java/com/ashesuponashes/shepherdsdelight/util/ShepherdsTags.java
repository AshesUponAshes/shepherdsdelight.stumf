package com.ashesuponashes.shepherdsdelight.util;

import com.ashesuponashes.shepherdsdelight.shepherdsdelight;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ShepherdsTags
{
    public static final TagKey<Block> MILK_AGING_ACTIVATORS = modBlockTag("milk_aging_activators");
    public static final TagKey<Block> RED_MILK_AGING_ACTIVATORS = modBlockTag("red_milk_aging_activators");


    private static TagKey<Block> modBlockTag(String path) {
        return TagKey.m_203882_(Registry.BLOCK_REGISTRY, new ResourceLocation(shepherdsdelight.MOD_ID + ":" + path));
    }
}