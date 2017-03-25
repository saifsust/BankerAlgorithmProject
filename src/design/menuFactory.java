package design;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class menuFactory {

	public static MenuBar getMenuBar(Double layoutX, Double layoutY, Double prefWidth, Double prefHeight) {
		menuBar.setLayoutX(layoutX);
		menuBar.setLayoutY(layoutY);
		menuBar.setPrefSize(prefWidth, prefHeight);
		menuBar.setStyle("-fx-background-color: GREEN;");
		addMenu();
		return menuBar;
	}

	private static void addMenu() {

		
		
		file.getItems().add(menuItem);
		menuItem.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				MenuItem m = (MenuItem) arg0.getSource();
				//if(m.getText()=="YES")
				System.out.println("djfhdjh");
				
			}
			
		});
		menuBar.getMenus().add(file);
		
	}

	private static MenuItem menuItem = new MenuItem("YES");
	private static Menu file = new Menu("File");
	private static MenuBar menuBar = new MenuBar();
}
