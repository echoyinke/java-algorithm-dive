package com.keyin.algorithms.data_structures.test;

import com.keyin.algorithms.data_structures.BTree;
import com.keyin.algorithms.data_structures.test.common.JavaCollectionTest;
import com.keyin.algorithms.data_structures.test.common.TreeTest;
import com.keyin.algorithms.data_structures.test.common.Utils;
import com.keyin.algorithms.data_structures.test.common.Utils.TestData;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class BTreeTests {

    @Test
    public void testBTree() {
        TestData data = Utils.generateTestData(1000);

        String bstName = "B-Tree";
        BTree<Integer> bst = new BTree<Integer>(2);
        Collection<Integer> bstCollection = bst.toCollection();

        assertTrue(TreeTest.testTree(bst, Integer.class, bstName, data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(bstCollection, Integer.class, bstName,
                                                     data.unsorted, data.sorted, data.invalid));
    }
}
