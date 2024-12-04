package combination;

/**
 * 组合模式
 * -----------------------
 * 透明组合模式（本例）：在抽象构件角色（MenuComponent）中声明了所有用于管理成员对象的方法
 * 优点：确保所有组件类都有相同的接口，是组合模式的标准形式
 * 缺点：不够安全，叶子节点和树枝节点有本质区别；对于叶子节点而言有些方法是没用的，调用时可能会出错
 * --------------------------------------------------------
 * 安全组合模式：在抽象构件角色中没有声明任何用于管理成员对象的方法，而是在组件类中声明各自所需的方法
 * 缺点：不够透明，不同的组件类有不同的方法，不能完全根据抽象编程
 *
 * @author RJZ
 */
public class Main {

    public static void main(String[] args) {

        Menu classAdapter = new Menu("class_adapter", 3);
        classAdapter.add(new MenuItem("TFCard", 4));

        Menu adapter = new Menu("adapter", 2);
        adapter.add(classAdapter);
        adapter.add(new Menu("object_adapter", 3));

        Menu mainMenu = new Menu("src", 1);
        mainMenu.add(adapter);

        mainMenu.print();
        System.out.println("=================");
        mainMenu.getChild(0).print();
    }
}
