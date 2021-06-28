package electricity_bill;

public class Consumers extends users {

    private users user;
    private String address;

    public Consumers(int id, String name, String address) {
        super(id, name);
        this.address=address;
    }

    public void userDetail()
    {
        System.out.println("Consumer Id:"+super.getId());
        System.out.println("Consumer Name:"+super.getName());
        System.out.println("Consumed Addres:"+this.address);
    }

    public void userDetail(int id)
    {
        System.out.println("Consumer Id:"+id);
    }

}
