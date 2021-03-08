package com.dmxcontroller.data;
import java.util.LinkedList;
import java.util.List;

public class Scene {
	public String name;
	public List<Channel> channels;
	
	public Scene(String name) {
		this.name = name;
		channels = new LinkedList<Channel>();
	}
	
	public void AddChannel(Channel channel) {
		channels.add(channel);
	}
}