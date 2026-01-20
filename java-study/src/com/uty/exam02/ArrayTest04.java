package com.uty.exam02;

public class ArrayTest04 {
	public static void main(String[] args) {
		int sales[] = { 52, 62, 30, 95, 77, 0, 100 };
		char graph[][] = new char[10][7];

		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				if ((graph.length - sales[j] / 10) > i) {
					graph[i][j] = '.';
				} else {
					graph[i][j] = '0';
				}

			}
		}
		
//		for (int i = 0; i < graph.length; i++)
//			for (int j = 0; j < graph[0].length; j++)
//				graph[i][j] = '.';
//
//		for (int i = 0; i < sales.length; i++) {
//			for (int k = 0; k < sales[i] / 10; k++) {
//				graph[graph.length - 1 - k][i] = 'O';
//			}
//		}
		
		
		System.out.println("-----<그래프>------");
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[0].length; j++) {
				System.out.printf("%c ", graph[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------");
		System.out.println("1 2 3 4 5 6 7 ");

	}
}
