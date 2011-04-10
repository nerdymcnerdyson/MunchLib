package net.mbyrd.munchkinng;

public class MunchkinNGmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MunchkinGameImpl mg = new MunchkinGameImpl();
		MunchkinTextGui mtg = new MunchkinTextGui();
		CommandStackGuiRemoteImpl cs = new CommandStackGuiRemoteImpl(); 
		mg.registerGui(cs);
		mtg.registerServer(cs);

	}

}
