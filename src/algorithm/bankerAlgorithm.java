package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bankerAlgorithm {

	public boolean algorithm(Integer A, Integer B, Integer C) {
		int i = 0, size = allocationList.size();
		boolean status[] = new boolean[size + 5];
		Arrays.fill(status, false);
		allocatedProcessList.clear();
		boolean allocation = false;
		while (i < size) {
			allocation = false;
			for (int j = 0; j < size; j++) {
				if (!status[j] && checkSafe(j, A, B, C)) {
					status[j] = true;
					allocation = true;
					i++;
					allocatedProcessList.add(allocationList.get(j).getProcess());
					A = A + allocationList.get(j).getA();
					B = B + allocationList.get(j).getB();
					C = C + allocationList.get(j).getC();
				}

			}
			if (!allocation) {
				break;
			}

		}
		return allocation;
	}

	public boolean algorithm(Integer A, Integer B, Integer C, Integer D) {
		int i = 0, size = allocationList.size();
		boolean status[] = new boolean[size + 5];
		Arrays.fill(status, false);
		allocatedProcessList.clear();
		boolean allocation = false;
		while (i < size) {
			allocation = false;
			for (int j = 0; j < size; j++) {
				if (!status[j] && checkSafe(j, A, B, C, D)) {
					status[j] = true;
					allocation = true;
					i++;
					allocatedProcessList.add(allocationList.get(j).getProcess());
					A = A + allocationList.get(j).getA();
					B = B + allocationList.get(j).getB();
					C = C + allocationList.get(j).getC();
					D = D + allocationList.get(j).getD();
				}

			}
			if (!allocation) {
				break;
			}

		}
		return allocation;
	}

	public boolean algorithm(Integer A, Integer B, Integer C, Integer D, Integer E) {
		int i = 0, size = allocationList.size();
		boolean status[] = new boolean[size + 5];
		Arrays.fill(status, false);
		allocatedProcessList.clear();
		boolean allocation = false;
		while (i < size) {
			allocation = false;
			for (int j = 0; j < size; j++) {
				if (!status[j] && checkSafe(j, A, B, C, D, E)) {
					status[j] = true;
					allocation = true;
					i++;
					allocatedProcessList.add(allocationList.get(j).getProcess());
					A = A + allocationList.get(j).getA();
					B = B + allocationList.get(j).getB();
					C = C + allocationList.get(j).getC();
					D = D + allocationList.get(j).getD();
					E = E + allocationList.get(j).getE();
				}

			}
			if (!allocation) {
				break;
			}

		}
		return allocation;
	}

	public boolean algorithm(Integer A, Integer B, Integer C, Integer D, Integer E, Integer F) {
		int i = 0, size = allocationList.size();
		boolean status[] = new boolean[size + 5];
		Arrays.fill(status, false);
		allocatedProcessList.clear();
		boolean allocation = false;
		while (i < size) {
			allocation = false;
			for (int j = 0; j < size; j++) {
				if (!status[j] && checkSafe(j, A, B, C, D, E, F)) {
					status[j] = true;
					allocation = true;
					i++;
					allocatedProcessList.add(allocationList.get(j).getProcess());
					A = A + allocationList.get(j).getA();
					B = B + allocationList.get(j).getB();
					C = C + allocationList.get(j).getC();
					D = D + allocationList.get(j).getD();
					E = E + allocationList.get(j).getE();
					F = F + allocationList.get(j).getF();
				}

			}
			if (!allocation) {
				break;
			}

		}
		return allocation;
	}

	public boolean algorithm(Integer A, Integer B, Integer C, Integer D, Integer E, Integer F, Integer G) {
		int i = 0, size = allocationList.size();
		boolean status[] = new boolean[size + 5];
		Arrays.fill(status, false);
		allocatedProcessList.clear();
		boolean allocation = false;
		while (i < size) {
			allocation = false;
			for (int j = 0; j < size; j++) {
				if (!status[j] && checkSafe(j, A, B, C, D, E, F, G)) {
					status[j] = true;
					allocation = true;
					i++;
					allocatedProcessList.add(allocationList.get(j).getProcess());
					A = A + allocationList.get(j).getA();
					B = B + allocationList.get(j).getB();
					C = C + allocationList.get(j).getC();
					D = D + allocationList.get(j).getD();
					E = E + allocationList.get(j).getE();
					F = F + allocationList.get(j).getF();
					G = G + allocationList.get(j).getG();
				}

			}
			if (!allocation) {
				break;
			}

		}
		return allocation;
	}

	private void findNeedList() {

		needList.clear();
		for (int i = 0; i < allocationList.size(); i++) {
			Integer A = maxAllocationList.get(i).getA() - allocationList.get(i).getA();
			Integer B = maxAllocationList.get(i).getB() - allocationList.get(i).getB();
			Integer C = maxAllocationList.get(i).getC() - allocationList.get(i).getC();
			needList.add(new data(allocationList.get(i).getProcess(), A, B, C));
		}
	}

	private boolean checkSafe(int index, Integer availableA, Integer availableB, Integer availableC) {
		if (availableA >= needList.get(index).getA() && availableB >= needList.get(index).getB()
				&& availableC >= needList.get(index).getC()) {
			return true;
		}
		return false;

	}

	private boolean checkSafe(int index, Integer availableA, Integer availableB, Integer availableC,
			Integer availableD) {
		if (availableA >= needList.get(index).getA() && availableB >= needList.get(index).getB()
				&& availableC >= needList.get(index).getC() && availableD >= needList.get(index).getD()) {
			return true;
		}
		return false;

	}

	private boolean checkSafe(int index, Integer availableA, Integer availableB, Integer availableC, Integer availableD,
			Integer availableE) {
		if (availableA >= needList.get(index).getA() && availableB >= needList.get(index).getB()
				&& availableC >= needList.get(index).getC() && availableD >= needList.get(index).getD()
				&& availableE >= needList.get(index).getE()) {
			return true;
		}
		return false;

	}

	private boolean checkSafe(int index, Integer availableA, Integer availableB, Integer availableC, Integer availableD,
			Integer availableE, Integer availableF) {
		if (availableA >= needList.get(index).getA() && availableB >= needList.get(index).getB()
				&& availableC >= needList.get(index).getC() && availableD >= needList.get(index).getD()
				&& availableE >= needList.get(index).getE() && availableF >= needList.get(index).getF()) {
			return true;
		}
		return false;

	}

	private boolean checkSafe(int index, Integer availableA, Integer availableB, Integer availableC, Integer availableD,
			Integer availableE, Integer availableF, Integer availableG) {
		if (availableA >= needList.get(index).getA() && availableB >= needList.get(index).getB()
				&& availableC >= needList.get(index).getC() && availableD >= needList.get(index).getD()
				&& availableE >= needList.get(index).getE() && availableF >= needList.get(index).getF()
				&& availableG >= needList.get(index).getG()) {
			return true;
		}
		return false;

	}

	public void setMaxAllocationList(List<data> maxAllocationList) {
		this.maxAllocationList.clear();
		this.maxAllocationList = maxAllocationList;
	}

	public void setAllocationList(List<data> allocationList) {
		this.allocationList.clear();
		this.allocationList = allocationList;
	}

	public void setNeedList(List<data> needList) {
		this.needList.clear();
		this.needList = needList;
	}

	public List<String> getAllocatedProcessList() {
		return allocatedProcessList;
	}

	private List<data> needList = new ArrayList<>();
	private List<data> maxAllocationList = new ArrayList<>();
	private List<data> allocationList = new ArrayList<>();
	private List<String> allocatedProcessList = new ArrayList<>();
}
