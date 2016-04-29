/**
* It is a Loan Re payment Bean having attributes of Loan Re payment as 
* variables and their getters and setters methods. 
* It is a model used for interacting with database.
      * @author   	:Dhaval Patel(537643), Arpan Jaiswal(537777)  
      * @version  	:1.0    
      * @Class 		:LoanRepaymentBean
      * @Creation 	:15-Dec-2011
     * @ History	:
*/

package com.nsep.beans;

public class LoanRepaymentBean 
{
	private int repaymentId;
	private int loanId;
	private int studentId;
	private double amount;
	private String repaymentDate;

	/**
	 * This function is used to get RepaymentId. 
	 * @param		:None
	 * @return		:int Returns the RepaymentId.
	 * @since		:JDK version 1.5
	 */
	
	public int getRepaymentId() {
		return repaymentId;
	}
	
	/**
	 * This function is used to set RepaymentId. 
	 * @param		:int RepaymentId
	 * @return		:None
	 * @since		:JDK version 1.5
	 */
	
	public void setRepaymentId(int repaymentId) {
		this.repaymentId = repaymentId;
	}
	
	/**
	 * This function is used to get LoanId. 
	 * @param		:None.
	 * @return		:int LoanId.
	 * @since		:JDK version 1.5
	 */
	public int getLoanId() {
		return loanId;
	}
	/**
	 * This function is used to set LoanId. 
	 * @param		:int RepaymentId
	 * @return		:None.
	 * @since		:JDK version 1.5
	 */
	
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	/**
	 * This function is used to get StudentId. 
	 * @param		:None
	 * @return		:int StudentId.
	 * @since		:JDK version 1.5
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * This function is used to set StudentId. 
	 * @param		:int StudentId
	 * @return		:None.
	 * @since		:JDK version 1.5
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * This function is used to get Amount. 
	 * @param		:None.
	 * @return		:double amount.
	 * @since		:JDK version 1.5
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * This function is used to set amount. 
	 * @param		:double Amount
	 * @return		:None.
	 * @since		:JDK version 1.5
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * This function is used to get RepaymentDate. 
	 * @param		:None.
	 * @return		:String repaymentDate.
	 * @since		:JDK version 1.5
	 */
	public String getRepaymentDate() {
		return repaymentDate;
	}
	/**
	 * This function is used to set RepaymentDate. 
	 * @param		:StringRepaymentDate
	 * @return		:None.
	 * @since		:JDK version 1.5
	 */
	public void setRepaymentDate(String repaymentDate) {
		this.repaymentDate = repaymentDate;
	}
}
