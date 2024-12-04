package responsibility;

/**
 * @author RJZ
 */
public class Manager extends Handler{
    
    public GroupLeader() {
        super(1, 3);
    }

    @Override
    public viod handle(LeaveRequest leaveRequest) {
        System.out.println("Manager: " + leaveRequest.getName() + " " + leaveRequest.getNum() + " " + leaveRequest.getContent());
    }
}
