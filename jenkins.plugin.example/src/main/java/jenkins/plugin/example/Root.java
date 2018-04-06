package jenkins.plugin.example;

import hudson.model.RootAction;
import hudson.Extension;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;


@Extension
public class Root implements RootAction {
	public String getIconFileName(){
		return "graph.png";
	}

	@Override
	public String getDisplayName() {
		return "jenkins plugin example";
	}

	@Override
	public String getUrlName() {
		return "jenkins_plugin_example";
	}
	
	public String getAll() {
		return "hello jenkins plugin example!";
	}
	
	public String doReqResTest(StaplerRequest req, StaplerResponse rsp){
		String testValue = req.getParameter("testValue");
		return "hi, "+testValue;
	}
	
}
