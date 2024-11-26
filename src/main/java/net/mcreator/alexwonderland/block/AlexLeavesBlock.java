
package net.mcreator.alexwonderland.block;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.alexwonderland.init.AlexWonderlandModBlocks;

public class AlexLeavesBlock extends LeavesBlock {
	public AlexLeavesBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
		return new ItemStack(AlexWonderlandModBlocks.ALEX_LEAVES.get());
	}

	@OnlyIn(Dist.CLIENT)
	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.getBlockColors().register((bs, world, pos, index) -> {
			return FoliageColor.getDefaultColor();
		}, AlexWonderlandModBlocks.ALEX_LEAVES.get());
	}

	@OnlyIn(Dist.CLIENT)
	public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
		event.getItemColors().register((stack, index) -> {
			return FoliageColor.getDefaultColor();
		}, AlexWonderlandModBlocks.ALEX_LEAVES.get());
	}
}
