package com.uty.exam04;

public class Desktop {
	private static String cpu = "8 core";
	private static String memory = "RAM 32GB";
	private static String video = "RTX 3060 8GB";
	private static String feature;
	
	//static block
	static {	
		feature = cpu + "/" + memory + "/" + video;
	}

	public static String getFeature() {
		return feature;
	}
}
