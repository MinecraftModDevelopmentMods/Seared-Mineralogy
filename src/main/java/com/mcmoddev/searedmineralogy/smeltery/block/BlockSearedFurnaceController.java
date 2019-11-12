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
import slimeknights.tconstruct.smeltery.block.BlockSmelteryController;

public class BlockSearedFurnaceController extends slimeknights.tconstruct.smeltery.block.BlockSearedFurnaceController implements ISearedObject {
	private Block baseBlock;

	public BlockSearedFurnaceController(Block baseBlock) {
		super();
		this.baseBlock = baseBlock;
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
}
