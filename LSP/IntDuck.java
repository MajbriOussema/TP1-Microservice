package com.directi.training.lsp.exercise_refactored;

public interface IntDuck
{
    void quack() throws IntDuckException;

    void swim() throws IntDuckException;

    class IntDuckException extends Exception
    {
        public IntDuckException(String message)
        {
            super(message);
        }
    }
}
