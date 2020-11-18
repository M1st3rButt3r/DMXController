
public class Main {
	
	public static Interface dmxInterface;

	public static void main(String[] args) {
		//Create DMX Interface
		dmxInterface = new Interface("");
		dmxInterface.Send(new Channel(1, 255));
	}

}
