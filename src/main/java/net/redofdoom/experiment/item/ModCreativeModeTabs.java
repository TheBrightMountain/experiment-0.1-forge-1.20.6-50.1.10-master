package net.redofdoom.experiment.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.redofdoom.experiment.Experiment;
import net.redofdoom.experiment.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Experiment.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EXPERIMENTAL_TAB = CREATIVE_MODE_TAB.register("experimental_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.RUBY.get()))
            .title(Component.translatable("creativetab.experimental_tab"))
            .displayItems((itemDisplayParameters, output) ->
            {
            output.accept(ModItems.RUBY.get());
            output.accept(ModBlocks.RUBY_BLOCK.get());
            output.accept(ModBlocks.RUBY_ORE.get());
            output.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
            output.accept(ModItems.CLOUD_IN_BOTTLE.get());
            output.accept(ModItems.LEMON.get());
            output.accept(ModItems.SOUL_FLAME.get());
            })
            .build());

    public static void register(IEventBus eventBus)
    {
           CREATIVE_MODE_TAB.register(eventBus);
    }
}
