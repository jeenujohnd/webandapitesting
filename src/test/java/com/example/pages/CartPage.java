package com.example.pages;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

public class CartPage extends PageObject {

    public void addProductToCart() {
        $(By.xpath("(//a[contains(text(),'Add to cart')])[1]")).click();
    }

    public void addMoreProductsToCart() {
        $(By.xpath("(//a[contains(text(),'Add to cart')])[3]")).click();
        }

    public void productAddedMessage() {
        System.out.println("Printing productAddedMessage:"+ $(By.xpath("//h4[normalize-space()='Added!']")).getText());
        assert ($(By.xpath("//h4[normalize-space()='Added!']")).getText().equalsIgnoreCase("Added!"));
    }

    public void viewCartOption() {
        assert ($(By.xpath("//u[normalize-space()='View Cart']"))
                .getText().equalsIgnoreCase("View Cart"));
    }

    public void clickViewCart() {
        $(By.xpath("//u[normalize-space()='View Cart']")).click();
    }

    public void viewAddedProduct() {
        String text1 = $(By.cssSelector("a[href='/product_details/1']")).getText();
        System.out.println(text1);
        $(By.cssSelector("a[href='/products']")).click();
        String text2 = $(By.xpath("(//p[contains(text(),'Blue Top')])[1]")).getText();
        assert (text1.equalsIgnoreCase(text2));
        System.out.println(text2);
    }

    public void viewContinueShopping() {
        assert ($(By.className("btn-success"))
                .getText().equalsIgnoreCase("Continue Shopping"));
    }

    public void clickContinueShopping() {
        $(By.className("btn-success")).click();
    }


    public void viewAllAddedProducts() {

        List<WebElementFacade> productsAdded = findAll(By.xpath("//td[@class='cart_description']"));
        System.out.println(productsAdded.size());
        for(int i=0;i<productsAdded.size();i++)
        {
            System.out.println("Product added to the cart is " +productsAdded.get(i).getText());
        }

    }

    public void viewProductQuantity() {
        assert ($(By.className("disabled")).getText().equalsIgnoreCase("1"));
        System.out.println("Number of products added to the cart are "
                +$(By.className("disabled")).getText());
    }

    public void viewProceedToCheckoutOption() {
        assert ($(By.className("check_out")).getText().equalsIgnoreCase("Proceed to checkout"));
    }

    public void clickProceedToCheckout() {
        $(By.className("check_out")).click();
    }

    public void viewDeliveryAddress() {
        assert ($(By.className("page-subheading"))
                .getText().equalsIgnoreCase("YOUR DELIVERY ADDRESS"));
    }

    public void viewBillingAddress() {
        assert ($(By.cssSelector("ul[id='address_invoice'] h3[class='page-subheading']"))
                .getText().equalsIgnoreCase("YOUR BILLING ADDRESS"));
    }

    public void viewReviewOrder() {
        String reviewProd1=($(By.id("product-1")).findElement(By.className("cart_description"))
                .getText());
        System.out.println(reviewProd1);
    }

    public void viewTotalAmount() {
       ListOfWebElementFacades productPricesList = findAll(By.cssSelector("td[class='cart_total']"));
        System.out.println("Total amount to be viewed for " +productPricesList.size()
                +" number of products.");
        System.out.println("Prices of all the products added are " +productPricesList);

       int sum=0;
       for(int i=0;i<productPricesList.size();i++) {
           String amount = productPricesList.get(i).getText().replace("Rs. ","");
           System.out.println(amount +" Rs. for no. " +i + " item" );
           if(amount!=null)
           {
               sum = sum + Integer.parseInt(amount);
           }
       }
        System.out.println("The total amount is "+sum);

        String temp = $(By.xpath("//tbody/tr[3]"))
                 .getText().replace("Total Amount","");
        String newTemp = temp.replace("Rs. ","");

        int total = Integer.parseInt(newTemp.trim());

        System.out.println((Integer.parseInt(newTemp.trim())));
        Assert.assertEquals(sum,total);
    }

    public void inputComments() {
        $(By.className("form-control")).sendKeys("waiting for the order");
    }

    public void placeOrderEnabled() {
        assert ($(By.className("check_out")).isEnabled());
    }

    public void clickPlaceOrder() {
        $(By.className("check_out")).click();
    }


    public void paymentPage() {
        assert ($(By.className("heading")).getText().equalsIgnoreCase("Payment"));
    }

    public void inputCardName(String cardName) {
        $(By.xpath("//input[@name='name_on_card']")).sendKeys(cardName);
    }


    public void inputCardNumber(Integer cardNumber) {
        $(By.xpath("//input[@name='card_number']")).sendKeys(String.valueOf(cardNumber));
    }

