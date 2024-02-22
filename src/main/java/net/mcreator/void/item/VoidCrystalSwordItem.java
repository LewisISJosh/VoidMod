
package net.mcreator.;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.void.item.VoidCrystalSwordItem;

import java.util.List;

import net.minecraft.world.entity.ai.attributes.Attributes;
public class VoidCrystalSwordItem extends PickaxeItem {
public VoidCrystalSwordItem () {
super( new Tier() {
public int getUses() {
return 100;
}
public float getSpeed() {
return 4f;
}
public float getAttackDamageBonus() {
return 2f;
}
public int getLevel() {
return 1;
}
public int getEnchantmentValue() {
return 2;
}
public Ingredient getRepairIngredient() {
return Ingredient.of();
}
},
1,-3f,
new Item.Properties()
);
}
@Override public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
super.appendHoverText(itemstack, world, list, flag);
}
@Override @OnlyIn(Dist.CLIENT) public boolean isFoil(ItemStack itemstack) {
return true;
}
}
