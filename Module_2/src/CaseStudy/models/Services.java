package CaseStudy.models;

public abstract class Services {

    private String nameService ;
    private double Area ;
    private double rentCost ;
    private int maxAmount ;
    private String rentType ;

    public Services( String nameService, double area, double rentCost, int maxAmount, String rentType) {
        this.nameService = nameService;
        Area = area;
        this.rentCost = rentCost;
        this.maxAmount = maxAmount;
        this.rentType = rentType;
    }

    public Services() {

    }


    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public abstract String ShowInfor();


    @Override
    public String toString() {
        return  "Name Services : " + nameService + '\n' +
                "Area Services : " + Area + '\n' +
                "Cost Services : " + rentCost + '\n' +
                "Quantity Included : " + maxAmount + '\n' +
                "Rental Type : " + rentType + '\n'
                + "\n --------------------------------"
                ;
    }
}
