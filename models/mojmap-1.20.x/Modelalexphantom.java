// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelalexphantom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "alexphantom"), "main");
	private final ModelPart body;
	private final ModelPart wing0;
	private final ModelPart wingtip0;
	private final ModelPart wing1;
	private final ModelPart wingtip1;
	private final ModelPart head;
	private final ModelPart tail;
	private final ModelPart tailtip;

	public Modelalexphantom(ModelPart root) {
		this.body = root.getChild("body");
		this.wing0 = root.getChild("wing0");
		this.wingtip0 = root.getChild("wingtip0");
		this.wing1 = root.getChild("wing1");
		this.wingtip1 = root.getChild("wingtip1");
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
		this.tailtip = root.getChild("tailtip");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 8).addBox(
				-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wing0 = body.addOrReplaceChild("wing0",
				CubeListBuilder.create().texOffs(23, 12).addBox(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.0F, -8.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition wingtip0 = wing0
				.addOrReplaceChild("wingtip0",
						CubeListBuilder.create().texOffs(16, 24).addBox(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition wing1 = body.addOrReplaceChild("wing1",
				CubeListBuilder.create().texOffs(23, 12).mirror()
						.addBox(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -2.0F, -8.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition wingtip1 = wing1.addOrReplaceChild("wingtip1",
				CubeListBuilder.create().texOffs(16, 24).mirror()
						.addBox(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -2.0F,
				-5.0F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -7.0F));

		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(3, 20).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tailtip = tail
				.addOrReplaceChild("tailtip",
						CubeListBuilder.create().texOffs(4, 29).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.5F, 6.0F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}