package online.shrimpspace.mod.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import online.shrimpspace.mod.BedrockAge;
import online.shrimpspace.mod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup BEDROCK_AGE_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(BedrockAge.MOD_ID, "bedrock_age_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.bedrock_age_group"))
                    .icon(() -> new ItemStack(ModItems.BEDROCK_INGOT))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BEDROCK_INGOT);
                        entries.add(ModItems.BEDROCK_NUGGET);

                        entries.add(ModBlocks.POLISHED_BEDROCK_BLOCK);
                        entries.add(ModBlocks.BEDROCK_ORE);

                        entries.add(ModItems.BEDROCK_SWORD);
                        entries.add(ModItems.BEDROCK_PICKAXE);
                        entries.add(ModItems.BEDROCK_AXE);
                        entries.add(ModItems.BEDROCK_HOE);
                        entries.add(ModItems.BEDROCK_SHOVEL);

                        entries.add(ModItems.BEDROCK_HELMET);
                        entries.add(ModItems.BEDROCK_CHESTPLATE);
                        entries.add(ModItems.BEDROCK_LEGGINGS);
                        entries.add(ModItems.BEDROCK_BOOTS);
                    }).build());
    public static void
    registerModItemGroups() {
        BedrockAge.LOGGER.info("Registering Item Groups");
    }
}
