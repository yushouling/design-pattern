package com.example.observer.myself;

/**
 * 自定义实现，测试
 *
 * @author Yu Shouling
 * @since 1.0
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("——————原有的通讯录——————");

        AbstractAddressBook addressBook = new CompanyAddressBook();


        AbstractEmployee employee1 = new CompanyEmployee("employee1");

        AbstractEmployee employee2 = new CompanyEmployee("employee2");


        addressBook.addEmployee(employee1);

        addressBook.addEmployee(employee2);


        System.out.println("——————更新的通讯录——————");

        String newAddressBook = "新的通讯录";

        addressBook.setAddressBook(newAddressBook);

        addressBook.notice();

    }

}