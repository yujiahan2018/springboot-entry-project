package demo.controller;

import demo.bean.User;
import demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MyController {
    @Autowired
    MyService myService;

    @RequestMapping ("/data")
    public User selectUser(@RequestParam("id") int id){
//        System.out.print(id);
        return myService.selectUser(id);
    }

}
