package school.management.system;

/**
 * This class is responsible for keeping the track of teacher's name, id, salary.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    //

    /**
     *
     * @return the id for the teacher.
     */

    public int getId(){
        return this.id;
    }

    /**
     *
     * @return the name of the teacher.
     */
    public String getName(){
        return this.name;
    }
    /**
     *
     * @return the salary of the teacher.
     */

    public int getSalary(){
        return this.salary;
    }

    /**
     * Update the salary.
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * Adds to salaryEarned.
     * @param salary removes from the total money earned by the school.
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "name:"+ name + "\n id:"+ id + "\n salary:"+ salary;
        /* return "Name of the teacher: "+ name
              + " Total salary earned so far: $"+ salaryEarned;*/
    }
}
