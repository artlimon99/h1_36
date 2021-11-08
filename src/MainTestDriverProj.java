import java.util.ArrayList;
import java.util.Collections;

public class MainTestDriverProj {

	public String[] alist = { "ART", "Bob", "Carmen","Dodge", "ED"};

	public ArrayList<String> arrayListInit() {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < alist.length; i++) {
			list.add(alist[i]);
		}
		return list;
	}
	
	public void insertName(ArrayList<String> plist,String pName) {
				
		//for (int i = 0; i < plist.size(); i++) {
		plist.add(pName);
		Collections.sort(plist);
		//}

	}

	
	public static void main(String[] pArgs)
	{
		new MainTestDriverProj().run();
	}

	public MainTestDriverProj() 
	{
	}

	private void run() 
	{
	//MainTestDriverProj h136 = new MainTestDriverProj();
		
		ArrayList<String> plist =  arrayListInit();
		insertName(plist,"Coe");
		System.out.println(plist);
		
		 
	}
	
}
		
		
		