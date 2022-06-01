package hospital_app.controller.encounter;

import java.time.LocalDateTime;

import hospital_app.dao.imp.EncounterDaoImp;
import hospital_app.dto.Encounter;
import hospital_app.service.imp.EncounterServiceImp;

public class TestSaveEncounterController {
	public static void main(String[] args) {

		Encounter encounter = new Encounter();
		encounter.setAdmit_date_time(LocalDateTime.of(2021, 05, 25, 1, 50));
		encounter.setDischarge_date_time(LocalDateTime.of(2021, 05, 30, 4, 20));
		encounter.setReason("loose motion pain");

		EncounterServiceImp encounterServiceImp = new EncounterServiceImp();
		Encounter encounter2 = encounterServiceImp.saveEncounter(7, 3, encounter);
		if (encounter2 != null) {
			System.out.println("yes encounter is saved for this person and in this branch");
		} else {
			System.out.println("there is no person or no branch to save encounter");
		}
	}

}
