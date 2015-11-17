package array.controller;

import array.model.Hipster;
import array.view.HipsterFrame;

public class HipsterAppController 
{
	private Hipster firstHipster;
	private HipsterFrame baseFrame;
	
	public HipsterAppController()
	{
		firstHipster = new Hipster();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		String myName = baseFrame.getResponse("What is your name");
		firstHipster.setName(myName);
		baseFrame.setTitle(myName + "'s hipster project");
	}
	
	public Hipster getFirstHipster() 
	{
		return firstHipster;
	}
	
	public HipsterFrame getBaseFrame() 
	{
		return baseFrame;
	}
	
}
