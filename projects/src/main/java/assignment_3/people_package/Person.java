package assignment_3.people_package;
import java.util.Random;
/*
    This is the class you need to work on
    If you were to create a class from scratch, please remember that the name of the class should match
    the name of the file the class resides in. (this is more of a convention thing)

    Reference:
    1) https://stackoverflow.com/questions/1841847/can-i-compile-a-java-file-with-a-different-name-than-the-class
 */

public class Person {
    private String name;
    private int age;
    private int id;
    public void setName(String n){
         this.name=n;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args){
        Random r=new Random();
        for(int i=0; i<=10; i++){
            int randomId = r.nextInt(1000);
            int randomAge= r.nextInt(99);

            Person M= new Person();
            M.setName("A-"+i);
            M.setAge(randomAge);
            M.setId(randomId);
            System.out.println("value "+ M.toString());
        }




    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
