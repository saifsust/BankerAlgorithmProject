package design;

import algorithm.data;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Separator;
import javafx.scene.control.TableView;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

public class toolBarFactory extends application {

	public toolBarFactory(Stage primaryStage) {
		super(primaryStage);
		setToolBar();
		availableStage.setTitle("Add Available");
		availableStage.setScene(scene);
		availableStage.setResizable(false);
		// TODO Auto-generated constructor stub
	}

	public void setToolBar() {
		toolBar.setLayoutX(0.0);
		toolBar.setLayoutY(25.0);
		toolBar.setPrefSize(width + 10, 20.0);
		toolBar.setStyle("-fx-background-color:GREEN;");
		clear.setPrefSize(100, 10);
		random.setPrefSize(100, 20);
		addAvailable.setPrefSize(100, 20);
		toolBar.getItems().addAll(new Separator(), setComboBox(), new Separator(), addAvailable, new Separator(), clear,
				new Separator());
		setAvailableButton();
		setClearButton();
		setRandomButton();
		root.getChildren().add(toolBar);
	}

	private static void setRandomButton() {
		tooltip = new Tooltip();
		tooltip.setText("Random Input Datas");
		random.setTooltip(tooltip);
		random.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Add AvailAble");

			}

		});
	}

	private void setClearButton() {
		tooltip = new Tooltip();
		tooltip.setText("Clear All Datas");
		clear.setTooltip(tooltip);
		clear.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				// System.out.println("Add AvailAble");
				comboBox.setValue(null);
				clearFactory();
			}

		});
	}

	private void setAvailableButton() {
		tooltip = new Tooltip();
		tooltip.setText("add Available and Run the process");
		addAvailable.setTooltip(tooltip);
		addAvailable.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				availableStage.show();

			}

		});
	}

	private ComboBox<String> setComboBox() {
		comboBox.setPromptText("process");
		comboBox.setPrefSize(100, 20);
		tooltip = new Tooltip();
		tooltip.setStyle("-fx-background-color: GRAY;");
		tooltip.setText("How Many Processes You Want to Run ?");
		comboBox.setTooltip(tooltip);
		comboBox.setItems(choiceList);

		comboBox.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg) {
				String selected = comboBox.getValue();
				clearFactory();
				if (selected == "3") {
					availableThreeFieldEvent();
					addThreeFieldEvent();
					addAllocationProcessTextField();
					addAllocationATextField();
					addAllocationBTextField();
					addAllocationCTextField();
					addMaximumAllocationATextField();
					addMaximumAllocationBTextField();
					addMaximumAllocationCTextField();
					addAvailableATextField();
					addAvailableBTextField();
					addAvailableCTextField();

					maximumAllocationTable = new TableFactory().getThreeColumnsTable();
					needTable = new TableFactory().getThreeColumnsTable();
					allocationTable = new TableFactory().getThreeColumnsTable();

				} else {
					if (selected == "4") {
						availableFourFieldEvent();
						addFourFieldEvent();
						addAllocationProcessTextField();
						addAllocationATextField();
						addAllocationBTextField();
						addAllocationCTextField();
						addAllocationDTextField();
						addMaximumAllocationATextField();
						addMaximumAllocationBTextField();
						addMaximumAllocationCTextField();
						addMaximumAllocationDTextField();
						addAvailableATextField();
						addAvailableBTextField();
						addAvailableCTextField();
						addAvailableDTextField();
						maximumAllocationTable = new TableFactory().getFourColumnsTable();
						needTable = new TableFactory().getFourColumnsTable();
						allocationTable = new TableFactory().getFourColumnsTable();

					} else {
						if (selected == "5") {
							availableFiveFieldEvent();
							addFiveFieldEvent();
							addAllocationProcessTextField();
							addAllocationATextField();
							addAllocationBTextField();
							addAllocationCTextField();
							addAllocationDTextField();
							addAllocationETextField();
							addMaximumAllocationATextField();
							addMaximumAllocationBTextField();
							addMaximumAllocationCTextField();
							addMaximumAllocationDTextField();
							addMaximumAllocationETextField();
							addAvailableATextField();
							addAvailableBTextField();
							addAvailableCTextField();
							addAvailableDTextField();
							addAvailableETextField();
							maximumAllocationTable = new TableFactory().getFiveColumnsTable();
							needTable = new TableFactory().getFiveColumnsTable();
							allocationTable = new TableFactory().getFiveColumnsTable();
						} else {
							if (selected == "6") {
								availableSixFieldEvent();
								addSixFieldEvent();
								addAllocationProcessTextField();
								addAllocationATextField();
								addAllocationBTextField();
								addAllocationCTextField();
								addAllocationDTextField();
								addAllocationETextField();
								addAllocationFTextField();
								addMaximumAllocationATextField();
								addMaximumAllocationBTextField();
								addMaximumAllocationCTextField();
								addMaximumAllocationDTextField();
								addMaximumAllocationETextField();
								addMaximumAllocationFTextField();
								addAvailableATextField();
								addAvailableBTextField();
								addAvailableCTextField();
								addAvailableDTextField();
								addAvailableETextField();
								addAvailableFTextField();
								maximumAllocationTable = new TableFactory().getSixColumnsTable();
								needTable = new TableFactory().getSixColumnsTable();
								allocationTable = new TableFactory().getSixColumnsTable();
							} else {
								availableSevenFieldEvent();
								addSevenFieldEvent();
								addAllocationProcessTextField();
								addAllocationATextField();
								addAllocationBTextField();
								addAllocationCTextField();
								addAllocationDTextField();
								addAllocationETextField();
								addAllocationFTextField();
								addAllocationGTextField();
								addMaximumAllocationATextField();
								addMaximumAllocationBTextField();
								addMaximumAllocationCTextField();
								addMaximumAllocationDTextField();
								addMaximumAllocationETextField();
								addMaximumAllocationFTextField();
								addMaximumAllocationGTextField();
								addAvailableATextField();
								addAvailableBTextField();
								addAvailableCTextField();
								addAvailableDTextField();
								addAvailableETextField();
								addAvailableFTextField();
								addAvailableGTextField();
								maximumAllocationTable = new TableFactory().getSevenColumnsTable();
								needTable = new TableFactory().getSevenColumnsTable();
								allocationTable = new TableFactory().getSevenColumnsTable();
							}
						}
					}
				}

				allocationTable.setItems(allocationObservableList);
				maximumAllocationTable.setItems(maxAllocationObservableList);
				needTable.setItems(needObservableList);
				allocationScrollpane.setContent(allocationTable);
				maximumAllocationScrollpane.setContent(maximumAllocationTable);
				needScrollpane.setContent(needTable);
			}

		});
		return comboBox;
	}

	private TableView<data> allocationTable;
	private TableView<data> maximumAllocationTable;
	private TableView<data> needTable;
	private Scene scene = new Scene(availableRoot, 550, 200);
	private static Button clear = new Button("Clear");
	private static Button random = new Button("Random");
	private static Button addAvailable = new Button("Add Available");
	private static Tooltip tooltip;// = new Tooltip();
	private static ObservableList<String> choiceList = FXCollections.observableArrayList("3", "4", "5", "6", "7");
	private static ComboBox<String> comboBox = new ComboBox<>();
	private static Button process = new Button("Process");
	private static ToolBar toolBar = new ToolBar();
}
