package facade;

/**
 * Created by alexg on 1/25/14.
 */
public class ComputerFacade {

    private CPU processor;
    private Memory ram;
    private HardDrive hdd;

    public ComputerFacade(){
        processor = new CPU();
        ram = new Memory();
        hdd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(0, null);
        processor.jump(0);
        processor.execute();
    }
}
