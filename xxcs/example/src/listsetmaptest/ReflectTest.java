package listsetmaptest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.ArithmeticException;

public class ReflectTest {
    public static void main(String[] args){
        int a = 5;
        try {
            float b = a / 0;
        }catch (ArithmeticException e) {
            System.out.println("e.getCause(): " + e.getCause());
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.printStackTrace(): ");
            e.printStackTrace();
            throw e;
        }

        Person p = new Person();
        Class clazz = p.getClass();
        System.out.println("类Person对象的Class对象是" + clazz);
        clazz = Person.class;
        System.out.println("类Person的Class对象是" + clazz);
        //clazz = Class.forName("listsetmaptest.ReflectTest.Person");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m:methods){
            System.out.println(m.toString());
        }

        Field[] fields = clazz.getDeclaredFields();
        for (Field f:fields){
            System.out.println(f.toString());
        }

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor c:constructors){
            System.out.println(c.toString());
        }
    }
}

class Person {
    private String name;
    private String gender;
    private int age;

    public Person() {

    }
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //getter和setter方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "姓名:"+name+"  性别:"+gender+"  年龄:"+age;
    }

}

