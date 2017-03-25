package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import algorithm.bankerAlgorithm;
import algorithm.data;
import design.application;
import design.toolBarFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class apps extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		new toolBarFactory(primaryStage);
		//new application(primaryStage);
	}

	public static void main(String[] args) {
		 launch(args);
		/*
		List<data> alloc = new ArrayList<>();
		List<data> max = new ArrayList<>();
		bankerAlgorithm ba = new bankerAlgorithm();
		Scanner scan = new Scanner(System.in);
		System.out.println("Entger Number");
		int np = scan.nextInt();
		for (int i = 0; i < np; i++) {
			alloc.add(new data(Integer.toString(i), scan.nextInt(), scan.nextInt(), scan.nextInt()));
		}

		ba.setAllocationList(alloc);
		for (int i = 0; i < np; i++) {
			max.add(new data(Integer.toString(i), scan.nextInt(), scan.nextInt(), scan.nextInt()));
		}
		ba.setMaxAllocationList(max);
		
		boolean t = ba.algorithm(scan.nextInt(),scan.nextInt(),scan.nextInt());
		for(int i=0;i<ba.getAllocatedProcessList().size();i++)
		{
			System.out.println(ba.getAllocatedProcessList().get(i));
		}*/

	}

}
