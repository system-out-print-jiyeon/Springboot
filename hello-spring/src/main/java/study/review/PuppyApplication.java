package study.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import study.review.repository.Puppy;

@SpringBootApplication
public class PuppyApplication implements CommandLineRunner{

    @Autowired
    @Qualifier("al")
    Puppy puppy;

    public static void main(String[] args) {
        SpringApplication.run(PuppyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        puppy.sounds();
        puppy.kind();
    }


}
