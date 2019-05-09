package org.katheer.test;

import org.katheer.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args) throws Exception {
        //Getting class name of a class
        //Class empClass = Class.forName("org.katheer.entity.Employee");
        //Employee emp = new Employee();
        //Class empClass = emp.getClass();
        Class empClass = Employee.class;
        System.out.println(empClass.getName());

        Class stdClass = Class.forName("org.katheer.entity.Student");
        //Student std = new Student();
        //Class stdClass = std.getClass();
        //Class stdClass = Student.class;
        System.out.println(stdClass.getName());

        //Getting super class of a class
        Class empSuperClass = empClass.getSuperclass();
        System.out.println("Super Class");
        System.out.println("-----------");
        System.out.println(empSuperClass.getName());
        System.out.println();

        //Getting interfaces of a class
        Class[] empClassInterfaces = empClass.getInterfaces();
        System.out.println("Interfaces");
        System.out.println("----------");
        for (Class empInterface : empClassInterfaces) {
            System.out.println(empInterface.getName());
        }
        System.out.println();

        //Getting instance variables of a class
        Field[] fields = empClass.getDeclaredFields();
        System.out.println("Instance Variables");
        System.out.println("------------------");
        for (Field field : fields) {
            System.out.println(field.getName() + " : " + field.getType());
        }
        System.out.println();

        //Getting methods of a class
        Method[] methods = empClass.getDeclaredMethods();
        System.out.println("Methods");
        System.out.println("-------");
        for (Method method : methods) {
            System.out.println("Name    : " + method.getName());
            System.out.println("Returns : " + method.getReturnType().getName());
            System.out.print("Params  : ");
            Class[] params = method.getParameterTypes();
            for (Class param : params) {
                System.out.print(param.getName() + "  ");
            }
            System.out.println();
            System.out.println();
        }

        //Getting constructors of a class
        Constructor[] constructors = empClass.getConstructors();
        System.out.println("Constructors");
        System.out.println("------------");
        for (Constructor constructor : constructors) {
            System.out.println("Name    : " + constructor.getName());
            System.out.print("Params  : ");
            Class[] parameters = constructor.getParameterTypes();
            for (Class parameter : parameters) {
                System.out.print(parameter.getName() + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
