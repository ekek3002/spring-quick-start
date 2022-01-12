package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("tv")
public class LgTv implements TV{

    //@Resource(name = "apple")
    @Autowired //@Qualifier("apple")
    private Speaker speaker;

    public LgTv() {
        System.out.println("LgTv.LgTv");
    }

    public void powerOn() {
        System.out.println("LgTv.powerOn");
    }
    public void powerOff() {
        System.out.println("LgTv.powerOff");
    }
    public void volumeUp() {
//        System.out.println("LgTv.volumeUp");
        speaker.volumeUp();
    }
    public void volumeDown() {
//        System.out.println("LgTv.volumeDown");
        speaker.volumeDown();
    }
}
