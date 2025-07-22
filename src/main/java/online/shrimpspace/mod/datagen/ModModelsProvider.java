package online.shrimpspace.mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import online.shrimpspace.mod.block.ModBlocks;
import online.shrimpspace.mod.item.ModItems;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BEDROCK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BEDROCK_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BEDROCK_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEDROCK_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.BEDROCK_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.BEDROCK_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BEDROCK_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BEDROCK_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BEDROCK_BOOTS);

    }
}
