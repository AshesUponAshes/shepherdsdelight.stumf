package com.ashesuponashes.shepherdsdelight.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SHEPHERDS_DELIGHT_TAB = new CreativeModeTab("shepherdstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SMOKED_SAUSAGE.get());
        }
    };
}
