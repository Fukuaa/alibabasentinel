package com.example.alibabasentinel.c;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.alibabasentinel.myhanler.myhander;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class c {
    @RequestMapping("/a")
    public String a(){
        return "*********a";
    }
    @RequestMapping("/b")
    public String b(){
        return "*********b";
    }
    @RequestMapping("/c")
    @SentinelResource(value = "c1",blockHandler = "c2")
    public String c(@RequestParam(value = "p1",required = false) String p1,
                    @RequestParam(value = "p2",required = false) String p2){
        return "*********c🥰🥰🥰";
    }
    @RequestMapping("/e")
    @SentinelResource(value = "e1")
    public String e(){
        return "*********e😘😘😘";
    }
    @RequestMapping("/d")
    @SentinelResource(value = "d1",
            blockHandlerClass = myhander.class,
            blockHandler = "handeler1")
    public String d(){
        return "*********d😘😘😘";
    }
    public String c2 (String p1, String p2, BlockException exception){
        return "*********c😭😭😭";
    }
}
