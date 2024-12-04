package responsibility;

/**
 * @author RJZ
 */
public class GeneralManager extends Handler {

    public GeneralManager() {
        super(7);
    }

    @Override
    protected void handle(LeaveRequest leaveRequest) {
        System.out.println("GeneralManager: " + leaveRequest.getName() + " " + leaveRequest.getNum() + " " + leaveRequest.getContent());
    }
}
