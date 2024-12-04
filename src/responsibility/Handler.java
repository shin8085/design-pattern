package responsibility;

/**
 * 抽象处理者
 * 
 * @author RJZ
 */
public abstract class Handler {
    
    /**
     * 请假天数区间
     */
    private Integer numStart;
    private Integer numEnd;
    
    /**
     * 声明下个处理人
     */
    private Handler nextHandler;

    public Handler(Integer numStart) {
        this.numStart = numStart;
    }

    public Handler(Integer numStart, Integer numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public final void submit(LeaveRequest leaveRequest) {
        handle(leaveRequest);
        if(nextHandler != null && leaveRequest.getNum() > numEnd) {
            nextHandler.submit(leaveRequest);
            return;
        }
        System.out.println("流程结束");
    }

    protected abstract void handle(LeaveRequest leaveRequest);
}
