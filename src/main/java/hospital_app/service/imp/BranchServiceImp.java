package hospital_app.service.imp;

import java.util.List;

import hospital_app.dao.imp.BranchDaoImp;
import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Hospital;
import hospital_app.service.Branch_Service;

public class BranchServiceImp implements Branch_Service {
	BranchDaoImp branchDao = new BranchDaoImp();

	public Branch saveBranch(Branch branch, int hospital_id) {

		return branchDao.saveBranch(branch, hospital_id);
	}

	public Branch getBranchById(int branch_id) {

		return branchDao.getBranchById(branch_id);
	}

	public Hospital getBranchHospitalById(int branch_id) {

		return branchDao.getBranchHospitalById(branch_id);
	}

	public List<Branch> getHospitalBranches(int hospital_id) {

		return branchDao.getHospitalBranches(hospital_id);
	}

	public List<Encounter> getBranchEncounters(int branch_id) {

		return branchDao.getBranchEncounters(branch_id);
	}

	public Branch updateBranch(Branch branch, int branch_id) {

		return branchDao.updateBranch(branch, branch_id);
	}

	public boolean deleteBranch(int branch_id) {

		return branchDao.deleteBranch(branch_id);
	}

}
