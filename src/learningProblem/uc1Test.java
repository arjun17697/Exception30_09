package learningProblem;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

//import junit.Assert;

public class uc1Test {
	@Test
	public void testMoodAnalysis() throws Exception{
		MoodAnalyser moodAnalyser =new MoodAnalyser();
		String  mood=moodAnalyser.analyseMood("This is a sad message");
		Assert.assertEquals( mood, "SAD");
	}

}
