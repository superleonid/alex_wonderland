
package net.mcreator.alexwonderland.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.network.chat.Component;

import java.util.List;

public class PItem extends Item {
	public PItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC)
				.attributes(ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Item modifier", 89999, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Item modifier", -2.4, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build()));
	}

	@Override
	public int getEnchantmentValue() {
		return 143;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 438;
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return -8.8f;
	}

	@Override
	public boolean isCorrectToolForDrops(ItemStack itemstack, BlockState state) {
		return true;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal(""));
	}
}
