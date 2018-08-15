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
        System.out.println(r1.getData());
        echo();
        System.out.println(new Rocket().getData());
        Rocket r2 = Rocket.generateRocket("Союз");
        echo();
        System.out.println(r2.getData());

    }
}
