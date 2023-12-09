public class Calculator {
    public double averageFunction (CourseDetails[] data) {
        double totalGradePoint = 0;
        double totalGradeUnit = 0;

        for (CourseDetails course: data) {
            totalGradePoint += course.getGradeUnit() * course.getCourseUnit();
            totalGradeUnit += course.getCourseUnit();
        }
        return totalGradePoint / totalGradeUnit;
    }
}
