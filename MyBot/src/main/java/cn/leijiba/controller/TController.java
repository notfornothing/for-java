package cn.leijiba.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.zhuangxv.bot.annotation.FriendMessageHandler;
import com.zhuangxv.bot.core.Bot;
import com.zhuangxv.bot.core.Friend;
import com.zhuangxv.bot.message.MessageChain;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TController {

    @PostMapping("/test")
    public String t() {
        System.out.println();

        return "1";
    }

    @FriendMessageHandler()
    public void tt(String receive, Bot bot, Friend friend) {
            
        friend.sendMessage(new MessageChain().text("asdf"));
        bot.sendPrivateMessage(friend.getUserId(), new MessageChain().text(receive));
        System.out.println(receive);
    }

    public static void main(String[] args) {
        JSONArray objects = JSON.parseArray("[\n" +
                "    {\n" +
                "        \"lucy\": \"lucy\"\n" +
                "    }\n" +
                "]");
        
        System.out.println(objects);
    }
}
