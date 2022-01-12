package polymorphism;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker{
    public AppleSpeaker() {
        System.out.println("AppleSpeaker.AppleSpeaker");
    }

    @Override
    public void volumeUp() {
        System.out.println("AppleSpeaker.volumeUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("AppleSpeaker.volumeDowm");
    }
}
