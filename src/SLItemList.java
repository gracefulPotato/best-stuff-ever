//Jolina Lam, Grace O'Hair-Sherman
//CMPS 101 12/4/2015
//
//SLItemList
//Singly linked item list
//element of userT array
public class SLItemList {
	SItem header;
	SLItemList(){
		header = new SItem("");
		header.next = header;
	}
	
	//adds element to the front of the list and links with other elements (if they exist)
	void pushFront(String uid){
		SItem newItem = new SItem(uid);
		newItem.next = header.next;
		header.next = newItem;
	}
	
	//returns element if it exists or dummy header if not
	SItem find(String uid){
		SItem currentItem = header.next;
		while(!currentItem.uid.equals("")){
		if(uid.equals(currentItem.uid))
			return currentItem;
			currentItem = currentItem.next;
		}
		return header;
	}

	//used for debugging linked list (NOT CALLED IN MAIN())
	void debugPrint(){
		SItem currentItem = header.next;
		while(!currentItem.uid.equals("")){
			System.out.println(currentItem.uid);
			currentItem = currentItem.next;
		}
	}
}
