package com.patterns.facade;

/**
 * Created by alexg on 11.06.2015.
 */
public class ComputerFacade {
    private Cpu processor;
    private Memory ram;
    private HardDrive hdd;

    public ComputerFacade(){
        processor = new Cpu();
        ram = new Memory();
        hdd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(0, null);
        processor.jump(0);
        processor.execute();
        hdd.read(0, 0);
    }
}
