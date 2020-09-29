package week3.Homework4;

public class Location {
    private double latitude;   // 위도
    private double longitude;   // 경도
    public Location (double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }
    public double getLatitude() {
        return this.latitude;
    }
    public double getLongitude() {
        return this.longitude;
    }
    public double distance (Location other) {
        double RADIUS_EARTH = 6371.0;   // 지구의 반지름

        // fill here!
        return RADIUS_EARTH * Math.acos(Math.cos(Math.toRadians(90-this.latitude)) * Math.cos(Math.toRadians(90-other.latitude)) + Math.sin(Math.toRadians(90-this.latitude)) * Math.sin(Math.toRadians(90-other.latitude)) * Math.cos(Math.toRadians(this.longitude-other.longitude)));
    }
}