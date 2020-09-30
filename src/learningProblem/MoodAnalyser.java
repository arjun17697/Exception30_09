package learningProblem;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		this.message=message;
		
	}
	/*public String analyseMood(String message) {
		this.message=message;
		return analyseMood();*/
	
	public String analyseMood() throws MoodException {
		try {
		if (message.contains(("sad")))
			{ return "SAD";
			}
		else
			{
				return "HAPPY";
			
			}
		
		} catch (NullPointerException e) {
			throw new MoodException("Please enter proper message");
		}
		
		
	}
}

