package template;

/**
 * 抽象类，定义模板方法和基本方法
 *
 * @author RJZ
 */
public abstract class AbstractMethod {

    /**
     * 烹饪（模板方法）
     */
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    /**
     * 倒油
     */
    public void pourOil() {
        System.out.println("倒油");
    }

    /**
     * 热油
     */
    public void heatOil() {
        System.out.println("热油");
    }

    /**
     * 倒菜
     */
    public abstract void pourVegetable();

    /**
     * 倒调味品
     */
    public abstract void pourSauce();

    /**
     * 翻炒
     */
    public void fry() {
        System.out.println("翻炒");
    }
}
