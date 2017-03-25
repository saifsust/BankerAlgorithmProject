package algorithm;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class data {

	public data(String process, Integer A, Integer B, Integer C) {
		this.process.setValue(process);
		this.A.setValue(A);
		this.B.setValue(B);
		this.C.setValue(C);
	}

	public data(String process, Integer A, Integer B, Integer C, Integer D) {
		this.process.setValue(process);
		this.A.setValue(A);
		this.B.setValue(B);
		this.C.setValue(C);
		this.D.setValue(D);
	}

	public data(String process, Integer A, Integer B, Integer C, Integer D, Integer E) {
		this.process.setValue(process);
		this.A.setValue(A);
		this.B.setValue(B);
		this.C.setValue(C);
		this.D.setValue(D);
		this.E.setValue(E);
	}

	public data(String process, Integer A, Integer B, Integer C, Integer D, Integer E, Integer F) {
		this.process.setValue(process);
		this.A.setValue(A);
		this.B.setValue(B);
		this.C.setValue(C);
		this.D.setValue(D);
		this.E.setValue(E);
		this.F.setValue(F);
	}

	public data(String process, Integer A, Integer B, Integer C, Integer D, Integer E, Integer F, Integer G) {
		this.process.setValue(process);
		this.A.setValue(A);
		this.B.setValue(B);
		this.C.setValue(C);
		this.D.setValue(D);
		this.E.setValue(E);
		this.F.setValue(F);
		this.G.setValue(G);
	}

	public String getProcess() {
		return this.process.getValue();
	}

	public void setProcess(String process) {
		this.process.setValue(process);
	}

	public Integer getA() {
		return this.A.getValue();
	}

	public void setA(Integer A) {
		this.A.setValue(A);
	}

	public Integer getB() {
		return this.B.getValue();
	}

	public void setB(Integer B) {
		this.B.setValue(B);
	}

	public Integer getC() {
		return this.C.getValue();
	}

	public void setC(Integer C) {
		this.C.setValue(C);
	}

	@Override
	public String toString() {
		return "data [process=" + process + ", A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + ", E=" + E + ", F=" + F
				+ ", G=" + G + "]";
	}

	public Integer getD() {
		return this.D.getValue();
	}

	public void setD(Integer d) {
		this.D.setValue(d);
	}

	public Integer getE() {
		return this.E.getValue();
	}

	public void setE(Integer e) {
		this.E.setValue(e);
	}

	public Integer getF() {
		return this.F.getValue();
	}

	public void setF(Integer f) {
		this.F.setValue(f);
	}

	public Integer getG() {
		return this.G.getValue();
	}

	public void setG(Integer g) {
		this.G.setValue(g);
	}

	private StringProperty process = new SimpleStringProperty();
	private IntegerProperty A = new SimpleIntegerProperty();
	private IntegerProperty B = new SimpleIntegerProperty();
	private IntegerProperty C = new SimpleIntegerProperty();
	private IntegerProperty D = new SimpleIntegerProperty();
	private IntegerProperty E = new SimpleIntegerProperty();
	private IntegerProperty F = new SimpleIntegerProperty();
	private IntegerProperty G = new SimpleIntegerProperty();
}
