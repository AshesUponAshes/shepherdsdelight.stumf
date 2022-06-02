package com.ashesuponashes.shepherdsdelight.util;

import com.ashesuponashes.shepherdsdelight.shepherdsdelight;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ShepherdsTags
{
    public static final TagKey<Block> MILK_AGING_ACTIVATORS = modBlockTag("milk_aging_activators");
    public static final TagKey<Block> RED_MILK_AGING_ACTIVATORS = modBlockTag("red_milk_aging_activators");

    public static final TagKey<Item> RED_CHEESE_CRAFT_ITEMS = modItemTag("red_cheese_craft_items");
    public static final TagKey<Item> BLUE_CHEESE_CRAFT_ITEMS = modItemTag("blue_cheese_craft_items");

    private static TagKey<Block> modBlockTag(String path) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(shepherdsdelight.MOD_ID + ":" + path));
    }

    private static TagKey<Item> modItemTag(String path) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(shepherdsdelight.MOD_ID + ":" + path));
    }
}