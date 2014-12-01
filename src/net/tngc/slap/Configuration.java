package net.tngc.slap;

import java.io.File;

import net.visualillusionsent.utils.PropertiesFile;

public class Configuration {
	
	File dir = new File("config/Slap/");
	PropertiesFile prop = new PropertiesFile("config/slap/slap.cfg");
	
	public void loadProperties(){
		
		if(!dir.exists()){
			dir.mkdir();
		}
		
		prop.addHeaderLines("Welcome to the Slap Configuration File!");
		prop.addHeaderLines("As a warning please do not set the values over 10.0.");
		
		if(!prop.containsKey("Min_Double")){
			prop.setDouble("Min_Double", 1.0);
			prop.addComment("Min_Double", "The lower the number the lower the person flies.");
		}
		
		if(!prop.containsKey("Max_Double")){
			prop.setDouble("Max_Double", 5.0);
			prop.addComment("Max_Double", "The higher the number the higher the person flies.");
		}

		prop.save();
	}
}
