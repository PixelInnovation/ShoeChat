package name.modid.mixin;



import net.minecraft.client.gui.hud.ChatHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(ChatHud.class)
public class MixinChatHud {
	@Inject(method = "isChatHidden", at = @At("HEAD"), cancellable = true)
	public void hideChat(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}
}
