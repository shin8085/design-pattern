package command;

/**
 * 服务员类（调用者角色）
 * 
 * @author RJZ
 */
public class Waitor {
    
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public voiod orderUp() {
        System.out.println("服务员: 订单来了!");
        commands.foreach(Command::execute);
    }
}
