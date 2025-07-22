package online.shrimpspace.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import online.shrimpspace.mod.BedrockAge;
import online.shrimpspace.mod.block.ModBlocks;
import online.shrimpspace.mod.item.ModItems;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup wrapperLookup, Consumer<AdvancementEntry> consumer) {
        AdvancementEntry getBEDROCK_NUGGET = Advancement.Builder.create()
                .display(
                        ModItems.BEDROCK_INGOT,
                        Text.translatable("advancements.get_bedrock_nugget.description"), //成就那个文字（残骸裹身、钻石等）
                        Text.translatable("advancements.get_bedrock_nugget.title"), //中间那段文字
                        Identifier.ofVanilla("textures/gui/advancements/backgrounds/adventure.png"), //背景图
                        AdvancementFrame.TASK,//成就类型
                        true,
                        false,
                        false
                )
                .criterion("get_bedrock_nugget", InventoryChangedCriterion.Conditions.items(ModItems.BEDROCK_NUGGET))
                .build(consumer, BedrockAge.MOD_ID + ":get_bedrock_nugget");

        AdvancementEntry COVER_ME_WITH_BEDROCK = Advancement.Builder.create()
                .parent(getBEDROCK_NUGGET)
                .display(
                        ModItems.BEDROCK_CHESTPLATE,
                        Text.translatable("advancements.cover_me_with_bedrock.description"), //成就那个文字（残骸裹身、钻石等）
                        Text.translatable("advancements.cover_me_with_bedrock.title"), //中间那段文字
                        null,
                        AdvancementFrame.CHALLENGE,//成就类型
                        true,
                        false,
                        false
                )
                .criterion("wear_bedrock_helmet", InventoryChangedCriterion.Conditions.items(ModItems.BEDROCK_HELMET))
                .criterion("wear_bedrock_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.BEDROCK_CHESTPLATE))
                .criterion("wear_bedrock_leggings", InventoryChangedCriterion.Conditions.items(ModItems.BEDROCK_LEGGINGS))
                .criterion("wear_bedrock_boots", InventoryChangedCriterion.Conditions.items(ModItems.BEDROCK_BOOTS))
                .build(consumer, BedrockAge.MOD_ID + ":cover_me_with_bedrock");

        AdvancementEntry INFINITE_DEDICATION = Advancement.Builder.create()
                .parent(getBEDROCK_NUGGET)
                .display(
                        ModItems.BEDROCK_HOE,
                        Text.translatable("advancements.infinite_dedication.description"), //成就那个文字（残骸裹身、钻石等）
                        Text.translatable("advancements.infinite_dedication.title"), //中间那段文字
                        null,
                        AdvancementFrame.CHALLENGE,//成就类型
                        true,
                        false,
                        false
                )
                .criterion("get_bedrock_hoe", InventoryChangedCriterion.Conditions.items(ModItems.BEDROCK_HOE))
                .build(consumer, BedrockAge.MOD_ID + ":infinite_dedication");

        AdvancementEntry MORE_BEAUTIFUL_BUILDING_BLOCKS = Advancement.Builder.create()
                .parent(getBEDROCK_NUGGET)
                .display(
                        ModBlocks.POLISHED_BEDROCK_BLOCK,
                        Text.translatable("advancements.More_beautiful_building_blocks.description"), //成就那个文字（残骸裹身、钻石等）
                        Text.translatable("advancements.More_beautiful_building_blocks.title"), //中间那段文字
                        null,
                        AdvancementFrame.TASK,//成就类型
                        true,
                        false,
                        false
                )
                .criterion("get_polished_bedrock_block", InventoryChangedCriterion.Conditions.items(ModBlocks.POLISHED_BEDROCK_BLOCK))
                .build(consumer, BedrockAge.MOD_ID + ":more_beautiful_building_blocks");

    }
}
