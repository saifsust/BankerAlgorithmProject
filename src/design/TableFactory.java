package design;

import algorithm.data;
import javafx.event.EventHandler;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;

public class TableFactory implements constants {

	public TableView<data> getThreeColumnsTable() {

		table = new TableView<>();
		table.getColumns().clear();
		table.setLayoutX(0.0);
		table.setLayoutY(0.0);
		table.setEditable(true);
		table.setPrefSize(tablePrefWidth - 15, tablePrefHeight);
		columnProcessFactory();
		table.getColumns().add(columnProcess);
		columnAFactory();
		table.getColumns().add(columnA);
		columnBFactory();
		table.getColumns().add(columnB);
		columnCFactory();
		table.getColumns().add(columnC);
		return table;
	}

	public TableView<data> getFourColumnsTable() {

		table = new TableView<>();
		table.getColumns().clear();
		table.setLayoutX(0.0);
		table.setLayoutY(0.0);
		table.setEditable(true);
		table.setPrefSize(tablePrefWidth - 15, tablePrefHeight);
		columnProcessFactory();
		table.getColumns().add(columnProcess);
		columnAFactory();
		table.getColumns().add(columnA);
		columnBFactory();
		table.getColumns().add(columnB);
		columnCFactory();
		table.getColumns().add(columnC);
		columnDFactory();
		table.getColumns().add(columnD);

		return table;
	}

	public TableView<data> getFiveColumnsTable() {

		table = new TableView<>();
		table.getColumns().clear();
		table.setLayoutX(0.0);
		table.setLayoutY(0.0);
		table.setEditable(true);
		// table.setPrefSize(tablePrefWidth - 15, tablePrefHeight);
		columnProcessFactory();
		table.getColumns().add(columnProcess);
		columnAFactory();
		table.getColumns().add(columnA);
		columnBFactory();
		table.getColumns().add(columnB);
		columnCFactory();
		table.getColumns().add(columnC);
		columnDFactory();
		table.getColumns().add(columnD);
		columnEFactory();
		table.getColumns().add(columnE);
		return table;
	}

	public TableView<data> getSixColumnsTable() {

		table = new TableView<>();
		table.getColumns().clear();
		table.setLayoutX(0.0);
		table.setLayoutY(0.0);
		table.setEditable(true);
		// table.setPrefSize(tablePrefWidth - 15, tablePrefHeight);
		columnProcessFactory();
		table.getColumns().add(columnProcess);
		columnAFactory();
		table.getColumns().add(columnA);
		columnBFactory();
		table.getColumns().add(columnB);
		columnCFactory();
		table.getColumns().add(columnC);
		columnDFactory();
		table.getColumns().add(columnD);
		columnEFactory();
		table.getColumns().add(columnE);
		columnFFactory();
		table.getColumns().add(columnF);
		return table;
	}

	public TableView<data> getSevenColumnsTable() {

		table = new TableView<>();
		// table.getColumns().clear();
		table.setLayoutX(0.0);
		table.setLayoutY(0.0);
		table.setEditable(true);
		// table.setPrefSize(tablePrefWidth - 15, tablePrefHeight);
		columnProcessFactory();
		table.getColumns().add(columnProcess);
		columnAFactory();
		table.getColumns().add(columnA);
		columnBFactory();
		table.getColumns().add(columnB);
		columnCFactory();
		table.getColumns().add(columnC);
		columnDFactory();
		table.getColumns().add(columnD);
		columnEFactory();
		table.getColumns().add(columnE);
		columnFFactory();
		table.getColumns().add(columnF);
		columnGFactory();
		table.getColumns().add(columnG);
		return table;
	}

	/*
	 * Maximum Table
	 */
/*	public TableView<data> getThreeColumnMaxAllocationTable() {
		table = new TableView<>();
		// maxTable.getColumns().clear();
		table.setLayoutX(0.0);
		table.setLayoutY(0.0);
		table.setEditable(true);
		table.setPrefSize(tablePrefWidth - 15, tablePrefHeight);
		columnProcessFactory();
		columnAFactory();
		table.getColumns().add(columnA);
		columnBFactory();
		table.getColumns().add(columnB);
		columnCFactory();
		table.getColumns().add(columnC);
		return table;
	}

	public TableView<data> getFourColumnMaxAllocationTable() {
		table = new TableView<>();
		table.getColumns().clear();
		table.setLayoutX(0.0);
		table.setLayoutY(0.0);
		table.setEditable(true);
		table.setPrefSize(tablePrefWidth - 15, tablePrefHeight);
		columnAFactory();
		columnBFactory();
		columnCFactory();
		columnDFactory();
		return table;
	}

	public TableView<data> getFiveColumnMaxAllocationTable() {
		table = new TableView<>();
		table.setLayoutX(0.0);
		table.setLayoutY(0.0);
		table.setEditable(true);
		table.setPrefSize(tablePrefWidth - 15, tablePrefHeight);
		columnAFactory();
		columnBFactory();
		columnCFactory();
		columnDFactory();
		columnEFactory();
		return table;
	}

	public TableView<data> getSixColumnMaxAllocationTable() {
		table = new TableView<>();
		table.setLayoutX(0.0);
		table.setLayoutY(0.0);
		table.setEditable(true);
		table.setPrefSize(tablePrefWidth - 15, tablePrefHeight);
		columnAFactory();
		columnBFactory();
		columnCFactory();
		columnDFactory();
		columnEFactory();
		columnFFactory();
		return table;
	}

	public TableView<data> getSevenColumnMaxAllocationTable() {
		table = new TableView<>();
		table.setLayoutX(0.0);
		table.setLayoutY(0.0);
		table.setEditable(true);
		table.setPrefSize(tablePrefWidth - 15, tablePrefHeight);
		columnAFactory();
		columnBFactory();
		columnCFactory();
		columnDFactory();
		columnEFactory();
		columnFFactory();
		columnGFactory();
		return table;
	}
*/
	/*
	 * column Process
	 */
	private void columnProcessFactory() {
		columnProcess.setPrefWidth(columnWidth);
		columnProcess.setResizable(false);
		// columnProcess.setStyle("-fx-background-color:GREEN;");
		columnProcess.setCellValueFactory(new PropertyValueFactory<data, String>("process"));
		columnProcess.setEditable(true);
		columnProcess.setCellFactory(TextFieldTableCell.forTableColumn());
		columnProcess.setOnEditCommit(new EventHandler<CellEditEvent<data, String>>() {

			@Override
			public void handle(CellEditEvent<data, String> arg0) {
				System.out.println("column process");
			}

		});

	}

