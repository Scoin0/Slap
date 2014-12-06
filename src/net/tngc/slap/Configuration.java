package net.tngc.slap;

import net.visualillusionsent.utils.PropertiesFile;

public class Configuration {
	PropertiesFile prop = new PropertiesFile("config/slap/slap.cfg");
	
	public void loadProperties(){
		
		prop.addHeaderLines("Welcome to the Slap Configuration File!");
		prop.addHeaderLines("As a warning please do not set the values over 5.0.");
		prop.addHeaderLines("Remember the player will take damage.");

		if(!prop.containsKey("Min_Double")){
			prop.setDouble("Min_Double", 0.5);
			prop.addComment("Min_Double", "The lower the number the lower the person flies.");
		}
		
		if(!prop.containsKey("Max_Double")){
			prop.setDouble("Max_Double", 3.0);
			prop.addComment("Max_Double", "The higher the number the higher the person flies.");
		}
		
		prop.save();
	}
}
