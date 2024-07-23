package in.sp.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Emp1;

@Configuration
public class ConfigFile {

    @Bean
    public Emp1 user1() {
        Emp1 e = new Emp1("Amit", "a@a.com", "568", ai);
//        e.setName("Karisma");
//        e.setMail("k@gmail.com");
//        e.setPhone("897676");
//        e.setSkill("Mean, Python");
        return e;
    }
}