package com.nsep.beans;

import java.util.HashMap;

/**
* This is a Bean for Loan Account Module.
		* @author Ravi Patel , Bhagyashree Soni
		* @version v1.0
		* @Class name LoanAccountBean
		* @Creation Date 30-DEC-2011
		* @History
*/



public class LoanAccountBean 
{
	
	HashMap<K, V>
/**
 * variable to get and set an AccountNumber
 */
	private String accountNumber;
	
	/**
	 * variable to get and set a LoanId
	 */
	private int loanId;
	/**
	 * variable to get and set a FirstName
	 */
	private String firstName;
	/**
	 * variable to get and set a MiddleName
	 */
	private String middleName;
	/**
	 * variable to get and set a  LastName
	 */
	private String lastName;
	/**
	 * variable to get and set a StudentId
	 */
	private int studentId;
	/**
	 * variable to get and set a LoanAmount
	 */
	private double loanAmount;
	/**
	 * variable to get and set a Tenure
	 */
	private int tenure;
	/**
	 * variable to get and set an OutStandingAmount
	 */
	private double outstandingAmount;
	/**
	 * variable to get and set a StartDate
	 */
	private String startDate;
	/**
	 * variable to get and set a BankName
	 */
	private String bankName;
	/**
	 * variable to get and set a Status
	 */
	private boolean status=true;
	
	
	/**
 	*This method is used to get an Account Number.
 	*@return String
 	*@Since JDK 1.5.0
 	
	 */
	
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
 	*This method is used to set an Account Number.
 	*@Param String
 	*@Since JDK 1.5.0
 	
	 */
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
 	*This method is used to get a Loan Id.
 	*@return int
 	*@Since JDK 1.5.0
 	
	 */
	
	public int getLoanId() {
		return loanId;
	}
	/**
 	*This method is used to set a Loan Id.
 	*@Param int
 	*@Since JDK 1.5.0
 	
	 */
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	/**
 	*This method is used to get a FirstName.
 	*@return String
 	*@Since JDK 1.5.0
 	
	 */
	
	public String getFirstName() {
		return firstName;
	}
	/**
 	*This method is used to set a FirstName.
 	*@Param String
 	*@Since JDK 1.5.0
 	
	 */
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
 	*This method is used to get a MiddleName.
 	*@return String
 	*@Since JDK 1.5.0
 	
	 */
	
	
	public String getMiddleName() {
		return middleName;
	}
	/**
 	*This method is used to set a MiddleName.
 	*@Param String
 	*@Since JDK 1.5.0
 	
	 */
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	/**
 	*This method is used to get a LastName.
 	*@return String
 	*@Since JDK 1.5.0
 	
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
 	*This method is used to set a LastName.
 	*@Param String
 	*@Since JDK 1.5.0
 	
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
 	*This method is used to get a StudentId.
 	*@return int
 	*@Since JDK 1.5.0
 	
	 */
	
	public int getStudentId() {
		return studentId;
	}
	/**
 	*This method is used to set a StudentId.
 	*@Param int
 	*@Since JDK 1.5.0
 	
	 */
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	/**
 	*This method is used to get a LoanAmount.
 	*@return double
 	*@Since JDK 1.5.0
 	
	 */
	
	public double getLoanAmount() {
		return loanAmount;
	}
	/**
 	*This method is used to set a LoanAmount.
 	*@Param double
 	*@Since JDK 1.5.0
 	
	 */
	
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	/**
 	*This method is used to get a Tenure.
 	*@return int
 	*@Since JDK 1.5.0
 	
	 */
	
	
	public int getTenure() {
		return tenure;
	}
	/**
 	*This method is used to set a Tenure.
 	*@Param int
 	*@Since JDK 1.5.0
 	
	 */
	
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	/**
 	*This method is used to get an OutStandingAmount.
 	*@return double
 	*@Since JDK 1.5.0
 	
	 */
	
	
	public double getOutstandingAmount() {
		return outstandingAmount;
	}
	
	/**
 	*This method is used to set an OutStandingAmount.
 	*@Param double
 	*@Since JDK 1.5.0
 	
	 */
	
	public void setOutstandingAmount(double outstandingAmount) {
		this.outstandingAmount = outstandingAmount;
	}
	
	/**
 	*This method is used to get a StartDate.
 	*@return String
 	*@Since JDK 1.5.0
 	
	 */
	
	public String getStartDate() {
		return startDate;
	}
	/**
 	*This method is used to set a StartDate.
 	*@Param String
 	*@Since JDK 1.5.0
 	
	 */
	
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	/**
 	*This method is used to get a BankName.
 	*@return String
 	*@Since JDK 1.5.0
 	
	 */
	
	public String getBankName() {
		return bankName;
	}
	/**
 	*This method is used to set a BankName.
 	*@Param String
 	*@Since JDK 1.5.0
 	
	 */
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
 	*This method is used to get a Status.
 	*@return boolean
 	*@Since JDK 1.5.0
 	
	 */
	
	public boolean isStatus() {
		return status;
	}
	
	/**
 	*This method is used to set a Status.
 	*@Param boolean
 	*@Since JDK 1.5.0
 	
	 */
	
	
	public void setStatus(boolean status) {
		this.status = status;
	}
}
