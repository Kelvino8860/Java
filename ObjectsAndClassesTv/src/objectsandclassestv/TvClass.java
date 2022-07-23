/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsandclassestv;

/**
 *
 * @author NJORO
 */
public class TvClass {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    
    public TvClass()
    {
    }
    public void turnOn()
    {
        on = true;
    }
    public void turnOff()
    {
        on = false;
    }
    public void setChannel(int newChannel)
    {
        if(on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }
    public void setVolume(int newVolume)
    {
        if(on && newVolume >= 1 && newVolume <= 7)
            volumeLevel = newVolume;
    }
    public void channelUp()
    {
        if(on && channel < 120)
            channel++;
    }
    public void channelDown()
    {
        if(on && channel > 1)
            channel--;
    }
    public void volumeUp()
    {
        if(on && volumeLevel < 7)
            volumeLevel++;
    }
    public void volumeDown()
    {
        if(on && volumeLevel > 1)
            volumeLevel--;
    }
}
