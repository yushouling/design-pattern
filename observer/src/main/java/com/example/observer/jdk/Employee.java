package com.example.observer.jdk;

/**
 * 观察者角色
 *
 * @author Yu Shouling
 * @since 1.0
 */

import java.util.Observable;
import java.util.Observer;


public class Employee implements Observer {

    protected String addressBookContents;

    private String employeeName;


    public Employee(String employeeName) {
        setEmployeeName(employeeName);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddressBookContents() {
        return addressBookContents;
    }

    public void setAddressBookContents(String addressBookContents) {

        this.addressBookContents = addressBookContents;

    }


    @Override
    public void update(Observable object, Object arg) {
        if (arg instanceof String) {

            setAddressBookContents(arg.toString());

            System.out.println(getEmployeeName() + "获得通信录:" + getAddressBookContents());

        }
    }

}