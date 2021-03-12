package com.example.strategy;

/**
 * TODO
 *
 * @author Yu Shouling
 * @since 1.0
 */
public class Project {

    private String projectName;

    private Strategy strategy;


    public Project(String projectName) {

        super();

        this.projectName = projectName;

    }


    public Project(String projectName, Strategy strategy) {

        super();

        this.projectName = projectName;

        this.strategy = strategy;

    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doCommonWork() {
    }

    public void doStrategyWork() {
        strategy.doWork(this);
    }

}