package com.example.slim_toshiba.pfe_project_demo;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created by SLIM-TOSHIBA on 22/02/2018.
 */

public class MyLocationListener implements LocationListener {
    
    Location locationn;
    
    MyLocationListener () {
        
        locationn = new Location("zerooooo");
        locationn.setLatitude(-34);
        locationn.setLongitude(151);
        
    }
    
    
    @Override
    public void onLocationChanged(Location location) {
        
        this.locationn = location;
        
    }
    
    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {
    
    }
    
    @Override
    public void onProviderEnabled(String s) {
    
    }
    
    @Override
    public void onProviderDisabled(String s) {
    
    }
}
