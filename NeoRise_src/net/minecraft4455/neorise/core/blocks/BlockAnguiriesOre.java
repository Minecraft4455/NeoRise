package net.minecraft4455.neorise.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAnguiriesOre extends Block {

	public BlockAnguiriesOre(int id, Material par2) {
		
		super(id, par2);
		this.setHardness(2.4F);
		this.setResistance(2F);
		this.setUnlocalizedName("AnguiriesOre");
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("minecraft4455:AnguiriesOre");
    }
	
}
