package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * @param id id for the student:unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */


    public Student (int id, String name, int grade){
        feesPaid=0;
        feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    //Not going to alter student's name, student's Id.

    /**
     * Used to update the student's grade
     * @param grade new grade of the student.
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     *
     * @return id of the student
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * Keep adding the fees to feedsPaid field.
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal=feesPaid;
    }

}
