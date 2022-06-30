package io.github.pkstdev.bonesword;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.ItemToolSword;
import net.minecraft.src.material.ToolMaterial;

public class ItemBoneSword extends ItemToolSword {
    private final int weaponDamage;
    public static final ToolMaterial BONE = new ToolMaterial().setDurability(256).setEfficiency(6.0F, 8.0F).setMiningLevel(2);

    public ItemBoneSword(int i, int weaponDamage) {
        super(i, BONE);
        this.weaponDamage = weaponDamage;
    }

    @Override
    public int getDamageVsEntity(Entity entity) {
        if (entity instanceof EntityLiving living) {
            return this.weaponDamage + (living.prevHealth / 20);
        }
        return this.weaponDamage;
    }
}
