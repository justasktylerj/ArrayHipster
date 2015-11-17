package array.model;

public class Hipster 
{
	private String name;
	private String [] hipsterPhrases;
//	private book [] hipster books;
	
	public Hipster()
	{
		this.name ="";
		this.hipsterPhrases = new String[4];
//		this.hipsterBooks = new Book[3];
		setupArray();
//		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "thats is so mainstream!";
		hipsterPhrases[1] = "I don't mean to sound like a hipster";
		hipsterPhrases[2] = "insert sarcastic phrase here";
		hipsterPhrases[3] = "i was into XXXXX before it was cool";
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String[] getHipsterPhrases() 
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases) 
	{
		this.hipsterPhrases = hipsterPhrases;
	}

	
}
