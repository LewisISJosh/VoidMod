
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.void.item.Void_CyrstalIngotItem;
import net.mcreator.void.item.VoidStickItem;
import net.mcreator.void.item.VoidCrystalSwordItem;
import net.mcreator.void.init.VoidModItems;
import net.mcreator.void.init.VoidModBlocks;
import net.mcreator.void.VoidMod;
public class VoidModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VoidMod.MODID);
				public static final RegistryObject<Item> VOID_CYRSTAL_BLOCK = block(VoidModBlocks.VOID_CYRSTAL_BLOCK);
				public static final RegistryObject<Item> VOID_CYRSTAL_ORE = block(VoidModBlocks.VOID_CYRSTAL_ORE);
			public static final RegistryObject<Item> VOID_CYRSTAL_INGOT =
				REGISTRY.register("void_cyrstal_ingot", () -> new Void_CyrstalIngotItem());
			public static final RegistryObject<Item> VOID_CRYSTAL_SWORD =
				REGISTRY.register("void_crystal_sword", () -> new VoidCrystalSwordItem());
				public static final RegistryObject<Item> VOID_TREE = block(VoidModBlocks.VOID_TREE);
				public static final RegistryObject<Item> VOID_TREE_LEAVES = block(VoidModBlocks.VOID_TREE_LEAVES);
			public static final RegistryObject<Item> VOID_STICK =
				REGISTRY.register("void_stick", () -> new VoidStickItem());
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
