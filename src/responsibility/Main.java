package responsibility;

/**
 * 责任链模式
 * 在JavaWeb中的应用：FilterChain
 *
 * @author RJZ
 */
public class Main {

    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("小明", 3, "有事");

        GroupLeader groupLeader = new GroupLeader();
        groupLeader.setNextHandler(new Manager())
                .setNextHandler(new GeneralManager());

        groupLeader.submit(leaveRequest);
    }
}
