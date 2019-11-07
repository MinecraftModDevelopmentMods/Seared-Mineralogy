package com.mcmoddev.searedmineralogy.smeltery.block;

import com.mcmoddev.searedmineralogy.SearedMineralogy;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockSeared extends slimeknights.tconstruct.smeltery.block.BlockSeared {
	private Block baseBlock;

	public BlockSeared(Block block) {
		this.baseBlock = block;
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

	public static String getSearedType(int meta) {
		return SearedType.values()[meta].name();
	}

	private enum SearedType {
		STONE,
		COBBLE,
		PAVER,
		BRICK,
		BRICK_CRACKED,
		BRICK_FANCY,
		BRICK_SQUARE,
		ROAD,
		CREEPER,
		BRICK_TRIANGLE,
		BRICK_SMALL,
		TILE
	}
}
