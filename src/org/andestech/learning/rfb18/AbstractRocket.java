package org.andestech.learning.rfb18;


public abstract  class AbstractRocket implements IRocket {

    //....

   // public abstract void preCheck();
    //.....
   // public abstract void postCheck();

  // public abstract void ignit();

   public void totalCycle(){
       //preCheck(); ...
       ignit();
       startUp();
       //....

   }

    public  void startUp(){

        System.out.println("...fly!");


    }

    public void powerUp(double perc){
        //....
        System.out.println("Engine Up to " + perc);
    };

    public void powerDown(double perc){
        //....
        System.out.println("Engine Down to " + perc);

    };

}
