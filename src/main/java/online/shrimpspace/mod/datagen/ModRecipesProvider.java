package online.shrimpspace.mod.datagen;

import com.mojang.datafixers.DataFixerBuilder;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import online.shrimpspace.mod.BedrockAge;
import online.shrimpspace.mod.block.ModBlocks;
import online.shrimpspace.mod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> BEDROCK_ORE = List.of(ModBlocks.BEDROCK_ORE);
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.BEDROCK_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BEDROCK_BLOCK);



        offerBlasting(exporter, BEDROCK_ORE, RecipeCategory.MISC, ModItems.BEDROCK_INGOT,
                10.0f, 100, "bedrock_ingot_from_bedrock_ore");


        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BEDROCK_ORE,1)
                .input(ModItems.BEDROCK_INGOT)
                .input(Items.DEEPSLATE)
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BEDROCK_INGOT))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, Identifier.of(BedrockAge.MOD_ID, "bedrock_ore_from_nugget_and_deepslate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BEDROCK_INGOT,1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Ingredient.ofItems(ModItems.BEDROCK_NUGGET))
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BEDROCK_NUGGET))
                .offerTo(exporter, Identifier.of(BedrockAge.MOD_ID, "bedrock_ingot_from_nugget"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BEDROCK_NUGGET,9)
                .input(ModItems.BEDROCK_INGOT)
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BEDROCK_INGOT))
                .offerTo(exporter, Identifier.of(BedrockAge.MOD_ID, "bedrock_nugget_from_ingot"));



        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // 第一格
                        Ingredient.ofItems(Items.NETHERITE_CHESTPLATE),     // 第二格
                        Ingredient.ofItems(ModItems.BEDROCK_INGOT),// 第三格
                RecipeCategory.MISC,ModItems.BEDROCK_CHESTPLATE)//第四格
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BEDROCK_INGOT))
                .offerTo(exporter, Identifier.of(BedrockAge.MOD_ID, "bedrock_chestplate_from_netherite_chestplate"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // 第一格
                        Ingredient.ofItems(Items.NETHERITE_LEGGINGS),     // 第二格
                        Ingredient.ofItems(ModItems.BEDROCK_INGOT),// 第三格
                        RecipeCategory.MISC,ModItems.BEDROCK_LEGGINGS)//第四格
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BEDROCK_INGOT))
                .offerTo(exporter, Identifier.of(BedrockAge.MOD_ID, "bedrock_chestplate_from_netherite_leggings"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // 第一格
                        Ingredient.ofItems(Items.NETHERITE_HELMET),     // 第二格
                        Ingredient.ofItems(ModItems.BEDROCK_INGOT),// 第三格
                        RecipeCategory.MISC,ModItems.BEDROCK_HELMET)//第四格
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BEDROCK_INGOT))
                .offerTo(exporter, Identifier.of(BedrockAge.MOD_ID, "bedrock_chestplate_from_netherite_helmet"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // 第一格
                        Ingredient.ofItems(Items.NETHERITE_BOOTS),     // 第二格
                        Ingredient.ofItems(ModItems.BEDROCK_INGOT),// 第三格
                        RecipeCategory.MISC,ModItems.BEDROCK_BOOTS)//第四格
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BEDROCK_INGOT))
                .offerTo(exporter, Identifier.of(BedrockAge.MOD_ID, "bedrock_chestplate_from_netherite_boots"));



        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // 第一格
                        Ingredient.ofItems(Items.NETHERITE_AXE),     // 第二格
                        Ingredient.ofItems(ModItems.BEDROCK_INGOT),// 第三格
                        RecipeCategory.MISC,ModItems.BEDROCK_AXE)//第四格
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BEDROCK_INGOT))
                .offerTo(exporter, Identifier.of(BedrockAge.MOD_ID, "bedrock_chestplate_from_netherite_axe"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // 第一格
                        Ingredient.ofItems(Items.NETHERITE_PICKAXE),     // 第二格
                        Ingredient.ofItems(ModItems.BEDROCK_INGOT),// 第三格
                        RecipeCategory.MISC,ModItems.BEDROCK_PICKAXE)//第四格
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BEDROCK_INGOT))
                .offerTo(exporter, Identifier.of(BedrockAge.MOD_ID, "bedrock_chestplate_from_netherite_pickaxe"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // 第一格
                        Ingredient.ofItems(Items.NETHERITE_SHOVEL),     // 第二格
                        Ingredient.ofItems(ModItems.BEDROCK_INGOT),// 第三格
                        RecipeCategory.MISC,ModItems.BEDROCK_SHOVEL)//第四格
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BEDROCK_INGOT))
                .offerTo(exporter, Identifier.of(BedrockAge.MOD_ID, "bedrock_chestplate_from_netherite_shovel"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // 第一格
                        Ingredient.ofItems(Items.NETHERITE_SWORD),     // 第二格
                        Ingredient.ofItems(ModItems.BEDROCK_INGOT),// 第三格
                        RecipeCategory.MISC,ModItems.BEDROCK_SWORD)//第四格
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BEDROCK_INGOT))
                .offerTo(exporter, Identifier.of(BedrockAge.MOD_ID, "bedrock_chestplate_from_netherite_sword"));
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), // 第一格
                        Ingredient.ofItems(Items.NETHERITE_HOE),     // 第二格
                        Ingredient.ofItems(ModItems.BEDROCK_INGOT),// 第三格
                        RecipeCategory.MISC,ModItems.BEDROCK_HOE)//第四格
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.BEDROCK_INGOT))
                .offerTo(exporter, Identifier.of(BedrockAge.MOD_ID, "bedrock_chestplate_from_netherite_hoe"));



    }
}

