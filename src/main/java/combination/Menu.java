package combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类（树枝节点）
 *
 * @author RJZ
 */
public class Menu extends MenuComponent{

    private final List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public void print(){
        System.out.print("-".repeat(level));
        System.out.println(name);
        for (MenuComponent menuComponent : menuComponents){
            menuComponent.print();
        }
    }
}
