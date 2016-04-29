function validation()
{
	var con=confirm("Do you Want to Submit ?");
	if (con==false)
	  {
		return false;
	  }
	
	
	var id=document.myform.id_field.value;
	
	if(!id.match(/^[0-9]*$/))
	{
		document.getElementById('loan_id_label').innerHTML="Loan ID should only contain numerics";
		document.getElementById('id_field').focus();
		document.getElementById('id_field').select();
		return false;
	}
	
	else if(id.length!="9")
	{
		document.getElementById('loan_id_label').innerHTML="Loan ID should be exactly 9 digits";
		document.getElementById('id_field').focus();
		document.getElementById('id_field').select();
		return false;
	}

	return true;
}

function callReset()
{
	var con=confirm("Do you Want to Reset ?");
	if (con==true)
	  {
		document.getElementById('loan_id_label').innerHTML="";
		document.getElementById('id_field').focus();
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