	/*
	 * Column A
	 */
	private void columnAFactory() {

		columnA.setResizable(false);
		columnA.setPrefWidth(columnWidth);
		// columnA.setStyle("-fx-background-color: RED;");
		columnA.setCellValueFactory(new PropertyValueFactory<data, Integer>("A"));
		columnA.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		columnA.setOnEditCommit(new EventHandler<CellEditEvent<data, Integer>>() {

			@Override
			public void handle(CellEditEvent<data, Integer> arg0) {
				// TODO Auto-generated method stub
				System.out.println("Column A ");

			}

		});

	}

	/*
	 * Column B
	 */
	private void columnBFactory() {

		columnB.setPrefWidth(columnWidth);
		columnB.setResizable(false);
		// columnB.setStyle("-fx-background-color: BLUE;");
		columnB.setCellValueFactory(new PropertyValueFactory<data, Integer>("B"));
		columnB.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		columnB.setOnEditCommit(new EventHandler<CellEditEvent<data, Integer>>() {

			@Override
			public void handle(CellEditEvent<data, Integer> arg0) {
				System.out.println("Column B");
			}

		});

	}

	/*
	 * Column C
	 */
	private void columnCFactory() {
		columnC.setPrefWidth(columnWidth);
		columnC.setResizable(false);
		columnC.setCellValueFactory(new PropertyValueFactory<data, Integer>("C"));
		// columnC.setStyle("-fx-background-color:YELLOW");
		columnC.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		columnC.setOnEditCommit(new EventHandler<CellEditEvent<data, Integer>>() {

			@Override
			public void handle(CellEditEvent<data, Integer> arg0) {
				System.out.println("Column C");

			}

		});

	}

	/*
	 * Column D
	 */
	private void columnDFactory() {

		columnD.setResizable(false);
		columnD.setPrefWidth(columnWidth);
		// columnA.setStyle("-fx-background-color: RED;");
		columnD.setCellValueFactory(new PropertyValueFactory<data, Integer>("D"));
		columnD.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		columnD.setOnEditCommit(new EventHandler<CellEditEvent<data, Integer>>() {

			@Override
			public void handle(CellEditEvent<data, Integer> arg0) {
				System.out.println("Column A ");

			}

		});

	}

	/*
	 * Column E
	 */
	private void columnEFactory() {

		columnE.setResizable(false);
		columnE.setPrefWidth(columnWidth);
		columnE.setCellValueFactory(new PropertyValueFactory<data, Integer>("E"));
		columnE.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		columnE.setOnEditCommit(new EventHandler<CellEditEvent<data, Integer>>() {

			@Override
			public void handle(CellEditEvent<data, Integer> arg0) {
				// TODO Auto-generated method stub
				System.out.println("Column A ");

			}

		});

	}

	/*
	 * Column F
	 */
	private void columnFFactory() {

		columnF.setResizable(false);
		columnF.setPrefWidth(columnWidth);
		// columnA.setStyle("-fx-background-color: RED;");
		columnF.setCellValueFactory(new PropertyValueFactory<data, Integer>("F"));
		columnF.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		columnF.setOnEditCommit(new EventHandler<CellEditEvent<data, Integer>>() {

			@Override
			public void handle(CellEditEvent<data, Integer> arg0) {
				// TODO Auto-generated method stub
				System.out.println("Column A ");

			}

		});

	}

	/*
	 * Column G
	 */
	private void columnGFactory() {

		columnG.setResizable(false);
		columnG.setPrefWidth(columnWidth);
		// columnA.setStyle("-fx-background-color: RED;");
		columnG.setCellValueFactory(new PropertyValueFactory<data, Integer>("G"));
		columnG.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		columnG.setOnEditCommit(new EventHandler<CellEditEvent<data, Integer>>() {

			@Override
			public void handle(CellEditEvent<data, Integer> arg0) {
				// TODO Auto-generated method stub
				System.out.println("Column A ");

			}

		});

	}

	private TableView<data> table;
	private TableColumn<data, String> columnProcess = new TableColumn<>("Process");
	private TableColumn<data, Integer> columnA = new TableColumn<>("A");
	private TableColumn<data, Integer> columnC = new TableColumn<>("C");
	private TableColumn<data, Integer> columnB = new TableColumn<>("B");
	private TableColumn<data, Integer> columnD = new TableColumn<>("D");
	private TableColumn<data, Integer> columnE = new TableColumn<>("E");
	private TableColumn<data, Integer> columnF = new TableColumn<>("F");
	private TableColumn<data, Integer> columnG = new TableColumn<>("G");
}
