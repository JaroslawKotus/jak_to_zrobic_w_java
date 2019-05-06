package tests;

import org.junit.Before;
import org.junit.Test;
import pageobjects.ContactPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static tests.Config.*;

public class TestContactPage extends Base {
    private ContactPage contactPage;

    @Before
    public void setUp() {

        contactPage = new ContactPage(driver);
    }

    @Test
    public void checkContactPageTitle() {
        assertEquals(staticTitleContactPage, contactPage.getTitle());
    }

    @Test
    public void elementAppears() {
        contactPage.insertDataAndPushSubmit("tadek","test@testuj.pl","text");
        assertTrue("should display text 'Your message has been sent.' when user sends message  ", contactPage.successMessagePresent());
    }

}
