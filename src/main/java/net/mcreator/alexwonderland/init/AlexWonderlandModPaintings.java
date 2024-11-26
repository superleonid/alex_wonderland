
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alexwonderland.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.core.registries.Registries;

import net.mcreator.alexwonderland.AlexWonderlandMod;

public class AlexWonderlandModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(Registries.PAINTING_VARIANT, AlexWonderlandMod.MODID);
	public static final DeferredHolder<PaintingVariant, PaintingVariant> LEOS_CREATION = REGISTRY.register("leos_creation", () -> new PaintingVariant(192, 192));
	public static final DeferredHolder<PaintingVariant, PaintingVariant> KDDJFD = REGISTRY.register("kddjfd", () -> new PaintingVariant(16, 624));
}
