package task;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class task {

	public static void main(String[] args) {
		Map<Integer,control> cr=new LinkedHashMap<Integer,control>();
		control c1=new control();
		c1.setBusno(10);
		c1.setRoute("Chennai to Madurai");
		c1.setCapacity(30);
		control c2=new control();
		c2.setBusno(20);
		c2.setRoute("Chennai to Trichy");
		c2.setCapacity(55);
		control c3=new control();
		c3.setBusno(12);
		c3.setRoute("Vellore to Madurai");
		c3.setCapacity(40);
		control c4=new control();
		c4.setBusno(67);
		c4.setRoute("Theni to Ooty");
		c4.setCapacity(90);
		cr.put(0,c1);
		cr.put(1,c2);
		cr.put(2,c3);
		cr.put(3,c4);
		Set<Entry<Integer,control>> a=cr.entrySet();
		for(Entry<Integer,control> ct:a)
		{
			System.out.println(ct.getValue().getBusno());
			System.out.println(ct.getValue().getRoute());
			System.out.println(ct.getValue().getCapacity());
		}
	}

}
