package test.test1220.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class MyControllerAdvice {
    @ExceptionHandler(value = Exception.class)
    public Map<String,Object> err(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code",-1);
        map.put("msg",e.getMessage());
        return map;
    }
}
