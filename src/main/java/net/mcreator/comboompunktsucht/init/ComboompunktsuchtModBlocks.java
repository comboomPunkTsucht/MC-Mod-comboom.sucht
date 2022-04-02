
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.comboompunktsucht.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.comboompunktsucht.block.CbpsgemoreBlock;
import net.mcreator.comboompunktsucht.block.CbpsgemblockBlock;
import net.mcreator.comboompunktsucht.block.CbpsdimensionPortalBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ComboompunktsuchtModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block CBPSGEMORE = register(new CbpsgemoreBlock());
	public static final Block CBPSGEMBLOCK = register(new CbpsgemblockBlock());
	public static final Block CBPSDIMENSION_PORTAL = register(new CbpsdimensionPortalBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
