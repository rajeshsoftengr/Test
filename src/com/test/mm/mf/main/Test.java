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
				+ "Texas,	Utah,	Vermont,	Virginia,	Washington,	West+Virginia,	Wisconsin,	Wyoming";
		List<String> searchStrings = Arrays.asList(bigSearchStrings.split(",")); 
		Collections.shuffle(searchStrings);
		int counter = 0;
		for(String s : searchStrings){
			counter++; 
			Desktop desk = Desktop.getDesktop();
			desk.browse(new URI(url.concat(s.trim())));
			//System.out.println(s);
			if(counter == 30){
				break;
			}
			Thread.sleep(2000);
		}
	}
}
