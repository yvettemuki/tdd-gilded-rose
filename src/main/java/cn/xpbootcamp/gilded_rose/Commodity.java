package cn.xpbootcamp.gilded_rose;

public class Commodity {
    public int SellIn;
    public int Quality;

    public Commodity(int sellIn, int quality) {
        this.SellIn = sellIn;
        this.Quality = quality;
    }

    public int getSellIn() {
        return SellIn;
    }

    public void setSellIn(int sellIn) {
        SellIn = sellIn;
    }

    public int getQuality() {
        return Quality;
    }

    public void setQuality(int quality) {
        Quality = quality;
    }
}
