package fr.wakleg.iroxxy.data;

import fr.wakleg.iroxxy.block.ModBlocks;
import fr.wakleg.iroxxy.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_RUBY_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_STONE_RUBY_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
    }
}
