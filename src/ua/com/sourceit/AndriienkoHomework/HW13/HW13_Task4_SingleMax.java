package ua.com.sourceit.AndriienkoHomework.HW13;

public class HW13_Task4_SingleMax {

	public int foriMaxDetermination(int[][] matrix) {
		int max = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max)
					max = matrix[i][j];
			}
		}
		return max;
	}

}
