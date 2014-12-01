package net.tngc.slap;

import net.canarymod.Canary;
import net.canarymod.commandsys.CommandDependencyException;
import net.canarymod.plugin.Plugin;

public class Slap extends Plugin{
	
	 public static String Plugin_Name = "Slap ";
	 public static String Plugin_Version = "1.2 ";
	 public static String Plugin_Author = "Scoin0 ";

	@Override
	public boolean enable() {
		getLogman().info(Plugin_Name + Plugin_Version + "created by " + Plugin_Author + "has been Enabled!");
		
		try{Canary.commands().registerCommands(new commandSlap(), this, false);
		}catch(CommandDependencyException e){ getLogman().error("Error with Command: ", e);}
		
		new Configuration().loadProperties();
		return true;
	}
	
	@Override
	public void disable() {
		getLogman().info(Plugin_Name + "has been Disabled!");
	}
}
