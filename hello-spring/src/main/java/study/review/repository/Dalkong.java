package study.review.repository;

import org.springframework.stereotype.Component;

@Component
public class Dalkong implements Puppy{

    @Override
    public void sounds(){
        System.out.println("멍멍");
    }

    @Override
    public void kind() {
        System.out.println("자브종");
    }



}
