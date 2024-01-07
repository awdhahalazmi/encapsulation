package encapsulationn;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGpaStatus(double gpa) {
        this.gpa = gpa;
        if (gpa <= 4.0 && gpa >= 0.0) {
            this.gpa = gpa;
        } else
            System.out.println("error: Gpa must be between 0.0 and 4.0");
    }

    public String getGpaStatus() {

        if (gpa > 3) {
            return "execellent";

        } else if (gpa <= 3) {
            return "good";

        } else
            return "needs improvment";
    }
}
