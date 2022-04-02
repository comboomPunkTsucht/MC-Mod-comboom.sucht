
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.comboompunktsucht.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ComboompunktsuchtModTabs {
	public static CreativeModeTab TAB_CPBSCREATIVETAB;

	public static void load() {
		TAB_CPBSCREATIVETAB = new CreativeModeTab("tabcpbscreativetab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ComboompunktsuchtModBlocks.CBPSGEMBLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
