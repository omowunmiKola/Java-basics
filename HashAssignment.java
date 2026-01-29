import java.util.*;

public class HashAssignment {

    public static void main(String args[]) {
        List<List<Integer>> intLists = new LinkedList<>();

        intLists.add(new ArrayList<Integer>(Arrays.asList(3, 4, 9, 8, 12, 15, 7, 13)));
        intLists.add(new ArrayList<Integer>(Arrays.asList(15, 24, 50, 12, 3, 9)));
        intLists.add(new ArrayList<Integer>(Arrays.asList(78, 65, 24, 13, 9, 3, 12)));
        intLists.add(new ArrayList<Integer>(Arrays.asList(15, 78, 14, 3, 2, 9, 44, 12)));

        List<Integer> intResult = findCommonElements(intLists);

        System.out.println("Common elements of the integer list");
        System.out.println(intResult + "\n");

        List<List<String>> stringLists = new LinkedList<>();

        stringLists.add(new ArrayList<String>(Arrays.asList("a", "b", "d", "c", "h", "e")));
        stringLists.add(new ArrayList<String>(Arrays.asList("g", "b", "e", "j", "u", "z", "h", "d")));
        stringLists.add(new ArrayList<String>(Arrays.asList("y", "p", "b", "d")));

        List<String> stringResult = findCommonElements(stringLists);

        System.out.println("Common elements of the string list");
        System.out.println(stringResult);
        
        List<List<Integer>> intLists2 = new LinkedList<>();
        
        intLists2.add(new ArrayList<Integer>(Arrays.asList(3, 4, 12, 15, 7, 13)));
        intLists2.add(new ArrayList<Integer>(Arrays.asList(72, 5, 24, 93, 9, 23, 12)));
        intLists2.add(new ArrayList<Integer>(Arrays.asList()));
        List<Integer> intResult2 = findCommonElements(intLists2);

        System.out.println("Common elements of the integer list empty list");
        System.out.println(intResult2 + "\n");
    }

    public static <T> List<T> findCommonElements(List<List<T>> collections) {
    	if(collections == null || collections.isEmpty()) {
    		return new ArrayList<>();
    	}
    	if(collections.size()==1) {
    		HashSet<T> sizeOneSet = new HashSet<>();
    		for(T item : collections.get(0)) {
    			sizeOneSet.add(item);
    		}
    		return new ArrayList<>(sizeOneSet);
    	}
    	
    	HashSet<T> similarElements = new HashSet<>();
    	for(T item : collections.get(0)) {
    		similarElements.add(item);
    	}
    	
    	for(int i = 1; i< collections.size();i++) {
    		List<T> currentListIteration = collections.get(i);
    		HashSet<T> nextIteration = new HashSet<>();
    		
    		if(similarElements.isEmpty()) {
    			return new ArrayList<>();
    		}
    		for(T item : currentListIteration) {
    			if(similarElements.contains(item)) {
    			nextIteration.add(item);
    			}
    		}
    		similarElements = nextIteration;
    	}
    	
        return new ArrayList<>(similarElements);
    }
}
