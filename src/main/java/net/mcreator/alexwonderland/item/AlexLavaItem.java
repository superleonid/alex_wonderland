
package net.mcreator.alexwonderland.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.alexwonderland.init.AlexWonderlandModFluids;

public class AlexLavaItem extends BucketItem {
	public AlexLavaItem() {
		super(AlexWonderlandModFluids.ALEX_LAVA.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE));
	}
}
