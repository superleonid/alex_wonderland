
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alexwonderland.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.alexwonderland.AlexWonderlandMod;

public class AlexWonderlandModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlexWonderlandMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ALEX_TAB = REGISTRY.register("alex_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alex_wonderland.alex_tab")).icon(() -> new ItemStack(AlexWonderlandModBlocks.ALEX_GRASS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AlexWonderlandModBlocks.ALEX_GRASS.get().asItem());
				tabData.accept(AlexWonderlandModBlocks.ALEX_DIRT.get().asItem());
				tabData.accept(AlexWonderlandModBlocks.ALEX_LEAVES.get().asItem());
				tabData.accept(AlexWonderlandModItems.LAVA_PET_SPAWN_EGG.get());
				tabData.accept(AlexWonderlandModItems.ALEX_PHANTOM_SPAWN_EGG.get());
				tabData.accept(AlexWonderlandModItems.ALEX_LAVA_BUCKET.get());
				tabData.accept(AlexWonderlandModItems.ALEX_PICKAXE.get());
				tabData.accept(AlexWonderlandModItems.ALEX_AXE.get());
				tabData.accept(AlexWonderlandModItems.ALEX_SWORD.get());
				tabData.accept(AlexWonderlandModItems.ALEX_SHOVEL.get());
				tabData.accept(AlexWonderlandModItems.ALEX_HOE.get());
				tabData.accept(AlexWonderlandModBlocks.RUBRUBIKSCUBE.get().asItem());
				tabData.accept(AlexWonderlandModBlocks.TAKE_IT_EASY_PILLOW.get().asItem());
				tabData.accept(AlexWonderlandModBlocks.BED.get().asItem());
				tabData.accept(AlexWonderlandModItems.P.get());
				tabData.accept(AlexWonderlandModBlocks.HDHD.get().asItem());
				tabData.accept(AlexWonderlandModItems.HAUJHSDLJCKSCHSIKSDVC_FHDFGHDUSKSGANEKJD.get());
			}).withSearchBar().build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEO_AND_MAMASTAB = REGISTRY.register("leo_and_mamastab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alex_wonderland.leo_and_mamastab")).icon(() -> new ItemStack(Blocks.BIRCH_SAPLING)).displayItems((parameters, tabData) -> {
				tabData.accept(AlexWonderlandModItems.COTTON_CANDY.get());
			}).withSearchBar().build());
}
