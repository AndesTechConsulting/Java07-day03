package org.andestech.learning.rfb18;

public class PhotonRocket extends Rocket {

    private String reactorType;

    public PhotonRocket(){
        System.out.println("+++ ctor PhotonRocket");

    }

    public PhotonRocket(String reactorType)
    {
        this.reactorType = reactorType;

    }

    public String getReactorType() {
        return reactorType;
    }

    public void setReactorType(String reactorType) {
        this.reactorType = reactorType;
    }


    @Override
    public String toString() {
        return super.toString() + ", " + reactorType ;
    }
}
