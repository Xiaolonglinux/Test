package growingIOTestcase1;
import java.util.List;
import org.jbehave.core.configuration.Configuration;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;


import com.growingio.web.util.Global;
public class GrowingIOExcuteStories  extends JUnitStories 
{
	
	
	 public Configuration configuration() {
	        return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(this.getClass()))  
	                .useStoryReporterBuilder(new StoryReporterBuilder()
	                	.withCodeLocation(codeLocationFromClass(this.getClass()))
	                	.withFormats(Format.HTML)
	                	.withRelativeDirectory("/../result/"+Global.Time));
	    }
		
	    public List<CandidateSteps> candidateSteps()
	    {
	    	return new InstanceStepsFactory(configuration(),
	    			new GrowingIODemoStep(),new GrowingIOTestBaseTest()).createCandidateSteps();
	    }
	    
	    protected List<String> storyPaths() {
	        return new StoryFinder()
	                .findPaths(codeLocationFromClass(this.getClass()),"**/*.story",null);
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
