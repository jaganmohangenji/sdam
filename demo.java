package stdMode;

import Details.ModelForREgistration;

public class demo {
public static void main(String[] args) {
	ModelForREgistration m=new ModelForREgistration("Jagan","20551A@gmail.com", "viz", "male","java");
	modelImp p=new modelImp();
	int i=p.getdetails(m);
	if(i==1)
	{
		System.out.println("Success!!!!!!!!!!!");
	}
	else {
		System.out.println("failed");
	}
;
	
}
}
