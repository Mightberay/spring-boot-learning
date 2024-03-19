package top.ray.boot.config.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @author RAY
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")
public class Family {

    private String familyName;

    private String father;

    private String mother;

    private String child;
}
