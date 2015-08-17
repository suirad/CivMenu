package vg.civcraft.mc.civmenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.bukkit.command.PluginCommand;
import org.bukkit.help.HelpTopic;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class CivMenu extends JavaPlugin {
	
	private TOSManager tosManager;
	
	public void onEnable() {
		tosManager = new TOSManager(this);
		getServer().getPluginManager().registerEvents(new TOSListener(), this);
		
		
		//THIS SHOULDN'T BE HERE
//		CommandHandler commandHandler = new CommandHandler(this);
//		for (String command : getDescription().getCommands().keySet()) {
//			getCommand(command).setExecutor(commandHandler);
//		}
//		
//		Map<Plugin, List<HelpTopic>> commands = new HashMap<Plugin, List<HelpTopic>>();
//		for (HelpTopic cmdLabel : getServer().getHelpMap().getHelpTopics()) {
//			PluginCommand pc = getServer().getPluginCommand(cmdLabel.getName());
//			if(commands.containsKey(pc.getPlugin())){
//				commands.get(pc.getPlugin()).add(cmdLabel);
//			} else {
//				commands.put(pc.getPlugin(), new ArrayList<HelpTopic>());
//			}
//		}
	}
	
    public void onDisable() { 

    }

	public TOSManager getTosManager() {
		return tosManager;
	}
    
}
