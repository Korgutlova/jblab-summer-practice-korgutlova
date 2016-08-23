package Builder;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String universityName;
    private String faculty;
    private String group;
    private double averageScore;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageScore() {
        return averageScore;
    }

    private Student() {
    }

    public static StudentBuilder newBuilder() {
        return new Student().new StudentBuilder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", universityName='" + universityName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", group='" + group + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }

    public class StudentBuilder {

        private StudentBuilder() {
        }

        public StudentBuilder setFirstName(String firstName) {
            Student.this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            Student.this.lastName = lastName;
            return this;
        }

        public StudentBuilder setAge(int age) {
            Student.this.age = age;
            return this;
        }

        public StudentBuilder setUniversityName(String universityName) {
            Student.this.universityName = universityName;
            return this;
        }

        public StudentBuilder setFaculty(String faculty) {
            Student.this.faculty = faculty;
            return this;
        }

        public StudentBuilder setGroup(String group) {
            Student.this.group = group;
            return this;
        }

        public StudentBuilder setAverageScore(double averageScore) {
            Student.this.averageScore = averageScore;
            return this;
        }

        public Student build() {
            return Student.this;
        }
    }
}
