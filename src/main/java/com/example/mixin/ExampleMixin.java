@Mixin(Entity.class)
public abstract class RotationMixin {
    @Inject(method = "getHeadYaw", at = @At("HEAD"), cancellable = true)
    private void onGetHeadYaw(CallbackInfoReturnable<Float> info) {
        if (Killaura.enabled && (Object)this == MinecraftClient.getInstance().player) {
            // Тут можно подменить Yaw для отрисовки модели от 3 лица
        }
    }
}
