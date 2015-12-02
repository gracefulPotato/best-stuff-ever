
public class SLItemList {
	SItem header;
	SLItemList(){
		header = new SItem("");
		header.next = header;
	}
	
	void pushFront(String uid){
		SItem newItem = new SItem(uid);
		newItem.next = header.next;
		header.next = newItem;
	}
	
	SItem find(String uid){
		SItem currentItem = header.next;
		while(!currentItem.uid.equals("")){
		if(uid.equals(currentItem.uid))
			return currentItem;
		currentItem = currentItem.next;
		}
		return header;
	}
	void debugPrint(){
		SItem currentItem = header.next;
		while(!currentItem.uid.equals("")){
			System.out.println(currentItem.uid);
			currentItem = currentItem.next;
		}
	}
}
