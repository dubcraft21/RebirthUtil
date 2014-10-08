package dubcraft21.main;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import dubcraft21.command.ClientCommandManager;

@Mod(modid = "rebirthUtil")
public class Main {
	public ClientCommandManager clientCMDM;
	public Main() {
		clientCMDM = new ClientCommandManager();
	}
	
}
