
public class Interface {
	public String port;
	
	public Interface(String port) {
		// TODO Setup Connection to arduino
		this.port = port;
	}
	
	public void Send(Channel channel) {
		System.out.println("Sended to Channel " + channel.channel + " the value: " + channel.value);
	}
	
	public void Send(Scene scene) {
		for (Channel channel : scene.channels) {
			Send(channel);
		}
	}
}