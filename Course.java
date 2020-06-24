package be.vdab.OOOef23juni;

public class Course {
    private String courseName;
    private String[] students = new String[][100];
    private int numbrOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String[] getStudents() {
        String[] newStud = new String[100];
        newStud = students;
        return newStud;
    }

    public void addStudent(String student){
        if (numbrOfStudents >= students.length){
            String[] nwStud = new String[numbrOfStudents+1];
            for (int i = 0; i < students.length; i++) {
                nwStud[i] = students[i];
            }
            students = nwStud;
        }
        students[numbrOfStudents] = student;
        numbrOfStudents++;
    }

    public void dropStudent(String student){
        for (int i = 0; i < students.length ; i++) {
            if (students[i] == student){

            }
        }

    }
}
