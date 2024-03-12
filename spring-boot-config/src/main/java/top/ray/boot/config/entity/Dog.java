package top.ray.boot.config.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author RAY
 */
@Data
@Component
public class Dog {
    @Value("${person.dog.name}")
    private String name;

    @Value("${person.dog.age}")
    private Integer age;
}
