package facebooksikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class facebookdemo {
	public static void main(String args[]) throws FindFailed, InterruptedException
	{
		Pattern emailid=new Pattern("E:\\selenim jar\\facebookimages\\email.PNG");
		Pattern passwd=new Pattern("E:\\selenim jar\\facebookimages\\password.PNG");
		Pattern login=new Pattern("E:\\selenim jar\\facebookimages\\login.PNG");
		Pattern forgtpasswd=new Pattern("E:\\selenim jar\\facebookimages\\forgotaccount.PNG");
		Pattern backword=new Pattern("E:\\selenim jar\\facebookimages\\backword.PNG");
		System.setProperty("webdriver.chrome.driver", "E:\\selenim jar\\New Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		Screen screen=new Screen();
		Thread.sleep(5000);
		screen.click(forgtpasswd);
		Thread.sleep(5000);
		screen.click(backword);
		Thread.sleep(5000);
		screen.type(emailid, "payalraghatate111@gmail.com");
		screen.type(passwd, "password345");
		screen.click(login);
		
	}
	

}
