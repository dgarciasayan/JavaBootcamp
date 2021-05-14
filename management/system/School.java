package school.management.system;
import java.util.List;

/**
 * The school can have many teachers, many students.
 * Implement teachers and students using ArrayList.
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * New School object is created.
     * @param teachers list of teachers in the school
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return the list of teachers in the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *
     * @return the list of students in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Adds a teacher to the school.
     * @param teacher the teacher to be added.
     */
    public void setTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Adds a student to the school
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Updates the total money earned by the school
     * @param moneyEarned money that is supossed to be added
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * Update the money that is spent by the school which is the salary given by the school to its teachers
     * @param moneySpent the money spent by school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -=moneySpent;
    }


}
