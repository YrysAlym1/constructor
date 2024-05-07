import java.util.Arrays;

public class MyClass {
    String name;
    String lastName;
    int age;
    String[] lessons;
    String food;

    public MyClass(){

    }
    public MyClass(String name, String lastName,int age,String [] lessons , String food){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.lessons = lessons;
        this.food = food;
    }
    public void info(){
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(Arrays.toString(lessons));
        System.out.println(food);
    }
}
