import responsibility;

/**
 * @author RJZ
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(0, 1);
    }
    
    @Override
    public handle(LeaveRequest leaveRequest) {
        System.out.println("GroupLeader: " + leaveRequest.getName() + " " + leaveRequest.getNum() + " " + leaveRequest.getContent());
    }
}
