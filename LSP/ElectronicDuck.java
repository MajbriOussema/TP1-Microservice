package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements IntDuck
{
    private boolean _on = false;

    @Override
    public void quack() throws DuckIsOffException
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new DuckIsOffException("Can't quack when off");
        }
    }

    @Override
    public void swim() throws DuckIsOffException
    {
        if (_on) {
            System.out.println("Electronic duck swim...");
        } else {
            throw new DuckIsOffException("Cant swim when off");
        }
    }

    public void turnOn()
    {
        this._on = true;
    }

    public void turnOff()
    {
        this._on = false;
    }


    public static class DuckIsOffException extends IntDuckException
    {
        public DuckIsOffException(String message)
        {
            super(message);
        }
    }

}
