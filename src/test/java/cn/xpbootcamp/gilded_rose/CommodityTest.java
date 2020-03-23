package cn.xpbootcamp.gilded_rose;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommodityTest {

    @Test
    public void test_commodity_created() {
        int quality = 30;
        long sellInTime = 1584937574;
        long outDatedTime7Days = 1585542374;
        long outDatedTime18Days = 1586492774;
        long inDatedTime = 1583814374;
        Commodity commodity = new Commodity(sellInTime, quality);
        assertEquals(commodity.getQuality(), 30);
        assertEquals(commodity.getSellIn(), 1584937574);
        assertEquals(commodity.getValue(outDatedTime7Days), 16);
        assertEquals(commodity.getValue(outDatedTime18Days), 0);
        assertEquals(commodity.getValue(inDatedTime), 30);
    }

    @Test
    public void test_aged_brie_created() {
        long sellInTime = 1584937574;
        long outedDate7Days = 1585542374; // 7 days
        int quality = 20;
        AgedBrie agedBrie = new AgedBrie(sellInTime, quality);
        assertEquals(agedBrie.getSellIn(), 1584937574);
        assertEquals(agedBrie.getQuality(), 20);
        assertEquals(agedBrie.getValue(outedDate7Days), 14);
    }

    @Test
    public void test_sulfuras_created() {
        long currentTime = 1585542374;
        int quality = 50;
        Sulfuras sulfuras = new Sulfuras(quality);
        assertEquals(sulfuras.getQuality(), 50);
        assertEquals(sulfuras.getSellIn(), -1);
        assertEquals(sulfuras.getValue(currentTime), 50);
    }

    @Test
    public void test_backstage_pass_create() {
        int quality = 10;
        long sellInTime = 1584937574;
        long dateToShow7days = 1584332774;
        long dateToShow3days = 1584678374;
        long outedDate3Days = 1585196774;
        BackstagePass backstagePass = new BackstagePass(sellInTime, quality);
        assertEquals(backstagePass.getSellIn(), 1584937574);
        assertEquals(backstagePass.getQuality(), 10);
        assertEquals(backstagePass.getValue(dateToShow7days), 16);
        assertEquals(backstagePass.getValue(dateToShow3days), 26);
        assertEquals(backstagePass.getValue(outedDate3Days), 0);
    }

}
