package be.vdab.OOOef23juni;

public class Student {
    private java.lang.String studentName;
    private java.lang.String[] courses = new java.lang.String[100];
    private int numbrOfCourses;

    public Student(java.lang.String studentName) {
        this.studentName = studentName;
    }

    public java.lang.String getStudentName() {
        return studentName;
    }

    public void setStudentName(java.lang.String studentName) {
        this.studentName = studentName;
    }

    public java.lang.String[] getCourses() {
        return courses;
    }

    public void setCourses(java.lang.String[] courses) {
        this.courses = courses;
    }

    public int getNumbrOfCourses() {
        return numbrOfCourses;
    }

    public void setNumbrOfCourses(int numbrOfCourses) {
        this.numbrOfCourses = numbrOfCourses;
    }

    @Override
    public java.lang.String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", numbrOfCourses=" + numbrOfCourses +
                '}';
    }
}
