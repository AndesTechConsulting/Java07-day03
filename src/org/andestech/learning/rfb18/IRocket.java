package org.andestech.learning.rfb18;

interface IRocketTestEngine
{
    void powerUp(double perc);
    void powerDown(double perc);
    //......

}

public interface IRocket extends IRocketTestEngine
{
    void ignit();
    //..........
}
