package ua.com.sourceit.AndriienkoHomework.HW3;
import java.util.Arrays;
import java.util.Scanner;

/*5
–еализовать переворот матрицы на 90, 180, 270 градусов по часовой стрелке
–азмер массива задаетс€ пользователем.

ƒополнительно: постаратьс€ без использовани€ дополнительного массива
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
			System.out.println(Arrays.toString(rotateMatrix90deg(M)[i]));
		}
		
		
		
		
	}
	
	public static double[][] rotateMatrix90deg (double[][] matrix){
		int mxlenght = 5 - 1;
		double rotateMatrix;
		
		for (int i = 0; i < mxlenght / 2; i++){ 
            
            for (int j = i; j < 5 - 1 - i; j++){
            	              
            	double p1 = matrix[i][j];
            	double p2 = matrix[j][5-i-1];
            	double p3 = matrix[5-i-1][5-j-1];
            	double p4 = matrix[5-j-1][i];
                
                matrix[j][5-i-1] = p1;
                matrix[5-i-1][5-j-1] = p2;
                matrix[5-j-1][i] = p3;
                matrix[i][j] = p4; 
            } 
        } 		
		return matrix;		
	}
	
	
	
}