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
public class Car extends Vehicle{

    @Override
    public void assemble(String type, String brand, String model) {
        this.type = type;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void paint(String color) {
        this.color = color;
    }

    @Override
    public void qualityCheck(double kmPerLiter) {
        this.kmPerLiter = kmPerLiter;
    }

    @Override
    public String toString() {
        return "Type : " + this.type + "\nBrand : " + this.brand + "\nModel : " + this.model + "\nColor : " + this.color + "\nKm Per Liter : " + this.kmPerLiter;
    }
   
}
