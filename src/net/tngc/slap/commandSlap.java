package net.tngc.slap;

import java.util.Random;

import net.canarymod.Canary;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.commandsys.Command;
import net.canarymod.commandsys.CommandListener;

public class commandSlap implements CommandListener{
	
	Random random = new Random();

	@Command(aliases={"slap"}, description="Slap a person into the air!", permissions={"slap.command.slap"}, toolTip="/slap <player>", min=2)
	  public void slap(MessageReceiver caller, String[] parameters){
	    Player player = (Player)caller;
	    Player targetPlayer = Canary.getServer().matchPlayer(parameters[1]);
	    
	    double start = -5;
	    double end = 5;
	    double n = random.nextDouble();
	    double n1 = random.nextDouble();
	    double result = start + (n * (end - start));
	    double result1 = start + (n1 * (end - start));


	    targetPlayer.setMotionX(result);
	    targetPlayer.setMotionY(result1);
	    
	    //targetPlayer.setMotionX(1.5);
	   // targetPlayer.setMotionY(1.0);
	    
	    targetPlayer.message("�cYou've been slapped by �a" + player.getName() + " �c!");
	    targetPlayer.message("�cThe power of the slap was �a" + result + "�cand �a" + result1 + "�c!");
	  }
}
