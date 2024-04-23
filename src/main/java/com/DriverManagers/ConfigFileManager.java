package com.DriverManagers;

import com.DataConfig.ReadConfig;

public class ConfigFileManager {

	private static final ConfigFileManager configFileManager = new ConfigFileManager();

	private static ReadConfig readConfig;

	private ConfigFileManager() {
	}

	public static ConfigFileManager getInstance() {
		return configFileManager;
	}

	/*
	 * Method to create object for read config
	 * 
	 * @return read config object
	 */
	public ReadConfig getReadConfig() {
		return (readConfig == null) ? new ReadConfig() : readConfig;
	}
}
