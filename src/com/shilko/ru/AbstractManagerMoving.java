package com.shilko.ru;

import com.shilko.ru.Client.ClientGUI.Canvas;

public abstract class AbstractManagerMoving implements Movable {

    protected final int step;
    protected final Coord coord;
    protected final int imageHeight, imageWidth;
    protected final Client.ClientGUI.Canvas canvas;
    protected final int weight;

    public AbstractManagerMoving(int step, Coord coord, int imageHeight, int imageWidth, Canvas canvas, int weight) {
        this.step = step;
        this.coord = coord;
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
        this.canvas = canvas;
        this.weight = weight;
    }

}
