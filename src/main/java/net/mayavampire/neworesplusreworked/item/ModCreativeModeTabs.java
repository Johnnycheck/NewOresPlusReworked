package net.mayavampire.neworesplusreworked.item;

import net.mayavampire.neworesplusreworked.Neworeplusreworked;
import net.mayavampire.neworesplusreworked.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Neworeplusreworked.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NEW_ORES_PLUS_REWORKED_TAB = CREATIVE_MODE_TABS.register("new_ores_plus_reworked_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TIN_INGOT.get()))
                    .title(Component.translatable("creativetab.new_ores_plus_reworked_tab"))
                    .displayItems((p_270258_, p_259752_) -> {
                        p_259752_.accept(ModItems.TIN_INGOT.get());
                        p_259752_.accept(ModItems.RAW_TIN.get());
                        p_259752_.accept(ModBlocks.TIN_BLOCK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
