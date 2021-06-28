package electricity_bill;

public abstract class Electricity_Suppliers_info {

    private String company_name;
    private String company_address;
    private int    no_of_employess;

    public Electricity_Suppliers_info(String company_name, String company_address, int no_of_employess) {
        this.company_name = company_name;
        this.company_address = company_address;
        this.no_of_employess = no_of_employess;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getCompany_address() {
        return company_address;
    }

    public int getNo_of_employess() {
        return no_of_employess;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public void setNo_of_employess(int no_of_employess) {
        this.no_of_employess = no_of_employess;
    }
    public void DisplayCompanyDetail()
    {
        System.out.println("Company Name:"+this.company_name);
        System.out.println("Company Address:"+this.company_address);
        System.out.println("No Of Employees:"+this.no_of_employess);
    }

}
