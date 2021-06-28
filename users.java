package electricity_bill;

public class users {

    private String name;
    private int id;

    users(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
