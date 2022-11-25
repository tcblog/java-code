package com.itheima.arraylist;

public class Movice {
    private String name;
    private double score;
    private String actor;

    public Movice() {
    }

    public Movice(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
