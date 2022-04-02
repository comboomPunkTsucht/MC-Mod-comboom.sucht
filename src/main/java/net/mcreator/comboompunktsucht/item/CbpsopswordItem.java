
package net.mcreator.comboompunktsucht.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.comboompunktsucht.init.ComboompunktsuchtModTabs;
import net.mcreator.comboompunktsucht.init.ComboompunktsuchtModItems;

public class CbpsopswordItem extends SwordItem {
	public CbpsopswordItem() {
		super(new Tier() {
			public int getUses() {
				return 100000;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 99998f;
			}

			public int getLevel() {
				return 100;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ComboompunktsuchtModItems.CBPSGEM));
			}
		}, 3, -3.8f, new Item.Properties().tab(ComboompunktsuchtModTabs.TAB_CPBSCREATIVETAB).fireResistant());
		setRegistryName("cbpsopsword");
	}

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
