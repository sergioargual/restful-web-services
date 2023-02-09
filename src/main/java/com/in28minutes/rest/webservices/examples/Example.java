package com.in28minutes.rest.webservices.examples;

import com.streamsets.pipeline.api.Field;
import java.util.*;


public class Example {

    private static final String DEVICE= "device";


    private static Map<String, Field> inputEmptyDeviceDataBase() {


        Map<String, Field> baseDataMap = new HashMap<>();

        List<Field> deviceDataList = new ArrayList<>();
        baseDataMap.put(DEVICE, Field.create(deviceDataList));
        return baseDataMap;
    }



}
