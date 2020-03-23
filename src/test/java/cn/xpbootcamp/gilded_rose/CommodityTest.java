package cn.xpbootcamp.gilded_rose;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommodityTest {

    @Test
    public void test_aged_brie_created() {
        AgedBrie agedBrie = new AgedBrie(9999, 20);
        assertEquals(agedBrie.getSellIn(), 9999);
        assertEquals(agedBrie.getQuality(), 20);
    }

    @Test
    public void test_sulfuras_created() {
        Sulfuras sulfuras = new Sulfuras(50);
        assertEquals(sulfuras.getQuality(), 50);
        assertEquals(sulfuras.getSellIn(), -1);
    }

    @Test
    public void test_backstage_pass_create() {
        BackstagePass backstagePass = new BackstagePass(10, 10);
        assertEquals(backstagePass.getSellIn(), 10);
        assertEquals(backstagePass.getQuality(), 10);
    }

}
