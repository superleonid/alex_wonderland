package net.minecraft.world.level.levelgen.structure.templatesystem.rule.blockentity;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;

public interface RuleBlockEntityModifierType<P extends RuleBlockEntityModifier> {
    RuleBlockEntityModifierType<Clear> CLEAR = register("clear", Clear.CODEC);
    RuleBlockEntityModifierType<Passthrough> PASSTHROUGH = register("passthrough", Passthrough.CODEC);
    RuleBlockEntityModifierType<AppendStatic> APPEND_STATIC = register("append_static", AppendStatic.CODEC);
    RuleBlockEntityModifierType<AppendLoot> APPEND_LOOT = register("append_loot", AppendLoot.CODEC);

    MapCodec<P> codec();

    private static <P extends RuleBlockEntityModifier> RuleBlockEntityModifierType<P> register(String p_277659_, MapCodec<P> p_338294_) {
        return Registry.register(BuiltInRegistries.RULE_BLOCK_ENTITY_MODIFIER, p_277659_, () -> p_338294_);
    }
}