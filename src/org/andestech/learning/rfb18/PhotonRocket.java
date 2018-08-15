package org.andestech.learning.rfb18;

public class PhotonRocket extends Rocket {

    private String reactorType;



    public PhotonRocket(){
        this("HH23");


    }

    public PhotonRocket(String reactorType)
    {
        super(4000000,300000,"LIGHT777");
        this.reactorType = reactorType;
        System.out.println("+++ ctor PhotonRocket");

    }

    public String getReactorType() {
        return reactorType;
    }

    public void setReactorType(String reactorType) {
        this.reactorType = reactorType;
    }


    public void ignit(){
        System.out.println("Photon Rocket, Поехали!!");

    }

    @Override
    public String toString() {
        return super.toString() + ", " + reactorType ;
    }
}
