
package net.mcreator.alexwonderland.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlotGroup;

public class CottonCandyItem extends Item {
	public CottonCandyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.1f).alwaysEdible().build())
				.attributes(ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Item modifier", 10.1, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Item modifier", -2.4, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getEnchantmentValue() {
		return -48;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return -5.1f;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
