import java.util.Scanner;

class DropLowestGrade
{
    public static void main(String[] args)
    {
        final int ARRAYSIZE = 5;
        double average;
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
            average = calculateAverageGrade(studentGrades, row);
            //findLowestGrade()
            //removeLowestGrade()
            //assignLetterGrade ();
            displayStudentGradeReport(average);
        }
    }
    public static void getstudentTestScores(int[][] testScores, int r, int c)
    {
    	final int MAXSCORE = 100;
    	final int MINSCORE = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Test #  " + ++c + ": ");
        testScores[r][c-1] = input.nextInt();
        while (testScores[r][c-1] < MINSCORE || testScores[r][c-1] > MAXSCORE)
        {
        	System.out.print("Error. You must enter a score in the range 0-100: ");
            testScores[r][c-1] = input.nextInt();
        }
    }
    public static double calculateAverageGrade(int[][] testScores, int r)
    {
    	double avg = 0;
    	double sum = 0;
    	int scoresAmount = 5;
    	for (int i = 0; i < testScores.length; i++)
    	{
    		sum += testScores[r][i];
    	}
    	avg = sum / scoresAmount;
    	return avg;
    }
    
    public static void displayStudentGradeReport(double avg)
    {
        System.out.printf("%s %s %s\n", "                                                                                  ", "Before Drop", "                           After Drop");
        System.out.printf("%12s %12s %12s %12s %12s %12s %12s %12s %12s %12s %12s\n","Student name", "Test 1", "Test 2", "Test 3", "Test 4", "Test 5", "Average", "Grade", "Lowest", "Average", "Grade");
        System.out.println(avg);
    }
}
