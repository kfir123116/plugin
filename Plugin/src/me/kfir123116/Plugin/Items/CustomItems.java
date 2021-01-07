package me.kfir123116.Plugin.Items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import me.kfir123116.Plugin.Plugin;


public class CustomItems implements Listener {
	private Plugin plugin = Plugin.getPlugin(Plugin.class);
	public void CustomRecipe(){	
		
		
// Crafting for FloopyUHC!
		
		
		
	//Crafting 1
//Recipe Bone
	//Crafting 2
//Recipe EndStone 
	//Crafting 3
//Recipe Obsidian
	//Crafting 4
//Recipe Anvil
	//Crafting 5
//Recipe Spawn_Wolf
	//Crafting 6
//Recipe Chain_Chestplate
	//Crafting 7
//Recipe Ender_Pearl
	//Crafting 8
//Recipe Twenty_Arrow
	//Crafting 9
//Recipe Iron_pickaxe_Efficiency_I
	//Crafting 10
//Recipe Iron_Axe_Efficiency_IV 
	//Crafting 11
//Recipe Stone_Sword_Knockback_II
	//Crafting 12
//Recipe Wooden_Sword_Fire_Aspect_I
	//Crafting 13
//Recipe Golden_Head
	//Crafting 14
//Recipe Diamond_Helmet_Protection_I_Unbreaking_I
	//Crafting 15
//Recipe Potion_Regeneration_II_Time_Twentytwo
	//Crafting 16
//Recipe Enchantment_Table
	//Crafting 17
//Recipe Spawn_Blaze
	//Crafting 18
//Recipe Nether_Star
	//Crafting 19
//Recipe Spawn_Skeleton
	//Crafting 20
//Recipe Bow_Flame_I
	//Crafting 21
//Recipe Enchanted_Book_FireAspect_I
	//Crafting 22
//Recipe Enchanted_Book_Sharpness_I
	//Crafting 23
//Recipe Enchanted_Book_Power_I
	//Crafting 24
//Recipe Enchanted_Book_Protection_I
	//Crafting 25
//Recipe Splash_Potion_Strength_Time_Two_Minutes_And_Fifteen_Seconds
	//Crafting 26
//Recipe Golden_Apple
	//Crafting 27
//Recipe Experience_Bottle
	//Crafting 28
//Recipe Apple
	//Crafting 29
//Recipe Fishing_Rod
	//Crafting 30
//Recipe Golden_Sworld_Sharpness_II
	//Crafting 31
//Recipe Potion_Strength_Time_Three_minutes
	//Crafting 32
//Recipe Iron_Sword
	//Crafting 33
//Recipe Iron_Helmet_Protection_I
	//Crafting 34
//Recipe Potion_Fire_Resistance_Time_Three_Minutes
	//Crafting 35
//Recipe Diamond_Sword_Sharpness_IV_Knockback_I
	//Crafting 36
//Recipe Diamond_Pickaxe_Efficiency_I_Fortune_II
	//Crafting 37
//Recipe Bow_Power_III_Punch_II
	//Crafting 38
//Recipe Diamond_Sword_Sharpness_IV
	//Crafting 39
//Recipe Diamond_Leggings_Protection_III_Thorns_II
	//Crafting 40
//Recipe Bone
	//Crafting 41!


		
		
//Recipe Name Recipe
//		ItemStack item = new ItemStack(Material.Item, 1);
//		ShapedRecipe Name Recipe = new ShapedRecipe(item7);
											
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//										
//		plugin.getServer().addRecipe(Name Recipe);	
		
			
		

	

//Bone
		ItemStack item1 = new ItemStack(Material.BONE, 3);
		ShapedRecipe Bone = new ShapedRecipe(item1);
		
		Bone.shape("   ","SBS"," R ");
		Bone.setIngredient('S', Material.SEEDS);
		Bone.setIngredient('B', Material.BONE);
		Bone.setIngredient('R', Material.REDSTONE_TORCH_ON);
		
		plugin.getServer().addRecipe(Bone);
	

		
//EndStone
		ItemStack item2 = new ItemStack(Material.ENDER_STONE, 1);
		ShapedRecipe EndStone = new ShapedRecipe(item2);
			
		EndStone.shape("   "," S "," T ");
		EndStone.setIngredient('S', Material.SAND);
		EndStone.setIngredient('T', Material.TORCH);
		
		plugin.getServer().addRecipe(EndStone);
		

		
//Obsidian
		ItemStack item3 = new ItemStack(Material.OBSIDIAN, 1);
		ShapedRecipe Obsidian = new ShapedRecipe(item3);
					
		Obsidian.shape("WL ","   ","   ");
		Obsidian.setIngredient('L', Material.LAVA_BUCKET);
		Obsidian.setIngredient('W', Material.WATER_BUCKET);	
				
		plugin.getServer().addRecipe(Obsidian);

		
		
		
		
//Anvil
		ItemStack item4 = new ItemStack(Material.ANVIL, 1);
		ShapedRecipe Anvil = new ShapedRecipe(item4);
					
		Anvil.shape("III","IBI","III");
		Anvil.setIngredient('B', Material.IRON_BLOCK);
		Anvil.setIngredient('I', Material.IRON_INGOT);
					
		plugin.getServer().addRecipe(Anvil);
		
		
		
//Spawn_Wolf
		ItemStack item5 = new ItemStack(Material.MONSTER_EGG);
		ShapedRecipe Spawn_Wolf = new ShapedRecipe(item5);
							
		Spawn_Wolf.shape("BBB","RER","BBB");
		Spawn_Wolf.setIngredient('B', Material.BONE);
		Spawn_Wolf.setIngredient('R', Material.RED_ROSE);
		Spawn_Wolf.setIngredient('E', Material.ENDER_PEARL);
						
		plugin.getServer().addRecipe(Spawn_Wolf);
		
		
		
//Chain_Chestplate
		ItemStack item6 = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
		ShapedRecipe Chain_Chestplate = new ShapedRecipe(item6);
									
		Chain_Chestplate.shape("S S","SSS","SSS");
		Chain_Chestplate.setIngredient('S', Material.COBBLESTONE);
								
		plugin.getServer().addRecipe(Chain_Chestplate);
		
		

//Recipe Ender_Pearl
		ItemStack item7 = new ItemStack(Material.ENDER_PEARL, 1);
		ShapedRecipe Ender_Pearl = new ShapedRecipe(item7);
									
		Chain_Chestplate.shape(" I ","IDI"," I ");
		Chain_Chestplate.setIngredient('D', Material.DIAMOND);
		Chain_Chestplate.setIngredient('I', Material.IRON_INGOT);
								
		plugin.getServer().addRecipe(Ender_Pearl);
		
		
		
//Recipe Twenty_Arrow
		ItemStack item8 = new ItemStack(Material.ARROW, 20);
		ShapedRecipe Twenty_Arrow = new ShapedRecipe(item8);
											
		Twenty_Arrow.shape("FFF","AAA","SSS");
		Twenty_Arrow.setIngredient('S', Material.STICK);
		Twenty_Arrow.setIngredient('F', Material.FLINT);
		Twenty_Arrow.setIngredient('A', Material.ARROW);
										
		plugin.getServer().addRecipe(Twenty_Arrow);
		
		
		
//Recipe Iron_pickaxe_Efficiency_I
		ItemStack item9 = new ItemStack(Material.IRON_PICKAXE, 1);
		ShapedRecipe Iron_pickaxe_Efficiency_I = new ShapedRecipe(item9);
											
		Iron_pickaxe_Efficiency_I.shape("ICI"," S "," S ");
		Iron_pickaxe_Efficiency_I.setIngredient('S', Material.STICK);
		Iron_pickaxe_Efficiency_I.setIngredient('I', Material.IRON_ORE);
		Iron_pickaxe_Efficiency_I.setIngredient('C', Material.COAL);
		Iron_pickaxe_Efficiency_I.getResult().addEnchantment(Enchantment.DIG_SPEED, 1);		
										
		plugin.getServer().addRecipe(Iron_pickaxe_Efficiency_I);
		
		
		
//Recipe Name Recipe
//		ItemStack item10 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item10);
//											
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//										
//		plugin.getServer().addRecipe(Name Recipe);
	
		
		
//Recipe Name Recipe
//		ItemStack item11 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item11);
//											
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//										
//		plugin.getServer().addRecipe(Name Recipe);
		
		
		
		
//Recipe Name Recipe
//		ItemStack item12 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item12);
//													
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//												
//		plugin.getServer().addRecipe(Name Recipe);
				
				
				
//Recipe Name Recipe
//		ItemStack item13 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item13);
//													
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//												
//		plugin.getServer().addRecipe(Name Recipe);
				
				
				
//Recipe Name Recipe
///		ItemStack item14 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item14);
//													
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//												
//		plugin.getServer().addRecipe(Name Recipe);
			
				
				
//Recipe Name Recipe
//		ItemStack item15 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item15);
//													
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//												
//		plugin.getServer().addRecipe(Name Recipe);
		
		
		
//Recipe Name Recipe
//		ItemStack item16 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item16);
//													
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//												
//		plugin.getServer().addRecipe(Name Recipe);
				
				
				
//Recipe Name Recipe
//		ItemStack item17 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item17);
//													
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//												
//		plugin.getServer().addRecipe(Name Recipe);
			
				
				
//Recipe Name Recipe
//		ItemStack item18 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item18);
//													
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//												
//		plugin.getServer().addRecipe(Name Recipe);
				
				
				
				
//Recipe Name Recipe
//		ItemStack item19 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item19);
//															
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//														
//		plugin.getServer().addRecipe(Name Recipe);
						
						
						
//Recipe Name Recipe
//		ItemStack item20 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item20);
//															
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//														
//		plugin.getServer().addRecipe(Name Recipe);
						
						
						
//Recipe Name Recipe
//		ItemStack item21 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item21);
//															
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//														
//		plugin.getServer().addRecipe(Name Recipe);
					
						
						
//Recipe Name Recipe
//		ItemStack item22 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item22);
//															
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//														
//		plugin.getServer().addRecipe(Name Recipe);
		
		
		
//Recipe Name Recipe
//		ItemStack item23 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item23);
//													
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//												
//		plugin.getServer().addRecipe(Name Recipe);
				
				
				
//Recipe Name Recipe
//		ItemStack item24 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item24);
//													
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//												
//		plugin.getServer().addRecipe(Name Recipe);
			
				
				
//Recipe Name Recipe
//		ItemStack item25 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item25);
//													
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//												
//		plugin.getServer().addRecipe(Name Recipe);
				
				
				
				
//Recipe Name Recipe
//		ItemStack item26 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item26);
//															
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//														
//		plugin.getServer().addRecipe(Name Recipe);
						
						
						
//Recipe Name Recipe
//		ItemStack item27 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item27);
//															
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//														
//		plugin.getServer().addRecipe(Name Recipe);
						
						
						
//Recipe Name Recipe
//		ItemStack item28 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item28);
//															
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//														
//		plugin.getServer().addRecipe(Name Recipe);
					
						
						
//Recipe Name Recipe
//		ItemStack item29 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item29);
//															
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//														
//		plugin.getServer().addRecipe(Name Recipe);
				
				
				
//Recipe Name Recipe
//		ItemStack item30 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item30);
//															
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//														
//		plugin.getServer().addRecipe(Name Recipe);
						
						
						
//Recipe Name Recipe
//		ItemStack item31 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item31);
//															
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//														
//		plugin.getServer().addRecipe(Name Recipe);
					
						
						
//Recipe Name Recipe
//		ItemStack item32 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item32);
//															
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//														
//		plugin.getServer().addRecipe(Name Recipe);
						
						
						
						
//Recipe Name Recipe
//		ItemStack item33 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item33);
//																	
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//																
//		plugin.getServer().addRecipe(Name Recipe);
								
								
								
//Recipe Name Recipe
//		ItemStack item34 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item34);
//																	
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//																
//		plugin.getServer().addRecipe(Name Recipe);
								
								
								
//Recipe Name Recipe
//		ItemStack item35 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item35);
//																	
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//																
//		plugin.getServer().addRecipe(Name Recipe);
							
								
								
//Recipe Name Recipe
///		ItemStack item36 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item36);
																	
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//																
//		plugin.getServer().addRecipe(Name Recipe);
		
		
		
//Recipe Name Recipe
//		ItemStack item37 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item33);
//																			
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//																		
//		plugin.getServer().addRecipe(Name Recipe);
										
										
										
//Recipe Name Recipe
//		ItemStack item38 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item38);
//																			
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//																		
//		plugin.getServer().addRecipe(Name Recipe);
										
										
										
//Recipe Name Recipe
//		ItemStack item39 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item39);
//																			
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//																		
//		plugin.getServer().addRecipe(Name Recipe);
									
										
										
//Recipe Name Recipe
//		ItemStack item40 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item40);
																			
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//																		
//		plugin.getServer().addRecipe(Name Recipe);

		
		
//Recipe Name Recipe!
//		ItemStack item41 = new ItemStack(Material.Item, 1);
//		ShapedRecipe Ender_Pearl = new ShapedRecipe(item41);
//																					
//		Item.shape("   ","   ","   ");
//		Item.setIngredient(' ', Material.Item);
//		Item.setIngredient(' ', Material.Item);
//																				
//		plugin.getServer().addRecipe(Name Recipe);

				
				
			}
		
	}
		
	

		
		


