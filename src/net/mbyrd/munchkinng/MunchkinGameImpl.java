package net.mbyrd.munchkinng;

import java.util.List;



public class MunchkinGameImpl {

	List<MunchkinPlayer> players;
	
	MunchkinDeck doorDeck;
	MunchkinDeck treasureDeck;
	int id;
	GuiRemote gui;
	
	MunchkinCombat activeCombat;
	
	MunchkinPlayer activePlayer;  //might just be an ID reference, rather than whole object reference

	
	public MunchkinGameImpl()
	{
		//nothing?
		
	}
	
	public int drawTreasure()
	{
		return 0;
	}
	
	public int kickDoor()
	{
		return 0;
	}

	public void registerGui(GuiRemote mygui) {
		gui = mygui;
	}
	
	
	
	
}
