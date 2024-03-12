package top.ray.boot.config.entity;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonTest {
    @Resource
    private Person person;

    @Resource
    private Dog dog;

    @Test
    public void testPerson(){
        System.out.println(person);
    }


}