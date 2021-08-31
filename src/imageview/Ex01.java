package imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ImageView iv = new ImageView("/img/smilerere.png"); //생성자로 넣는거라 경로를 넣어주는거
		//iv.setImage(new Image("/img/calendar.png")); //이미지를 넣어줘야함
		
		//iv.setFitHeight(100); //세로 크기
		iv.setFitWidth(50); // 가로 크기
		iv.setPreserveRatio(true); // 세로 또는 가로 둘중 하나만 설정하면 나머지에 맞춰줌. 이거 하나 하면 자동적으로 하나의 사이즈로 맞춰줌
		iv.setRotate(45); // 이미지 회전. 돌아감
		
		
		ap.getChildren().add(iv);
		
		arg0.setScene(new Scene(ap, 300, 200));
		
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
