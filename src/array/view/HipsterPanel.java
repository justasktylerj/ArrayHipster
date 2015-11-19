package array.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import array.controller.HipsterAppController;
import array.model.Book;



public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private JComboBox<String> phaseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton ChangeBookButton;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private int startClick;
	private int maxClicks;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		bookPageCountLabel = new JLabel("the page count");
		bookAuthorLabel = new JLabel("the author");
		bookSubjectLabel = new JLabel("the price");
		bookTitleLabel = new JLabel("the subject");
		bookPriceLabel = new JLabel("the title");
		ChangeBookButton = new JButton("Change books");
		phraseComboBox = new JComboBox<String>();
		maxClicks = baseController.getFirstHipster().getHipsterBooks().length;
		startClick = 0;
		
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(phraseComboBox);
		this.add(bookAuthorLabel);
		this.add(bookTitleLabel);
		this.add(bookPageCountLabel);			
		this.add(bookSubjectLabel);
		this.add(bookPriceLabel);
		this.add(ChangeBookButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, phraseComboBox, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, phraseComboBox, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, bookAuthorLabel, 177, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, bookPriceLabel, 177, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, bookPriceLabel, -169, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, bookAuthorLabel, 6, SpringLayout.SOUTH, bookPriceLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, ChangeBookButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, ChangeBookButton, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, bookPageCountLabel, 0, SpringLayout.WEST, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookSubjectLabel, 6, SpringLayout.SOUTH, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookSubjectLabel, 0, SpringLayout.WEST, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookPageCountLabel, 6, SpringLayout.SOUTH, bookTitleLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookTitleLabel, 6, SpringLayout.SOUTH, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookTitleLabel, 0, SpringLayout.WEST, bookAuthorLabel);
	}
	
	private void ChangeColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		setBackground(new Color(red, green, blue));
	}
	
	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				ChangeColor();
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}
		});
	
		ChangeBookButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Book [] tempBooks = baseController.getFirstHipster().getHipsterBooks();
				if(startClick < maxClicks)
				{
					bookAuthorLabel.setText("Book author: " + tempBooks[startClick].getAuthor());
					bookTitleLabel.setText("Book title: " + tempBooks[startClick].getTitle());
					bookPageCountLabel.setText("Book page count: " + tempBooks[startClick].getPageCount());
					bookSubjectLabel.setText("Book subject: " + tempBooks[startClick].getSubject());
					bookPriceLabel.setText("Book Price: " + tempBooks[startClick].getPrice());
					startClick++;
				}
				else
				{
					startClick = 0;
					bookTitleLabel.setText("Book title: ");
					bookPageCountLabel.setText("Book pagecount: ");
					bookSubjectLabel.setText("Book subject: ");
					bookPriceLabel.setText("Book price: ");
					bookAuthorLabel.setText("Book author: ");
				}
			}
		});
		
	}
	
	

}


