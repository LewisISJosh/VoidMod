
package net.mcreator.;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.void.item.VoidStickItem;

import java.util.List;

import net.minecraft.world.entity.ai.attributes.Attributes;

import javax.annotation.Nullable;
public class VoidStickItem extends Item {
public VoidStickItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.COMMON)
);
}
@Override public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
super.appendHoverText(itemstack, world, list, flag);
}
}
