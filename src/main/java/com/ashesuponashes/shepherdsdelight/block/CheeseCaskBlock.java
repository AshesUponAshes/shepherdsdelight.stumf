package com.ashesuponashes.shepherdsdelight.block;

import com.ashesuponashes.shepherdsdelight.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class CheeseCaskBlock extends Block {

    public CheeseCaskBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if (this == ModBlocks.MILK_CHEESE_CASK.get()) {
            popResource(level, pos, new ItemStack(ModItems.MILK_CHEESE.get(), 2));
            level.setBlock(pos, Blocks.BARREL.defaultBlockState(), 2);
            return InteractionResult.SUCCESS;
        }
        if (this == ModBlocks.RED_CHEESE_CASK.get()) {
            popResource(level, pos, new ItemStack(ModItems.RED_CHEESE.get(), 2));
            level.setBlock(pos, Blocks.BARREL.defaultBlockState(), 2);
            return InteractionResult.SUCCESS;
        }
        if (this == ModBlocks.BLUE_CHEESE_CASK.get()) {
            popResource(level, pos, new ItemStack(ModItems.BLUE_CHEESE.get(), 2));
            level.setBlock(pos, Blocks.BARREL.defaultBlockState(), 2);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}
