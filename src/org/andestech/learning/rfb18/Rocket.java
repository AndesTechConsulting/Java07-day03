package org.andestech.learning.rfb18;

public class Rocket {


    private double power;
    private double mass;
    private String model;

    // fabrica

    public static Rocket generateRocket(String model)
    {
        //.... checks
        model = model.toUpperCase();
        return new Rocket(model);
    }

    public Rocket(){
       // System.out.println();
        this(12344,2222.333,"Vostok");
        //----
    }

    public Rocket(double power){
        // System.out.println();
        this(power,2222.333,"Vostok");
        //----
    }

    private Rocket(String model){
        // System.out.println();
        this(22222222,2222.333,model);
        //----
    }

    public Rocket(double power, double mass, String model)
    {

       // double mass = 12312.123123;
        // this.mass = mass2;

       this.mass = mass;
       this.model = model;
       this.power = power;

    }

    public String getData(){


        return "Rocket: " + model + ", P=" + power +
                ", M=" + mass + ".";
    }


    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
