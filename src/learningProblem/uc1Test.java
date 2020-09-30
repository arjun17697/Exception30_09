package learningProblem;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

//import junit.Assert;

public class uc1Test {
	@Test
	public void returnHappyWhenGivenNull() {
		MoodAnalyser moodAnalyser =new MoodAnalyser(null);
		String mood= null;
		try {
			ExpectedException exceptionRule=ExpectedException.none();
			exceptionRule.expect(MoodException.class);
			mood=moodAnalyser.analyseMood();
			Assert.assertEquals( "Happy", mood);
		}catch(MoodException e) {
			e.printStackTrace();
		}
		
	}

}
