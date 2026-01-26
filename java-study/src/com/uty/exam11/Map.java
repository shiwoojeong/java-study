package com.uty.exam11;

public class Map {
	public static void main(String[] args) {
		int map1[] = { 46, 33, 33, 22, 31, 50 };
		int map2[] = { 27, 56, 19, 14, 14, 10 };
		
//		int[][] rmap1 = a(map1);
//		int[][] rmap2=  a(map2);
//
//		printmap(rmap1);
//		System.out.println();
//		printmap(rmap2);
//		printmap(solve(map1,map2));
		result(solve(map1,map2));
	}
	
	public static int[][] solve(int[] arr1, int[] arr2){
		int map[][] = new int[6][6];
		for(int i=0;i<arr1.length;i++) {
//			String s1= toBinaryString(arr1[i]);
//			String s2= toBinaryString(arr2[i]);
//			System.out.println(s1);
//			System.out.println(s2);
			String s= toBinaryString(arr1[i]|arr2[i]);
			for(int j=0;j<6;j++) {
				int n = s.charAt(j) - '0';
				map[i][j]=n;
			}
		}
		return map;
		
		
	}
	
	public static int[][] a(int[] arr) {
		int map[][] = new int[6][6];
		for(int i=0;i<arr.length;i++) {
			String s= toBinaryString(arr[i]);
			for(int j=0;j<6;j++) {
				int n = s.charAt(j) - '0';
				map[i][j]=n;
			}
		}
		return map;		
	}
	
	public static String toBinaryString(int val) {
		String s = Integer.toBinaryString(val);
		while (s.length()<6) {
			s ="0" + s;
		}
		return s;
		
	}
	
	
	public static void result(int[][] array) {
		for(int i=0; i<6;i++) {
			for(int j=0;j<6;j++) {
				if(array[i][j]==1) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void printmap(int[][] samples) {
		for (int[] row : samples) {
			for (int element : row) {
				System.out.printf("%d ", element);
			}
			System.out.println();
		}
	}
	

}
