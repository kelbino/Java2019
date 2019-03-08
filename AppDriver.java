import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.scene.media;
import javafx.util.Duration;


public class AppDriver extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Button btn1=new Button("Submit");
		//btn1.setLayoutX(10);btn1.setLayoutY(10);
		
		//Ellipse sun = new Ellipse(100, 100, 50, 50);
		Image img=new Image("rim.png");
		ImageView iv=new ImageView(img);
		
		
		Group grp=new Group( iv);
		Scene sn=new Scene(grp, 600, 300);
		sn.getStylesheets().add("mystyle.css");
		primaryStage.setScene(sn);
		primaryStage.show();
		
		BoxBlur bb=new BoxBlur();
		DropShadow ds = new DropShadow();
		ds.setOffsetX(20);ds.setOffsetY(20);
		iv.setEffect(ds);
		
		
		RotateTransition rt= new RotateTransition(new Duration(2000), iv); //Rotates an animation
		TranslateTransition tt=new TranslateTransition(new Duration(800), iv);//moves an animation and uses duration to determine how long it'll take to complete
		tt.setFromX(10);tt.setFromY(10);
		tt.setToX(200);tt.setToY(300);
		
		File soundFile = new File("guitar.wav");
		
		
		rt.setFromAngle(0);
		rt.setToAngle(1080);
		
		rt.setCycleCount(rt.INDEFINITE);
		tt.setCycleCount(tt.INDEFINITE); //runs duration infinitely
		rt.play();
		//tt.play();		
		
		
		
	}		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);

	}

}
