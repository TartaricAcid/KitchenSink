package com.theundertaker11.kitchensink.ksitems;

import java.util.List;

import com.theundertaker11.kitchensink.KitchenSink;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

public class Wand extends Item {

	public Wand(String name) {
		this.setCreativeTab(KitchenSink.KStab);
		this.setMaxDamage(0);
		this.setFull3D();
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int metadata, boolean bool)
	{
		
	}
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
		tooltip.add("The wand of destinnnny");
    }
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		stack.setItemDamage(0);
		return false;
    }
	
	
	
	/*      This shoots a fireball where the player is looking
			if (!world.isRemote) 
			{
	            Vec3 v3 = player.getLook(1);
	            EntitySmallFireball smallfireball = new EntitySmallFireball(world, player.posX, player.posY + player.eyeHeight, player.posZ, v3.xCoord, v3.yCoord, v3.zCoord);
	            smallfireball.shootingEntity = player;
	            world.playSoundAtEntity(player, "mob.ghast.fireball", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	            world.spawnEntityInWorld(smallfireball);
	        }
	        */
}
