package responsibility;

/**
 * @author RJZ
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(1);
    }

    @Override
    protected void handle(LeaveRequest leaveRequest) {
        System.out.println("GroupLeader: " + leaveRequest.getName() + " " + leaveRequest.getNum() + " " + leaveRequest.getContent());
    }
}
