package array.model;

public class Hipster 
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name ="";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "thats is so mainstream!";
		hipsterPhrases[1] = "I don't mean to sound like a hipster";
		hipsterPhrases[2] = "insert sarcastic phrase here";
		hipsterPhrases[3] = "i was into XXXXX before it was cool";
	}
	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		firstBook = new Book();
		firstBook.setAuthor("Bill watterson");
		firstBook.setTitle("Calvin and Hobbes");
		firstBook.setSubject("Cartoons");
		firstBook.setPageCount(302);
		firstBook.setPrice(24.99);
		
		secondBook = new Book();
		secondBook.setAuthor("WOTC");
		secondBook.setTitle("player's handbook");
		secondBook.setSubject("Roleplaying");
		secondBook.setPageCount(320);
		secondBook.setPrice(49.95);
		
		thirdBook = new Book(1080,"Tyler Jarrard", "Leading a life of power, awesome, wizardry, and arcana", "Biography", 49.95 );
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
		
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
