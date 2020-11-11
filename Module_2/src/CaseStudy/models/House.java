package CaseStudy.models;

public class House  extends Services {
    private String typeRoom;
    private String otherService;
    private int floors;

    public House(String nameService, double area, double rentCost, int maxAmount, String rentType, String typeRoom, String otherService, int floors) {
        super( nameService, area, rentCost, maxAmount, rentType);
        this.typeRoom = typeRoom;
        this.otherService = otherService;
        this.floors = floors;
    }


    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getOtherService() {
        return otherService;
    }

    public void setOtherService(String otherService) {
        this.otherService = otherService;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String ShowInfor() {
        return this.toString();
    }
}
