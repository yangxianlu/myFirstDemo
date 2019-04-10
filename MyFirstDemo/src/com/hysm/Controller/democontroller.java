package com.hysm.Controller;

import com.hysm.Service.demoService;

public class democontroller {;
    public  String demo( ){
        demoService service = new demoService();
        String result = service.demosevice();
        return result;
    }

}
