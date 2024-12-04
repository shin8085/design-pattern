package responsibility;

import java.util.logging.Handler;

/**
 * @author RJZ
 */
public class GeneralManager extends Handler {

    public GeneralManager() {
        super(3);
    }
    
    @Override
    protected void handler(LeaveRequest leaveRequest) {
        System.out.println("GeneralManager: " + leaveRequest.getName() + " " + leaveRequest.getNum() + " " + leaveRequest.getContent());
    }
}
