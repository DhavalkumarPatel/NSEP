
function formvalidator(form)
{
	var FName=document.getElementById("FirstName");
	var StFName=document.getElementById("StFName");
	var MName=document.getElementById("MiddleName");
	var StMName=document.getElementById("StMName");
	var LName=document.getElementById("LastName");
	var StLName=document.getElementById("StLName");
	var Id=document.getElementById("StudentId");
	var StId=document.getElementById("StId");
	var Purpose=document.getElementById("LoanPurpose");
	var LnPurpose=document.getElementById("LnPurpose");
	var Amount=document.getElementById("LoanAmount");
	var LnAmt=document.getElementById("LnAmt");
	var RepPeriod=document.getElementById("RepaymentPeriod");
	var RPeriod=document.getElementById("RPeriod");
	var count =0;
	var foc=0;

	if(validateForm(RepPeriod,RPeriod,"Please Enter Repayment Period as Total of Months",2))
	{
		if(isNumeric(RepPeriod,RPeriod,"Please Enter Numeric Values for Repayment Period"))
		{
			count++;
		}
		else
		{
			foc = RepPeriod;

		}
	}
	else
	{
		foc = RepPeriod;

		
	}
	if(validateForm(Amount,LnAmt,"Please Enter Loan Amount",10))
	{
		if(isNumeric(Amount,LnAmt,"Please Enter Numeric Values for Loan Amount"))
		{
			count++;
		}
		else
		{
			foc = Amount;

		}
	}
	else
	{
		foc = Amount;

	}
	if(validateForm(Purpose,LnPurpose,"Please Enter Loan Purpose",30))
	{
		if(isAlphabetWithSpace(Purpose,LnPurpose,"Please Enter Purpose in Alphabets"))
		{
			count++;
		}
		else
		{
			foc = Purpose;

		}
	}
	else
	{
		foc = Purpose;

	}
	if(validateForm(Id,StId,"Please Enter Student Id upto 10 Digit",10))
	{
		if(isNumeric(Id,StId,"Please Enter Numeric Values"))
		{
			count++;
		}
		else
		{
			foc = Id;

		}
	}
	else
	{
		foc = Id;

	}
	
	if(validateForm(LName,StLName,"Please Enter Student's Last Name",30))
	{
		if(isAlphabet(LName,StLName,"Please Enter Student's Last Name Name in Alphabets"))
		{
			count++;
			
		}
		else
		{
			foc = LName;

		}
	}
	else
	{
		foc = LName;

	}
	var temp=MName.value;
	if (temp==null || temp=="")
	{
		count++;
	}
	else 
	{
		if(isAlphabet(MName,StMName,"Please Enter Student's Middle Name in Alphabets"))
		{
			count++;
		}
		else
		{
			foc = MName;
		}
	}
	if(validateForm(FName,StFName,"Please Enter Student's First Name",30))
	{
		if(isAlphabet(FName,StFName,"Please Enter Student's First Name in Alphabets"))
		{
			count++;
		}
		else
		{
			foc = FName;
		}
	}
	else
	{
		foc = FName;
	}
	
	if (count!=7)
	{
		foc.focus();
		foc.select();
		return false;
	}
	else
		return true;
	
}
function validateForm(field,label,label_text,textLength)
{
	var x=field.value;
	if ((x==null || x=="") || x.length > textLength)
	  {
		label.innerHTML = label_text;
		
		field.style.backgroundColor="pink";
		return false;
	  }
	else
	{
		label.innerHTML = "";
		return true;
	}
	
}  
function isNumeric(field,label,label_text)
{
	 var numericExpression = /^[0-9.]+$/;
	 if(field.value.match(numericExpression) && field.value>0)
	 {
		 return true;
	 }
	 else
	 {
		 label.innerHTML = label_text;
		 field.style.backgroundColor="pink";
		 return false;
	 }
	 
}

function isAlphabet(field,label,label_text)
{
	 var alphaExp = /^[a-zA-Z]+$/;
	 if(field.value.match(alphaExp))
	 {
	  return true;
	 }
	 else
	 {
		 label.innerHTML = label_text;
		 
		 field.style.backgroundColor="pink";
		 return false;
	 }
}
function isAlphabetWithSpace(field,label,label_text)
{
	 var alphaExp = /^[a-zA-Z ]+$/;
	 if(field.value.match(alphaExp))
	 {
	  return true;
	 }
	 else
	 {
		 label.innerHTML = label_text;
		 
		 field.style.backgroundColor="pink";
		 return false;
	 }
}

function changeColor(value)
{
	value.style.backgroundColor="#fffacd";
}

function changeBGcolor(value)
{
	value.style.backgroundColor="#ffffff";
}


function resetButton()
{
 var a=confirm("Do you really want to Reset ?");
 if(a==true)
  { 
	document.getElementById("FirstName").focus();
	document.getElementById("FirstName").style.backgroundColor="#FFFFFF";
	document.getElementById("MiddleName").style.backgroundColor="#FFFFFF";
	document.getElementById("LastName").style.backgroundColor="#FFFFFF";
	document.getElementById("StudentId").style.backgroundColor="#FFFFFF";
	document.getElementById("LoanPurpose").style.backgroundColor="#FFFFFF";
	document.getElementById("LoanAmount").style.backgroundColor="#FFFFFF";
	document.getElementById("RepaymentPeriod").style.backgroundColor="#FFFFFF";
	document.getElementById("StFName").innerHTML=""; 
	document.getElementById("StMName").innerHTML="";
	document.getElementById("StLName").innerHTML="";
	document.getElementById("StId").innerHTML="";
	document.getElementById("LnPurpose").innerHTML="";
	document.getElementById("LnAmt").innerHTML="";
	document.getElementById("RPeriod").innerHTML="";
   return true;
  }
 else 
   return false;

}
function submitButton()
{
 var b=confirm("Do you want to submit Loan Request Details ?");
 if(b==true)
	 return formvalidator();
 else 
 {
	 document.getElementById("FirstName").focus();
	 return false;
 }
}
