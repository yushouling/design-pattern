package com.example.observer.jdk;

/**
 * 使用JDK里提供的Observer设计模式的实现，
 * java.util.Observer是观察者角色，
 * java.util.Observable是被观察目标角色，对应于Subject角色。
 *
 * @author Yu Shouling
 * @since 1.0
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("——————原有的通讯录——————");

        AddressBook addressBook = new AddressBook();


        Employee employee1 = new Employee("employee1");

        Employee employee2 = new Employee("employee2");

        Employee employee3 = new Employee("employee3");


        addressBook.addEmployee(employee1);

        addressBook.addEmployee(employee2);

        addressBook.addEmployee(employee3);


        addressBook.modifyAddress("旧的通讯录");


        System.out.println("——————更新的通讯录——————");

        String newAddressBook = "新的通讯录";

        addressBook.modifyAddress(newAddressBook);

    }

}