package net.mcreator.comboompunktsucht.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.comboompunktsucht.entity.CpbsmcpeapsHDEntity;
import net.mcreator.comboompunktsucht.client.model.Modelsteve;

public class CpbsmcpeapsHDRenderer extends MobRenderer<CpbsmcpeapsHDEntity, Modelsteve<CpbsmcpeapsHDEntity>> {
	public CpbsmcpeapsHDRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CpbsmcpeapsHDEntity entity) {
		return new ResourceLocation("comboompunktsucht:textures/4b64a973ed5c027b.png");
	}
}
