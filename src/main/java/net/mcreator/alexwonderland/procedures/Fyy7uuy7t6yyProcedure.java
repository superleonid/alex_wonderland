package net.mcreator.alexwonderland.procedures;

import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.Map;

public class Fyy7uuy7t6yyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entLootTbl && !_entLootTbl.level().isClientSide() && _entLootTbl.getServer() != null) {
			DamageSource _dsLootTbl = _entLootTbl.getLastDamageSource();
			if (_dsLootTbl == null)
				_dsLootTbl = _entLootTbl.damageSources().generic();
			for (ItemStack itemstackiterator : _entLootTbl.getServer().reloadableRegistries().getLootTable(ResourceKey.create(Registries.LOOT_TABLE, new ResourceLocation("minecraft:chests/spawn_bonus_chest")))
					.getRandomItems(new LootParams.Builder((ServerLevel) _entLootTbl.level()).withParameter(LootContextParams.THIS_ENTITY, _entLootTbl)
							.withOptionalParameter(LootContextParams.LAST_DAMAGE_PLAYER, _entLootTbl.getLastHurtByMob() instanceof Player _player ? _player : null).withParameter(LootContextParams.DAMAGE_SOURCE, _dsLootTbl)
							.withOptionalParameter(LootContextParams.KILLER_ENTITY, _dsLootTbl.getEntity()).withOptionalParameter(LootContextParams.DIRECT_KILLER_ENTITY, _dsLootTbl.getDirectEntity())
							.withParameter(LootContextParams.ORIGIN, _entLootTbl.position()).withParameter(LootContextParams.BLOCK_STATE, _entLootTbl.level().getBlockState(_entLootTbl.blockPosition()))
							.withOptionalParameter(LootContextParams.BLOCK_ENTITY, _entLootTbl.level().getBlockEntity(_entLootTbl.blockPosition()))
							.withParameter(LootContextParams.TOOL, _entLootTbl instanceof Player _player ? _player.getInventory().getSelected() : _entLootTbl.getUseItem()).withParameter(LootContextParams.EXPLOSION_RADIUS, 0f)
							.withLuck(_entLootTbl instanceof Player _player ? _player.getLuck() : 0).create(LootContextParamSets.EMPTY))) {
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.REPEATING_COMMAND_BLOCK)) : false)
						&& (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(BlockPos.containing(x, y - 1, z), Direction.UP) : 0) > 0) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(9e+66)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BONE));
						entityToSpawn.setPickUpDelay(10);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
