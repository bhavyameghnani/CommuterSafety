package com.example.lenovo.commutersafety;

public class Zone {
    String zoneID , zoneTitle , zoneData , zoneSolution , zoneLat , zoneLong , zoneStatus;

    public Zone() {
    }

    public Zone(String zoneID, String zoneTitle, String zoneData, String zoneSolution, String zoneLat, String zoneLong, String zoneStatus) {
        this.zoneID = zoneID;
        this.zoneTitle = zoneTitle;
        this.zoneData = zoneData;
        this.zoneSolution = zoneSolution;
        this.zoneLat = zoneLat;
        this.zoneLong = zoneLong;
        this.zoneStatus = zoneStatus;
    }

    public String getZoneID() {
        return zoneID;
    }

    public String getZoneTitle() {
        return zoneTitle;
    }

    public String getZoneData() {
        return zoneData;
    }

    public String getZoneSolution() {
        return zoneSolution;
    }

    public String getZoneLat() {
        return zoneLat;
    }

    public String getZoneLong() {
        return zoneLong;
    }

    public String getZoneStatus() {
        return zoneStatus;
    }
}
