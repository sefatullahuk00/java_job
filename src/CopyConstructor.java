class Student {
    int Roll;
    String Name;
    float Mark;

    Student(int R, String N, float M) {
        Roll = R;
        Name = N;
        Mark = M;
    }

    Student(Student s) {
        Roll = s.Roll;
        Name = s.Name;
        Mark = s.Mark;
    }

    void Display() {
        System.out.println("Name is: " + Name);
        System.out.println("Roll is: " + Roll);
        System.out.println("Mark is: " + Mark);

    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(592656,"Sefat Ullah",54);
        System.out.println();
        
        System.out.println("Result of S1");
        s1.Display();
        System.out.println();

        Student s2 = new Student(s1);
        Student s3 = new Student(s1);
        System.out.println("Result of s2");
        s2.Display();

        System.out.println();
        s3.Display();

    }
}