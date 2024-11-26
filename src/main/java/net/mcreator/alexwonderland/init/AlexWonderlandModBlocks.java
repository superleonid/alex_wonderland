
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alexwonderland.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.alexwonderland.block.TakeItEasyPillowBlock;
import net.mcreator.alexwonderland.block.RubrubikscubeBlock;
import net.mcreator.alexwonderland.block.HdhdBlock;
import net.mcreator.alexwonderland.block.BedBlock;
import net.mcreator.alexwonderland.block.AlexLeavesBlock;
import net.mcreator.alexwonderland.block.AlexLavaBlock;
import net.mcreator.alexwonderland.block.AlexGrassBlock;
import net.mcreator.alexwonderland.block.AlexDirtBlock;
import net.mcreator.alexwonderland.AlexWonderlandMod;

public class AlexWonderlandModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AlexWonderlandMod.MODID);
	public static final DeferredHolder<Block, Block> ALEX_GRASS = REGISTRY.register("alex_grass", AlexGrassBlock::new);
	public static final DeferredHolder<Block, Block> ALEX_DIRT = REGISTRY.register("alex_dirt", AlexDirtBlock::new);
	public static final DeferredHolder<Block, Block> ALEX_LEAVES = REGISTRY.register("alex_leaves", AlexLeavesBlock::new);
	public static final DeferredHolder<Block, Block> ALEX_LAVA = REGISTRY.register("alex_lava", AlexLavaBlock::new);
	public static final DeferredHolder<Block, Block> RUBRUBIKSCUBE = REGISTRY.register("rubrubikscube", RubrubikscubeBlock::new);
	public static final DeferredHolder<Block, Block> TAKE_IT_EASY_PILLOW = REGISTRY.register("take_it_easy_pillow", TakeItEasyPillowBlock::new);
	public static final DeferredHolder<Block, Block> BED = REGISTRY.register("bed", BedBlock::new);
	public static final DeferredHolder<Block, Block> HDHD = REGISTRY.register("hdhd", HdhdBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			AlexGrassBlock.blockColorLoad(event);
			AlexLeavesBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			AlexLeavesBlock.itemColorLoad(event);
		}
	}
}
