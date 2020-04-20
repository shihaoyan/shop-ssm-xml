package bh.db.ssm.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author 石皓岩
 * @create 2019-12-20 11:04
 * 描述：这个就是为了不让service层扫描，因为这个是controller层的东西
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MvcAnnotatation {


    @AliasFor(annotation = Component.class)
    String value() default "";


}
