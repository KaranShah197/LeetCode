package com.online.code;

import com.online.code.controller.easy.SingleRowKeyboard;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class JavaEasyTests {

    /**
     * The SingleRowKeyboard
     */
    SingleRowKeyboard srk;
    @Before
    public void setUp() throws Exception {
        srk = new SingleRowKeyboard();
    }

    @After
    public void tearDown() throws Exception {
        srk = null;
    }

    @Test
    void contextLoads() {
    }

    @org.junit.Test //1
    public void singleRowKeyBoardTests() {
        Assert.assertTrue("1st test case",
                srk.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba")  == 4);
        Assert.assertTrue("2nd test case",
                srk.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode") == 73);

        assertEquals(srk.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"), 4, 0);
        assertEquals(srk.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"), 73, 0);
        Assert.assertNotEquals(srk.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"),
                srk.calculateTime("pqrstuvwxyzabcdefghijklmno", "eletcode"));
        Assert.assertNotEquals(srk.calculateTime("abcdefghijklmnopqrstuvwxyz", "abc"),
                srk.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"));
    }


}
