package state;

/**
 * 环境角色类
 * 
 * @author RJZ
 */
public class Context {
    
    // 线程安全问题？或者在构造方法中初始化
    // public static final OpeningState OPENING_STATE = new OpeningState();
    // public static final ClosingState CLOSING_STATE = new ClosingState();;
    // public static final RunningState RUNNING_STATE = new RunningState();
    // public static final StoppingState STOPPING_STATE = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
