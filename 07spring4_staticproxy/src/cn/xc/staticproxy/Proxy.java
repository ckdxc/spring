package cn.xc.staticproxy;

import javax.sound.midi.Soundbank;

public class Proxy implements Rent{
    private Host host;
    public Proxy(Host host) {
        this.host = host;
    }
    public void setHost(Host host) {
        this.host = host;
    }
    @Override
    public void rent(){
        seeHouse();
        host.rent();
        fare();
    }
    private void seeHouse(){
        System.out.println("带房客看房");
    }
    private void fare(){
        System.out.println("收取中介费");
    }
}
