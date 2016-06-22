package com.example.examplemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {
	public static final String MODID = "examplemod";
	public static final String VERSION = "1.0.0";

	@EventHandler
	public void preLoad(FMLPreInitializationEvent event) {
		// 配置Mod设置,添加合成表...另外CPW建议Mod间通讯(通过FMLInterModComms类完成)应当在此时进行.

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// some example code
		// 砖块和物品的初始化必须在这个阶段进行
		System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());

	}

	@EventHandler
	public void postLoad(FMLPostInitializationEvent event) {
		// CPW认为初始化后是供Mod间相互交互的时候,此时该载入的Mod都已经载入了,因此开发者们可以在此时为实现Mod间联动的操作做准备.
	}
}
