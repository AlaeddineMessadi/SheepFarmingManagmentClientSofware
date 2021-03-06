package mainTests;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import delegate.AdminServiceDelegate;
import delegate.BatimentServiceDelegate;
import delegate.FarmServicesDelegate;
import delegate.SheepServicesDelegate;
import persistance.Admin;
import persistance.Batiment;
import persistance.Employee;
import persistance.Farm;
import persistance.Sheep;


public class TestMain {

	public TestMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) throws Exception {




/**/
	 Farm f = new Farm(0, "FarmaVille", "Nabeul","20928321","farmaville@gmail.com");
      FarmServicesDelegate.createFarm(f);


	   Farm ff = new Farm(0, "FarmaVille", "Nabeul","20928321","farmaville@gmail.com");
       FarmServicesDelegate.createFarm(ff);
	  	 Farm f1 = new Farm(); 
	  	 
	    f1= FarmServicesDelegate.findFarmById(1);
		System.out.println(f1.toString());
		
		Batiment b1 = new Batiment("batiment1");
		Batiment b2 = new Batiment("batiment2");
		List<Batiment> batiments = new ArrayList<Batiment>();
		batiments.add(b1);
		batiments.add(b2);

		f1.BatimentToFarm(batiments);
		FarmServicesDelegate.batimentToFarm(f1,batiments);
 	/////

		
		Employee emp1 = new Employee("aza", "ee", "ee", "ee", "ee", "ee", "ee", "ee", "ee",null);
     	Employee emp2 = new  Employee("alea", null, null, null, null, null, null, null, null,null);
     	
	List<Employee> emp = new ArrayList<Employee>();
	emp.add(emp1);
	emp.add(emp2);
	
	Batiment b = BatimentServiceDelegate.findBatimentById(1);
	BatimentServiceDelegate.EmployeeToBatiment(b,emp);
	
	Admin a = new Admin("aa", "aa", "aa", "aa", "aa", "aa", "aa",null);
	AdminServiceDelegate.createAdmin(a);
  //////////////

		
		Sheep sh1 = new Sheep(0, 04, "arabi", "male", null, null, null, "A-", null, null, 0, 0, null, 0, 0, "happy sheep");
		Sheep sh2 = new Sheep(0, 2, "arbi", "male", new Date(), null, null, null, null, null, 0, 0, null, 0, 0, "mad sheep");
		List<Sheep> sheeps = new ArrayList<Sheep>();
		sheeps.add(sh1);
		sheeps.add(sh2);

        Batiment bb = BatimentServiceDelegate.findBatimentById(1);
        BatimentServiceDelegate.SheepToBatiment(bb, sheeps);
        
		
		List<Sheep> s = SheepServicesDelegate.getSheeps();
		for(Sheep ss:s){
			System.out.println(ss.getCode_sheep());
		}
	
		
	
	}

}
