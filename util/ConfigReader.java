package com.brainmentors.chatapp.util;

import java.util.ResourceBundle;

public class ConfigReader {
	ConfigReader(){}
private static ResourceBundle rb=ResourceBundle.getBundle("config");
public static String getValue(String key) {
	return rb.getString(key);
}
}
