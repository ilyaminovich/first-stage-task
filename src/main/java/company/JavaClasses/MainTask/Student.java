package main.java.company.JavaClasses.MainTask;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {

    private int id;
    private String fullname;
    private GregorianCalendar date;
    private String addres;
    private long telefonnumber;
    private String faculty;
    private int course;
    private int group;

    public Student(int id, String fullname, GregorianCalendar date, String addres, long telefonnumber, String faculty, int course, int group) {
        this.id = id;
        this.fullname = fullname;
        this.date = date;
        this.addres = addres;
        this.telefonnumber = telefonnumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public long getTelefonnumber() {
        return telefonnumber;
    }

    public void setTelefonnumber(long telefonnumber) {
        this.telefonnumber = telefonnumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", date=" + date.get(Calendar.YEAR) + "." + date.get(Calendar.MONTH) + "." + date.get(Calendar.DAY_OF_MONTH) +
                ", addres='" + addres + '\'' +
                ", telefonnumber=" + telefonnumber +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }

    public void listOfStudentsOfGivenFaculty(String faculty) {
        if ((this.getFaculty()).equals(faculty)) {
            System.out.println(toString());
        }
    }

    public void listOfStudentsOfSpecifiedFacultyAndCourse(String faculty, int course) {
        if ((this.getFaculty()).equals(faculty) && this.getCourse() == course) {
            System.out.println(toString());
        }
    }

    public void listOfStudentsWhoWereBornAfterSpecifiedYear(GregorianCalendar gregorianCalendar) {
        if ((date.get(Calendar.YEAR)) > (gregorianCalendar.get(Calendar.YEAR))) {
            System.out.println(toString());
        }
    }

    public void showStudentGroup(String faculty, int course, int group) {
        if (this.getFaculty().equals(faculty) && this.getCourse() == course && this.getGroup() == group) {
            System.out.println(toString());
        }
    }
}
