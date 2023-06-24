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
public class MitsubishiWorkshop extends Workshop{

    public MitsubishiWorkshop(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public Vehicle produce(String type, String brand, String model, String color, double kmPerLiter) {
        this.vehicle.assemble(type, brand, model);
        this.vehicle.paint(color);
        this.vehicle.qualityCheck(kmPerLiter);
        return this.vehicle;
    }

    

}
