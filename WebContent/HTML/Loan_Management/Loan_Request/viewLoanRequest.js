function formvalidator(form)
{
	var LoanId=document.getElementById("LoanId");
	var LnId=document.getElementById("LnId");
	
	var count =0;
	if(validateForm(LoanId,LnId,"Please Enter 10 Digit Loan Id",10))
	{
		if(isNumeric(LoanId,LnId,"Please Enter Numeric Values for Loan Id"))
		{
			count++;
		}
	}
	
	if (count!=1)
		return false;
	else
		return true;

}
function validateForm(field,label,label_text,textLength)
{
	var x=field.value;
	if ((x==null || x=="") || x.length < textLength)
	  {
		label.innerHTML = label_text;
		// field.style.backgroundColor='blue';
		field.focus();
		field.select();
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
	 var numericExpression = /^[0-9]+$/;
	 if(field.value.match(numericExpression))
	 {
		 return true;
	 }
	 else
	 {
		 label.innerHTML = label_text;
		 field.focus();
		 field.select();
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
	 document.getElementById("LoanId").focus();
	 document.getElementById("LnId").innerHTML="";
   return true;
  }
 else 
   return false;

}
function submitButton()
{
 var b=confirm("Do you want to view Loan Request Details ?");
 if(b==true)
 	 return formvalidator(); 
 else 
	 return formvalidator();
}

function ExitButton()
{
 var b=confirm("Do you really want to Exit ?");
 if(b==true)
  {
	 window.close();
  }
 else 
	 return false;
}
