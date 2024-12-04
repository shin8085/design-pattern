package command;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类（调用者角色）
 * 
 * @author RJZ
 */
public class Waitor {
    
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void orderUp() {
        System.out.println("服务员: 订单来了!");
        commands.forEach(Command::execute);
    }
}
