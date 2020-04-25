package tddjunitdemo;

public class RemoveAFirst2Chars 
{
   
	public String remove(String string)
	{
			
		String result=" ";
		int stringLength=string.length();
		if(stringLength>1)
		{
			if(string.charAt(0)=='A' &&  string.charAt(1)=='A')
			{
				result=string.substring(2, stringLength);
			}
			else if(string.charAt(0)=='A')
			{
				 result=string.substring(1, stringLength);
				 
			}
			else if(string.charAt(1)=='A')
			{
				 result=string.charAt(0)+string.substring(2, stringLength);
			}
			else
			{
				result=string;
			}
		}
		else
		{
			if(string.charAt(0)!='A' || string==" ")
			{
				result=string;
			}
			else if(string.charAt(0)=='A')
			{
				result=" ";
			}
		}
		return result;
		
	}
}













