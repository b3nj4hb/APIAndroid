package com.example.api_android.service;

public class Apis {
    public static final String URL_001="http://10.40.0.223:8080/personas/";

    public static com.example.api_android.service.EscuelaService getEscuelaService(){
        return  Cliente.getClient(URL_001).create(com.example.api_android.service.EscuelaService.class);
    }
}
