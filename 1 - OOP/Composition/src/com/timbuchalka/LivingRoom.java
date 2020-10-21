package com.timbuchalka;

public class LivingRoom {
    private int width;
    private int height;
    private Table table;
    private Television television;


    public LivingRoom(int width, int height, Table table, Television television) {
        this.width = width;
        this.height = height;
        this.table = table;
        this.television = television;
    }

    public void connectTv(){
        turnTVOn();
    }

    private void turnTVOn(){
        television.turnTvOn();
        television.displayLogo();

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Table getTable() {
        return table;
    }

    public Television getTelevision() {
        return television;
    }
}
