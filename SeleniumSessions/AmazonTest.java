package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {

		String browserName = "edge";
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.LaunchBrowser(browserName);
		
		brUtil.launchURL("https://amazon.com");
		
		String title=brUtil.getPageTitle();
		
		if(title.contains("Amazon")) {
			System.out.println("title is pass");
		}
		else {
			System.out.println("title is failed");
		}
		String myurl =brUtil.getPageurl();
		if(myurl.contains("amazon.com")) {
			System.out.println("this is the correct url"+  myurl);
		}
		else
			System.out.println("this is the wrong url"+myurl);

		
		brUtil.closeBrowser();
	}

}
