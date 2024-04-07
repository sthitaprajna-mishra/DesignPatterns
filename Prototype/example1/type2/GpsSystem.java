package Prototype.example1.type2;

public class GpsSystem implements IPrototype {
    public String latitude;
    public String longitude;

    public GpsSystem(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    };

    public GpsSystem(GpsSystem gps) {
        this.latitude = gps.latitude;
        this.longitude = gps.longitude;
    }

    @Override
    public GpsSystem clone() {
        return new GpsSystem(this);
    }
}
