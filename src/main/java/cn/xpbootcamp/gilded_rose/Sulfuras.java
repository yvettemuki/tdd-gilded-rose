package cn.xpbootcamp.gilded_rose;

public class Sulfuras extends Commodity {

    public Sulfuras(int quality) {
        super(-1, quality);
    }

    @Override
    public void setSellIn(int sellIn) {
        this.SellIn =  -1;
    }
}
