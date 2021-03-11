package com.example.observer.jdk;

/**
 * 被观察目标角色
 *
 * @author Yu Shouling
 * @since 1.0
 */

import java.util.Observable;


public class AddressBook extends Observable {

    protected String addressBookContent;

    public AddressBook() {
        super();
    }


    public String getAddressBook() {
        return addressBookContent;
    }

    public void setAddressBook(String addressBook) {
        this.addressBookContent = addressBook;
    }

    public void addEmployee(Employee employee) {
        super.addObserver(employee);
    }

    public void removeEmployee(Employee employee) {
        deleteObserver(employee);
    }

    public void modifyAddress(String addressBook) {

        setAddressBook(addressBook);

        setChanged();

        notifyObservers(addressBook);

    }

}