package com.cucumber.framework.helper.Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cucumber.framework.utility.ResourceHelper;

/**
 * 
 * @author bsingh5
 *
 */
@SuppressWarnings("rawtypes")
public class LoggerHelper {

	private static boolean root = false;

	public static Logger getLogger(Class clas) {
		if (root) {
			return Logger.getLogger(clas);
		}
        System.out.println(ResourceHelper.getResourcePath("configfile/log4j.properties"));
		PropertyConfigurator.configure(ResourceHelper.getResourcePath("configfile/log4j.properties"));
		root = true;
		return Logger.getLogger(clas);
	}
	
	public static void main(String[] args) {
		LoggerHelper.getLogger(LoggerHelper.class);
	}

}
