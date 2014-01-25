package facade;

/**
 * Created by alexg on 1/25/14.
 */
public class CPU {
    public void freeze() {
        System.out.println("CPU: freeze()");
    }
    public void jump(long position) {
        System.out.println("CPU: jump(" + position + ")");
    }
    public void execute() {
        System.out.println("CPU: execute()");
    }
}
