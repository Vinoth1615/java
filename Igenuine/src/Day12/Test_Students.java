package Igenuine.src.Day12;

public class Test_Students {
    public static void main(String[] args) {
        Students s1 = new Students("Vinoth", 20,720822103179L);
        Students s2 = new Students("Ajay", 19,720822103001L);
        s1.displayStudents();

        s1.setName("vinoth_D");
        s1.displayStudents();
        String s3=s1.getName();
        System.out.println(s3);
        s2.setAge(35);
        int s4 = s2.getAge();
        System.out.println(s4);
        s2.displayStudents();
    }
}
