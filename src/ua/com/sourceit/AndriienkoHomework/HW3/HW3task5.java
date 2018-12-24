package ua.com.sourceit.AndriienkoHomework.HW3;
import java.util.Arrays;

/*5
����������� ��������� ������� �� 90, 180, 270 �������� �� ������� �������
������ ������� �������� �������������.

�������������: ����������� ��� ������������� ��������������� �������
*/

public class hw3task5 {
	public static void main(String[] args) throws Exception {
		
		double[][] M = {
					{1.1, 2.1, 3.1, 4.1, 5.1},		
					{1.2, 2.2, 3.2, 4.2, 5.2},
					{1.3, 2.3, 3.3, 4.3, 5.3},
					{1.4, 2.4, 3.4, 4.4, 5.4},
					{1.5, 2.5, 3.5, 4.5, 5.5}
		};
				
		for (int i = 0; i < 5; i++) {
			System.out.println(Arrays.toString(M[i]));
		}
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			System.out.println(M[i]);
		}
		
		
		
		
	}
	
	private static void tMatrix(String[][] matrix) {
		String temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	private static void verticalMirror(String[][] matrix) {
		String temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}
	}

	private static void horizontalMirror(String[][] matrix) {
		String temp;
		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = 0; j < matrix.length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length - 1 - i][j];
				matrix[matrix.length - 1 - i][j] = temp;
			}
		}
	}
	
	static void rotate90(String[][] matrix) {
		tMatrix(matrix);
		verticalMirror(matrix);
	}

	static void rotate180(String[][] matrix) {
		verticalMirror(matrix);
		horizontalMirror(matrix);
	}

	static void rotate270(String[][] matrix) {
		tMatrix(matrix);
		horizontalMirror(matrix);
	}
	
	static void outputMatrix(String[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	
}