package com.musman.cabs.Common;

import com.musman.cabs.Remote.FCMClient;
import com.musman.cabs.Remote.IFCMService;

/**
 * Created by Musman on 2018-01-02.
 */

public class Common {
    public static final String drivers_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    private static final String fcmURL = "https://fcm.googleapis.com";


    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
