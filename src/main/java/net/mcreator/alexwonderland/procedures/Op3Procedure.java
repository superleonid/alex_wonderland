package net.mcreator.alexwonderland.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import java.util.Collections;

public class Op3Procedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("tagName", "tagValue");
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("minecraft:netherite_pickaxe")));
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Items.NETHERITE_INGOT).copy();
			_setstack.setCount(3);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Items.STICK).copy();
			_setstack.setCount(2);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Items.ENCHANTED_BOOK).copy();
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		itemstack.enchant(Enchantments.SILK_TOUCH, 9000);
	}
}
