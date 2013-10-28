/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mpsproject;



/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            int[][] matrix1 = MathUtils.ReadMatrix("mat1");
            int[][] matrix2 = MathUtils.ReadMatrix("mat2");

            int[][] resultMatrix = MathUtils.SumUp(matrix1, matrix2);
            
            MathUtils.PrintMatrix(resultMatrix);
    }
}
