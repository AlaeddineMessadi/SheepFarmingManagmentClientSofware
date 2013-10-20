package delegate;

import java.util.List;

import locator.ServiceLocator;
import persistance.Admin;
import persistance.Vaccine;
import services.adminServices.AdminServicesRemote;
import services.vaccineServices.VaccineServicesRemote;

public class VaccineServicesDelegate {
private static final String jndiNameAdmin = "ejb:/SheepFarmingManagment/VaccineServices!services.vaccineServices.VaccineServicesRemote";
	
	private static VaccineServicesRemote getProxyVaccine(){
		return (VaccineServicesRemote)ServiceLocator.getInstance().getProxy(jndiNameAdmin);
	}
	public static void createVaccine(Vaccine vaccin) {
		getProxyVaccine().createVaccine(vaccin);	
	}
	public static void updateVaccine(Vaccine vaccin) {
		getProxyVaccine().updateAdmin(vaccin);
		
	}
	public static void deleteAdmin(Vaccine vaccin) {
		getProxyVaccine().deleteAdmin(vaccin);
	}
	public static Vaccine findAdminById(int id_vaccin) {
		
		return getProxyVaccine().findAdminById(id_vaccin);
	}
	public static List<Vaccine> getVaccines() {
		
		return getProxyVaccine().getVaccin();
	}

}
