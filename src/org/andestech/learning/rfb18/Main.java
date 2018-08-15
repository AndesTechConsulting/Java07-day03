package org.andestech.learning.rfb18;


public class Main {

    private static void echo(String s, int N)
    {
        for(int i =0; i<N; i++) System.out.print(s);
        System.out.println();
    }

    private static void echo()
    {
        echo("-",75);
    }


    public static void main(String[] args) {

    Rocket r1 = new Rocket(777777);
        //System.out.println(r1.getData());
        System.out.println(r1);
        echo();
       // System.out.println(new Rocket().getData());
        System.out.println(new Rocket());
        Rocket r2 = Rocket.generateRocket("Союз");
        echo();
       // System.out.println(r2.getData());
        System.out.println(r2);
        echo("+", 55);
        PhotonRocket pr2 = new PhotonRocket("RGGG5555");
       // System.out.println(pr2.getData());
        System.out.println(pr2);
    }
}
