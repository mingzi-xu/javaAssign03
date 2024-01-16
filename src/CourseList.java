
/*
 * File name: CalculatorInput.java
 * Student Name: Mingzi Xu
 * student number: 040897612
 * Assignment: assignment 3
 * Modified: Dec.3nd 2023
 * Description: assignment 3 using Lists, LinkedLists, ListIterators, and more from the lecture
 */
/**
* This assignment explores the use of Lists, LinkedLists, 
* ListIterators and several more concepts learned in this course.
* @author Mingzi Xu
* @version 1.1
* @since Java 1_8.301
* @see Calculator, CalculatorEngine
*/

//23F Assignment 3 Solution: CourseList.java 
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet; 

public class CourseList {
	/**
	 * this is the main method to enter the program to control the list with different format
	 * @param  args an array of command-line arguments for the application
	 */
	public static void main(String[] args) {
		/**
		 * string array for courses with name courses
		 */
	   String[] courses = {"math", "english", "chemistry", "physics", "history", "geography"};
	   /**
		 * LinkedLists of Strings named list2 with courses array 
		 */
	   LinkedList<String> list1 = new LinkedList<>(Arrays.asList(courses));
	   /**
		 * string array for courses with name courses2
		 */
	   String[] courses2 = {"religion", "arts", "accounting", "math", "programming", "biology"};
	   /**
		 * LinkedLists of Strings named list2 with courses2 array 
		 */
	   LinkedList<String> list2 = new LinkedList<>(Arrays.asList(courses2));
	   /**
		 * method to add the list2 content to list1
		 */
	   list1.addAll(list2);
	   /**
		 * LinkedLists of Strings named list2 with courses2 array 
		 */
	 //print out information about current list
	   System.out.printf("%nWelcome Everyone to My Assignment 3. My name is Mingzi XU%n");
	   /**
		 * call printList() function
		 */
	   printList(list1);
	   
	 //print out information of updated list after convert all items to all upper case
	   System.out.printf("%nDisplaying names of courses in uppercase letters...%n");
	   /**
		 * call upperCase() function
		 */
	   upperCase(list1);
	  
	   //print out information of updated list after deleting 4 to 6 items
	   System.out.printf("%nDeleting courses 4 to 6...%n");
	   /**
		 * call printDeleted() function
		 */
	   printDeleted(list1);
	   
	  //print out information about  list
	   System.out.printf("%nHere is the current list of courses...%n");
	   /**
		 * call printList() function
		 */
	   printList(list1);
	   /**
		 * call printListReverse() function
		 */
	   printListReverse(list1);  
	   
	   //print out information of  alphabetical order list
	   System.out.printf("%nSorted courses in alphabetical order...%n");
	   /**
		 * call alphabeticalOrder() function
		 */
	   alphabeticalOrder(list1);
	   
	   //print out information of  removing duplicated courses		
	   System.out.printf("%nRemoving duplicate courses...%n");
	   /**
		 * call printNonDuplicates() function
		 */
	   printNonDuplicates(list1);	 		
	} 
	
	/**
	 * This is the function to print the list
	 * @param list LinkedList of string
	 */
// output List contents
	public static void  printList(LinkedList<String> list) {
		System.out.printf("%nThe List is: %n");
		for (String course : list) {
            System.out.printf("%s, ",course);
        }
		System.out.printf("%n");
	}
	
	/**
	 * This is the function to convert the list items to upper case
	 * @param list LinkedList of string
	 */
// locate String objects and convert to upper case
	public static void upperCase(LinkedList<String> list) {
		System.out.printf("%nThe List is: %n");
		ListIterator<String> iterator = list.listIterator();
		LinkedList<String> tempList = new LinkedList<>();
		while
			(iterator.hasNext()) {
			tempList.add(iterator.next().toUpperCase());
		}
		list.clear();
	    list.addAll(tempList);
	   	for (String course : list) {
	   		System.out.printf("%s, ",course);
	   		}
	   	System.out.printf("%n");
	}
	
	/**
	 * This is the function to remove duplicated items in the list
	 * @param list LinkedList of string
	 */
//locate String objects and eliminate duplicates
	private static void printNonDuplicates(Collection<String> list) {
		Set<String> set =  new HashSet<>(list);
		list.clear();
		System.out.printf("%nNon-duplicates are: ");
		list.addAll(set);
		for (String course : list) {
	   		System.out.printf("%s, ",course);
	   	}
	   	System.out.printf("%n");
	}
	
	/**
	 * This is the function to create sublist and use sublit to remove the 4 to 6 items from the list
	 * @param list LinkedList of string
	 */
// obtain sublist and use clear method to delete sublist items
	private static void printDeleted(LinkedList<String> list) {
		System.out.printf("%nThe List is: %n");
		List<String> subList = list.subList(4,7);
	    subList.clear();
	    for (String course : list) {
	   			System.out.printf("%s, ",course);
	   	}
	    System.out.printf("%n");
	}
	
	/**
	 * This is the function to print the list with reverse order
	 * @param list LinkedList of string
	 */
 // print the list in reverse order
	private static void printListReverse(LinkedList<String> list) {
		System.out.printf("%nReversed List: %n");  
	    Collections.reverse(list);
	    for (String course : list) {
	   			System.out.printf("%s, ",course);
	   	}
	   	System.out.printf("%n");
	    }
	
	/**
	 * This is the function to print the list with alphabetical order
	 * @param list LinkedList of string
	 */
	 //Sorted courses in alphabetical order...
	private static void alphabeticalOrder(LinkedList<String> list) {
		System.out.printf("%nThe List is: %n");  
        Collections.sort(list);
	    for (String course : list) {
	   			System.out.printf("%s, ",course);
	   	}
	   	System.out.printf("%n");
	}
}