    public void inputCVV(Integer cvv) {
        $(By.xpath("//input[@name='cvc']")).sendKeys(String.valueOf(cvv));
    }

    public void inputExpirationMonth(Integer expirationMonth) {
        $(By.xpath("//input[@name='expiry_month']")).sendKeys(String.valueOf(expirationMonth));
    }

    public void inputExpirationYear(Integer expirationYear) {
        $(By.xpath("//input[@name='expiry_year']")).sendKeys(String.valueOf((expirationYear)));
    }

    public void clickPayAndConfirmOrder() {
        $(By.id("submit")).click();
    }

    public void viewOrderPlacedMessage() {
        assert ($(By.className("text-center")).getText().trim().equalsIgnoreCase("Order Placed!"));
    }

    public void clickContinue() {
        $(By.className("btn-primary")).click();
    }

    public void clickDeleteProducts() {
        $(By.xpath("//td[@class='cart_delete']")).click();
    }

    public void cartEmptyMessage() {
        assert ($(By.cssSelector("p[class='text-center'] b"))
                .getText().trim().equalsIgnoreCase("Cart is empty!"));
        System.out.println("The cart is empty!!!!!");
    }

    public void viewCategory() {
        assert ($(By.xpath("//h2[normalize-space()='Category']"))
                .getText().trim().equalsIgnoreCase("category"));
    }

    public void viewCategoryList() {
        ListOfWebElementFacades categoryList = findAll(By.id("accordian"));
        System.out.println("List size: " +categoryList.size());
        System.out.println("The categories are :");
        for(int i =0;i<categoryList.size();i++)
        {

            System.out.println(categoryList.get(i).getText());
        }
    }

    public void clickCategory() {
        $(By.className("fa-plus")).click();
    }

    public void viewSubCategoryList() {
        ListOfWebElementFacades subCategoryList = findAll(By.cssSelector("div[id='Women'] ul"));
        System.out.println("List size: " +subCategoryList.size());
        System.out.println("The subcategories are: ");
        for(int i=0;i<subCategoryList.size();i++)
        {
            System.out.println(subCategoryList.get(i).getText());
        }

    }

    public void clickSubCategory() {
        $(By.xpath("//a[@href='/category_products/1']")).click();
    }

    public void viewSubCategoryPage() {
        assert($(By.className("text-center")).getText()
                .trim().equalsIgnoreCase("WOMEN - DRESS PRODUCTS"));
        System.out.println($(By.className("text-center")).getText());
        $(By.className("fa-plus")).click();

    }

    public void clickAnotherCategory() {
        $(By.xpath("(//i[@class='fa fa-plus'])[2]")).click();
    }

    public void viewAnotherSubCategoryList() {
        ListOfWebElementFacades anotherSubCategoryList
                = findAll(By.xpath("//div[@id='Men']//ul"));
        System.out.println("The other subcategory list is:");
        for (int i = 0; i<anotherSubCategoryList.size();i++)
        {
            System.out.println(anotherSubCategoryList.get(i).getText());
        }
    }

    public void clickAnotherSubCategory() {
        $(By.xpath("//a[@href='/category_products/3']")).click();
    }

    public void viewAnotherSubCategoryPage() {
        assert ($(By.className("text-center"))
                .getText().trim().equalsIgnoreCase("MEN - TSHIRTS PRODUCTS"));
        System.out.println($(By.className("text-center")).getText());
    }

    public void viewBrands() {
        assert ($(By.xpath("//h2[normalize-space()='Brands']"))
                .getText().trim().equalsIgnoreCase("Brands"));
    }

    public void viewBrandsList() {
        ListOfWebElementFacades brandsList=findAll(By.className("brands-name"));
        System.out.println("Brands list size :" +brandsList.size());
        for (int i=0;i<brandsList.size();i++)
        {
            System.out.println(brandsList.get(i).getText());
        }
    }

    public void clickBrand() {
        $(By.xpath("//a[@href='/brand_products/Polo']")).click();
    }

    public void viewBrandPage() {
        assert ($(By.className("text-center")).getText().trim()
                .equalsIgnoreCase("BRAND - POLO PRODUCTS"));
        System.out.println("Page Title : "+$(By.className("text-center")).getText());
    }

    public void countBrandProduct() {
        ListOfWebElementFacades productCount=findAll(By.className("countBrandProduct"));
        System.out.println(("Number of products :")+productCount.size());
    }

    public void viewsBrandProduct() {
        $(By.cssSelector("a[href='/product_details/1']")).click();
    }

    public void checkBrand() {
        assert ($(By.xpath("//body//section//p[4]"))
                .getText().trim().contains("Polo"));
    }


//    public void clickBuyProducts() {
//        getWaitForTimeout();
//        $(By.xpath("//u[normalize-space()='here']")).click();
//    }
}

