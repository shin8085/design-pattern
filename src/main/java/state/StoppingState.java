package state;

/**
 * 电梯停止状态
 * 
 * @author RJZ
 */
public class StoppingState extends LiftState {

    @Override
    public void open() {
        context.setLiftState(new OpeningState());
        context.open();
    }

    @Override
    public void close() {
        context.setLiftState(new ClosingState());
        context.close();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }

    @Override
    public void run() {
        context.setLiftState(new RunningState());
        context.run();
    }

    
    
}
