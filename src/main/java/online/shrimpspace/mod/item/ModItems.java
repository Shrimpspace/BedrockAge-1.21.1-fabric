package online.shrimpspace.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import online.shrimpspace.mod.BedrockAge;

public class ModItems {
    public static final Item BEDROCK_INGOT = registerItems("bedrock_ingot", new Item(new Item.Settings()));
    public static final Item BEDROCK_NUGGET = registerItems("bedrock_nugget", new Item(new Item.Settings()));

    public static final Item BEDROCK_AXE = registerItems("bedrock_axe",
            new AxeItem(ModToolMaterials.BEDROCK, new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BEDROCK,5, -3.0f))));
    public static final Item BEDROCK_SWORD = registerItems("bedrock_sword",
            new SwordItem(ModToolMaterials.BEDROCK, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BEDROCK,3, -2.4f))));
    public static final Item BEDROCK_PICKAXE = registerItems("bedrock_pickaxe",
            new PickaxeItem(ModToolMaterials.BEDROCK, new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BEDROCK,1, -2.8f))));
    public static final Item BEDROCK_SHOVEL = registerItems("bedrock_shovel",
            new ShovelItem(ModToolMaterials.BEDROCK, new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BEDROCK,1.5f, -3.0f))));
    public static final Item BEDROCK_HOE = registerItems("bedrock_hoe",
            new HoeItem(ModToolMaterials.BEDROCK, new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BEDROCK,-4.0f, 0.0f))));

    public static final Item BEDROCK_HELMET = registerItems("bedrock_helmet", new ArmorItem(ModArmorMaterials.BEDROCK, ArmorItem.Type.HELMET,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));
    public static final Item BEDROCK_CHESTPLATE = registerItems("bedrock_chestplate", new ArmorItem(ModArmorMaterials.BEDROCK, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));
    public static final Item BEDROCK_LEGGINGS = registerItems("bedrock_leggings", new ArmorItem(ModArmorMaterials.BEDROCK, ArmorItem.Type.LEGGINGS,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));
    public static final Item BEDROCK_BOOTS = registerItems("bedrock_boots", new ArmorItem(ModArmorMaterials.BEDROCK, ArmorItem.Type.BOOTS,
            new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BedrockAge.MOD_ID, id), item);
    }
    private static void addItemTOIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(BEDROCK_INGOT);
        fabricItemGroupEntries.add(BEDROCK_NUGGET);
    }
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemTOIG);
        //INGREDIENTS是原材料的意思
        BedrockAge.LOGGER.info("Registering Items");
    }
}
