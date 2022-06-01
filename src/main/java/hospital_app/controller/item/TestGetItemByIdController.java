package hospital_app.controller.item;

import hospital_app.dto.Item;
import hospital_app.service.imp.ItemServiceImp;

public class TestGetItemByIdController {
	public static void main(String[] args) {
		ItemServiceImp itemServiceImp=new ItemServiceImp();
		Item item=itemServiceImp.getItemById(4);
		if(item!=null) {
			System.out.println(item.getCost());
			System.out.println(item.getMedicName());
			System.out.println(item.getQuatity());
		}else {
			System.out.println("there is no item id is not present to display item");

		}
	}

}
