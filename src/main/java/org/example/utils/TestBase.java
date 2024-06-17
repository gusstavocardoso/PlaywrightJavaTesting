package org.example.utils;

import com.microsoft.playwright.Page;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

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
