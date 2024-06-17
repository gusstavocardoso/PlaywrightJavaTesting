package org.example.utils;

import com.microsoft.playwright.Page;
import org.testng.annotations.*;

public class TestBase {
    protected Page page;

    @BeforeClass
    public void setup() {
        page = PlaywrightFactory.getPage();
    }

    @AfterClass
    public void tearDown() {
        PlaywrightFactory.close();
    }
}
