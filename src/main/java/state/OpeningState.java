package state;

/**
 * 电梯开启状态
 * 
 * @author RJZ
 */
public class OpeningState extends LiftState {

    /**
     * 当前状态要执行的方法
     */
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        context.setLiftState(new ClosingState());
        context.close();
    }

    @Override
    public void stop() {
    }

    @Override
    public void run() {
    }

    
    
}
