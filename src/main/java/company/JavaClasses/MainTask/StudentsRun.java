package main.java.company.JavaClasses.MainTask;

import java.util.GregorianCalendar;

public class StudentsRun {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(1999, 11, 8);
        gregorianCalendar.getCalendarType();
        Student[] student = new Student[10];
        student[0] = new Student(111, "Розанов Данила Васильевич", new GregorianCalendar(2000, 8, 12), "Gorkogo 23", 375255080768L, "MMF-faculty", 3, 10);
        student[1] = new Student(222, "Минович Илья Андреевич", new GregorianCalendar(1998, 12, 21), "Chapaeva 26, 4", 375255080769L, "LAW-faculty", 1, 6);
        student[2] = new Student(333, "Борушко Артём Владимирович", new GregorianCalendar(1998, 9, 16), "Chapaeva 23", 375251233456L, "LAW-faculty", 1, 6);
        student[3] = new Student(444, "Иванов Иван Иванович", new GregorianCalendar(1999, 10, 15), "Gorkogo 421", 375250041245L, "MMF-faculty", 1, 5);
        student[4] = new Student(555, "Семёнов Семён Семёнович", new GregorianCalendar(2000, 5, 5), "Chapaeva 33", 37525876584L, "MMF-faculty", 3, 10);
        student[5] = new Student(666, "Сезанов Гаврила Васильевич", new GregorianCalendar(2001, 10, 5), "Gorkogo 56", 375255080568L, "LAW-faculty", 3, 10);
        student[6] = new Student(777, "Булович Илья Андреевич", new GregorianCalendar(1998, 6, 8), "Chapaeva 28, 4", 375255030769L, "LAW-faculty", 2, 6);
        student[7] = new Student(888, "Костюшко Артём Владимирович", new GregorianCalendar(1998, 4, 2), "Chapaeva 73", 375257233456L, "LAW-faculty", 4, 6);
        student[8] = new Student(999, "Пиманов Иван Иванович", new GregorianCalendar(1999, 4, 7), "Gorkogo 42", 375250021245L, "MMF-faculty", 2, 5);
        student[9] = new Student(100, "Сываев Семён Семёнович", new GregorianCalendar(1999, 6, 9), "Chapaeva 63", 37525873584L, "MMF-faculty", 4, 10);

        System.out.println("List of students of a given faculty" + "\n");
        for (int i = 0; i < student.length; i++) {
            student[i].listOfStudentsOfGivenFaculty("LAW-faculty");
        }

        System.out.println("\n" + "List of students for each faculty and course ");
        for (int i = 0; i < student.length; i++) {
            student[i].listOfStudentsOfSpecifiedFacultyAndCourse("LAW-faculty", 1);
        }

        System.out.println("\n" + "List of students who were born after specified year: ");
        for (int i = 0; i < student.length; i++) {
            student[i].listOfStudentsWhoWereBornAfterSpecifiedYear(gregorianCalendar);
        }

        System.out.println("\n" + "List of study group: ");
        for (int i = 0; i < student.length; i++) {
            student[i].showStudentGroup("LAW-faculty", 1, 6);
        }
    }
}
