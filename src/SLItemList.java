
public class SLItemList {
	SItem header;
	SLItemList(){
		header = new SItem("",-1);
		header.next = header;
	}
	
	void pushFront(String uid, int cid){
		SItem newItem = new SItem(uid,cid);
		newItem.next = header.next;
		header.next = newItem;
	}
	
	SItem find(String uid){
		SItem currentItem = header.next;
		while(currentItem.cid!=-1){
		if(uid.equals(currentItem.uid))
			return currentItem;
		currentItem = currentItem.next;
		}
		return header;
	}
	void debugPrint(){
		SItem currentItem = header.next;
		while(currentItem.cid!=-1){
			System.out.println(currentItem.uid);
			currentItem = currentItem.next;
		}
	}
}
