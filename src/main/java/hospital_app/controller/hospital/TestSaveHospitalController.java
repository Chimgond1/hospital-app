package hospital_app.controller.hospital;

import hospital_app.dto.Hospital;
import hospital_app.service.imp.HospitalServiceImp;

public class TestSaveHospitalController {
	public static void main(String[] args) {
		
		Hospital hospital=new Hospital();
		hospital.setName("godke hospital");
		hospital.setWebsite("www.godkehospital.com");
		
		
		HospitalServiceImp hospitalServiceImp=new HospitalServiceImp();
	Hospital hospital2=hospitalServiceImp.saveHospital(hospital);
		if(hospital2!=null) {
			System.out.println("hospital added or created successfully");
		}else {
			System.out.println("hospital not added or created successfully");
		}
		
	}

}
