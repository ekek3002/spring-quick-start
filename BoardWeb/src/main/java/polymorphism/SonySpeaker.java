package polymorphism;

import org.springframework.stereotype.Component;

//@Component("sony")
public class SonySpeaker implements Speaker{
    public SonySpeaker() {
        System.out.println("SonySpeaker.SonySpeaker");
    }

    public void volumeUp() {
        System.out.println("SonySpeaker.volumeUp");
    }

    public void volumeDown() {
        System.out.println("SonySpeaker.volumeDown");
    }
}
