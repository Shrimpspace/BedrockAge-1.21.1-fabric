package online.shrimpspace.mod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import online.shrimpspace.mod.BedrockAge;

public class ModBlocks {
    public static final Block POLISHED_BEDROCK_BLOCK = register("polished_bedrock_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(50.0F, 1200.0F)));
    public static final Block BEDROCK_ORE = register("bedrock_ore", new Block(AbstractBlock.Settings.create().requiresTool().strength(15.0F, 1200.0F)));
    public static void registerBlockItems(String id,Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(BedrockAge.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BedrockAge.MOD_ID, id), block);
    }
    public static void registerModBlocks() {
        BedrockAge.LOGGER.info("Registering Mod Blocks");
    }
}
