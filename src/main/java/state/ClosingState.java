package state;

/**
 * 电梯关闭状态
 * 
 * @author RJZ
 */
public class ClosingState extends LiftState {

    @Override
    public void open() {
        context.setLiftState(new OpeningState());
        context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭了");
    }

    @Override
    public void stop() {
        context.setLiftState(new StoppingState());
        context.stop();
    }

    @Override
    public void run() {
        context.setLiftState(new RunningState());
        context.run();
    }

    
    
}
