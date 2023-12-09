
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many courses: ");
        int noOfCourses = input.nextInt(), index = 0;
        CourseDetails[] data = new CourseDetails[noOfCourses];

        while (index < noOfCourses)
        {
            try {
                CourseDetails course = new CourseDetails();

                input = new Scanner(System.in);
                System.out.printf("Entry: %d\n", index + 1);
                System.out.printf("Enter Course %d name & code: ", index + 1);
                course.setCourseCode(input.nextLine());

                input = new Scanner(System.in);
                System.out.print("Enter Course Unit (only positive integers allowed): ");
                int unit = input.nextInt();
                if (unit < 0) {
                    throw new Exception();
                }
                course.setCourseUnit(unit);

                input = new Scanner(System.in);
                System.out.print("Enter Course Score: ");
                int score = input.nextInt();
                while (score < 0 || score > 100) {
                    System.out.print("Enter a score greater than 0 and less than 100: ");
                    score = input.nextInt();
                }
                course.setCourseScore(score);

                data[index] = course;
                index++;
            } catch (Exception ex) {
                System.out.println("** Wrong value entered, re-enter **");
            }
        }
        Output print = new Output ();
        print.printTable(data);
    }
}