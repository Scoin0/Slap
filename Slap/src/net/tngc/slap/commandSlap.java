package net.tngc.slap;

import net.canarymod.Canary;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.commandsys.Command;
import net.canarymod.commandsys.CommandListener;

public class commandSlap implements CommandListener{

	@Command(aliases={"slap"}, description="Slap a person into the air!", permissions={"slap.command.slap"}, toolTip="/slap <player>", min=2)
	  public void slap(MessageReceiver caller, String[] parameters){
	    Player player = (Player)caller;
	    Player targetPlayer = Canary.getServer().matchPlayer(parameters[1]);
	    
	    //targetPlayer.setMotionX(1.5);
	   // targetPlayer.setMotionY(1.0);
	    
	    targetPlayer.message("§cYou've been slapped by §a" + player.getName() + " §c!");
	  }
}
