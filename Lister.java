package hello;
import java.io.*;

public class Lister {

	private File file;
	private boolean showHidden;
	
	//ctor
	public Lister(File file, boolean showHidden) {
		this.file = file;
		this.showHidden = showHidden;
	}
	
	public void list() {
		listRecurse(file, "");
	}
	
	private void listRecurse(File file, String indent) {
		if(file.isFile()){
			System.out.println(file.getName());
		}
		else {
			System.out.println(indent + file.getName() + ":");
			indent += "    ";
			String[] arr = file.list();
			for(String s: arr) {				
					if(showHidden || !(s.substring(0,1).equals("."))) {
						File newFile = new File(file, s);
						listRecurse(newFile, indent);
					}
				}
			}
	}
	
	public static void main(String[] args) {
		File f = new File("/Users/MANNATKAUR/Documents/Lab5Workspace");
		Lister l = new Lister(f,true);
		Lister n = new Lister(f, false);
		l.list();
		System.out.println("---------------------------");
		n.list();
	}
}
