
function formvalidator(form)
{
	var studentId=document.getElementById("studentId");
	var stId=document.getElementById("stId");
	
	var count =0;
	var foc=0;

	if(validateForm(studentId,stId,"Please Enter Student Id ",9))
	{
		if(isNumeric(studentId,stId,"Please Enter Numeric Values for Student Id"))
		{
			count++;
		}
		else
		{
			foc = studentId;
		}
	}
	else
	{
		foc = studentId;	
	}
	
	if (count!=1)
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
	document.getElementById("studentId").focus();
	document.getElementById("studentId").style.backgroundColor="#FFFFFF";
	
	document.getElementById("stId").innerHTML=""; 
	
   return true;
  }
 else 
   return false;

}
function submitButton()
{
 var b=confirm("Do you want to search ?");
 if(b==true)
	 return formvalidator();
 else 
 {
	 document.getElementById("studentId").focus();
	 return false;
 }
}
