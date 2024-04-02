package cn.leijiba;

import com.zhuangxv.bot.EnableBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBot   
public class MyBot {
    public static void main(String[] args) {
        SpringApplication.run(MyBot.class, args);
    }
}