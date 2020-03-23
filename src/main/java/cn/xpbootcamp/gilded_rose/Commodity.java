package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.utils.DateUtils;

public class Commodity {
    public long SellIn;
    public int Quality;

    public Commodity(long sellIn, int quality) {
        this.SellIn = sellIn;
        this.Quality = quality;
    }

    public long getSellIn() {
        return SellIn;
    }

    public void setSellIn(long sellIn) {
        SellIn = sellIn;
    }

    public int getQuality() {
        return Quality;
    }

    public void setQuality(int quality) {
        Quality = quality;
    }

    public int getValue(long currentTime) {
        if (currentTime - this.SellIn > 0) {
            int days = DateUtils.getDiffDays(this.SellIn, currentTime);
            int curQuality = this.Quality - 2 * days;
            if (curQuality < 0) {
                return 0;
            }
            return curQuality;
        }
        return this.Quality;
    }
}
