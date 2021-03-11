package com.example.observer.myself;

public class CompanyEmployee extends AbstractEmployee{

    private String employeeName ;


    public String getEmployeeName() {return employeeName; }

    public void setEmployeeName(String employeeName) {this.employeeName = employeeName;}

    public CompanyEmployee(String employeeName) {

        super();

        this.employeeName = employeeName;

    }


    @Override
    public void update(AbstractAddressBook book ){

        super.update(book);

        System.out.println(getEmployeeName()+"更新通讯录。"+"通讯录内容："+addressBookContents);

    }

}