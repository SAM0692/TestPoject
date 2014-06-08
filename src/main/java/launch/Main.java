package launch;

import java.io.File;
import org.apache.catalina.Context;
import org.apache.catalina.core.AprLifecycleListener;
import org.apache.catalina.core.StandardServer;
import org.apache.catalina.startup.Tomcat;

public class Main {

  public static void main(String[] args) throws Exception {

    String webappDirLocation = "src/main/webapp/";
    Tomcat tomcat = new Tomcat();
    tomcat.setPort(8080);

    tomcat.setBaseDir(".");
    tomcat.getHost().setAppBase(".");
    tomcat.setSilent(false);

    Context ctx = tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
    Tomcat.addServlet(ctx, "jsf_servlet", "javax.faces.webapp.FacesServlet");
    ctx.addServletMapping("*.xhtml", "jsf_servlet");
    tomcat.start();
    tomcat.getServer().await();
  }
}
