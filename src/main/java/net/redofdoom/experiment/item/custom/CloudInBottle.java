package net.redofdoom.experiment.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CloudInBottle extends Item {
    public CloudInBottle(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if(!pLevel.isClientSide()){
            pPlayer.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 100));
            pPlayer.getItemInHand(pUsedHand).hurtAndBreak(1, pPlayer, EquipmentSlot.MAINHAND);
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
