package hospital_app.controller.item;

import hospital_app.dto.Item;
import hospital_app.dto.MedOrder;
import hospital_app.service.imp.ItemServiceImp;

public class TestSaveItemController {
	public static void main(String[] args) {

		Item item = new Item();
		item.setCost(10);
		item.setMedicName("leg pain tablat");
		item.setQuatity(2);

		ItemServiceImp itemServiceImp = new ItemServiceImp();
		Item item2 = itemServiceImp.saveItem(item, 2);
		if (item2 != null) {
			System.out.println("item is saved ");
		} else {
			System.out.println("item is not saved ");
		}
	}

}
