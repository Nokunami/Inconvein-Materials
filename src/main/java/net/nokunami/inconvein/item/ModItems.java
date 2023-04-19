package net.nokunami.inconvein.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nokunami.inconvein.Inconvein;
import net.nokunami.inconvein.block.ModBlocks;
import net.nokunami.inconvein.item.custom.ModArmorMaterials;
import net.nokunami.inconvein.item.custom.ModTiers;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Inconvein.MOD_ID);
    public static final RegistryObject<Item> CRUDE_STEEL = ITEMS.register("crude_steel",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> COKE = ITEMS.register("coke",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> DIARKRITE_INGOT = ITEMS.register("diarkrite_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ANCIENT_METAL_SCRAP = ITEMS.register("ancient_metal_scrap",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> STEEL_SWORD= ITEMS.register("steel_sword",
            () -> new SwordItem(ModTiers.STEEL, (int) 3.5F, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_SHOVEL= ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModTiers.STEEL, (int) 1.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> STEEL_PICKAXE= ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModTiers.STEEL, (int) 1.2, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> STEEL_AXE= ITEMS.register("steel_axe",
            () -> new AxeItem(ModTiers.STEEL, 5, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> STEEL_HOE= ITEMS.register("steel_hoe",
            () -> new HoeItem(Tiers.IRON, -2, 0f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> DIARKRITE_SWORD= ITEMS.register("diarkrite_sword",
            () -> new SwordItem(ModTiers.DIARKRITE, (int) 3.5F, -2.7f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> DIARKRITE_SHOVEL= ITEMS.register("diarkrite_shovel",
            () -> new ShovelItem(ModTiers.DIARKRITE, (int) 1.5f, -2f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> DIARKRITE_PICKAXE= ITEMS.register("diarkrite_pickaxe",
            () -> new PickaxeItem(ModTiers.DIARKRITE, (int) 1.2, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> DIARKRITE_AXE= ITEMS.register("diarkrite_axe",
            () -> new AxeItem(ModTiers.DIARKRITE, 5, -3.2f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> DIARKRITE_HOE= ITEMS.register("diarkrite_hoe",
            () -> new HoeItem(Tiers.NETHERITE, -4,0,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> STEEL_HELMET= ITEMS.register("steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE= ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_LEGGINGS= ITEMS.register("steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STEEL_BOOTS= ITEMS.register("steel_boots",
            () -> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> DIARKRITE_HELMET= ITEMS.register("diarkrite_helmet",
            () -> new ArmorItem(ModArmorMaterials.DIARKRITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> DIARKRITE_CHESTPLATE= ITEMS.register("diarkrite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DIARKRITE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> DIARKRITE_LEGGINGS= ITEMS.register("diarkrite_leggings",
            () -> new ArmorItem(ModArmorMaterials.DIARKRITE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> DIARKRITE_BOOTS= ITEMS.register("diarkrite_boots",
            () -> new ArmorItem(ModArmorMaterials.DIARKRITE, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).rarity(Rarity.UNCOMMON)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
