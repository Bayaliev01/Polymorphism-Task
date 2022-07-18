package company;

public class Main {
    public static void main(String[] args) {

        Animal[] animal = {new Shark(),
                           new Turtle(),
                            new Eagle()};
        for (Animal a : animal) {
        if (a instanceof Shark){
            ((Shark) a).attack();
        }
        if (a.getClass().getName().equals("company.Shark")) {
            ((Shark) a).attack();
        }
        }

        }

        }





