
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.void.init.VoidModBlocks;
import net.mcreator.void.block.Void_CyrstalOreBlock;
import net.mcreator.void.block.Void_CyrstalBlockBlock;
import net.mcreator.void.VoidMod;
public class VoidModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VoidMod.MODID);
			public static final RegistryObject<Block> VOID_CYRSTAL_BLOCK =
				REGISTRY.register("void_cyrstal_block", () -> new Void_CyrstalBlockBlock());
			public static final RegistryObject<Block> VOID_CYRSTAL_ORE =
				REGISTRY.register("void_cyrstal_ore", () -> new Void_CyrstalOreBlock());
}
