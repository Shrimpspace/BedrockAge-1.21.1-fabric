package online.shrimpspace.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import online.shrimpspace.mod.block.ModBlocks;
import online.shrimpspace.mod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider {
    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.BEDROCK_INGOT, "基岩锭");
        translationBuilder.add(ModItems.BEDROCK_NUGGET, "基岩粒");

        translationBuilder.add(ModItems.BEDROCK_AXE, "基岩斧");
        translationBuilder.add(ModItems.BEDROCK_SWORD, "基岩剑");
        translationBuilder.add(ModItems.BEDROCK_PICKAXE, "基岩镐");
        translationBuilder.add(ModItems.BEDROCK_SHOVEL, "基岩铲");
        translationBuilder.add(ModItems.BEDROCK_HOE, "基岩锄");

        translationBuilder.add(ModItems.BEDROCK_HELMET, "基岩头盔");
        translationBuilder.add(ModItems.BEDROCK_CHESTPLATE, "基岩胸甲");
        translationBuilder.add(ModItems.BEDROCK_LEGGINGS, "基岩护腿");
        translationBuilder.add(ModItems.BEDROCK_BOOTS, "基岩靴子");

        translationBuilder.add(ModBlocks.POLISHED_BEDROCK_BLOCK, "磨制基岩块");
        translationBuilder.add(ModBlocks.BEDROCK_ORE, "基岩矿");

        translationBuilder.add("itemGroup.bedrock_age_group", "基岩时代");
        translationBuilder.add("advancements.get_bedrock_nugget.description", "基岩时代");
        translationBuilder.add("advancements.get_bedrock_nugget.title", "获得基岩粒");
        translationBuilder.add("advancements.cover_me_with_bedrock.description", "基岩护体");
        translationBuilder.add("advancements.cover_me_with_bedrock.title", "获得一整套基岩盔甲");
        translationBuilder.add("advancements.infinite_dedication.description", "无限奉献");
        translationBuilder.add("advancements.infinite_dedication.title", "用基岩锭升级一把锄，然后重新考虑你的人生抉择");
        translationBuilder.add("advancements.More_beautiful_building_blocks.description", "更美观的建筑方块");
        translationBuilder.add("advancements.More_beautiful_building_blocks.title", "获得一个磨制基岩块");


    }
}

