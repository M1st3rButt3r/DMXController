import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static Interface dmxInterface;

	public static void main(String[] args) {
		//Create DMX Interface
		dmxInterface = new Interface("");
		dmxInterface.Send(new Channel(0, 255, 0));
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
