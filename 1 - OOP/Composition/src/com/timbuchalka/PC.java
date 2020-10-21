package com.timbuchalka;

/**
 * Created by keanehubertang on 8/3/15.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        getTheCase().pressPowerButton();
        drawLogo();
    }
    private Case getTheCase() {
        return theCase;
    }
    private void drawLogo(){
        //Fancy Graphics
        monitor.drawPixelAt(1250,30,"Blue");
        
    }


}
