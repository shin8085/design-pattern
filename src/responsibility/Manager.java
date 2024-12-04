package responsibility;

/**
 * @author RJZ
 */
public class Manager extends Handler {

    public Manager() {
        super(3);
    }

    @Override
    protected void handle(LeaveRequest leaveRequest) {
        System.out.println("Manager: " + leaveRequest.getName() + " " + leaveRequest.getNum() + " " + leaveRequest.getContent());
    }
}
