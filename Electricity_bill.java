package electricity_bill;

public class Electricity_bill {


    public static void main(String[] args) {

        bill_detail obj=new bill_detail(23);
        double billPay=obj.balanceCalc();
        obj.display();
        System.out.println("bill to pay"+billPay);


        Electricity_Suppliers_infoImpl KE= new Electricity_Suppliers_infoImpl("KE","Pakistan",200);
        KE.company_detail();
    }

}
