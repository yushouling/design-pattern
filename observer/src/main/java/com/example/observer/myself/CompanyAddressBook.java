package com.example.observer.myself;

public class CompanyAddressBook extends AbstractAddressBook {

    public CompanyAddressBook (){

        addressBook = "旧的通信录";

    }


    @Override
    public void addEmployee(AbstractEmployee employee) {

//employee.setAddressBook(this);

        employee.update(this);

        super.addEmployee(employee);

    }


    @Override
    public void notice() {

        for (int i = 0; i < employeeList.size(); i++) {

            employeeList.get(i).update(this);

        }

    }

}