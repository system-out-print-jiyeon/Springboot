package study.review.repository;

import org.springframework.stereotype.Component;

@Component
public class Alkong implements Puppy{
    @Override
    public void sounds() {
        System.out.println("왕왕");
    }

    @Override
    public void kind() {
        System.out.println("포메라니안");
    }
}
