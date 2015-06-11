package com.patterns.flyweight;

import java.awt.*;

/**
 * Created by alexg on 11.06.2015.
 */
public class Client {
    public static void main(String[] args) {
        LineFlyweightFactory factory = new LineFlyweightFactory();
        LineFlyweight line1 = factory.getLine(Color.RED);
        LineFlyweight line2 = factory.getLine(Color.RED);

        // can use the lines independently
        line1.draw(new Point(100, 100));
        line2.draw(new Point(200, 100));
    }
}
