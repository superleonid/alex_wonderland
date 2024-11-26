
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alexwonderland.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.alexwonderland.item.PItem;
import net.mcreator.alexwonderland.item.HaujhsdljckschsiksdvcFHDFGHDUSKSGANEKJDItem;
import net.mcreator.alexwonderland.item.CottonCandyItem;
import net.mcreator.alexwonderland.item.AlexSwordItem;
import net.mcreator.alexwonderland.item.AlexShovelItem;
import net.mcreator.alexwonderland.item.AlexPickaxeItem;
import net.mcreator.alexwonderland.item.AlexLavaItem;
import net.mcreator.alexwonderland.item.AlexHoeItem;
import net.mcreator.alexwonderland.item.AlexAxeItem;
import net.mcreator.alexwonderland.AlexWonderlandMod;

public class AlexWonderlandModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AlexWonderlandMod.MODID);
	public static final DeferredHolder<Item, Item> ALEX_GRASS = block(AlexWonderlandModBlocks.ALEX_GRASS);
	public static final DeferredHolder<Item, Item> ALEX_DIRT = block(AlexWonderlandModBlocks.ALEX_DIRT);
	public static final DeferredHolder<Item, Item> ALEX_LEAVES = block(AlexWonderlandModBlocks.ALEX_LEAVES);
	public static final DeferredHolder<Item, Item> LAVA_PET_SPAWN_EGG = REGISTRY.register("lava_pet_spawn_egg", () -> new DeferredSpawnEggItem(AlexWonderlandModEntities.LAVA_PET, -6750004, -10027009, new Item.Properties()));
	public static final DeferredHolder<Item, Item> ALEX_PHANTOM_SPAWN_EGG = REGISTRY.register("alex_phantom_spawn_egg", () -> new DeferredSpawnEggItem(AlexWonderlandModEntities.ALEX_PHANTOM, -52429, -3407617, new Item.Properties()));
	public static final DeferredHolder<Item, Item> ALEX_LAVA_BUCKET = REGISTRY.register("alex_lava_bucket", AlexLavaItem::new);
	public static final DeferredHolder<Item, Item> ALEX_PICKAXE = REGISTRY.register("alex_pickaxe", AlexPickaxeItem::new);
	public static final DeferredHolder<Item, Item> ALEX_AXE = REGISTRY.register("alex_axe", AlexAxeItem::new);
	public static final DeferredHolder<Item, Item> ALEX_SWORD = REGISTRY.register("alex_sword", AlexSwordItem::new);
	public static final DeferredHolder<Item, Item> ALEX_SHOVEL = REGISTRY.register("alex_shovel", AlexShovelItem::new);
	public static final DeferredHolder<Item, Item> ALEX_HOE = REGISTRY.register("alex_hoe", AlexHoeItem::new);
	public static final DeferredHolder<Item, Item> RUBRUBIKSCUBE = block(AlexWonderlandModBlocks.RUBRUBIKSCUBE);
	public static final DeferredHolder<Item, Item> TAKE_IT_EASY_PILLOW = block(AlexWonderlandModBlocks.TAKE_IT_EASY_PILLOW);
	public static final DeferredHolder<Item, Item> BED = block(AlexWonderlandModBlocks.BED);
	public static final DeferredHolder<Item, Item> P = REGISTRY.register("p", PItem::new);
	public static final DeferredHolder<Item, Item> COTTON_CANDY = REGISTRY.register("cotton_candy", CottonCandyItem::new);
	public static final DeferredHolder<Item, Item> HDHD = block(AlexWonderlandModBlocks.HDHD);
	public static final DeferredHolder<Item, Item> HAUJHSDLJCKSCHSIKSDVC_FHDFGHDUSKSGANEKJD = REGISTRY.register("haujhsdljckschsiksdvc_fhdfghdusksganekjd", HaujhsdljckschsiksdvcFHDFGHDUSKSGANEKJDItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
