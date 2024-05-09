package POM;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePage {
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			}

		@FindBy(linkText="Register")
		private WebElement registerLink;
		
		@FindBy(linkText="Log in")
		private WebElement loginLink;
		
		@FindBy(linkText="Shopping cart")
		private WebElement shoppingCartLink;
		
		@FindBy(linkText="Wishlist")
		private WebElement wishlistLink;
		
		@FindBy(xpath="//input[@value='Search']")
		private WebElement searchBtn;
		
		@FindBy(id="small-searchterms")
		private WebElement searchBox;
		
		@FindBy(partialLinkText="BOOKS")
		private WebElement booksTab;
		
		@FindBy(partialLinkText="COMPUTERS")
		private WebElement computersTab;
		
		@FindBy(partialLinkText="ELECTRONICS")
		private WebElement electronicsTab;
		
		@FindBy(partialLinkText="APPAREL & SHOES")
		private WebElement apparel_shoesTab;
		
		@FindBy(partialLinkText="DIGITAL DOWNLOADS")
		private WebElement digitalTab;
		
		@FindBy(partialLinkText="JEWELRY")
		private WebElement jewelryTab;
		
		@FindBy(partialLinkText="GIFT CARDS")
		private WebElement gift_cardsTab;
		
		@FindBy(xpath="(//img)[2]")
		private WebElement image;

		public WebElement getRegisterLink() {
			return registerLink;
		}

		public WebElement getLoginLink() {
			return loginLink;
		}

		public WebElement getShoppingCartLink() {
			return shoppingCartLink;
		}

		public WebElement getWishlistLink() {
			return wishlistLink;
		}

		public WebElement getSearchBtn() {
			return searchBtn;
		}

		public WebElement getSearchBox() {
			return searchBox;
		}

		public WebElement getBooksTab() {
			return booksTab;
		}

		public WebElement getComputersTab() {
			return computersTab;
		}

		public WebElement getElectronicsTab() {
			return electronicsTab;
		}

		public WebElement getApparel_shoesTab() {
			return apparel_shoesTab;
		}

		public WebElement getDigitalTab() {
			return digitalTab;
		}

		public WebElement getJewelryTab() {
			return jewelryTab;
		}

		public WebElement getGift_cardsTab() {
			return gift_cardsTab;
		}

		public WebElement getImage() {
			return image;
		}
		
		
		}
		
		

	
	

