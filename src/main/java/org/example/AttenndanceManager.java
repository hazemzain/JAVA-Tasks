package org.example;

import java.util.ArrayList;
import java.util.List;

public class AttenndanceManager {
    List<attendance>studentslist;
    public AttenndanceManager()
    {
        this.studentslist=new ArrayList<>();

    }
    public void markAttendance(Student studentDetalis,Boolean studentAttendanceValue)
    {
        attendance value = new attendance(studentDetalis,studentAttendanceValue);
        studentslist.add(value);
    }
    public void  PrintAllStudent()
    {
        for (int i=0;i<studentslist.size();i++)
        {
            System.out.println("the name of student is "+studentslist.get(i).student.name+"->the id for this student is "+studentslist.get(i).student.id+"->the attend for this student is "+studentslist.get(i).Attendance_Value);
        }
    }
}
