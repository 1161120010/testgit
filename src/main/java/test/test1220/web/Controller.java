package test.test1220.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${app.msg}")
    public String msg;


    @GetMapping("/test")
    public String test(){
        if (true){
            throw new RuntimeException("异常");
        }
        return "test";
    }
    @GetMapping("/iii")
    public String iii(){
        return msg;
    }
}
