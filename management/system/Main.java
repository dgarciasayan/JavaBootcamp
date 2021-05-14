package management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int id = 0;
        int salary = 0;
        Teacher teacher;


        List<Teacher> teacherList = new ArrayList<>();


        for (int i = 0; i < 2; i ++){

            System.out.print( "Nombre:");
            name = scanner.next();


            System.out.print( "Id:");
            id = scanner.nextInt();

            System.out.print( "Salario:");
            salary = scanner.nextInt();
            System.out.println();

            teacher = new Teacher(id, name, salary);
            teacherList.add(teacher);


        }

        System.out.println(teacherList.get(0).toString());
       /* Teacher lizzy=new Teacher(1, "Lizzy", 5000);
        Teacher mellisa=new Teacher (2,"Mellisa", 7000);
        Teacher vanderhorn=new Teacher(3, "Vanderhorn", 6000);

        List<Teacher> teachersList=new ArrayList<>();
        teachersList.add(lizzy);
        teachersList.add(mellisa);
        teachersList.add(vanderhorn);

        Student tamasha=new Student(1,"Tamasha", 4);
        Student rakshith=new Student(2, "Rakshith Vasudev",12);
        Student rabbi=new Student(3,"Rabbi",5);

        List<Student> studentList=new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);

        School ghs=new School(teachersList,studentList);
        tamasha.payFees(5000);
        System.out.println("GHS has earned $"+ghs.getTotalMoneyEarned());
        rakshith.payFees(6000);
        System.out.println("GHS has earned $"+ghs.getTotalMoneyEarned());
        System.out.println("---------Making GHS PAY SALARY--------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to"+ lizzy.getName()
        +" and now has"+ghs.getTotalMoneyEarned());
        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to"+ vanderhorn.getName()
                +" and now has"+ghs.getTotalMoneyEarned());
        System.out.println(rakshith);
        */
    }

}
