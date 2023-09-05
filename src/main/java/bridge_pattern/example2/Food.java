package bridge_pattern.example2;

public abstract class Food {
    //水果
    Fruit fruit;

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
    /**
     * 制作时添加
     */
    public abstract void add();
}
