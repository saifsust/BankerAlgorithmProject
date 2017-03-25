package design;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import algorithm.bankerAlgorithm;
import algorithm.data;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class application implements constants {

	public application(Stage primaryStage) {
		this.stage = primaryStage;
		availableInit();
		init();
	}

	private void availableInit() {

		availablePane = addPane(0.0, 50.0, 600.0, 80.0);

		availableRoot.getChildren().add(availableImageView);
		availableRoot.getChildren().add(addLabel("Available", 0.0, 0.0, 600.0, 50, 20));
		addAvailable = addButton("Process", 200, 150, buttonPrefWidth, buttonPrefHeight);
		availableRoot.getChildren().add(addAvailable);
		availableRoot.getChildren().add(availablePane);
	}

	/*
	 * initial method
	 *
	 */
	private void init() {
		stage.setResizable(false);
		stage.setScene(scene);
		root.getChildren().add(imageView);
		add = addButton("ADD", 480, tablePrefHeight + scrollpaneLayoutY + buttonPrefHeight + 40, 2.0 * buttonPrefWidth,
				buttonPrefHeight);
		root.getChildren().add(add);
		allocationPane = addPane(constX, tablePrefHeight + scrollpaneLayoutY, tablePrefWidth, buttonPrefHeight + 30);
		maximumAllocationPane = addPane(maximumAllocationLabelLayoutX, tablePrefHeight + scrollpaneLayoutY,
				tablePrefWidth, buttonPrefHeight + 30);
		root.getChildren().add(allocationPane);
		root.getChildren().add(maximumAllocationPane);
		labelFactory();
		allocationTableFactory();
		maximumAllocationTableFactory();
		root.getChildren().add(addNeedTitledPane());
		root.getChildren().add(menuFactory.getMenuBar(0.0, 0.0, width + 10.0, 10.0));

		stage.show();
	}

	/*
	 * label Factory start
	 *
	 */
	private void labelFactory() {

		root.getChildren().add(addLabel(title, 0.0, startY, width + 10, appNameHeight, 50));
		root.getChildren().add(addLabel("Allocation", constX, defaultLayoutY, tablePrefWidth, nameHeight, titleSize));
		root.getChildren().add(addLabel("Maximum Allocation", maximumAllocationLabelLayoutX, defaultLayoutY,
				tablePrefWidth, nameHeight, titleSize));
	}

	/*
	 * allocation Factory start
	 */
	private void allocationTableFactory() {
		allocationScrollpane = addScrollPane(constX, scrollpaneLayoutY, tablePrefWidth, tablePrefHeight);
		root.getChildren().add(allocationScrollpane);
	}

	/*
	 * maximum allocation Factory
	 */
	private void maximumAllocationTableFactory() {
		maximumAllocationScrollpane = addScrollPane(maximumAllocationLabelLayoutX, scrollpaneLayoutY, tablePrefWidth,
				tablePrefHeight);
		root.getChildren().add(maximumAllocationScrollpane);

	}

	/*
	 * Select Button Factory Start
	 *
	 */
	protected void clearFactory() {

		allocationObservableList.clear();
		maxAllocationObservableList.clear();
		needObservableList.clear();
		allocationProcessTextField.clear();
		allocationATextField.clear();
		allocationBTextField.clear();
		allocationCTextField.clear();
		allocationDTextField.clear();
		allocationETextField.clear();
		allocationFTextField.clear();
		allocationGTextField.clear();
		maximumAllocationATextField.clear();
		maximumAllocationBTextField.clear();
		maximumAllocationCTextField.clear();
		maximumAllocationDTextField.clear();
		maximumAllocationETextField.clear();
		maximumAllocationFTextField.clear();
		maximumAllocationGTextField.clear();
		availableATextField.clear();
		availableBTextField.clear();
		availableCTextField.clear();
		availableDTextField.clear();
		availableETextField.clear();
		availableFTextField.clear();
		availableGTextField.clear();
		needObservableList.clear();
		allocationPane.getChildren().clear();
		maximumAllocationPane.getChildren().clear();
		availablePane.getChildren().clear();
		needScrollpane.setContent(null);
		allocationScrollpane.setContent(null);
		maximumAllocationScrollpane.setContent(null);

	}

	/*
	 * return Method start
	 *
	 */

	private TextField addTextField(String promptText, double layoutX, double layoutY) {
		TextField textfield = new TextField();
		textfield.setPromptText(promptText);
		textfield.setPrefSize(columnWidth, buttonPrefHeight);
		textfield.setLayoutX(layoutX);
		textfield.setLayoutY(layoutY);
		return textfield;
	}

	private ScrollPane addScrollPane(double layoutX, double layoutY, double prefWidth, double prefHeight) {
		ScrollPane scroll = new ScrollPane();
		scroll.setLayoutX(layoutX);
		scroll.setLayoutY(layoutY);
		scroll.setPrefSize(prefWidth, prefHeight);
		scroll.setStyle("-fx-background-color: ORANGE;");
		return scroll;
	}

	private Pane addPane(double layoutX, double layoutY, double prefWidth, double prefHeight) {
		Pane pane = new Pane();
		pane.setLayoutX(layoutX);
		pane.setLayoutY(layoutY);
		pane.setPrefSize(prefWidth, prefHeight);
		pane.setStyle("-fx-background-color: ORANGE");
		return pane;
	}

	private Button addButton(String title, double layoutX, double layoutY, double prefWidth, double prefHeight) {
		Button button = new Button(title);
		button.setLayoutX(layoutX);
		button.setLayoutY(layoutY);
		button.setPrefSize(prefWidth, prefHeight);
		return button;
	}

	private Label addLabel(String title, double layoutX, double layoutY, double prefWidth, double prefHeight,
			double fontSize) {
		Label label = new Label();
		label.setText(title);
		label.setWrapText(true);
		label.setLayoutX(layoutX);
		label.setLayoutY(layoutY);
		label.setPrefSize(prefWidth, prefHeight);
		label.setFont(new Font("Arial", fontSize));
		String str = null;
		str = "-fx-background-color: GREEN;";
		label.setStyle("-fx-text-fill: ORANGE;" + str);
		label.setAlignment(Pos.CENTER);
		return label;
	}

	/*
	 * add TitledPane
	 *
	 *
	 */

	protected TitledPane addNeedTitledPane() {
		TitledPane titled = new TitledPane();
		titled.setLayoutX(constX);
		titled.setLayoutY(appNameHeight + 57.0);
		titled.setText("Ouput Factory");
		titled.setStyle("-fx-text-fill:RED;");
		titled.setExpanded(expanded.getValue());
		titledPane = addPane(0.0, 0.0, 2.0 * tablePrefWidth + 10.0, tablePrefHeight + nameHeight + 70);
		double x = 2.0, y = 40.0, labelY = 13.0;

		titledPane.getChildren().add(addLabel("NEED VALUE", x, labelY, tablePrefWidth, nameHeight, titleSize));
		titledPane.getChildren().add(
				addLabel("Allocaed Process", tablePrefWidth + x + 5, labelY, tablePrefWidth, nameHeight, titleSize));

		needScrollpane = addScrollPane(x, y, tablePrefWidth, tablePrefHeight);
		titledPane.getChildren().add(needScrollpane);
		titled.setContent(titledPane);
		return titled;
	}

	/*
	 *
	 * add allocation TexField Configuration
	 *
	 *
	 */

	protected void addAllocationProcessTextField() {
		allocationProcessTextField = addTextField("process", textFieldX, 5.0);
		allocationPane.getChildren().add(allocationProcessTextField);

	}

	/*
	 * add Allocation A textfield Configuration
	 */
	protected void addAllocationATextField() {
		allocationATextField = addTextField("A", textFieldX + columnWidth + 1, 5.0);

		allocationPane.getChildren().add(allocationATextField);
	}

	/*
	 * add Allocation B textField
	 */
	protected void addAllocationBTextField() {
		allocationBTextField = addTextField("B", textFieldX + 2.0 * columnWidth + 1, 5.0);
		allocationPane.getChildren().add(allocationBTextField);
	}

	/*
	 * add Allocation C TextField
	 *
	 *
	 */
	protected void addAllocationCTextField() {
		allocationCTextField = addTextField("C", textFieldX + 3.0 * columnWidth + 1, 5.0);
		allocationPane.getChildren().add(allocationCTextField);
	}

	/*
	 * add Allocation D TextField
	 *
	 *
	 */
	protected void addAllocationDTextField() {
		allocationDTextField = addTextField("D", textFieldX + 4.0 * columnWidth + 1, 5.0);
		allocationPane.getChildren().add(allocationDTextField);
	}

	/*
	 * add Allocation D TextField
	 *
	 *
	 */
	protected void addAllocationETextField() {
		allocationETextField = addTextField("E", textFieldX + 5.0 * columnWidth + 1, 5.0);
		allocationPane.getChildren().add(allocationETextField);
	}

	/*
	 * add Allocation D TextField
	 *
	 *
	 */
	protected void addAllocationFTextField() {
		allocationFTextField = addTextField("F", textFieldX + 6.0 * columnWidth + 1, 5.0);
		allocationPane.getChildren().add(allocationFTextField);
	}

	/*
	 * add Allocation G TextField
	 *
	 *
	 */
	protected void addAllocationGTextField() {
		allocationGTextField = addTextField("G", textFieldX + 7.0 * columnWidth + 1, 5.0);
		allocationPane.getChildren().add(allocationGTextField);
	}

	/*
	 *
	 * add maximum Allocation Process textField
	 *
	 */
	protected void addMaximumAllocationProcessTextField() {
		maximumAllocationProcessTextField = addTextField("process", textFieldX, 5.0);
		maximumAllocationPane.getChildren().add(maximumAllocationProcessTextField);
	}

	/*
	 *
	 * add maximum Allocation A textField
	 *
	 */
	protected void addMaximumAllocationATextField() {
		maximumAllocationATextField = addTextField("A", textFieldX + columnWidth, 5.0);
		maximumAllocationPane.getChildren().add(maximumAllocationATextField);
	}

	/*
	 *
	 * add maximum Allocation B textFoield
	 *
	 */
	protected void addMaximumAllocationBTextField() {
		maximumAllocationBTextField = addTextField("B", textFieldX + 2.0 * columnWidth + 1, 5.0);
		maximumAllocationPane.getChildren().add(maximumAllocationBTextField);
	}

	/*
	 *
	 * add maximum Allocation C textField
	 *
	 */
	protected void addMaximumAllocationCTextField() {
		maximumAllocationCTextField = addTextField("C", textFieldX + 3.0 * columnWidth + 1, 5.0);
		maximumAllocationPane.getChildren().add(maximumAllocationCTextField);
	}

	/*
	 *
	 * add maximum Allocation C textField
	 *
	 */
	protected void addMaximumAllocationDTextField() {
		maximumAllocationDTextField = addTextField("D", textFieldX + 4.0 * columnWidth + 1, 5.0);
		maximumAllocationPane.getChildren().add(maximumAllocationDTextField);
	}

	/*
	 *
	 * add maximum Allocation C textField
	 *
	 */
	protected void addMaximumAllocationETextField() {
		maximumAllocationETextField = addTextField("E", textFieldX + 5.0 * columnWidth + 1, 5.0);
		maximumAllocationPane.getChildren().add(maximumAllocationETextField);
	}

	/*
	 *
	 * add maximum Allocation C textField
	 *
	 */
	protected void addMaximumAllocationFTextField() {
		maximumAllocationFTextField = addTextField("F", textFieldX + 6.0 * columnWidth + 1, 5.0);
		maximumAllocationPane.getChildren().add(maximumAllocationFTextField);
	}

	/*
	 *
	 * add maximum Allocation C textField
	 *
	 */
	protected void addMaximumAllocationGTextField() {
		maximumAllocationGTextField = addTextField("G", textFieldX + 7.0 * columnWidth + 1, 5.0);
		maximumAllocationPane.getChildren().add(maximumAllocationGTextField);
	}

	/*
	 *
	 * add Three TextField Event
	 *
	 */
	protected void addThreeFieldEvent() {

		add.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// System.out.println("ggggDD");

				if (!allocationProcessTextField.getText().trim().isEmpty()
						&& !allocationATextField.getText().trim().isEmpty()
						&& !allocationBTextField.getText().trim().isEmpty()
						&& !allocationCTextField.getText().trim().isEmpty()
						&& !maximumAllocationATextField.getText().trim().isEmpty()
						&& !maximumAllocationBTextField.getText().trim().isEmpty()
						&& !maximumAllocationCTextField.getText().trim().isEmpty()) {

					String process = allocationProcessTextField.getText();
					Integer A = Integer.parseInt(allocationATextField.getText());
					Integer B = Integer.parseInt(allocationBTextField.getText());
					Integer C = Integer.parseInt(allocationCTextField.getText());
					Integer maxA = Integer.parseInt(maximumAllocationATextField.getText());
					Integer maxB = Integer.parseInt(maximumAllocationBTextField.getText());
					Integer maxC = Integer.parseInt(maximumAllocationCTextField.getText());

					System.out.println("Three Field Event");

					allocationObservableList.add(new data(process, A, B, C));
					maxAllocationObservableList.add(new data(process, maxA, maxB, maxC));
					needObservableList.add(new data(process, maxA - A, maxB - B, maxC - C));
					allocationProcessTextField.clear();
					allocationATextField.clear();
					allocationBTextField.clear();
					allocationCTextField.clear();
					maximumAllocationATextField.clear();
					maximumAllocationBTextField.clear();
					maximumAllocationCTextField.clear();
				}

			}

		});

	}

	/*
	 *
	 * add Four TextField Event
	 *
	 */
	protected void addFourFieldEvent() {

		add.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// System.out.println("ggggDD");

				if (!allocationProcessTextField.getText().trim().isEmpty()
						&& !allocationATextField.getText().trim().isEmpty()
						&& !allocationBTextField.getText().trim().isEmpty()
						&& !allocationCTextField.getText().trim().isEmpty()
						&& !allocationDTextField.getText().trim().isEmpty()
						&& !maximumAllocationATextField.getText().trim().isEmpty()
						&& !maximumAllocationBTextField.getText().trim().isEmpty()
						&& !maximumAllocationCTextField.getText().trim().isEmpty()
						&& !maximumAllocationDTextField.getText().trim().isEmpty()) {

					String process = allocationProcessTextField.getText();
					Integer A = Integer.parseInt(allocationATextField.getText());
					Integer B = Integer.parseInt(allocationBTextField.getText());
					Integer C = Integer.parseInt(allocationCTextField.getText());
					Integer D = Integer.parseInt(allocationDTextField.getText());
					Integer maxA = Integer.parseInt(maximumAllocationATextField.getText());
					Integer maxB = Integer.parseInt(maximumAllocationBTextField.getText());
					Integer maxC = Integer.parseInt(maximumAllocationCTextField.getText());
					Integer maxD = Integer.parseInt(maximumAllocationDTextField.getText());

					System.out.println("Four Field event");

					allocationObservableList.add(new data(process, A, B, C, D));
					maxAllocationObservableList.add(new data(process, maxA, maxB, maxC, maxD));
					needObservableList.add(new data(process, maxA - A, maxB - B, maxC - C, maxD - D));
					allocationProcessTextField.clear();
					allocationATextField.clear();
					allocationBTextField.clear();
					allocationCTextField.clear();
					allocationDTextField.clear();
					maximumAllocationATextField.clear();
					maximumAllocationBTextField.clear();
					maximumAllocationCTextField.clear();
					maximumAllocationDTextField.clear();
				}

			}

		});

	}

	/*
	 *
	 * add Five TextField Event
	 *
	 */
	protected void addFiveFieldEvent() {

		add.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// System.out.println("ggggDD");

				if (!allocationProcessTextField.getText().trim().isEmpty()
						&& !allocationATextField.getText().trim().isEmpty()
						&& !allocationBTextField.getText().trim().isEmpty()
						&& !allocationCTextField.getText().trim().isEmpty()
						&& !allocationDTextField.getText().trim().isEmpty()
						&& !allocationETextField.getText().trim().isEmpty()
						&& !maximumAllocationATextField.getText().trim().isEmpty()
						&& !maximumAllocationBTextField.getText().trim().isEmpty()
						&& !maximumAllocationCTextField.getText().trim().isEmpty()
						&& !maximumAllocationDTextField.getText().trim().isEmpty()
						&& !maximumAllocationETextField.getText().trim().isEmpty()) {

					String process = allocationProcessTextField.getText();
					Integer A = Integer.parseInt(allocationATextField.getText());
					Integer B = Integer.parseInt(allocationBTextField.getText());
					Integer C = Integer.parseInt(allocationCTextField.getText());
					Integer D = Integer.parseInt(allocationDTextField.getText());
					Integer E = Integer.parseInt(allocationETextField.getText());
					Integer maxA = Integer.parseInt(maximumAllocationATextField.getText());
					Integer maxB = Integer.parseInt(maximumAllocationBTextField.getText());
					Integer maxC = Integer.parseInt(maximumAllocationCTextField.getText());
					Integer maxD = Integer.parseInt(maximumAllocationDTextField.getText());
					Integer maxE = Integer.parseInt(maximumAllocationETextField.getText());

					System.out.println("Five Field");

					allocationObservableList.add(new data(process, A, B, C, D, E));
					maxAllocationObservableList.add(new data(process, maxA, maxB, maxC, maxD, maxE));
					needObservableList.add(new data(process, maxA - A, maxB - B, maxC - C, maxD - D, maxE - E));
					allocationProcessTextField.clear();
					allocationATextField.clear();
					allocationBTextField.clear();
					allocationCTextField.clear();
					allocationDTextField.clear();
					allocationETextField.clear();
					maximumAllocationATextField.clear();
					maximumAllocationBTextField.clear();
					maximumAllocationCTextField.clear();
					maximumAllocationDTextField.clear();
					maximumAllocationETextField.clear();
				}

			}

		});

	}

	/*
	 *
	 * add Three TextField Event
	 *
	 */
	protected void addSixFieldEvent() {

		add.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// System.out.println("ggggDD");

				if (!allocationProcessTextField.getText().trim().isEmpty()
						&& !allocationATextField.getText().trim().isEmpty()
						&& !allocationBTextField.getText().trim().isEmpty()
						&& !allocationCTextField.getText().trim().isEmpty()
						&& !allocationDTextField.getText().trim().isEmpty()
						&& !allocationETextField.getText().trim().isEmpty()
						&& !allocationFTextField.getText().trim().isEmpty()
						&& !maximumAllocationATextField.getText().trim().isEmpty()
						&& !maximumAllocationBTextField.getText().trim().isEmpty()
						&& !maximumAllocationCTextField.getText().trim().isEmpty()
						&& !maximumAllocationDTextField.getText().trim().isEmpty()
						&& !maximumAllocationETextField.getText().trim().isEmpty()
						&& !maximumAllocationFTextField.getText().trim().isEmpty()) {

					String process = allocationProcessTextField.getText();
					Integer A = Integer.parseInt(allocationATextField.getText());
					Integer B = Integer.parseInt(allocationBTextField.getText());
					Integer C = Integer.parseInt(allocationCTextField.getText());
					Integer D = Integer.parseInt(allocationDTextField.getText());
					Integer E = Integer.parseInt(allocationETextField.getText());
					Integer F = Integer.parseInt(allocationFTextField.getText());
					Integer maxA = Integer.parseInt(maximumAllocationATextField.getText());
					Integer maxB = Integer.parseInt(maximumAllocationBTextField.getText());
					Integer maxC = Integer.parseInt(maximumAllocationCTextField.getText());
					Integer maxD = Integer.parseInt(maximumAllocationDTextField.getText());
					Integer maxE = Integer.parseInt(maximumAllocationETextField.getText());
					Integer maxF = Integer.parseInt(maximumAllocationFTextField.getText());

					System.out.println("Six Field");

					allocationObservableList.add(new data(process, A, B, C, D, E, F));
					maxAllocationObservableList.add(new data(process, maxA, maxB, maxC, maxD, maxE, maxF));
					needObservableList
							.add(new data(process, maxA - A, maxB - B, maxC - C, maxD - D, maxE - E, maxF - F));
					allocationProcessTextField.clear();
					allocationATextField.clear();
					allocationBTextField.clear();
					allocationCTextField.clear();
					allocationDTextField.clear();
					allocationETextField.clear();
					allocationFTextField.clear();
					maximumAllocationATextField.clear();
					maximumAllocationBTextField.clear();
					maximumAllocationCTextField.clear();
					maximumAllocationDTextField.clear();
					maximumAllocationETextField.clear();
					maximumAllocationFTextField.clear();
				}

			}

		});
	}

	/*
	 *
	 * add Seven TextField Event
	 *
	 */
	protected void addSevenFieldEvent() {

		add.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// System.out.println("ggggDD");

				if (!allocationProcessTextField.getText().trim().isEmpty()
						&& !allocationATextField.getText().trim().isEmpty()
						&& !allocationBTextField.getText().trim().isEmpty()
						&& !allocationCTextField.getText().trim().isEmpty()
						&& !allocationDTextField.getText().trim().isEmpty()
						&& !allocationETextField.getText().trim().isEmpty()
						&& !allocationFTextField.getText().trim().isEmpty()
						&& !allocationGTextField.getText().trim().isEmpty()
						&& !maximumAllocationATextField.getText().trim().isEmpty()
						&& !maximumAllocationBTextField.getText().trim().isEmpty()
						&& !maximumAllocationCTextField.getText().trim().isEmpty()
						&& !maximumAllocationDTextField.getText().trim().isEmpty()
						&& !maximumAllocationETextField.getText().trim().isEmpty()
						&& !maximumAllocationFTextField.getText().trim().isEmpty()
						&& !maximumAllocationGTextField.getText().trim().isEmpty()) {

					String process = allocationProcessTextField.getText();
					Integer A = Integer.parseInt(allocationATextField.getText());
					Integer B = Integer.parseInt(allocationBTextField.getText());
					Integer C = Integer.parseInt(allocationCTextField.getText());
					Integer D = Integer.parseInt(allocationDTextField.getText());
					Integer E = Integer.parseInt(allocationETextField.getText());
					Integer F = Integer.parseInt(allocationFTextField.getText());
					Integer G = Integer.parseInt(allocationGTextField.getText());
					Integer maxA = Integer.parseInt(maximumAllocationATextField.getText());
					Integer maxB = Integer.parseInt(maximumAllocationBTextField.getText());
					Integer maxC = Integer.parseInt(maximumAllocationCTextField.getText());
					Integer maxD = Integer.parseInt(maximumAllocationDTextField.getText());
					Integer maxE = Integer.parseInt(maximumAllocationETextField.getText());
					Integer maxF = Integer.parseInt(maximumAllocationFTextField.getText());
					Integer maxG = Integer.parseInt(maximumAllocationGTextField.getText());

					System.out.println("Seven Field");

					allocationObservableList.add(new data(process, A, B, C, D, E, F, G));
					maxAllocationObservableList.add(new data(process, maxA, maxB, maxC, maxD, maxE, maxF, maxG));
					needObservableList.add(
							new data(process, maxA - A, maxB - B, maxC - C, maxD - D, maxE - E, maxF - F, maxG - G));
					allocationProcessTextField.clear();
					allocationATextField.clear();
					allocationBTextField.clear();
					allocationCTextField.clear();
					allocationDTextField.clear();
					allocationETextField.clear();
					allocationFTextField.clear();
					allocationGTextField.clear();
					maximumAllocationATextField.clear();
					maximumAllocationBTextField.clear();
					maximumAllocationCTextField.clear();
					maximumAllocationDTextField.clear();
					maximumAllocationETextField.clear();
					maximumAllocationFTextField.clear();
					maximumAllocationGTextField.clear();
				}

			}

		});
	}

	/*
	 * available A Textfield
	 *
	 */
	protected void addAvailableATextField() {
		availableATextField = addTextField("A", availableTextFieldLayoutX, availableTextFieldLayoutY);

		availablePane.getChildren().add(availableATextField);
	}

	/*
	 * available B TextField
	 *
	 */
	protected void addAvailableBTextField() {
		availableBTextField = addTextField("B", availableTextFieldLayoutX + columnWidth + 1.0,
				availableTextFieldLayoutY);
		availablePane.getChildren().add(availableBTextField);
	}

	/*
	 * available C TextField
	 *
	 */
	protected void addAvailableCTextField() {
		availableCTextField = addTextField("C", availableTextFieldLayoutX + 2.0 * columnWidth + 1.0,
				availableTextFieldLayoutY);
		availablePane.getChildren().add(availableCTextField);
	}

	/*
	 * available C TextField
	 *
	 */
	protected void addAvailableDTextField() {
		availableDTextField = addTextField("D", availableTextFieldLayoutX + 3.0 * columnWidth + 1.0,
				availableTextFieldLayoutY);
		availablePane.getChildren().add(availableDTextField);
	}

	/*
	 * available C TextField
	 *
	 */
	protected void addAvailableETextField() {
		availableETextField = addTextField("E", availableTextFieldLayoutX + 4.0 * columnWidth + 1.0,
				availableTextFieldLayoutY);
		availablePane.getChildren().add(availableETextField);
	}

	/*
	 * available C TextField
	 *
	 */
	protected void addAvailableFTextField() {
		availableFTextField = addTextField("F", availableTextFieldLayoutX + 5.0 * columnWidth + 1.0,
				availableTextFieldLayoutY);
		availablePane.getChildren().add(availableFTextField);
	}

	/*
	 * available C TextField
	 *
	 */
	protected void addAvailableGTextField() {
		availableGTextField = addTextField("G", availableTextFieldLayoutX + 6.0 * columnWidth + 1.0,
				availableTextFieldLayoutY);
		availablePane.getChildren().add(availableGTextField);
	}

	/*
	 *
	 * add available Three Field Event
	 *
	 */
	protected void availableThreeFieldEvent() {

		addAvailable.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Three Field Event");

				if (!availableATextField.getText().trim().isEmpty() && !availableBTextField.getText().trim().isEmpty()
						&& !availableCTextField.getText().trim().isEmpty() && !allocationObservableList.isEmpty()
						&& !maxAllocationObservableList.isEmpty()) {
					Integer A = Integer.parseInt(availableATextField.getText());
					Integer B = Integer.parseInt(availableBTextField.getText());
					Integer C = Integer.parseInt(availableCTextField.getText());
					bankerAlgorithm ba = new bankerAlgorithm();
					ba.setAllocationList(allocationObservableList);
					ba.setMaxAllocationList(maxAllocationObservableList);
					ba.setNeedList(needObservableList);
					boolean test = ba.algorithm(A, B, C);
					allocatedList = ba.getAllocatedProcessList();
					String str = "";
					if (test)
						str += "All Process are allocated \n\n";
					else
						str += "All Process are not allocated\n\n";
					str += "Allocated Processes: \n";
					str += "< ";
					for (int i = 0; i < allocatedList.size() - 1; i++) {
						str += allocatedList.get(i);
						str += ", ";
					}
					str += allocatedList.get(allocatedList.size() - 1);
					str += " >";

					titledPane.getChildren()
							.add(addLabel(str, tablePrefWidth + 5, 45, tablePrefWidth, tablePrefHeight, 12));

					availableATextField.clear();
					availableBTextField.clear();
					availableCTextField.clear();
				}

			}

		});

	}

	/*
	 *
	 * add available Three Field Event
	 *
	 */
	protected void availableFourFieldEvent() {

		addAvailable.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Four Field Event");

				if (!availableATextField.getText().trim().isEmpty() && !availableBTextField.getText().trim().isEmpty()
						&& !availableCTextField.getText().trim().isEmpty()
						&& !availableDTextField.getText().trim().isEmpty() && !allocationObservableList.isEmpty()
						&& !maxAllocationObservableList.isEmpty()) {
					Integer A = Integer.parseInt(availableATextField.getText());
					Integer B = Integer.parseInt(availableBTextField.getText());
					Integer C = Integer.parseInt(availableCTextField.getText());
					Integer D = Integer.parseInt(availableDTextField.getText());
					bankerAlgorithm ba = new bankerAlgorithm();
					ba.setAllocationList(allocationObservableList);
					ba.setMaxAllocationList(maxAllocationObservableList);
					ba.setNeedList(needObservableList);
					boolean test = ba.algorithm(A, B, C, D);
					allocatedList = ba.getAllocatedProcessList();
					String str = "";
					if (test)
						str += "All Process are allocated \n\n";
					else
						str += "All Process are not allocated\n\n";
					str += "Allocated Processes: \n";
					str += "< ";
					for (int i = 0; i < allocatedList.size() - 1; i++) {
						str += allocatedList.get(i);
						str += ", ";
					}
					str += allocatedList.get(allocatedList.size() - 1);
					str += " >";

					titledPane.getChildren()
							.add(addLabel(str, tablePrefWidth + 5, 45, tablePrefWidth, tablePrefHeight, 12));

					availableATextField.clear();
					availableBTextField.clear();
					availableCTextField.clear();
					availableDTextField.clear();
				}

			}

		});

	}

	/*
	 *
	 * add available Three Field Event
	 *
	 */
	protected void availableFiveFieldEvent() {

		addAvailable.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Five Field Event");

				if (!availableATextField.getText().trim().isEmpty() && !availableBTextField.getText().trim().isEmpty()
						&& !availableCTextField.getText().trim().isEmpty()
						&& !availableDTextField.getText().trim().isEmpty()
						&& !availableETextField.getText().trim().isEmpty() && !allocationObservableList.isEmpty()
						&& !maxAllocationObservableList.isEmpty()) {
					Integer A = Integer.parseInt(availableATextField.getText());
					Integer B = Integer.parseInt(availableBTextField.getText());
					Integer C = Integer.parseInt(availableCTextField.getText());
					Integer D = Integer.parseInt(availableDTextField.getText());
					Integer E = Integer.parseInt(availableETextField.getText());
					bankerAlgorithm ba = new bankerAlgorithm();
					ba.setAllocationList(allocationObservableList);
					ba.setMaxAllocationList(maxAllocationObservableList);
					ba.setNeedList(needObservableList);
					boolean test = ba.algorithm(A, B, C, D, E);
					allocatedList = ba.getAllocatedProcessList();
					String str = "";
					if (test)
						str += "All Process are allocated \n\n";
					else
						str += "All Process are not allocated\n\n";
					str += "Allocated Processes: \n";
					str += "< ";
					for (int i = 0; i < allocatedList.size() - 1; i++) {
						str += allocatedList.get(i);
						str += ", ";
					}
					str += allocatedList.get(allocatedList.size() - 1);
					str += " >";

					titledPane.getChildren()
							.add(addLabel(str, tablePrefWidth + 5, 45, tablePrefWidth, tablePrefHeight, 12));

					availableATextField.clear();
					availableBTextField.clear();
					availableCTextField.clear();
					availableDTextField.clear();
					availableETextField.clear();
				}

			}

		});

	}

	/*
	 *
	 * add available Three Field Event
	 *
	 */
	protected void availableSixFieldEvent() {

		addAvailable.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Six Field Event");

				if (!availableATextField.getText().trim().isEmpty() && !availableBTextField.getText().trim().isEmpty()
						&& !availableCTextField.getText().trim().isEmpty()
						&& !availableDTextField.getText().trim().isEmpty()
						&& !availableETextField.getText().trim().isEmpty()
						&& !availableFTextField.getText().trim().isEmpty() && !allocationObservableList.isEmpty()
						&& !maxAllocationObservableList.isEmpty()) {
					Integer A = Integer.parseInt(availableATextField.getText());
					Integer B = Integer.parseInt(availableBTextField.getText());
					Integer C = Integer.parseInt(availableCTextField.getText());
					Integer D = Integer.parseInt(availableDTextField.getText());
					Integer E = Integer.parseInt(availableETextField.getText());
					Integer F = Integer.parseInt(availableFTextField.getText());
					bankerAlgorithm ba = new bankerAlgorithm();
					ba.setAllocationList(allocationObservableList);
					ba.setMaxAllocationList(maxAllocationObservableList);
					ba.setNeedList(needObservableList);
					boolean test = ba.algorithm(A, B, C, D, E, F);
					allocatedList = ba.getAllocatedProcessList();
					String str = "";
					if (test)
						str += "All Process are allocated \n\n";
					else
						str += "All Process are not allocated\n\n";
					str += "Allocated Processes: \n";
					str += "< ";
					for (int i = 0; i < allocatedList.size() - 1; i++) {
						str += allocatedList.get(i);
						str += ", ";
					}
					str += allocatedList.get(allocatedList.size() - 1);
					str += " >";

					titledPane.getChildren()
							.add(addLabel(str, tablePrefWidth + 5, 45, tablePrefWidth, tablePrefHeight, 12));

					availableATextField.clear();
					availableBTextField.clear();
					availableCTextField.clear();
					availableDTextField.clear();
					availableETextField.clear();
					availableFTextField.clear();
				}

			}

		});

	}

	/*
	 *
	 * add available Three Field Event
	 *
	 */
	protected void availableSevenFieldEvent() {

		addAvailable.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Seven Field Event");

				if (!availableATextField.getText().trim().isEmpty() && !availableBTextField.getText().trim().isEmpty()
						&& !availableCTextField.getText().trim().isEmpty()
						&& !availableDTextField.getText().trim().isEmpty()
						&& !availableETextField.getText().trim().isEmpty()
						&& !availableFTextField.getText().trim().isEmpty()
						&& !availableGTextField.getText().trim().isEmpty() && !allocationObservableList.isEmpty()
						&& !maxAllocationObservableList.isEmpty()) {
					Integer A = Integer.parseInt(availableATextField.getText());
					Integer B = Integer.parseInt(availableBTextField.getText());
					Integer C = Integer.parseInt(availableCTextField.getText());
					Integer D = Integer.parseInt(availableDTextField.getText());
					Integer E = Integer.parseInt(availableETextField.getText());
					Integer F = Integer.parseInt(availableFTextField.getText());
					Integer G = Integer.parseInt(availableGTextField.getText());
					bankerAlgorithm ba = new bankerAlgorithm();
					ba.setAllocationList(allocationObservableList);
					ba.setMaxAllocationList(maxAllocationObservableList);
					ba.setNeedList(needObservableList);
					boolean test = ba.algorithm(A, B, C, D, E, F, G);
					allocatedList = ba.getAllocatedProcessList();
					String str = "";
					if (test)
						str += "All Process are allocated \n\n";
					else
						str += "All Process are not allocated\n\n";
					str += "Allocated Processes: \n";
					str += "< ";
					for (int i = 0; i < allocatedList.size() - 1; i++) {
						str += allocatedList.get(i);
						str += ", ";
					}
					str += allocatedList.get(allocatedList.size() - 1);
					str += " >";

					titledPane.getChildren()
							.add(addLabel(str, tablePrefWidth + 5, 45, tablePrefWidth, tablePrefHeight, 12));

					availableATextField.clear();
					availableBTextField.clear();
					availableCTextField.clear();
					availableDTextField.clear();
					availableETextField.clear();
					availableFTextField.clear();
					availableGTextField.clear();
				}

			}

		});

	}
	/*
	 * declaration start
	 *
	 */

	protected ObservableList<data> allocationObservableList = FXCollections.observableArrayList();
	protected ObservableList<data> maxAllocationObservableList = FXCollections.observableArrayList();
	protected ObservableList<data> needObservableList = FXCollections.observableArrayList();
	protected List<String> allocatedList = new ArrayList<>();
	private TextField availableATextField = new TextField();
	private TextField availableBTextField = new TextField();
	private TextField availableCTextField = new TextField();
	private TextField availableDTextField = new TextField();
	private TextField availableETextField = new TextField();
	private TextField availableFTextField = new TextField();
	private TextField availableGTextField = new TextField();
	private TextField allocationProcessTextField = new TextField();
	private TextField allocationATextField = new TextField();
	private TextField allocationBTextField = new TextField();
	private TextField allocationCTextField = new TextField();
	private TextField allocationDTextField = new TextField();
	private TextField allocationETextField = new TextField();
	private TextField allocationFTextField = new TextField();
	private TextField allocationGTextField = new TextField();
	private TextField maximumAllocationProcessTextField = new TextField();
	private TextField maximumAllocationATextField = new TextField();
	private TextField maximumAllocationBTextField = new TextField();
	private TextField maximumAllocationCTextField = new TextField();
	private TextField maximumAllocationDTextField = new TextField();
	private TextField maximumAllocationETextField = new TextField();
	private TextField maximumAllocationFTextField = new TextField();
	private TextField maximumAllocationGTextField = new TextField();
	private BooleanProperty expanded = new SimpleBooleanProperty(false);
	private Image image = new Image(new File("resource/backgroundImage.jpg").toURI().toString());
	private Image ima = new Image(new File("resource/logIn.jpg").toURI().toString());
	private ImageView imageView = new ImageView(image);
	private ImageView availableImageView = new ImageView(ima);
	private Pane titledPane = new Pane();
	protected Pane allocationPane = new Pane();
	protected Pane maximumAllocationPane = new Pane();
	protected Pane availablePane = new Pane();
	private Button add = new Button();
	private Button addAvailable = new Button();
	protected ScrollPane allocationScrollpane = new ScrollPane();
	protected ScrollPane maximumAllocationScrollpane = new ScrollPane();
	protected ScrollPane needScrollpane = new ScrollPane();
	protected Group root = new Group();
	private Scene scene = new Scene(root, width, height);
	private Stage stage;
	protected Stage availableStage = new Stage();
	protected Group availableRoot = new Group();

}
