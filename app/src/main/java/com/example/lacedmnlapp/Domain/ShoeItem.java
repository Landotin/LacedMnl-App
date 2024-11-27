package com.example.lacedmnlapp.Domain;

public class ShoeItem {
    private String title;
    private String pic;

    public ShoeItem(String title, String pic) {
        this.title = title;
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public String getPic() {
        return pic;
    }
}
