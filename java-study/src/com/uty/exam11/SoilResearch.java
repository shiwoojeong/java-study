package com.uty.exam11;

import java.util.StringTokenizer;

public class SoilResearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] elements = getElements(args[0]);
		printElement(elements);
		
		double[][] samples = getSamples(args[1]);
		printSamples(samples);
	}

	public static String[] getElements(String inputElementString) {
		String[] arr = inputElementString.split(",");
		return arr;
	}

	public static double[][] getSamples(String inputSampleString) {
	    String[] rows = inputSampleString.split("<>");
	    
	    double[][] arr2 = new double[rows.length][];

	    for (int i = 0; i < rows.length; i++) {
	        String[] columns = rows[i].split(",");
	        
	        arr2[i] = new double[columns.length];
	                                   
	        for (int j = 0; j < columns.length; j++) {
	            arr2[i][j] = Double.parseDouble(columns[j]);
	        }
	    }
	    return arr2;
	}
	
	public static void printElement(String[] array) {
		for(String token: array) {
			System.out.println(token);
		}
	}
	
	
	
	public static void printSamples(double[][] samples) {
		for (double[] row : samples) {
			for (double element : row) {
				System.out.printf("%2.1f  ", element);
			}
			System.out.println();
		}
	}
}
