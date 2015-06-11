package com.patterns.flyweight;

import java.awt.*;

/**
 * Created by alexg on 11.06.2015.
 */
public interface LineFlyweight {
    Color getColor();
    void draw(Point location);
}
