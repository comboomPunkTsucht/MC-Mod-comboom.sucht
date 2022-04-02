package net.mcreator.comboompunktsucht.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.comboompunktsucht.init.ComboompunktsuchtModItems;

import java.util.function.Supplier;
import java.util.Map;

public class CbpsgemWennEinGegenstandHergestelltOderGeschmolzenWurdeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(ComboompunktsuchtModItems.CBPSGEM);
			_setstack.setCount(64);
			((Slot) _slots.get(16)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
	}
}
