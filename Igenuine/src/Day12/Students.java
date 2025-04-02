package Igenuine.src.Day12;

public class Students {
    private int age;
    private String name;
    long rollNo;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Students(String name, int age, long rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void displayStudents() {
        System.out.println("*************************");
        System.out.println("Name : " + this.name + "\nAge : " + this.age + "\nRoll No : " + this.rollNo);
        System.out.println("*************************");
    }
}
