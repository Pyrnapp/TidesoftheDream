//Made with Blockbench, by Daniel Astral (@TrisAstral)
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class jellyfish extends ModelBase {
	private final ModelRenderer upper_core;
	private final ModelRenderer lower_core;
	private final ModelRenderer lower_cover_0;
	private final ModelRenderer lower_cover_1;
	private final ModelRenderer lower_cover_2;
	private final ModelRenderer lower_cover_3;
	private final ModelRenderer upper_cover_0;
	private final ModelRenderer upper_cover_1;
	private final ModelRenderer upper_cover_2;
	private final ModelRenderer upper_cover_3;

	public jellyfish() {
		textureWidth = 32;
		textureHeight = 32;

		upper_core = new ModelRenderer(this);
		upper_core.setRotationPoint(0.0F, 14.0F, 0.0F);
		upper_core.cubeList.add(new ModelBox(upper_core, 0, 0, -3.0F, -1.0F, -3.0F, 6, 5, 6, 0.0F, false));

		lower_core = new ModelRenderer(this);
		lower_core.setRotationPoint(0.0F, 5.0F, 0.0F);
		upper_core.addChild(lower_core);
		lower_core.cubeList.add(new ModelBox(lower_core, 0, 11, -2.0F, -1.0F, -2.0F, 4, 4, 4, 0.0F, false));

		lower_cover_0 = new ModelRenderer(this);
		lower_cover_0.setRotationPoint(0.0F, -1.0F, -2.0F);
		setRotationAngle(lower_cover_0, -0.5236F, 0.0F, 0.0F);
		lower_core.addChild(lower_cover_0);
		lower_cover_0.cubeList.add(new ModelBox(lower_cover_0, 16, 11, -2.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F, false));

		lower_cover_1 = new ModelRenderer(this);
		lower_cover_1.setRotationPoint(2.0F, -1.0F, 0.0F);
		setRotationAngle(lower_cover_1, -0.5236F, -1.5708F, 0.0F);
		lower_core.addChild(lower_cover_1);
		lower_cover_1.cubeList.add(new ModelBox(lower_cover_1, 16, 11, -2.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F, false));

		lower_cover_2 = new ModelRenderer(this);
		lower_cover_2.setRotationPoint(0.0F, -1.0F, 2.0F);
		setRotationAngle(lower_cover_2, -0.5236F, 3.1416F, 0.0F);
		lower_core.addChild(lower_cover_2);
		lower_cover_2.cubeList.add(new ModelBox(lower_cover_2, 16, 11, -2.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F, false));

		lower_cover_3 = new ModelRenderer(this);
		lower_cover_3.setRotationPoint(-2.0F, -1.0F, 0.0F);
		setRotationAngle(lower_cover_3, -0.5236F, 1.5708F, 0.0F);
		lower_core.addChild(lower_cover_3);
		lower_cover_3.cubeList.add(new ModelBox(lower_cover_3, 16, 11, -2.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F, false));

		upper_cover_0 = new ModelRenderer(this);
		upper_cover_0.setRotationPoint(0.0F, -1.0F, -3.0F);
		setRotationAngle(upper_cover_0, -0.4363F, 0.0F, 0.0F);
		upper_core.addChild(upper_cover_0);
		upper_cover_0.cubeList.add(new ModelBox(upper_cover_0, 0, 19, -3.0F, 0.0F, 0.0F, 6, 5, 3, 0.0F, false));

		upper_cover_1 = new ModelRenderer(this);
		upper_cover_1.setRotationPoint(3.0F, -1.0F, 0.0F);
		setRotationAngle(upper_cover_1, -0.4363F, -1.5708F, 0.0F);
		upper_core.addChild(upper_cover_1);
		upper_cover_1.cubeList.add(new ModelBox(upper_cover_1, 0, 19, -3.0F, 0.0F, 0.0F, 6, 5, 3, 0.0F, false));

		upper_cover_2 = new ModelRenderer(this);
		upper_cover_2.setRotationPoint(0.0F, -1.0F, 3.0F);
		setRotationAngle(upper_cover_2, -0.4363F, 3.1416F, 0.0F);
		upper_core.addChild(upper_cover_2);
		upper_cover_2.cubeList.add(new ModelBox(upper_cover_2, 0, 19, -3.0F, 0.0F, 0.0F, 6, 5, 3, 0.0F, false));

		upper_cover_3 = new ModelRenderer(this);
		upper_cover_3.setRotationPoint(-3.0F, -1.0F, 0.0F);
		setRotationAngle(upper_cover_3, -0.4363F, 1.5708F, 0.0F);
		upper_core.addChild(upper_cover_3);
		upper_cover_3.cubeList.add(new ModelBox(upper_cover_3, 0, 19, -3.0F, 0.0F, 0.0F, 6, 5, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		upper_core.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}