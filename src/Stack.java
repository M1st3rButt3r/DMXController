import java.util.LinkedList;
import java.util.List;

public class Stack {
	public String name;
	public List<Scene> scenes;
	
	public Stack(String name) {
		this.name = name;
		scenes = new LinkedList<Scene>();
	}
}