package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManagerBestCar
{
    private List<Car> _carsDb;
    public CarManagerBestCar(List<Car> carsDb)
    {
        _carsDb = carsDb;
    }
    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
   
}
