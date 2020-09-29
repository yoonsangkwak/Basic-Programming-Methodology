package week3.Homework2;

public class Television {
    private String BrandName;  // 브랜드명
    private boolean Powered = false;  // 켜져있는가?
    private int Channel = 1;  // 현재 채널
    int Volume = 0;  // 현재 볼륨
    // 생성자
    public Television() {
        // 아무것도 안함.
    }

    public String toString() {
        String str = "Brandname: " + BrandName + "\n";
        str = str + "IsPowered: " + Powered + "\n";
        str = str + "Channel: " + Channel + "\n";
        str = str + "Volume: " + Volume;
        return str;
    }

    // 다음 함수들을 정의하세요.
    // getChannel : 현재 채널을 반환한다.
    public int getChannel () {
        return Channel;
    }
    // getBrandName : 브랜드명을 반환한다.
    public String getBrandName () {
        return BrandName;
    }
    // getVolume : 현재 볼륨을 반환한다.
    public int getVolume () {
        return Volume;
    }
    // getPower : 현재 전원 상태를 반환한다.
    public boolean getPower () {
        return Powered;
    }

    // TV 의 전원을 주어진 값으로 변경.
    public void setPowered(boolean NewPowered) {
        Powered = NewPowered;
    }

    // 다음 함수들을 정의하세요.
    // setChannel : TV의 채널 번호를 주어진 값으로 변경.
    public void setChannel (int NewChannel) {
        Channel = NewChannel;
    }
    // setBrandName : TV의 브랜드명을 주어진 값으로 변경.
    public void setBrandName (String NewBrandName) {
        BrandName = NewBrandName;
    }
    // setVolume : TV의 볼륨을 주어진 값으로 변경.
    public void setVolume (int NewVolume) {
        Volume = NewVolume;
    }
    // incrementChannel : TV의 채널을 1만큼 증가시킨다.
    public void incrementChannel() {
        Channel += 1;
    }
    // decrementChannel : TV의 채널을 1만큼 감소시킨다.
    public void decrementChannel() {
        Channel -= 1;
    }
    // incrementVolume : TV의 볼륨을 1만큼 증가시킨다.
    public void incrementVolume() {
        Volume += 1;
    }
    // decrementVolume : TV의 볼륨을 1만큼 감소시킨다.
    public void decrementVolume() {
        Volume -= 1;
    }
}