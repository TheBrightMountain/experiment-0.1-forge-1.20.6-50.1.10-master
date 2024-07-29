package net.redofdoom.experiment.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redofdoom.experiment.Experiment;
import net.redofdoom.experiment.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Experiment.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)));
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",() -> new DropExperienceBlock(UniformInt.of(5,10), BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",() -> new DropExperienceBlock(UniformInt.of(5,10), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE)));



    public static final RegistryObject<Block> RUBY_STAIRS = registerBlock("ruby_stairs",() -> new StairBlock(ModBlocks.RUBY_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)));
    public static final RegistryObject<Block> RUBY_SLAB = registerBlock("ruby_slab",() -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> RUBY_BUTTON = registerBlock("ruby_button",() -> new ButtonBlock(BlockSetType.IRON, 20,BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)));
    public static final RegistryObject<Block> RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",() -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> RUBY_FENCE = registerBlock("ruby_fence",() -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)));
    public static final RegistryObject<Block> RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",() -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK), SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE));
    public static final RegistryObject<Block> RUBY_WALL = registerBlock("ruby_wall",() -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> RUBY_DOOR = registerBlock("ruby_door",() -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).noOcclusion()));
    public static final RegistryObject<Block> RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",() -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).noOcclusion()));

//    public static final RegistryObject<Block> RUBY_LADDER = registerBlock("ruby_ladder",() -> new LadderBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }

}
