package net.redofdoom.experiment.item.custom;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ModSwordItem extends SwordItem {
    public ModSwordItem(Tier pTier, int pAttackDamage, float pAttackSpeed) {
        super(pTier, new Properties().attributes(createAttributes(pTier, pAttackDamage, pAttackSpeed)));
    }
}
