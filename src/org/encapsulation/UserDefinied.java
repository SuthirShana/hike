package org.encapsulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinied {

	public static void main(String[] args) {
		UserDefinedListAndSetAndMap ud = new UserDefinedListAndSetAndMap();
		ud.setid(123);
		ud.setName("Java");
		ud.setphone(123456789l);
		
		UserDefinedListAndSetAndMap ud1 = new UserDefinedListAndSetAndMap();
		ud1.setid(456);
		ud1.setName("Selenium");
		ud1.setphone(987456321l);
		
		UserDefinedListAndSetAndMap ud2 = new UserDefinedListAndSetAndMap();
		ud2.setid(789);
		ud2.setName("SQL");
		ud2.setphone(741852933l);
		
		List<UserDefinedListAndSetAndMap> li = new ArrayList<UserDefinedListAndSetAndMap>();
		li.add(ud);
		li.add(ud1);
		li.add(ud2);
		
		for(int i = 0; i<li.size();i++) {
			System.out.println(li.get(i).getid());
			System.out.println(li.get(i).getName());
			System.out.println(li.get(i).getphone());
		}
			
		for(UserDefinedListAndSetAndMap  l:li) {
			System.out.println(l.getid());
			System.out.println(l.getName());
			System.out.println(l.getphone());
			
		}
		
		System.out.println("UserDefinrd Map  \n\n\n");
		
		Map<String,UserDefinedListAndSetAndMap > Mi = new HashMap<String,UserDefinedListAndSetAndMap>();
			Mi.put("First", ud);
			Mi.put("Second", ud1);
			Mi.put("Third", ud2);
			
			Set<Entry<String,UserDefinedListAndSetAndMap>> si = Mi.entrySet();
			
			for (Entry<String, UserDefinedListAndSetAndMap> entry : si) {
				
				System.out.println(entry.getValue().getid());
				System.out.println(entry.getValue().getName());
				System.out.println(entry.getValue().getphone());
				
				
			}
	
	}
	

}
