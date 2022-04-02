
package net.mcreator.comboompunktsucht.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.comboompunktsucht.procedures.CpbsopruestungTickEreignisProcedure;
import net.mcreator.comboompunktsucht.init.ComboompunktsuchtModTabs;
import net.mcreator.comboompunktsucht.client.model.Modelsteve;

import java.util.Map;
import java.util.Collections;

public abstract class CpbsopruestungItem extends ArmorItem {
	public CpbsopruestungItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1000;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 1;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "cpbsopruestung";
			}

			@Override
			public float getToughness() {
				return 9f;
			}

			@Override
			public float getKnockbackResistance() {
				return 3f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CpbsopruestungItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ComboompunktsuchtModTabs.TAB_CPBSCREATIVETAB).fireResistant());
			setRegistryName("cpbsopruestung_helmet");
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("head", new Modelsteve(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsteve.LAYER_LOCATION)).Head, "hat",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "comboompunktsucht:textures/4b64a973ed5c027b.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CpbsopruestungTickEreignisProcedure.execute(entity);
		}
	}

	public static class Chestplate extends CpbsopruestungItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ComboompunktsuchtModTabs.TAB_CPBSCREATIVETAB).fireResistant());
			setRegistryName("cpbsopruestung_chestplate");
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("body",
							new Modelsteve(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsteve.LAYER_LOCATION)).Body, "left_arm",
							new Modelsteve(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsteve.LAYER_LOCATION)).LeftArm, "right_arm",
							new Modelsteve(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsteve.LAYER_LOCATION)).RightArm, "head",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "comboompunktsucht:textures/4b64a973ed5c027b.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CpbsopruestungTickEreignisProcedure.execute(entity);
		}
	}

	public static class Leggings extends CpbsopruestungItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ComboompunktsuchtModTabs.TAB_CPBSCREATIVETAB).fireResistant());
			setRegistryName("cpbsopruestung_leggings");
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("left_leg", new Modelsteve(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsteve.LAYER_LOCATION)).LeftLeg,
									"right_leg",
									new Modelsteve(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsteve.LAYER_LOCATION)).RightLeg, "head",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "comboompunktsucht:textures/4b64a973ed5c027b.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CpbsopruestungTickEreignisProcedure.execute(entity);
		}
	}

	public static class Boots extends CpbsopruestungItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ComboompunktsuchtModTabs.TAB_CPBSCREATIVETAB).fireResistant());
			setRegistryName("cpbsopruestung_boots");
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("left_leg", new Modelsteve(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsteve.LAYER_LOCATION)).LeftLeg,
									"right_leg",
									new Modelsteve(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsteve.LAYER_LOCATION)).RightLeg, "head",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "comboompunktsucht:textures/gfhjk_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CpbsopruestungTickEreignisProcedure.execute(entity);
		}
	}
}
