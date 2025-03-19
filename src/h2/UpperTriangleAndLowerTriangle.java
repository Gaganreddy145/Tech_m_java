package h2;

import java.util.Random;

public class UpperTriangleAndLowerTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int mat[][] = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				mat[i][j] = r.nextInt(10);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i <= j)
					System.out.print(mat[i][j] + " ");
				else
					System.out.print("0 ");
			}
			System.out.println();

		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i >= j)
					System.out.print(mat[i][j] + " ");
				else
					System.out.print("0 ");
			}
			System.out.println();

		}

	}

}
