package hospital_app.controller.branch;

import java.util.ArrayList;
import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;
import hospital_app.service.imp.BranchServiceImp;

public class TestSaveBranchController {
	public static void main(String[] args) {

		Branch branch = new Branch();
		branch.setName(" rammayya hospital doller calony ");
		branch.setEmail("rammayyahospitaldollercalony@gmail.com");
		branch.setPhone(112335l);

		BranchServiceImp branchServiceImp = new BranchServiceImp();
		Branch branch1 = branchServiceImp.saveBranch(branch, 6);

		if (branch1 != null) {
			System.out.println("branch is added successfully for this hospital");
		} else {
			System.out.println("branch is not saved ,hospital id is wrong or hospital is not exit to save branch");

		}

	}
}
