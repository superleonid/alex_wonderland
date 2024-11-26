
package net.mcreator.alexwonderland.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.BiomeColors;

import net.mcreator.alexwonderland.init.AlexWonderlandModBlocks;

import com.mojang.serialization.MapCodec;

public class AlexGrassBlock extends FallingBlock {
	public static final MapCodec<AlexGrassBlock> CODEC = simpleCodec(properties -> new AlexGrassBlock());

	public MapCodec<AlexGrassBlock> codec() {
		return CODEC;
	}

	public AlexGrassBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.amethyst_block.chime")), () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.amethyst_block.place")),
						() -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.amethyst_block.chime")), () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.amethyst_block.break")),
						() -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.amethyst_block.step"))))
				.strength(1f, 10f).noCollission().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
		return context.getItemInHand().getItem() != this.asItem();
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
		return new ItemStack(AlexWonderlandModBlocks.ALEX_GRASS.get());
	}

	@OnlyIn(Dist.CLIENT)
	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.getBlockColors().register((bs, world, pos, index) -> {
			return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5D, 1.0D);
		}, AlexWonderlandModBlocks.ALEX_GRASS.get());
	}
}
