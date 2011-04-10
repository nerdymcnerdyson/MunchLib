package net.mbyrd.munchkinng;

import java.util.List;

public class MunchkinPlayer {
	
	int id;
	String name;
	int level;
	
	public enum Gender {NONE, MALE, FEMALE};
	//name all classes.. here?
	//maybe make races into classes like strategy pattern?  for bonuses and combat effects?
	//still a deciding enum seems ok for now.
	public enum Class {BARD, THIEF, WARRIOR, WIZARD, RANGER};
	public enum Race {HUMAN, GNOME, ORC};
	
	List<MunchkinCard> down;
	List<MunchkinCard> hand;
	
}
