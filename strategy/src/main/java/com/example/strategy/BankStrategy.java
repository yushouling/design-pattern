package com.example.strategy;

/**
 * TODO
 *
 * @author Yu Shouling
 * @since 1.0
 */
public class BankStrategy extends Strategy {

    @Override
    public void doWork(Project project) {

        System.out.println(project.getProjectName() + "采用银行策略的工作。");

    }

}


class GovernmentStrategy extends Strategy {

    @Override
    public void doWork(Project project) {

        System.out.println(project.getProjectName() + "采用政府策略的工作");

    }

}


class TelecomStrategy extends Strategy {

    @Override
    public void doWork(Project project) {

        System.out.println(project.getProjectName() + "采用电信策略的工作");

    }

}