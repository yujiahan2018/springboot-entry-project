package demo.bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class User {
    public int id;
    public String name;
    public String sex;
    public int age;
}
