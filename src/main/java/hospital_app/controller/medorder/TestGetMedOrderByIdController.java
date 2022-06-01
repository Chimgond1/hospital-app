package hospital_app.controller.medorder;

import hospital_app.dto.MedOrder;
import hospital_app.service.imp.MedOrderServiceImp;

public class TestGetMedOrderByIdController {
	public static void main(String[] args) {
		MedOrderServiceImp medOrderServiceImp=new MedOrderServiceImp();
		MedOrder medOrder=medOrderServiceImp.getMedOrderById(3);
		if(medOrder!=null) {
			System.out.println(medOrder.getOreder_date_time());
		}else {
			System.out.println("there is no med order id is present to show");
		}
	}

}
