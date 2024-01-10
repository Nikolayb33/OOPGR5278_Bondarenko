package Classes;

public class OrdinaryClient extends Actor{
    private int number;

    public OrdinaryClient(String name, int number) {
        super(name);
        this.number = number;
    }


    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Actor getActor(){
        return this;
    }
    

    
}
