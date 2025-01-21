package com.loose.ioc;

public class UserWebServiceProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "fetching data from WS";
    }
}