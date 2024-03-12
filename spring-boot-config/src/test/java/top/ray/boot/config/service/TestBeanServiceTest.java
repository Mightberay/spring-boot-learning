package top.ray.boot.config.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import top.ray.boot.config.ConfigApplication;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
public class TestBeanServiceTest {

    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    public void testLoadService(){
        boolean flag = ioc.containsBean("testBeanService");
        assertTrue(flag);
        TestBeanService testBeanService = (TestBeanService) ioc.getBean("testBeanService");
        log.info(String.valueOf(testBeanService));
        assertEquals("SpringBoot", testBeanService.getName());
    }

}