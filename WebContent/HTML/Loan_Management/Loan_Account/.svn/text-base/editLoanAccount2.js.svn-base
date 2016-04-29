function validation()
{
	var con=confirm("Do you Want to Submit ?");
	if (con==false)
	  {
		return false;
	  }
	
	
	var acc_no=document.myform.acc_no.value;
	var retrn=true;
	var bank=document.myform.bank.value;
	var start_date=document.myform.start_date.value;
	var foc;
	
	if(!acc_no.match(/^[0-9]*$/))
	{
		document.getElementById('acc_no_label').innerHTML="Loan ID should only contain numerics";
		document.getElementById('acc_no').style.background="#FF9999";
		foc=document.getElementById('acc_no');
		retrn=false;
	}
	else if(acc_no.length!="14")
	{
		document.getElementById('acc_no_label').innerHTML="Loan ID should be exactly 14 digits";
		document.getElementById('acc_no').style.background="#FF9999";
		foc=document.getElementById('acc_no');
		retrn=false;
	}
	else
	{
		document.getElementById('acc_no_label').innerHTML="";
	}
	
	if(bank=="not_selected")
	{
		document.getElementById('bank_label').innerHTML="Please select your Bank";
		document.getElementById('bank').style.background="#FF9999";
		foc=document.getElementById('bank');
		retrn=false;
	}
	
	if(bank!="not_selected")
	{
		document.getElementById('bank_label').innerHTML="";
	}
	
	if(start_date=="")
	{
		document.getElementById('start_date_label').innerHTML="Please select your Start Date";
		document.getElementById('start_date').style.background="#FF9999";
		foc=document.getElementById('start_date');
		retrn=false;
	}
	
	if(start_date!="")
	{
		document.getElementById('start_date_label').innerHTML="";
	}
	
	foc.focus();
	
	return retrn;
}

function callReset()
{
	var con=confirm("Do you Want to Reset ?");
	if (con==true)
	  {
		document.getElementById('start_date_label').innerHTML="";
		document.getElementById('bank_label').innerHTML="";
		document.getElementById('acc_no_label').innerHTML="";
		document.getElementById('acc_no').style.background="#FFFFFF";
		document.getElementById('bank').style.background="#FFFFFF";
		document.getElementById('start_date').style.background="#FFFFFF";
		
		return true;
	  }

	return false;
}

function focusColor(val)
{
	val.style.background='#abcdef';
}

function blurColor(val)
{
	val.style.background='#ffffff';
}