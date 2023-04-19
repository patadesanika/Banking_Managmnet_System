public class Acc_details  {
	private  String Term_deposit;
private String mode_operation;
private int operation_date;
private String nominee_name;
private String  nominee_Dob;
private int nominee_age;
private String acc_type;
private Accholder acc;
public String getTerm_deposit() {
	return Term_deposit;
}
public void setTerm_deposit(String term_deposit) {
	Term_deposit = term_deposit;
}
public String getMode_operation() {
	return mode_operation;
}
public void setMode_operation(String mode_operation) {
	this.mode_operation = mode_operation;
}
public int getOperation_date() {
	return operation_date;
}
public void setOperation_date(int operation_date) {
	this.operation_date = operation_date;
}
public String getNominee_name() {
	return nominee_name;
}
public void setNominee_name(String nominee_name) {
	this.nominee_name = nominee_name;
}
public String getNominee_Dob() {
	return nominee_Dob;
}
public void setNominee_Dob(String nominee_Dob) {
	this.nominee_Dob = nominee_Dob;
}
public int getNominee_age() {
	return nominee_age;
}
public void setNominee_age(int nominee_age) {
	this.nominee_age = nominee_age;
}
public String getAcc_type() {
	return acc_type;
}
public void setAcc_type(String acc_type) {
	this.acc_type = acc_type;
}

public void setacc(Accholder acc) {
	this.acc = acc;
}

}
