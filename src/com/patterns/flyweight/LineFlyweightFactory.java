package com.patterns.flyweight;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexg on 11.06.2015.
 */
public class LineFlyweightFactory {

    private List<LineFlyweight> pool;

    public LineFlyweightFactory () {
        pool = new ArrayList<>();
    }

    public LineFlyweight getLine (Color c) {
        for (LineFlyweight line : pool) {
            if (line.getColor().equals(c)) {
                return line;
            }
        }

        LineFlyweight line = new Line(c);
        pool.add(line);
        return line;
    }
}
