package net.redofdoom.experiment.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redofdoom.experiment.Experiment;
import net.redofdoom.experiment.item.custom.CloudInBottle;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Experiment.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOUD_IN_BOTTLE = ITEMS.register("cloud_in_bottle", () -> new CloudInBottle(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}