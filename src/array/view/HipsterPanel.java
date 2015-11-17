package array.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import array.controller.HipsterAppController;


public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		phraseComboBox = new JComboBox<String>();
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel raseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(raseModel);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(phraseComboBox);
		
	}
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}
		});
	}

}


