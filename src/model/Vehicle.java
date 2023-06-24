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
public abstract class Vehicle {

    protected String type;
    protected String brand;
    protected String model;
    protected String color;
    protected double kmPerLiter;

    public abstract void assemble(String type, String brand, String model);

    public abstract void paint(String color);

    public abstract void qualityCheck(double  kmPerLiter);

}
