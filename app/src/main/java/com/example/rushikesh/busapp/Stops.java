package com.example.rushikesh.busapp;

/**
 * Created by Phase on 13-03-18.
 */

public class Stops {
    //Declare member variables.
    private String mstopDetails;
    private String mbusDetails;

    //Define constructor of a class.
    public Stops(String stopDetails,String busDetails){
            mstopDetails = stopDetails;
            mbusDetails = busDetails;
    }
    //Getter method to get stopDetails.
    public String getStopDetails(){
        return mstopDetails;
    }
    //Getter method to get busDetails.
    public String getbusDetails(){
        return mbusDetails;
    }
}
