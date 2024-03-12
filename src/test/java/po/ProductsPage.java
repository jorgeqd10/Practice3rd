package po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ProductsPage extends BasePage{
    public ProductsPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-backpack']")
    private WebElement backpackAddToCartBtn;

    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement tshirtAddToCartBtn;

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    private WebElement shoppingCartIcon;
}
