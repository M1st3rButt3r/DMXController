
public class Channel {
	public int universe;
	public int channel;
	public int value;
	
	public Channel(int channel, int value, int universe) {
		//TODO Clamp values
		this.channel = channel > 512 ? 512 : channel < 1 ? 1 : channel;
		this.value =  value > 255 ? 255 : value < 0 ? 0 : value;
		this.universe = universe;
	}
}