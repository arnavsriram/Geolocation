public class Runner {
    public static void main(String[] args) {
        GeoLocation building = new GeoLocation(33.123961, -96.798735);
        System.out.println(building.toString());
        Place school = new Place("Independence High School", "10555 Independence Pkwy, Frisco, TX 75035", 33.1645, -96.7516);
        System.out.println(school.toString());
        Place admin = new Place("Frisco ISD Administration Building", "5515 Ohio Dr, Frisco, TX 75035", building);
        System.out.println(admin.toString());
        System.out.println(admin.distanceTo(school));
    }
}

