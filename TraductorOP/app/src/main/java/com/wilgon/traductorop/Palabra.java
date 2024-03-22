package com.wilgon.traductorop;

public class Palabra {
    private String palabraEsp;
    private String palabraIng;
    private int img;

    public Palabra(String palabraEsp, String palabraIng, int img) {
        this.palabraEsp = palabraEsp;
        this.palabraIng = palabraIng;
        this.img = img;
    }

    public String getPalabraEsp() {
        return palabraEsp;
    }

    public void setPalabraEsp(String palabraEsp) {
        this.palabraEsp = palabraEsp;
    }

    public String getPalabraIng() {
        return palabraIng;
    }

    public void setPalabraIng(String palabraIng) {
        this.palabraIng = palabraIng;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
