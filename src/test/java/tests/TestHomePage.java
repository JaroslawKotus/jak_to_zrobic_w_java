package tests;

import org.junit.Before;
import org.junit.Test;
import pageobjects.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static tests.Config.staticHeadLineHomePage;
import static tests.Config.staticTitleHomePage;

public class TestHomePage extends Base {

    private HomePage homePage;

    @Before
    public void setUp() {
        homePage = new HomePage(driver);
    }

    @Test
    public void checkHomePageTitle() {
        assertEquals(staticTitleHomePage, homePage.getTitle());
    }

    @Test
    public void expectedCaruselItem() {
        assertEquals(staticHeadLineHomePage, homePage.checkHeadline());
    }

    @Test
    public void dropDownAppears() {
        assertTrue("after clicking 'About' dropdown should appear", homePage.dropDownAppears());
    }


}
