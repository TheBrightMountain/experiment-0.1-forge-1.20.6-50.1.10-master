package net.redofdoom.experiment.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class SpeedboostBlock extends Block {
    public SpeedboostBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (pEntity instanceof Player pPlayer)
        {
            pPlayer.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2,1));
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
