package malakb;
import java.util.ArrayList;


public class SC {
public ArrayList<product>pro=new  ArrayList<product>();
	public int getcount() {
		// TODO Auto-generated method stub
		int number=0;
		for(int i=0;i<pro.size();i++) {
			number+=pro.get(i).q;
		}
		return number;
		}
		

	public void add(product p) {
		// TODO Auto-generated method stub
		pro.add(p);
		
	}

	public int gettotalprice() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<pro.size();i++) {
			sum+=pro.get(i).price;
		}
		return sum;
		}
}
