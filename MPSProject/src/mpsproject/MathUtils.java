/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mpsproject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class MathUtils {

    public static int[][] SumUp(int[][] matrix1, int[][] matrix2)
    {
        int[][] resultMatrix = new int[matrix1.length][matrix1.length];

        for(int i = 0; i < matrix1.length; i++)
            for(int j = 0; j < matrix1.length; j++)
            {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }

        return resultMatrix;
    }

    public static void PrintMatrix(int[][] matrixResult)
    {
        for(int i = 0; i < matrixResult.length; i++)
        {
            for(int j = 0; j < matrixResult.length; j++)
            {
                System.out.print(matrixResult[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] ReadMatrix(String filename)
    {
        try {
            Scanner input1 = new Scanner(new File("../" + filename));
            int size = input1.nextInt();
            int[][] matrix = new int[size][size];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = input1.nextInt();
                }
            }

            return matrix;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
