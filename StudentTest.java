package encapsulationn;

public class StudentTest {
    public static void main(String[] args) {
        Student StudentStat = new Student();
        StudentStat.setGpaStatus(3.5);
        StudentStat.setAge(23);
        StudentStat.setName("Awdhah");
        System.out.println(StudentStat.getGpaStatus());
        System.out.println(StudentStat.getAge());
        System.out.println(StudentStat.getName());
    }
}
