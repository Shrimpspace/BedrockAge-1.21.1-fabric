package online.shrimpspace.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import online.shrimpspace.mod.block.ModBlocks;
import online.shrimpspace.mod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.BEDROCK_INGOT, "Bedrock Ingot");
        translationBuilder.add(ModItems.BEDROCK_NUGGET, "Bedrock Nugget");

        translationBuilder.add(ModItems.BEDROCK_SWORD, "Bedrock Sword");
        translationBuilder.add(ModItems.BEDROCK_PICKAXE, "Bedrock Pick" );
        translationBuilder.add(ModItems.BEDROCK_AXE, "Bedrock Axe");
        translationBuilder.add(ModItems.BEDROCK_SHOVEL, "Bedrock Shovel");
        translationBuilder.add(ModItems.BEDROCK_HOE, "Bedrock Hoe");

        translationBuilder.add(ModItems.BEDROCK_HELMET, "Bedrock Helmet");
        translationBuilder.add(ModItems.BEDROCK_CHESTPLATE, "Bedrock Chestplate");
        translationBuilder.add(ModItems.BEDROCK_LEGGINGS, "Bedrock Leggings");
        translationBuilder.add(ModItems.BEDROCK_BOOTS, "Bedrock Boots");

        translationBuilder.add(ModBlocks.POLISHED_BEDROCK_BLOCK, "Polished Bedrock Block");
        translationBuilder.add(ModBlocks.BEDROCK_ORE, "Bedrock Ore");

        translationBuilder.add("itemGroup.bedrock_age_group", "Bedrock Age");
        translationBuilder.add("advancements.get_bedrock_nugget.description", "Bedrock Age");
        translationBuilder.add("advancements.get_bedrock_nugget.title", "Get Bedrock Nugget");
        translationBuilder.add("advancements.cover_me_with_bedrock.description", "Cover Me With Bedrock");
        translationBuilder.add("advancements.cover_me_with_bedrock.title", "Get a full suit of Bedrock armor");
        translationBuilder.add("advancements.infinite_dedication.description", "Infinite Dedication");
        translationBuilder.add("advancements.infinite_dedication.title", "Use a Bedrock Ingot to upgrade a Hoe, and then reevaluate your life choices");
        translationBuilder.add("advancements.More_beautiful_building_blocks.description", "More Beautiful Building Blocks");
        translationBuilder.add("advancements.More_beautiful_building_blocks.title", "Get a Polished Bedrock Block");


    }
}
