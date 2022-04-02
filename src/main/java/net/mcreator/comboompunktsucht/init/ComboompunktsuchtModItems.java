
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.comboompunktsucht.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.comboompunktsucht.item.CpbsopruestungItem;
import net.mcreator.comboompunktsucht.item.CbpsopswordItem;
import net.mcreator.comboompunktsucht.item.CbpsgemItem;
import net.mcreator.comboompunktsucht.item.CbpsdimensionItem;
import net.mcreator.comboompunktsucht.item.CbpsGemrodItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ComboompunktsuchtModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item CBPSGEMORE = register(ComboompunktsuchtModBlocks.CBPSGEMORE, ComboompunktsuchtModTabs.TAB_CPBSCREATIVETAB);
	public static final Item CBPSGEMBLOCK = register(ComboompunktsuchtModBlocks.CBPSGEMBLOCK, ComboompunktsuchtModTabs.TAB_CPBSCREATIVETAB);
	public static final Item CBPSGEM = register(new CbpsgemItem());
	public static final Item CBPS_GEMROD = register(new CbpsGemrodItem());
	public static final Item CBPSDIMENSION = register(new CbpsdimensionItem());
	public static final Item CBPSOPSWORD = register(new CbpsopswordItem());
	public static final Item CPBSOPRUESTUNG_HELMET = register(new CpbsopruestungItem.Helmet());
	public static final Item CPBSOPRUESTUNG_CHESTPLATE = register(new CpbsopruestungItem.Chestplate());
	public static final Item CPBSOPRUESTUNG_LEGGINGS = register(new CpbsopruestungItem.Leggings());
	public static final Item CPBSOPRUESTUNG_BOOTS = register(new CpbsopruestungItem.Boots());
	public static final Item CPBSMCPEAPS_HD = register(new SpawnEggItem(ComboompunktsuchtModEntities.CPBSMCPEAPS_HD, -16711936, -65536,
			new Item.Properties().tab(ComboompunktsuchtModTabs.TAB_CPBSCREATIVETAB)).setRegistryName("cpbsmcpeaps_hd_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
