package com.example.observer.myself;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAddressBook {

    protected List<AbstractEmployee> employeeList = new ArrayList<AbstractEmployee>();

    protected String addressBook;


    public String getAddressBook() {return addressBook;}

    public void setAddressBook(String addressBook) {this.addressBook = addressBook; }

    public void addEmployee(AbstractEmployee employee){employeeList.add(employee);}

    public void removeEmployee(AbstractEmployee employee){employeeList.remove(employee);}

    public void notice(){}

}
