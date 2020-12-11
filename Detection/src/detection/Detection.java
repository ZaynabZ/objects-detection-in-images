package detection;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Detection extends Application {
	
	private Stage primaryStage;
    private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Object Detection and Classification");

        initRootLayout();

        showOverview();
		
	}
	
	public void initRootLayout() {
		   try {
	            // Load root layout from fxml file.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Detection.class.getResource("view/RootLayout.fxml"));
	            rootLayout = loader.load();
	            
	            // Show the scene containing the root layout.
	            Scene scene = new Scene(rootLayout);
	            primaryStage.setScene(scene);
	            primaryStage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	
	  public void showOverview() {
	        try {
	            
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Detection.class.getResource("view/OverView1.fxml"));
	            AnchorPane overview = loader.load();
	            
	            
	            rootLayout.setCenter(overview);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	  
	  public Stage getPrimaryStage() {
	        return primaryStage;
	    }


	public static void main(String[] args) {
		launch(args);
	}
}
