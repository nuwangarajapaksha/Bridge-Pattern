/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NUWAA
 */
public abstract class Workshop {

    protected Vehicle vehicle;

    public Workshop(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract Vehicle produce(String type, String brand, String model, String color, double kmPerLiter);

}
