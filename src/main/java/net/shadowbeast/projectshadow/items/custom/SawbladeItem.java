package net.shadowbeast.projectshadow.items.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SawbladeItem extends Item {
    int maxDamage;
    public SawbladeItem(int maxDamage) {
        super(new Properties().stacksTo(1));
        this.maxDamage = maxDamage;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        CompoundTag tag = pStack.getOrCreateTagElement("DamageData");
        int damage = tag.getInt("Damage");

        pTooltipComponents.add(Component.literal("Durability: "+(this.maxDamage-damage)+"/"+this.maxDamage));
    }
}
