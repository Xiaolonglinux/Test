package growingIOTestcase1;

import org.jbehave.core.annotations.*;
import com.growingio.web.driver.Browser;
import com.growingio.web.environment.Chrome;
import com.growingio.web.environment.Firefox;
import com.growingio.web.environment.IE;
import com.growingio.web.environment.Remote;
import com.growingio.web.environment.RemoteCapabilities;
import com.growingio.web.pageobject.GrowingIO主页;
import com.growingio.web.pageobject.GrowingIO首页;
import com.growingio.web.pageobject.注册页面;
import com.growingio.web.pageobject.用户管理;
import com.growingio.web.pageobject.登录页面;
import com.growingio.web.pageobject.重设密码;
import com.growingio.web.pageobject.关于我们;
import com.growingio.web.pageobject.加入我们;
import com.growingio.web.pageobject.技术论坛;
import com.growingio.web.pageobject.邮箱页面;
import com.growingio.web.pageobject.概览;
import com.growingio.web.pageobject.忘记密码;
import com.growingio.web.pageobject.我的订阅;
import com.growingio.web.pageobject.看板;
// import com.growingio.web.pageobject.网易邮箱;
// import com.growingio.web.pageobject.接受邀请;
// import com.growingio.web.pageobject.关于我们;;
public class GrowingIODemoStep {

	String email = "xiaolong.chen@Dilatoit.com";
	String password = "123456";
	String phone = "15701007635";
	String url = "https://email.dilatoit.com";

	@Given("I has opend $BROWSER")
	public void givenIHaveOpend(@Named("BROWSER") String value) {
		if (value.toLowerCase().contains("firefox")) {
			Browser.createWebDriver(new Firefox(), 30);// 创建浏览器 等待三十秒
		} else if (value.toLowerCase().contains("ie")) {
			Browser.createWebDriver(new IE(), 30);
		} else if (value.toLowerCase().contains("chrome")) {
			Browser.createWebDriver(new Chrome(), 30);
		} else if (value.toLowerCase().contains("remote")) {
			RemoteCapabilities RemoteCapabilities = new RemoteCapabilities();
			RemoteCapabilities.username = "GrowingIO";
			RemoteCapabilities.accessKey = "232e34f7-0804-4c1d-a8ad-75b389fe7917";
			RemoteCapabilities.testName = "Demo";
			RemoteCapabilities.browserName = "safari";
			RemoteCapabilities.browserVersion = "8.0";
			RemoteCapabilities.platform = "OS X 10.10";
			Browser.createWebDriver(new Remote(), RemoteCapabilities, 30);
		}
	}
	// 打开网站
	@When("I forwards to $URL")
	public void whenIForwardTo(@Named("URL") String value) {
		Browser.goTo(value);
	}

	// 操作网站
	@Then("the browsers click login")
	public void thenTheBrowserTitleShouleBe() throws Exception {
		// 主站case test
		// 1 点击产品
	/*	GrowingIO首页.产品特色1();
		Thread.currentThread().sleep(1000);
		// 2 点击左上角的logo
		GrowingIO首页.logo().click();
		GrowingIO首页.申请2试用(phone, email, password);
		// 3 点击技术论坛
		GrowingIO首页.技术论坛().click();
		// 判断title/image 可以打开文章
		// 技术论坛.title().click();
		技术论坛.image().click();
		// 4 加入我们
		GrowingIO首页.加入我们().click(); // 点击加入我们按钮
		加入我们.click(); // 加入我们流程
		// 5关于我们
		关于我们.click();
		// 6 点击申请试用
		GrowingIO首页.申请试用1().click();
		String name = "test";
		注册页面.新用户申请(phone, email, name, password);// 注册页面
		*/
		// 7点击登录
		GrowingIO首页.登录().click();
		String password1 = "123456";
		登录页面.登录("support2@growingio.com", "yidongqa");
	  //  点击概览
		概览.概览click();
		//点击我的订阅
		我的订阅.我的订阅click();
		//点击看板
		看板.看板2();
		
	}

	@Then("the forgot password")
	public void thenTheForgotpassword() throws Exception {
		// 判断如果密码不正确，点击忘记密码，进行密码重置
		if (password.equals("1234")) {
			// 忘记密码
			忘记密码.forgotpassword(email);
			// 等待30s后台邮件发送完成
			Thread.currentThread().sleep(60000);// 毫秒
			Browser.goTo(url);
			// 登录邮箱
			String password = "7mK939D*";
			邮箱页面.longin(email, password);
			// 点击重设密码
			// 邮箱页面.重设密码1().click();
			String SetPassword = "123456";
			// 重置密码
			// 打开链接
			String url1 = 邮箱页面.website().getText();
			Browser.goTo(url1);
			重设密码.重置(SetPassword);
			登录页面.登录(email, SetPassword); // 登录进入
			// } else {
			// 进入GrowingIO主页，点击用户
			GrowingIO主页.user().click();
			String name1 = "mafengwo";
			String url = "www.mafengwo.com";
			用户管理.add(name1, url);
			// 进入用户管理
			String emailAddress = "xiaolong.chen@dilatoit.com";

			用户管理.邀请成员发送(emailAddress);
         
		}
	}
	
	

	// 新老用户接受邀请进行进行注册/登录操作
	@Then("the users accept the invitation")
	public void thenTheUsersAcceptTheInvitation() throws Exception {
		// 等待30秒，用户接受邮件
		/* Thread.currentThread().sleep(30000);// 毫秒 // 用户接收到邮件，打开邮件 String
		 // 登录邮箱
		   Browser.goTo("https://email.dilatoit.com");
		  String account = "xiaolong.chen@dilatoit.com"; 
		  String password = "123456"; 
		  邮箱页面.longin(account, password); 
		   String url=邮箱页面.website().getText();
		   Browser.goTo(url);
		  // 根据跳转的页面来判断是新老用户 
		  if
		  (Browser.getTitle().equals("登录到 GrowingIO")) { 
			  String Email1 =
		  "xiaolong.chen@dilatoit.com"; 
			  String password1 = "123456";
		  登录页面.登录(Email1, password1); // 老用户登录成功跳转主页 
		  } else { 
			  // 新用户设置姓名、电话、密码
		 // 补充信息 
		  String name = "xiaolong"; 
		  String phone = "15701007635"; 
		  String password2 = ""; 
		  接受邀请.addinfo(name, phone, password2);
		  // 注册成功并且自动登录，进入项目管理，进行添加
		  // 点击左上角用户进入用户管理界面 GrowingIO主页.user().click();
		String name1 = "你好"; String scheme = "www.nihao.com"; 用户管理.add(name1,
		 scheme); }
		*/
	}
}
