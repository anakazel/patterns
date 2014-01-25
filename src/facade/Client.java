package facade;

/**
 * Created by alexg on 1/25/14.
 */
public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
