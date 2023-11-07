import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import org.openqa.selenium.By;


public class CheckoutTest extends Hooks {

    public CheckoutPage checkoutPage;


    @Before
    public void setupPageObject() {
        checkoutPage = new CheckoutPage(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void checkout() throws InterruptedException {
        System.out.println(checkoutPage.billingPostcode);
        checkoutPage.getFoodMenu();
        checkoutPage.getAddToCart();
        checkoutPage.getCityCart();
        checkoutPage.setPostcode("12345");
        checkoutPage.clickCartRegionDropdown();
        checkoutPage.selectCartRegion("Alabama");
        checkoutPage.clickCheckoutButton();
        checkoutPage.clickRegisterButton();
        checkoutPage.setFirstName("Test");
        checkoutPage.setMiddleName("Test2");
        checkoutPage.setLastName("Test3");
        checkoutPage.setCompany("Test5");
        checkoutPage.setEmail("asdf@example.com");
        checkoutPage.setStreet1("adresa mea");
        checkoutPage.setStreet2("adresa mea 2");
        checkoutPage.setCity("Alabama City");
        checkoutPage.selectRegion("Alabama");
        checkoutPage.setBillingPostcode("12345");
        checkoutPage.setBillingTelephone("0777777777");
        checkoutPage.clickWhenReady(checkoutPage.billingContinue);
        checkoutPage.clickWhenReady(checkoutPage.shippingContinue);
        checkoutPage.clickWhenReady(checkoutPage.lastContinue);
        checkoutPage.clickWhenReady(checkoutPage.order);

    }

    @Test
    public void checkoutAnotherTest() {

    }
}
