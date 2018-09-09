package cn.xc.vo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> habbies;
    private Map<String,String> cards;
    private Set<String> games;
    private String wife;
    private Properties info;
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public void setHabbies(List<String> habbies) {
        this.habbies = habbies;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public void show(){
        for(String book : books){
            System.out.println(this.name+" has "+book+" in "+address.getAddress());
        }
        System.out.println("habbies is "+habbies);
        System.out.println(cards.get("公交卡"));
        System.out.println(games);
        System.out.println(wife);
        System.out.println(info);
    }
}
