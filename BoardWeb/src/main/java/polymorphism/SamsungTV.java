package polymorphism;

public class SamsungTV implements TV{

	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("SamsungTV.setSpeaker");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("SamsungTV.setPrice");
		this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsungTV--전원 켠다. (가격: " + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV.powerOff");
	}

	public void volumeUp() {
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	public void volumeDown() {
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}

//	public void initMethod() {
//		System.out.println("SamsungTV.initMethod");
//	}
//
//	public void destroyMethod() {
//		System.out.println("SamsungTV.destroyMethod");
//	}
}
