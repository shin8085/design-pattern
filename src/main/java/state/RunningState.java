package state;

/**
 * 电梯运行状态
 * 
 * @author RJZ
 */
public class RunningState extends LiftState {

    @Override
    public void open() {
    }

    @Override
    public void close() {
    }

    @Override
    public void stop() {
        context.setLiftState(new StoppingState());
        context.stop();
    }

    @Override
    public void run() {
        System.out.println("电梯运行中");
    }

    
    
}
