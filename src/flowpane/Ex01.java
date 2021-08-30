package flowpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane flowPane = new FlowPane();
//		Button btn01 = new Button("버튼01");
//		Button btn02 = new Button("버튼02");
//		Button btn03 = new Button("버튼03");
//		
//		flowPane.getChildren().add(btn01);// 자식을 갖고와서 추가해라~
//		flowPane.getChildren().add(btn02);
//		flowPane.getChildren().add(btn03);
		
		//반복문 사용하기
		for(int i=1; i<=3; i++) {
			flowPane.getChildren().add(new Button("버튼0"+i));
		}
		
		Scene sc = new Scene(flowPane,200,100);
		
		arg0.setScene(sc);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args); // properties에서 arguments 설정해줘야 실행 가능
		
	}


}