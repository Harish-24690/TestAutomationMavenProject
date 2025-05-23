package test;

import java.util.Properties;

import utilities.PropUtil;

public class ReadProperties {

	public static void main(String[] args) {
		
		Properties prop = PropUtil.readData("Config.properties");
		System.out.println(prop.getProperty("APP_URL"));
	}
}
