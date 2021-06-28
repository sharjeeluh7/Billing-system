package electricity_bill;


public class Electricity_Suppliers_infoImpl extends Electricity_Suppliers_info {

    public Electricity_Suppliers_infoImpl(String company_name, String company_address, int no_of_employess) {
        super(company_name, company_address, no_of_employess);
    }

    public void company_detail()
    {
        super.DisplayCompanyDetail();
    }
}
