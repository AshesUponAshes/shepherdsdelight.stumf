package com.ashesuponashes.shepherdsdelight.block;

import com.ashesuponashes.shepherdsdelight.util.ShepherdsTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BarrelBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Random;

public class MilkCaskBlock extends Block {
    public static IntegerProperty AGING = IntegerProperty.create("aging", 0, 5);

    public MilkCaskBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)super.defaultBlockState().setValue(AGING, 0));
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack mainHand = player.getItemInHand(hand);
        if (this == ModBlocks.MILK_CASK.get()) {
            if (mainHand.is(ShepherdsTags.RED_CHEESE_CRAFT_ITEMS)) {
                if (!player.isCreative()) {
                    mainHand.shrink(1);
                }
                level.setBlock(pos, ModBlocks.RED_MILK_CASK.get().defaultBlockState(), 2);
                return InteractionResult.SUCCESS;
            }
            if (mainHand.is(ShepherdsTags.BLUE_CHEESE_CRAFT_ITEMS)) {
                if (!player.isCreative()) {
                    mainHand.shrink(1);
                }
                level.setBlock(pos, ModBlocks.BLUE_MILK_CASK.get().defaultBlockState(), 2);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{AGING});
        super.createBlockStateDefinition(builder);
    }

    public int getMaxCompostingStage() {
        return 5;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel worldIn, BlockPos pos, Random random) {
        if (!worldIn.isClientSide) {
            float chance = 0.0F;
            int maxLight = 0;
            Iterator var8 = BlockPos.betweenClosed(pos.offset(-1, -1, -1), pos.offset(1, 1, 1)).iterator();

            while(var8.hasNext()) {
                BlockPos neighborPos = (BlockPos)var8.next();
                BlockState neighborState = worldIn.getBlockState(neighborPos);
                if (this == ModBlocks.MILK_CASK.get()) {
                    if (neighborState.is(ShepherdsTags.MILK_AGING_ACTIVATORS)) {
                        chance += 0.02F;
                    }
                }
                if (this == ModBlocks.BLUE_MILK_CASK.get()) {
                    if (neighborState.is(ShepherdsTags.MILK_AGING_ACTIVATORS)) {
                        chance += 0.02F;
                    }
                }
                if (this == ModBlocks.RED_MILK_CASK.get()) {
                    if (neighborState.is(ShepherdsTags.RED_MILK_AGING_ACTIVATORS)) {
                        chance += 0.02F;
                    }
                }

                int light = worldIn.getBrightness(LightLayer.SKY, neighborPos.above());
                if (light > maxLight) {
                    maxLight = light;
                }
            }

            chance += maxLight < 6 ? 0.1F : 0.05F;
            if (worldIn.getRandom().nextFloat() <= chance) {
                if ((Integer)state.getValue(AGING) == this.getMaxCompostingStage()) {
                    if (this == ModBlocks.MILK_CASK.get()) {
                        worldIn.setBlock(pos, ModBlocks.MILK_CHEESE_CASK.get().defaultBlockState(), 2);
                    }
                    if (this == ModBlocks.RED_MILK_CASK.get()) {
                        worldIn.setBlock(pos, ModBlocks.RED_CHEESE_CASK.get().defaultBlockState(), 2);
                    }
                    if (this == ModBlocks.BLUE_MILK_CASK.get()) {
                        worldIn.setBlock(pos, ModBlocks.BLUE_CHEESE_CASK.get().defaultBlockState(), 2);
                    }
                } else {
                    worldIn.setBlock(pos, (BlockState)state.setValue(AGING, (Integer)state.getValue(AGING) + 1), 2);
                }
            }

        }
    }

    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    public int getAnalogOutputSignal(BlockState blockState, Level worldIn, BlockPos pos) {
        return this.getMaxCompostingStage() + 1 - (Integer)blockState.getValue(AGING);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand) {
        super.animateTick(stateIn, worldIn, pos, rand);
        if (rand.nextInt(10) == 0) {
            worldIn.addParticle(ParticleTypes.MYCELIUM, (double)pos.getX() + (double)rand.nextFloat(), (double)pos.getY() + 1.1D, (double)pos.getZ() + (double)rand.nextFloat(), 0.0D, 0.0D, 0.0D);
        }

    }
}
