package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application {
	@Override
	public void start(Stage arg0) throws Exception {// 이 오버라이드 를 해줘야 가능함
		//stage : 무대라고 생각하면 됨(기본틀)
		
		Label lb = new Label("Hello World!!");
		lb.setFont(new Font(20));
		
		Scene scene = new Scene(lb, 200, 100);
		
		arg0.setScene(scene);
		arg0.setTitle("연습중");
		arg0.show();
		
	}
	
	public static void main(String[] args) {
		launch(args); //(launch 전부 소문자) 이거 해줘야 위에 start(Stage arg0)이 실행됨
	}

	

}
