package responsibility;

/**
 * 抽象处理者
 *
 * @author RJZ
 */
public abstract class Handler {

    /**
     * 可以通过的请假天数
     */
    private final Integer leaveDays;

    /**
     * 声明下个处理人
     */
    private Handler nextHandler;

    public Handler(Integer leaveDays) {
        this.leaveDays = leaveDays;
    }

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public final void submit(LeaveRequest leaveRequest) {
        handle(leaveRequest);
        if (nextHandler != null && leaveRequest.getNum() > leaveDays) {
            nextHandler.submit(leaveRequest);
            return;
        }
        System.out.println("流程结束");
    }

    protected abstract void handle(LeaveRequest leaveRequest);
}
