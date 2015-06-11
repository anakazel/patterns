package com.patterns.flyweight;

import java.awt.*;

/**
 * Created by alexg on 11.06.2015.
 */
public class Line implements LineFlyweight {

    private Color color;

    public Line (Color c) {
        color = c;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void draw(Point location) {
        // draw the character on the screen
    }
}
