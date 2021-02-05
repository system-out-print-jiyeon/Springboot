package study.review.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigurationExample {

    @Bean(name = "al")
    public Puppy Alkong(){
        Alkong alkong = new Alkong();
        return alkong;
    }

    @Bean(name = "dal")
    @Primary
    public Puppy Dalkong(){
        Dalkong dalkong = new Dalkong();
        return dalkong;
    }
}
