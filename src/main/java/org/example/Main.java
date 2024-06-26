package org.example;

import java.security.PublicKey;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        AttenndanceManager DataStudent=new AttenndanceManager();
        boolean Flag=true;
        boolean find=false;

        Scanner scanner=new Scanner(System.in);
        Student student_1=new Student("hazem",123);
        Student student_2=new Student("mahmad",154);
        DataStudent.markAttendance(student_1,true);
        DataStudent.markAttendance(student_2,false);
        //DataStudent.PrintAllStudent();
        while (Flag==true)
        {
            OptionInScreen();
            int OptionNum= scanner.nextInt();
            switch (OptionNum)
            {
                case 1:
                    System.out.print("\n");
                    System.out.print("PLease enter your id :");
                    int idStudent=scanner.nextInt();
                    for(int i=0;i<DataStudent.studentslist.size();i++)
                    {
                        if(idStudent==DataStudent.studentslist.get(i).student.id)
                        {
                         System.out.println("the id is found");
                         DataStudent.studentslist.get(i).Attendance_Value=true;
                         System.out.println("the id "+idStudent+"has name is "+DataStudent.studentslist.get(i).student.name+" he is attend");
                         find=true;
                         break;
                        }
                    }
                    if (find==false)
                    {
                        System.out.println("this id is not Found !!!");
                    }

                    break;
                case 2:
                    DataStudent.PrintAllStudent();
                    break;
                case 3:
                    Flag=false;
                    break;
                case 4:
                    System.out.print("\n");
                    System.out.print("PLease enter your name to add:");
                    String nameAdd=scanner.next();
                    System.out.print("\n");
                    System.out.print("PLease enter your id to add:");
                    int idAdd=scanner.nextInt();
                    Student NewStudent=new Student(nameAdd,idAdd);
                    DataStudent.markAttendance(NewStudent,true);

                    break;
            }

        }






    }
    public static void OptionInScreen()
    {
        System.out.println("Choose from the following option");
        System.out.println("1- For prove your attendance Please Enter 1 :");
        System.out.println("2- For attendance Report Please Enter 2 :");
        System.out.println("3- For Exist The Attendance System Enter 3 :");
        System.out.println("4- If you do not find your information in Database enter 4 :");
        System.out.print("Your Choose number is : ");
    }
}