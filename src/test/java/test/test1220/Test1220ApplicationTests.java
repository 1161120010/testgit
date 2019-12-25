package test.test1220;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class Test1220ApplicationTests {

    @Autowired
    Date date;
    @Test
    void contextLoads() {
        System.out.println(date);
    }

}
