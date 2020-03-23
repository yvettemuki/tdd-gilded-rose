package cn.xpbootcamp.gilded_rose;

public class Sulfuras extends Commodity {

    public Sulfuras(int quality) {
        super(-1, quality);
    }

    @Override
    public void setSellIn(long sellIn) {
        this.SellIn =  -1;
    }

    public int getValue(long currentTime) {
        return this.Quality;
    }
}
