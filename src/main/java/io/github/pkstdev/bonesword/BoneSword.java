package io.github.pkstdev.bonesword;

import bta.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.src.Item;

public class BoneSword implements Mod {
    public static Item BONE_SWORD;

    @Override
    public void init(Minecraft minecraft) {
        BONE_SWORD = new ItemBoneSword(135, 6).setIconCoord(1, 13).setItemName("bonesword");
        System.out.println("[BoneSword] Initialized.");
    }

    @Override
    public void update() {
    }

    @Override
    public void tick() {
    }
}
