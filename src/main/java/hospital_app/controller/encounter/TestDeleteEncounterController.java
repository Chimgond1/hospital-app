package hospital_app.controller.encounter;

import hospital_app.dto.Encounter;
import hospital_app.service.imp.EncounterServiceImp;

public class TestDeleteEncounterController {
	public static void main(String[] args) {
		EncounterServiceImp encounterServiceImp=new EncounterServiceImp();
	boolean  result=encounterServiceImp.deleteEncounter(3);
	if(result) {
		System.out.println("encounter is delaited based on encounter id");
	}else {
		System.out.println("encouter id is not exit to delete encouter");
	}
	}

}
