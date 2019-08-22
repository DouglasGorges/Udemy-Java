package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two number about the matrixes size (LxH):");

		int l = sc.nextInt();
		int h = sc.nextInt();

		System.out.println("Now, enter the numbers to put on your matrix:");
		
		int[][] matrix = new int[l][h];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("For last, enter the number who you want to know theirs neighbors:");
		int who = sc.nextInt();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == who) {
					if(j>0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if(i>0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if(j<matrix[i].length) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if(i<matrix.length) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
				}

			}
		}

		sc.close();

	}

}
