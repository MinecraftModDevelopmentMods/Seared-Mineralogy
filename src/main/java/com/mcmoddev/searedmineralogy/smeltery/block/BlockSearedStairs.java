package com.mcmoddev.searedmineralogy.smeltery.block;

import com.mcmoddev.searedmineralogy.SearedMineralogy;
import com.mcmoddev.searedmineralogy.smeltery.ISearedObject;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockSearedStairs extends slimeknights.tconstruct.smeltery.block.BlockSearedStairs implements ISearedObject {
	private Block baseBlock;
	private String searedType;

	public BlockSearedStairs(IBlockState modelState, BlockSeared block, slimeknights.tconstruct.smeltery.block.BlockSeared.SearedType searedType) {
		super(modelState);
		this.baseBlock = block.getBaseBlock();
		this.searedType = searedType.getName();
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

	@Override
	@MethodsReturnNonnullByDefault
	public SoundType getSoundType() {
		return this.baseBlock.getSoundType();
	}

	public String getSearedType() {
		return this.searedType;
	}
}
