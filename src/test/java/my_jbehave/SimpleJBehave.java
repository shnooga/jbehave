package my_jbehave;


import java.util.Arrays;
import java.util.List;
 
import org.jbehave.core.junit.JUnitStories;
 
public class SimpleJBehave extends JUnitStories {
 
	public SimpleJBehave() {
		super();
		this.configuredEmbedder().candidateSteps().add(new ExampleSteps());
	}
 
	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("Math.story");
	}
}