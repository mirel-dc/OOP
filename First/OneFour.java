public class OneFour {
    public static void main(String[] args) {
        City city = new City();
        city.Name = "Yekaterinburg";
        city.Location = new GeoLocation();
        city.Location.Latitude = 56.50;
        city.Location.Longitude = 60.35;
        System.out.printf("I love %s located at %.2f %.2f",
                city.Name,
                city.Location.Longitude,
                city.Location.Latitude);
    }
}

class GeoLocation {
    double Longitude, Latitude;
}

class City {
    String Name;
    public GeoLocation Location;
}
