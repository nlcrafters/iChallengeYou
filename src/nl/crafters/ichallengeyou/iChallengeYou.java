package nl.crafters.ichallengeyou;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Event;

public class iChallengeYou extends JavaPlugin{
	private final iChallengeYouBlockListener blockListener = new iChallengeYouBlockListener(this);
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		System.out.println("[icy] - Disabled! ");
	     
	}

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		 System.out.println("[icy] - Enabled! ");
	        PluginManager pm = getServer().getPluginManager();
	        pm.registerEvent(Event.Type.BLOCK_BREAK, blockListener, Event.Priority.Normal, this);		
	}
	

}
