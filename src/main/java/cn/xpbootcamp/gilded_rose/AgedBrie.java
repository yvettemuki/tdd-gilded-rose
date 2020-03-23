package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.utils.DateUtils;

public class AgedBrie extends Commodity {

    public AgedBrie(long sellIn, int quality) {
        super(sellIn, quality);
    }

    public int getValue(long currentTime) {
        long startTime = this.SellIn;
        return DateUtils.getDiffDays(startTime, currentTime) * 2;
    }


}
