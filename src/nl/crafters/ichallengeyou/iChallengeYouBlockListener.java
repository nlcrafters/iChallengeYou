package nl.crafters.ichallengeyou;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockListener;

public class iChallengeYouBlockListener extends BlockListener {

	 public static iChallengeYou plugin;
	 
	 public iChallengeYouBlockListener(iChallengeYou instance) {
		 plugin = instance;
	 }
	 @Override
	    public void onBlockBreak(BlockBreakEvent event) {
	        Player ply = (Player) event.getPlayer();
	        event.getBlock().getType();
			if (event.getBlock().getType().equals(Material.SAND) ) {
				ply.sendMessage("Broken sand!");
	        }
			if (event.getBlock().getType().equals(Material.COBBLESTONE) ) {
				ply.sendMessage("Broken Cobble!");
				event.setCancelled(true);
				
	        }
	        
	        
	 }
	 
	 
	 
}
