package com.example.marketapplication_se114_m22_pmcl.common;

import com.example.marketapplication_se114_m22_pmcl.Model.User;

public class Common {
    public static User currentUser;

    public static String convertCodeToStatus(String code){
        if(code.equals(0)){
            return "Placed";
        } else if (code.equals(1)){
            return "On my way";
        } else return "Shipped";
    }
}
