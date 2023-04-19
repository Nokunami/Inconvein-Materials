package net.nokunami.inconvein.item.custom;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.nokunami.inconvein.item.ModItems;

public class ModTiers {
    public static final ForgeTier STEEL = new ForgeTier(3, 716, 7.0F,
            2.5F,10, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.STEEL_INGOT.get()));
    public static final ForgeTier DIARKRITE = new ForgeTier(4, 1678, 8.5F,
            4.75F,15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.DIARKRITE_INGOT.get()));
}