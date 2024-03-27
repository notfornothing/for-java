package cn.leijiba;

import com.zhuangxv.bot.EnableBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBot   
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}