package io.mycat.route.function;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * TODO
 *
 * @author mawenhao
 * @since 2023/6/15
 */
public class PartitionByFileMapTest extends TestCase {

    public void testCalculate() {
        PartitionByFileMap partition = new PartitionByFileMap();
        partition.setMapFile("demo.txt");
        partition.setType(1);
        partition.init();

        Assert.assertEquals(partition.calculate("CLSS") == 0, true);
        Assert.assertEquals(partition.calculate("clss") == 0, true);
        Assert.assertEquals(partition.calculate("123") == 0, true);
    }
}