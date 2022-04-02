
package net.mcreator.comboompunktsucht.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.comboompunktsucht.init.ComboompunktsuchtModTabs;

public class CbpsGemrodItem extends Item {
	public CbpsGemrodItem() {
		super(new Item.Properties().tab(ComboompunktsuchtModTabs.TAB_CPBSCREATIVETAB).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
		setRegistryName("cbps_gemrod");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}
}
