package com.things8051.blev2;

import java.util.HashMap;

/**
 * Created by Muhammad on 4/02/2015.
 */
public class SampleGattAttributes {


    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    static {

        // Sample Services.
        attributes.put("0000dfb0-0000-1000-8000-00805f9b34fb","M1BLE_SERVICE_UUID");
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");

        // Sample Characteristics.

        attributes.put("0000dfb1-0000-1000-8000-00805f9b34fb","M1BLE_CHAR_RXTX_UUID");

        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }

}
