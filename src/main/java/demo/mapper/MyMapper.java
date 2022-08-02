package demo.mapper;

import demo.bean.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MyMapper {

    public User selectUser(int id);

}