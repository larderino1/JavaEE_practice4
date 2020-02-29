package lib;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MyLibAutoConfig {
    @Bean
    @ConditionalOnProperty(value = "bestOfTheBestProperty", havingValue = "custom")
    MyLibClass MyLibClass() {
        return new MyLibClass();
    }

}
