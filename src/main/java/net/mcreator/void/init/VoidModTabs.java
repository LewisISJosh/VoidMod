
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.void.init.VoidModTabs;
import net.mcreator.void.init.VoidModItems;
import net.mcreator.void.init.VoidModBlocks;
import net.mcreator.void.VoidMod;
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VoidModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VoidMod.MODID);
	@SubscribeEvent public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
				
				if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
					tabData.accept(VoidModBlocks.VOID_CYRSTAL_BLOCK.get().asItem());
					tabData.accept(VoidModBlocks.VOID_CYRSTAL_ORE.get().asItem());
				}
				
				if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
					tabData.accept(VoidModItems.VOID_CYRSTAL_INGOT.get());
				}
				
				if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
					tabData.accept(VoidModItems.VOID_CRYSTAL_SWORD.get());
				}
	}
}
