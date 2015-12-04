//Jolina Lam, Grace O'Hair-Sherman
//CMPS 101 12/4/2015
//
//SItem
//Item/node of singly-linked list
public class SItem {
	SItem next;
	String uid;
	public SItem(String uid){
		this.uid = uid;
	}
	public String getUid(){
		return this.uid;
	}
}
