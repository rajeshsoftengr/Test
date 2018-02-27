package com.test.mm.mf.main;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
		String url = "http://www.bing.com/search?q=";
		String bigSearchStrings = "java,javac,javadoc,java+jar,javap,java+jdeps,java+scripting,"
				+ "java+securtiy,java+monitoring,java+jconsole,java+visualVM,java+JMC,java+JFR,"
				+ "java+JPDA,java+JVA+TI,java+IDL,java+RMI,JAVA+DB,JAVA+DEPLOYMENT,java+internationalization,"
				+ "web+services,java+troubleshooting,java+web+start,java+applet,javafx,java+swing,java+2d,"
				+ "java+awt,java+accessibility,java+drag+and+drop,"
				+ "java+JNDI,java+Beans,Java+Serialization,java+jmx,java+jms,"
				+ "java+jaxp,java+math,java+collections,java+regular+expressions,"
				+ "java+logging,java+management,java+instrumentation,java+reflection,"
				+ "java+versioning,java+lang,java+util,rajeshsoftengr,wipro,tech+mahindra,tata+consultancy+services,"
				+ "Mphasis,infosys,hcl+technologies,accel+frontline,cognizant,syntal,igate,zoho+corp,intellect+design, "
				+ "Assamese, Bengali, Gujarati, Kannada, Kashmiri, Konkani, Malayalam, Marathi, Nepali, Oriya, Punjabi, "
				+ "Sanskrit, Tamil, Telugu, Urdu"
				+ "Alaska,	Alabama,	Arizona,	Arkansas,	California,	Colorado,	Connecticut,	"
				+ "Delaware,	Florida,	Georgia,	Hawaii,	Idaho,	Illinois+Indiana,	Iowa,	Kansas,	"
				+ "Kentucky,	Louisiana,	Maine,	Maryland,	Massachusetts,	Michigan,	Minnesota,	"
				+ "Mississippi,	Missouri,	Montana+Nebraska,	Nevada,	New+Hampshire,	New+Jersey,	"
				+ "New+Mexico,	New+York,	North+Carolina,	North+Dakota,	Ohio,	Oklahoma,	"
				+ "Oregon,	Pennsylvania+Rhode+Island,	South+Carolina,	South+Dakota,	Tennessee,	"
				+ "Texas,	Utah,	Vermont,	Virginia,	Washington,	West+Virginia,	Wisconsin,	Wyoming"
				+ "Java+Apache+Ant				 ,Java+Apache+POI+(Powerpoint) , Java+Apache+POI+(Word)       , "
				+ "Java+Apache+POI              ,Java+AWT                     ,Java+Design+Patterns         ,"
				+ "Java+EasyMock                ,Java+Eclipse                 ,Java+EJB                     ,"
				+ "Java+Guava                   ,Java+Hibernate               ,Java+iBATIS                  ,"
				+ "Java+Jackson                 ,Java+JasperReports           ,Java+Java+Concurrency        ,Java+Java+RMI                ,"
				+ "Java+io+Package              ,Java+Interview+Questions     ,Java+lang+Package            ,Java+reflect+Package         ,"
				+ "Java+time+Package            ,Java+math+Package            ,Java+util+Package            ,Java+Java+XML                ,"
				+ "Java+Java-8                  ,Java+Examples                ,Java+JavaFx                  ,Java+JavaMail+API            ,"
				+ "Java+Jbpm5                   ,Java+JDB                     ,Java+JDBC                    ,Java+JFreeChart              ,"
				+ "Java+jMeter                  ,Java+JOGL                    ,Java+JPA                     ,Java+JSON                    ,"
				+ "Java+JSP                     ,Java+JUnit                   ,Java+log4j                   ,Java+Lucene                  ,"
				+ "Java+Maven                   ,va+PDFbox                  ,Java+Servlets                ,Java+Spring                  ,"
				+ "Java+Spring+AOP              ,va+Spring+MVC              ,Java+Spring+Web+Services     ,Java+Struts+2x               ,"
				+ "Java+Swing                   ,Java+TestNG                  ,Java+Apache+Tika             ,Java+Apache+Xerces           ,Java+XStream ,"
				+ "Ajax				,AmazonWebServices   ,AngularMaterial     ,Angular2            ,AngularJS           ,ApacheTapestry      ,"
				+ "ASP.Net             ,Aurelia             ,BackboneJS          ,Bootstrap           ,CakePHP             ,CherryPy            ,"
				+ "Codeigniter         ,CoffeeScript        ,CPanel              ,CSS                 ,Django              ,Drupal              ,"
				+ "Electron            ,EmberJS             ,ExpressJS           ,ExtJS               ,ES6                 ,Firebase            ,"
				+ "Flask               ,AdobeFlex           ,Foundation          ,Framework7          ,Google+Maps         ,Grav                ,"
				+ "Grunt               ,Gulp                ,GWT                 ,Highcharts          ,HTML                ,HTML5               ,"
				+ "HTTP                ,JasmineJS           ,JavaScript          ,Joomla              ,jQuery              ,jQueryUI            ,"
				+ "JSF                 ,KnockoutJS          ,KoaJS               ,Laravel             ,LESS                ,MathML              ,"
				+ "Magento+Framework   ,Material+Design+Lite,Materialize         ,Mootools            ,MVC+Framework       ,Phalcon             ,"
				+ "Prototype           ,Pure+CSS            ,ReactJS             ,RESTfulWebServices  ,RubyonRails2        ,RubyonRails         ,"
				+ "SASS                ,script+aculo+us     ,  SenchaTouch         ,  SVG                 ,  TurboGears          ,  Typescript          ,  "
				+ "VBScript            ,  W3CSS               ,  WebDevelopers+Guide ,  WebIcons            ,  Web2Py              ,  WebGL               ,  "
				+ "WebRTC              ,  WebServices         ,  Website+Development ,  WebSockets          ,  Wordpress           ,  XHTML               ,  "
				+ "Yii                 ,  ZendFramework ";
		List<String> searchStrings = Arrays.asList(bigSearchStrings.split(",")); 
		Collections.shuffle(searchStrings);
		System.out.println(searchStrings.size());
		int counter = 0;
		for(String s : searchStrings){
			counter++; 
			Desktop desk = Desktop.getDesktop();
			desk.browse(new URI(url.concat(s.trim())));
			if(counter == 30){
				break;
			}
			Thread.sleep(2000);
		}
	}
}
