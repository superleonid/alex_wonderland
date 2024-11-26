
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.alexwonderland.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class AlexWonderlandModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == AlexWonderlandModVillagerProfessions.ALEXVILLAGER.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.BUBBLE_COLUMN, 64), new ItemStack(Blocks.AMETHYST_CLUSTER, 64), new ItemStack(AlexWonderlandModBlocks.RUBRUBIKSCUBE.get(), 64), 222, 444, 0.01f));
		}
	}
}
