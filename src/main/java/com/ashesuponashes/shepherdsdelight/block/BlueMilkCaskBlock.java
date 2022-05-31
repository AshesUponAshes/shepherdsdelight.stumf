package com.ashesuponashes.shepherdsdelight.block;

import com.ashesuponashes.shepherdsdelight.util.ShepherdsTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Iterator;
import java.util.Random;

public class BlueMilkCaskBlock extends Block {
    public static IntegerProperty COMPOSTING = IntegerProperty.create("composting", 0, 5);

    public BlueMilkCaskBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)super.defaultBlockState().setValue(COMPOSTING, 0));
    }

    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{COMPOSTING});
        super.createBlockStateDefinition(builder);
    }

    public int getMaxCompostingStage() {
        return 5;
    }

    public void randomTick(BlockState state, ServerLevel worldIn, BlockPos pos, Random random) {
        if (!worldIn.isClientSide) {
            float chance = 0.0F;
            int maxLight = 0;
            Iterator var8 = BlockPos.betweenClosed(pos.offset(-1, -1, -1), pos.offset(1, 1, 1)).iterator();

            while(var8.hasNext()) {
                BlockPos neighborPos = (BlockPos)var8.next();
                BlockState neighborState = worldIn.getBlockState(neighborPos);
                if (neighborState.m_204336_(ShepherdsTags.MILK_AGING_ACTIVATORS)) {
                    chance += 0.02F;
                }

                int light = worldIn.getBrightness(LightLayer.SKY, neighborPos.above());
                if (light > maxLight) {
                    maxLight = light;
                }
            }

            chance += maxLight > 12 ? 0.1F : 0.05F;
            if (worldIn.getRandom().nextFloat() <= chance) {
                if ((Integer)state.getValue(COMPOSTING) == this.getMaxCompostingStage()) {
                    worldIn.setBlock(pos, ((Block) ModBlocks.BLUE_CHEESE_CASK.get()).defaultBlockState(), 2);
                } else {
                    worldIn.setBlock(pos, (BlockState)state.setValue(COMPOSTING, (Integer)state.getValue(COMPOSTING) + 1), 2);
                }
            }

        }
    }

    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    public int getAnalogOutputSignal(BlockState blockState, Level worldIn, BlockPos pos) {
        return this.getMaxCompostingStage() + 1 - (Integer)blockState.getValue(COMPOSTING);
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand) {
        super.animateTick(stateIn, worldIn, pos, rand);
        if (rand.nextInt(10) == 0) {
            worldIn.addParticle(ParticleTypes.MYCELIUM, (double)pos.getX() + (double)rand.nextFloat(), (double)pos.getY() + 1.1D, (double)pos.getZ() + (double)rand.nextFloat(), 0.0D, 0.0D, 0.0D);
        }

    }
}

