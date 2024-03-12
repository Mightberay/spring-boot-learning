package top.ray.boot.config.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import top.ray.boot.config.factory.MixPropertySourceFactory;

/**
 * @author RAY
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")
@PropertySource(value = {"classpath:family.yml"},factory = MixPropertySourceFactory.class)
public final class Family {

    @Length(min = 5,max = 20,message = "家庭名称长度必须处于5-20位")
    private String familyName;

    private String father;

    private String mother;

    private String child;

    @Range(min = 3,message = "必须大于三年")
    private Integer age;
}
