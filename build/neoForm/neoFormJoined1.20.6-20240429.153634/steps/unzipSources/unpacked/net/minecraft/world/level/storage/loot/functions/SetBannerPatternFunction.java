package net.minecraft.world.level.storage.loot.functions;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

public class SetBannerPatternFunction extends LootItemConditionalFunction {
    public static final MapCodec<SetBannerPatternFunction> CODEC = RecordCodecBuilder.mapCodec(
        p_330181_ -> commonFields(p_330181_)
                .and(
                    p_330181_.group(
                        BannerPatternLayers.CODEC.fieldOf("patterns").forGetter(p_330180_ -> p_330180_.patterns),
                        Codec.BOOL.fieldOf("append").forGetter(p_298522_ -> p_298522_.append)
                    )
                )
                .apply(p_330181_, SetBannerPatternFunction::new)
    );
    private final BannerPatternLayers patterns;
    private final boolean append;

    SetBannerPatternFunction(List<LootItemCondition> p_165276_, BannerPatternLayers p_331947_, boolean p_165277_) {
        super(p_165276_);
        this.patterns = p_331947_;
        this.append = p_165277_;
    }

    @Override
    protected ItemStack run(ItemStack p_165280_, LootContext p_165281_) {
        if (this.append) {
            p_165280_.update(
                DataComponents.BANNER_PATTERNS,
                BannerPatternLayers.EMPTY,
                this.patterns,
                (p_330178_, p_330179_) -> new BannerPatternLayers.Builder().addAll(p_330178_).addAll(p_330179_).build()
            );
        } else {
            p_165280_.set(DataComponents.BANNER_PATTERNS, this.patterns);
        }

        return p_165280_;
    }

    @Override
    public LootItemFunctionType<SetBannerPatternFunction> getType() {
        return LootItemFunctions.SET_BANNER_PATTERN;
    }

    public static SetBannerPatternFunction.Builder setBannerPattern(boolean p_165283_) {
        return new SetBannerPatternFunction.Builder(p_165283_);
    }

    public static class Builder extends LootItemConditionalFunction.Builder<SetBannerPatternFunction.Builder> {
        private final BannerPatternLayers.Builder patterns = new BannerPatternLayers.Builder();
        private final boolean append;

        Builder(boolean p_165287_) {
            this.append = p_165287_;
        }

        protected SetBannerPatternFunction.Builder getThis() {
            return this;
        }

        @Override
        public LootItemFunction build() {
            return new SetBannerPatternFunction(this.getConditions(), this.patterns.build(), this.append);
        }

        public SetBannerPatternFunction.Builder addPattern(Holder<BannerPattern> p_230999_, DyeColor p_231000_) {
            this.patterns.add(p_230999_, p_231000_);
            return this;
        }
    }
}