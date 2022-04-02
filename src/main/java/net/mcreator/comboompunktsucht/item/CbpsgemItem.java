
package net.mcreator.comboompunktsucht.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.comboompunktsucht.procedures.CbpsgemWennEinGegenstandHergestelltOderGeschmolzenWurdeProcedure;
import net.mcreator.comboompunktsucht.init.ComboompunktsuchtModTabs;
import net.mcreator.comboompunktsucht.init.ComboompunktsuchtModItems;

public class CbpsgemItem extends Item {
	public CbpsgemItem() {
		super(new Item.Properties().tab(ComboompunktsuchtModTabs.TAB_CPBSCREATIVETAB).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
		setRegistryName("cbpsgem");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(ComboompunktsuchtModItems.CBPSGEM);
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

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		CbpsgemWennEinGegenstandHergestelltOderGeschmolzenWurdeProcedure.execute(entity);
	}
}
