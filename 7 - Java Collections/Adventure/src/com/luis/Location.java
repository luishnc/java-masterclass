package com.luis;

import java.util.HashMap;
import java.util.Map;

public class Location {

    public final int LocationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        LocationID = locationID;
        this.description = description;
        //this.exits = exits;
        if (exits != null) {
            this.exits = new HashMap<>(exits);
        } else {
            this.exits = new HashMap<>();
        }


        this.exits.put("Q", 0);

    }

//    public void addExit(String direction, int location){
//        exits.put(direction,location);
//    }

    public int getLocationID() {
        return LocationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
