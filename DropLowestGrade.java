package javaprojects;

import java.util.Scanner;

class DropLowestGrade
{
    public static void main(String[] args)
    {
        final int ARRAYSIZE = 5;
        String[] studentNames = {"Ann", "Bob", "Cara", "Don", "Eve"};
        int[][] studentGrades = new int[ARRAYSIZE][ARRAYSIZE];
        final int[] NEW_STUDENT_GRADES = new int[ARRAYSIZE];
        for (int row = 0; row < studentGrades.length; row++)
        {
            System.out.println("Please enter test Scores (0 - 100) for " + studentNames[row]);
            for (int column = 0; column < studentGrades[row].length; column++ )
            {
                getstudentTestScores(studentGrades, row, column);
            }
            //average = calculateAverageGrade();
            //findLowestGrade()
            //removeLowestGrade()
            //assignLetterGrade ();
            //displayStudentGradeReport()
        }
    }
    public static void getstudentTestScores(int[][] testScores, int r, int c)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Test #  " + ++c + ": ");
        testScores[r][c-1] = input.nextInt();
    }
    
    public static void displayStudentGradeReport()
    {
        
    }
}
