package demo.service;

import demo.bean.User;
import demo.mapper.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    MyMapper myMapper;

    public User selectUser(int id){
        return myMapper.selectUser(id);
    }

}
