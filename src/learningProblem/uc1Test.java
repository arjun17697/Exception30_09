package learningProblem;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

//import junit.Assert;

public class uc1Test {
	@Test
	public void returnHappyWhenGivenNull() {
		MoodAnalyser moodAnalyser =new MoodAnalyser(null);
		String  mood=moodAnalyser.analyseMood();
		Assert.assertEquals( "Happy", mood);
	}

}
