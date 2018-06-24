package week0.day1;

public class Array {

	int num[] = {111111,222222,33333,444444,555555};

	public String addContact() {
		System.out.println("Number doesnot exist. Do you want to add the contact");
		return null;

	}



	public String fetchName(int number) {

		if (number==num[0])
		{
			return "san";

		}
		else if  (number==num[1]){
			return "suganth";

		}else if (number==num[2]){
			return "suriya";

		}else if (number==num[3]){
			return "bala";

		}
		else if (number==num[4]){
			return "vineela";

		}

		else 
		{

			return addContact();
		}

	}	




}


