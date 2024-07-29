package net.redofdoom.experiment.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.redofdoom.experiment.Experiment;
import net.redofdoom.experiment.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Experiment.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.RUBY_STAIRS.get(),
                        ModBlocks.RUBY_SLAB.get(),
                        ModBlocks.RUBY_BUTTON.get(),
                        ModBlocks.RUBY_PRESSURE_PLATE.get(),
                        ModBlocks.RUBY_FENCE.get(),
                        ModBlocks.RUBY_FENCE_GATE.get(),
                        ModBlocks.RUBY_WALL.get(),
                        ModBlocks.RUBY_DOOR.get(),
                        ModBlocks.RUBY_TRAPDOOR.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.RUBY_STAIRS.get(),
                        ModBlocks.RUBY_SLAB.get(),
                        ModBlocks.RUBY_BUTTON.get(),
                        ModBlocks.RUBY_PRESSURE_PLATE.get(),
                        ModBlocks.RUBY_FENCE.get(),
                        ModBlocks.RUBY_FENCE_GATE.get(),
                        ModBlocks.RUBY_WALL.get(),
                        ModBlocks.RUBY_DOOR.get(),
                        ModBlocks.RUBY_TRAPDOOR.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.RUBY_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.RUBY_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.RUBY_WALL.get());
    }
}
