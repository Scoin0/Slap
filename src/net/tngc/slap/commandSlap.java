package net.tngc.slap;

import java.util.Random;

import net.canarymod.Canary;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.commandsys.Command;
import net.canarymod.commandsys.CommandListener;
import net.visualillusionsent.utils.PropertiesFile;

public class commandSlap implements CommandListener{
	Random random = new Random();

	@Command(aliases={"slap"}, description="Slap a person into the air!", permissions={"slap.command.slap"}, toolTip="/slap <player>", min=2)
	  public void slap(MessageReceiver caller, String[] parameters){
	    Player targetPlayer = Canary.getServer().matchPlayer(parameters[1]);
	    PropertiesFile prop = new PropertiesFile("config/slap/slap.cfg");
	    
	    double start = prop.getDouble("Min_Double");
	    double end = prop.getDouble("Max_Double");
	    double n = random.nextDouble();
	    double n1 = random.nextDouble();
	    double result = start + (n * (end - start));
	    double result1 = start + (n1 * (end - start));
	    
	    if(targetPlayer != null){
		    targetPlayer.setMotionX(result);
		    targetPlayer.setMotionY(result1);
		    
		    targetPlayer.message("§cYou've been slapped by §a" + caller.getName() + " §c!");
		    //targetPlayer.message("§cThe power of the slap was §a" + result + " §cfor X,§a" + result1 + " §cfor Yand §a" + result2 + " §cfor Z!"); 
		    //Above is for debugging.
	    }else{
	    	caller.notice("The player you are trying to slap is not online.");
	    }

	  }
}
