package net.ukr.juliakoziy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = 0;
		System.out.println("Input array size");
		double[][] arrayA = new double[sc.nextInt()][sc.nextInt()];
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayA[0].length; j++) {
				arrayA[i][j] = j +1;
				System.out.print(arrayA[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = i; j < arrayA[0].length; j++) {
				a = arrayA[j][i];
				arrayA[j][i] = arrayA[i][j];
				arrayA[i][j] = a;

			}

		}
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayA[0].length; j++) {
				System.out.print(arrayA[i][j] + " ");

			}
			System.out.println();
		}

		sc.close();

	}

}
