package com.cybage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserExample {
	public static void main(String[] args) {
		System.out.println("---User Example---");
		List<User> users = new ArrayList<>();
		
		users.add(new User(11,"auser1"));
		users.add(new User(13,"cuser3"));
		users.add(new User(12,"buser2"));
		users.add(new User(15,"euser5"));
		users.add(new User(14,"duser4"));

		
		System.out.println(users);
		
		users.remove(0);
		System.out.println("After Removal: "+ users);
		
		users.remove(new User(13,"user3"));		//It will compare this object with already stored object and if it matches the reference ,it will delete it.
		System.out.println("After Removal: "+ users);
		
		//Sorting users based on there id.
		
		 //sorting using id(ascending)
        Collections.sort(users, new IdComparator());
        System.out.println("after sorting" + users);
        
        //sorting using id but in descending
        Collections.sort(users, new IdComparatorDesc());
        System.out.println("after sorting" + users);
        
        //sort using name(Asc)
        Collections.sort(users, new NameComparator());
        System.out.println("after sorting" + users);
	}
}
