package CaseStudy.models;

public class Villa extends Services {
    private String typeVilla;
    private String otherService;
    private double poolArea;
    private int floors;

    public Villa(){}

    public Villa(String nameService, double area, double rentCost, int maxAmount, String rentType, String typeRoom, String otherService, double poolArea, int floors) {
        super(nameService, area, rentCost, maxAmount, rentType);
        this.typeVilla = typeRoom;
        this.otherService = otherService;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getTypeRoom() {
        return typeVilla;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeVilla = typeRoom;
    }

    public String getOtherService() {
        return otherService;
    }

    public void setOtherService(String otherService) {
        this.otherService = otherService;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }


    @Override
    public String toString() {
        return super.toString()  +
                "Standard Villa : " + typeVilla + '\n' +
                "Comfortable Description Villa : " + otherService + '\n' +
                "Floor Villa : " + floors + '\n' +
                "Area Pool Villa : " + poolArea;
    }

    @Override
    public String ShowInfor() {
        return this.toString();
    }
}
