package com.directi.training.lsp.exercise_refactored;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electronicDuck = new ElectronicDuck();
        quack(donaldDuck, electronicDuck);
        swim(donaldDuck, electronicDuck);
    }

    private void quack(IntDuck... ducks)
    {
        for (IntDuck duck : ducks) {
            try {
                duck.quack();
            } catch (IntDuck.IntDuckException e) {
                e.printStackTrace();
            }
        }
    }

    private void swim(IntDuck... ducks)
    {
        for (IntDuck duck : ducks) {
            try {
                duck.swim();
            } catch (IntDuck.IntDuckException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
