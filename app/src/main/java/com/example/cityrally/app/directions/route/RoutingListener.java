package com.example.cityrally.app.directions.route;

import com.google.android.gms.maps.model.PolylineOptions;

public interface RoutingListener {
    public void onRoutingFailure();

    public void onRoutingStart();

    public void onRoutingSuccess(PolylineOptions mPolyOptions, Route route);
}
