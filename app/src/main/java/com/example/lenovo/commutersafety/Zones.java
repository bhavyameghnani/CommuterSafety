package com.example.lenovo.commutersafety;

public class Zones {
    String ZoneTitle , ZoneDescription , ZoneSolution , ZoneLocation;

    Zones(){

    }

    public Zones(String zoneTitle, String zoneDescription, String zoneSolution, String zoneLocation) {
        ZoneTitle = zoneTitle;
        ZoneDescription = zoneDescription;
        ZoneSolution = zoneSolution;
        ZoneLocation = zoneLocation;
    }

    public String getZoneTitle() {
        return ZoneTitle;
    }

    public void setZoneTitle(String zoneTitle) {
        ZoneTitle = zoneTitle;
    }

    public String getZoneDescription() {
        return ZoneDescription;
    }

    public void setZoneDescription(String zoneDescription) {
        ZoneDescription = zoneDescription;
    }

    public String getZoneSolution() {
        return ZoneSolution;
    }

    public void setZoneSolution(String zoneSolution) {
        ZoneSolution = zoneSolution;
    }

    public String getZoneLocation() {
        return ZoneLocation;
    }

    public void setZoneLocation(String zoneLocation) {
        ZoneLocation = zoneLocation;
    }
}
