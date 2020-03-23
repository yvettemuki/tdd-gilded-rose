package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.utils.DateUtils;


public class BackstagePass extends Commodity {

    public BackstagePass(long sellIn, int quality) {
        super(sellIn, quality);
    }

    public int getValue(long currentTime) {
        int diff = DateUtils.getDiffDays(this.SellIn, currentTime);
        if (diff <= 0) {
            if (diff < 0 && Math.abs(diff) <= 10 && Math.abs(diff) > 5) {
                return (10 - Math.abs(diff)) * 2 + this.Quality;
            } else if (diff < 0 && Math.abs(diff) <= 5) {
                return this.Quality + 10 + (5 - Math.abs( diff )) * 3;
            } else if (diff  == 0) {
                return this.Quality + 10 + 15;
            }
        }
        return 0;
    }
}
