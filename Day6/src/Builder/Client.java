package Builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.newBuilder()
                .setFirstName("Oleg")
                .setLastName("Ivanov")
                .setAge(20)
                .setUniversityName("KFU")
                .build();
        System.out.println(student);
    }
}
