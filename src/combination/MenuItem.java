package combination;

/**
 * 菜单项类（叶子节点）
 *
 * @author RJZ
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level){
        this.name = name;
        this.level = level;
    }

    public void print(){
        System.out.print("-".repeat(level));
        System.out.println(name);
    }
}
