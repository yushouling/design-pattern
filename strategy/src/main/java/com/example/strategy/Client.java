package com.example.strategy;

/**
 * TODO
 *
 * @author Yu Shouling
 * @since 1.0
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("——————要求projectA采用银行策略——————");

        Project projectA = new Project("projectA");

        Strategy strategy1 = new BankStrategy();

        projectA.setStrategy(strategy1);

        projectA.doStrategyWork();


        System.out.println("——————要求projectB采用政府策略——————");

        Project projectB = new Project("projectB");

        Strategy strategy2 = new GovernmentStrategy();

        projectB.setStrategy(strategy2);

        projectB.doStrategyWork();


        System.out.println("——————要求projectC采用电信策略——————");

        Project projectC = new Project("projectC");

        Strategy strategy3 = new TelecomStrategy();

        projectC.setStrategy(strategy3);

        projectC.doStrategyWork();

    }

}