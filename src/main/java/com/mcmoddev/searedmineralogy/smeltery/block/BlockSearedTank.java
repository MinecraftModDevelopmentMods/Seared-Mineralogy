package com.mcmoddev.searedmineralogy.smeltery.block;

import com.mcmoddev.searedmineralogy.SearedMineralogy;
import com.mcmoddev.searedmineralogy.smeltery.ISearedObject;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import slimeknights.tconstruct.smeltery.block.BlockTank;

public class BlockSearedTank extends BlockTank implements ISearedObject {
	private Block baseBlock;

	public BlockSearedTank(Block block) {
		super();
		this.baseBlock = block;
		this.setDefaultState(this.blockState.getBaseState().withProperty(KNOB, false));
		this.setCreativeTab(SearedMineralogy.CREATIVE_TAB);
	}

	public Block getBaseBlock() {
		return baseBlock;
	}

	@Override
	public float getBlockHardness(IBlockState blockState, World worldIn, BlockPos pos) {
		return (this.baseBlock.getBlockHardness(blockState, worldIn, pos) * 2);
	}

	@Override
	public float getExplosionResistance(Entity exploder) {
		return (this.baseBlock.getExplosionResistance(exploder) * 2 / 3);
	}
}
