package electricity_bill;


import java.io.Serializable;

public class bill_detail {

    private int units;
    Consumers consumer;


    bill_detail(int units)
    {
        this.units=units;
        this.consumer=new Consumers(1,"Bilal","Karachi");
    }

    public bill_detail() {

    }

    void display()
    {
        System.out.println("Consumed unit:"+units);
    }

    double balanceCalc(){

        double billAmount=0;
        if(units>0 && units<=100)
            billAmount=units*1.5;
        else if(units>100 && units<=200)
            billAmount=100*1.5+(units-100)*3;
        else if(units>200 && units<=300)
            billAmount=(100*1.5)+200*3+(units-200)*6;
        else if(units>350)
            billAmount=(100*1.5)+200*3+(300-200)*6+(units-350)*7;
        else
            System.out.println("No charges");
        return billAmount;
    }
}
