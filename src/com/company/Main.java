package com.company;

public class Main {
    public static void main(String[] args) {

        Animal[] animal = {new Shark(),
                           new Turtle(),
                            new Eagle()};


        for (Animal a : animal) {


        if (a instanceof Shark){
            ((Shark) a).attack();
        }
            else if (a.getClass().getName().equals("com.company.Turtle")) {
            ((Turtle) a).swim();
        } else if (a instanceof Eagle){
            ((Eagle)a).fly();
        }

        }
        }

        }







