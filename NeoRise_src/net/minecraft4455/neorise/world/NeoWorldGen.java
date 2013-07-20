package net.minecraft4455.neorise.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class NeoWorldGen implements IWorldGenerator {
	
	@Override
	public void generate(final Random random, final int chunkX,
	        final int chunkZ, final World world,
	        final IChunkProvider chunkGenerator,
	        final IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
			case 1:
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
			case -1:
				generateNether(world, random, chunkX * 16, chunkZ * 16);
		}
	}
	
	private void generateEnd(final World world, final Random random, final int chunkX, final int chunkZ) {

		
		
	}
	
	private void generateNether(final World world, final Random random, final int chunkX, final int chunkZ) {

		
		
	}
	
	private void generateSurface(final World world, final Random random, final int chunkX, final int chunkZ) {
		
		
		
	}
	
}