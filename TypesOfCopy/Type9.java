package java_home.TypesOfCopy;

public class Type9 {

	public static void main(String[] args) throws CloneNotSupportedException {
		//Deep Copy by .clone()
		
		Patient p=new Patient();
		
		Hospital h1=new Hospital();
		h1.Hosp_name="Sancheti";
		h1.Hosp_Type="Cancer Specilist";
		h1.patient=p;
		h1.patient.P_id=163;
		h1.patient.P_name="Ananda";
		
		
		
		Hospital h2=(Hospital)h1.clone();
		h2.Hosp_name="Sahyadri";
		h2.Hosp_Type="Accident Specilist";
		
		h2.patient.P_id=258;
		h2.patient.P_name="Omkar";
		
		System.out.println(h1.Hosp_name+" "+h1.Hosp_Type+" "+h1.patient.P_id+" "+h1.patient.P_name);
		System.out.println();
		System.out.println(h2.Hosp_name+" "+h2.Hosp_Type+" "+h2.patient.P_id+" "+h2.patient.P_name);

	}

}

class Hospital implements Cloneable
{
	String Hosp_name;
	String Hosp_Type;
	
	Patient patient;
	
	
	public Object clone() throws CloneNotSupportedException
	{
		Hospital hosp=(Hospital)super.clone();
		hosp.patient=(Patient) this.patient.clone();
		
		return hosp;
		
	}
}

class Patient implements Cloneable
{
	int P_id;
	String P_name;
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
