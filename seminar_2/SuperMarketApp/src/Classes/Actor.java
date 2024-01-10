package Classes;

public abstract class Actor {
    //поля
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    
    //конструктор
    public Actor(String name) {
        this.name = name;
    }

    //абстрактные методы
    public abstract String getName();
    public abstract void setName(String name);

    

}
