package LAB06;

import java.util.Iterator;

public class okola4Lab06 {

	public static void main(String[] args) {
		new okola4Lab06();

	}
	
	public okola4Lab06() {
		//Test your code first
		//Problem01(10);
		//printIntArray(Problem01(23));
		//printIntArray(Problem02());
		//printIntArray(Problem03());
		//printIntArray(Problem04());
		//System.out.println(Problem05(140));
		//printIntArray(Problem06(15));
		//System.out.println(Problem06(10).length);
		//printIntArray(Problem07(15));
		//printIntArray(Problem08(4,8));
		//printIntArray(Problem09(10));
		//Problem10();
		String[] testString = {"Apple",null,"Anu", null,"Yeahhh","praise",null,"lovely","people"};
		String[] lyrics = {"No", "matter","what","may","come","my way","reels Jav"};
		String[] testJava = {"JAvA", "Script java","c worse than JaVa"," more complex than phython","Html es the Best. Sorry JAVA"} ;
		int[] values = {28,1,2,4,2,1,28};
		int[] values2 = {0,20,4,2,20,10};
		int[] sortedValues = {1,2,3,4,7,8,10, };
		//System.out.println(Problem10(testString));
		//printStringArray(Problem11(testString));
		//printIntArray(Problem12(values));
		//printIntArray(Problem13(values, 3));
		//printIntArray(Problem14(values, 3));
		//printIntArray(Problem15(values, -2));
		//System.out.println(Problem16(lyrics));
		//System.out.println(Problem17(lyrics));
		//System.out.println(Problem18(testJava));
		//System.out.println(Problem19(values, values));
		//System.out.println(Problem20(values, values2));
		//Problem21(values2, 2);
		//Problem22(values2, 2);
		//Problem23(values2, 2);
		//printIntArray(Problem24(sortedValues, 5));
		System.out.println(Problem25(values2));
		System.out.println(Problem26(values));
		System.out.println(Problem27(lyrics));
		System.out.println(Problem28(values2));
		printIntArray(Problem29(values));
		printIntArray(Problem30(values));
		
	}
	

	public void printIntArray(int[] sol) {
		for(int i=0;i<sol.length;i++) {
			System.out.print(sol[i]+" ");
		}
		System.out.println();
	}
	
	public void printStringArray(String[] sol) {
		for(int i=0;i<sol.length;i++) {
			System.out.print(sol[i]+" ");
		}
		System.out.println();
	}
	
	public int[] Problem01(int size) {
		int myIntArray[] = new int[size];
		
		for(int i=0;i<myIntArray.length;i++) {
			myIntArray[i] = i;
		}
		return myIntArray;
	}
	
	public int[] Problem02() {
		int myIntArray[]= new int[100];
		for(int i =0; i<myIntArray.length;i++) {
			myIntArray[i]=i *2+1;
				
			}
		return myIntArray;
	}
	
	public int[] Problem03() {
		int count =0;
		int myIntArray[]= new int[100];
		for(int i =0; i<300;i++) {
			if(i % 3 == 0||i % 5==0) {
				//int storeCount = count++;
				myIntArray[count++] = i;
			}
			if(count==100) {
				break;
			}
			
		}
		return myIntArray;
		
	}
	
	public int[] Problem04() {
		int count = 0;
		int myIntArray[]= new int[25];
		for(int i = 2; i<25; i++) {
			myIntArray[0]=0;
			myIntArray[1]=1;
			int currentIValue = i;
			myIntArray[i]= myIntArray[i-1]+myIntArray[i-2];
			
		}
		return myIntArray;
	}
	
	public int Problem05(int size) {
		int[] myIntArray = new int[size];
		int countSeven = 0;
		for(int i = 0; i<myIntArray.length;i++) {
			myIntArray[i] = (int)(Math.random()*10);
		}
		for(int j =0; j<myIntArray.length;j++) {
			if(myIntArray[j]==7) {
				countSeven += 1;
			}
		}
		return countSeven;
	}
	
	public int[] Problem06(int size) {
		int[] myIntArray1 = new int[size];
		int[] myIntArray2 = new int[size];
		int[] myJointArray = new int[size*2];
		for(int i = 0; i< myIntArray1.length;i++) {
			myIntArray1[i] = (int)(Math.random()*10);
			myIntArray2[i] = (int)(Math.random()*10);
		}
		for(int j = 0; j<size;j++) {
			myJointArray[j] = myIntArray1[j];
		}
		for(int z = 0;z<size;z++) {
			myJointArray[z+2] = myIntArray2[z];
		}
		return myJointArray;
		
	}
	
	public int[] Problem07(int size) {
		int[] myIntArray1 = new int[size];
		int[] myIntArray2 = new int[size];
		int[] myJointArray = new int[size*2];
		for(int i = 0; i< myIntArray1.length;i++) {
			myIntArray1[i] = (int)(Math.random()*10);
			myIntArray2[i] = (int)(Math.random()*10);
		}
		for(int i = 0; i<myJointArray.length;i++) {
			if(i%2==0) {
				myJointArray[i]=myIntArray1[i/2];
			}else {
				myJointArray[i]=myIntArray2[i/2];
			}
		}
		return myJointArray;
	}
	
	public int[] Problem08(int size, int size2) {
		int[] mySmallerArray = new int[Math.min(size, size2)];
		int[] myLargerArray = new int[Math.max(size, size2)];
		int[] myJointArray = new int[size+size2];
		for(int i = 0; i< mySmallerArray.length;i++) {
			mySmallerArray[i] = (int)(Math.random()*10);
			System.out.println(mySmallerArray[i]);
		}
		for(int j = 0; j< myLargerArray.length;j++) {
			myLargerArray[j] = (int)(Math.random()*10);
			System.out.println(myLargerArray[j]);
			}
		for(int i=0,j=0;i<myLargerArray.length;i++, j++) {
			if(i%2==0) {
				myJointArray[i] = mySmallerArray[i/2];
			}else {
				myJointArray[i] = myLargerArray[i/2];
			}
		}
		for(int j =mySmallerArray.length*2;j<myJointArray.length;j++) {
			myJointArray[j]=myLargerArray[j-mySmallerArray.length];
			
		}
		
		
		return myJointArray;
	}
	
	public int[] Problem09(int size) {
		int[] myIntArray = new int[size];
		for(int i = 0; i<  myIntArray.length;i++) {
			 myIntArray[i] = (int)(Math.random()*2)+1;
			System.out.println( myIntArray[i]);
		}
		for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++)
                if (myIntArray[j] > myIntArray[j + 1]) {
                    int storeArray = myIntArray[j];
                    myIntArray[j] = myIntArray[j + 1];
                    myIntArray[j + 1] = storeArray;
                }
		}
		return myIntArray;
	}

	
	public String Problem10(String[] words) {
		//String[] myStringArray = new String[words.length];
		String letters = "";
		for (int j = 0; j < words.length; j++) {
			if(words[j]!= null) {
				letters += words[j];
			}
		}
		return letters;
		
	}
	
	public String[] Problem11(String[] words) {
		for(int i =0; i < words.length;i++){
			for(int j=0; j<words.length-1;j++) {
				if(words[j] == null) {
					String temp = words[j];
					words[j]=words[j+1];
					words[j+1]=temp;
				}
			}
		}
		return words ;
		
	}
	
	public int[] Problem12(int[] size) {
		//int lastValue = size[size.length-1];
		for(int i = size.length-1; i>0;i--) {
			int temp =size[i];
			size[i] = size[i-1];
			size[i-1] =temp;
			}
		//size[0] = lastValue;
		return size;
		}
	
	public int[] Problem13(int[] size, int times) {
		for(int i=0;i<times;i++) {
			Problem12(size);
		}
		return size;
	}
	
	public int[] Problem14(int[] size, int times) {
		Problem13(size, times);
		return size;
	}
	
	public int[] Problem15(int[] size, int times) {
		if(times>=0) {
			Problem13(size, times);
		}else {
			for(int i=times; i>0;i--) {
				Problem13(size, size.length);
			}
		}
		return size;
	}
	
	public boolean Problem16(String[] words) {
		for(int i=0;i<words.length;i++) {
			if(words[i].startsWith("Java")) {
				return  true;
			}
			
		}
		return  false;
		
	}
	
	public boolean Problem17(String[] words) {
		for(int i=0;i<words.length;i++) {
			if(words[i].toLowerCase().contains("java")) {
				return  true;
			}
			
		}
		return  false;
	}
	
	public boolean Problem18(String[] words) {
		for(int i=0;i<words.length;i++) {
			if(words[i].toLowerCase().startsWith("java")||words[i].toLowerCase().endsWith("java")) {
				return  true;
			}
			
		}
		return  false;
	}
	
	public boolean Problem19(int[] values, int[] valuesToo) {
		if(values.length != valuesToo.length) {
			return false;
		}
		int counter = 0;
		for(int i=0; i<values.length;i++) {
			if(values[i]!=valuesToo[i]) {
				counter++;
				}
		}
		if(counter<2) {
			return true;
		}
		
		return true;
		}
	
	public int Problem20(int[] values, int[] valuesToo) {
		if(values.length != valuesToo.length) {
			return 0;
		}
		int counter = 0;
		for(int i=0; i<values.length;i++) {
			if(values[i] == valuesToo[i]) {
				counter++;
				}
		}
		return counter;
	}
	
	public void Problem21(int[] values,int n) {
		
		for(int i=n;i<values.length-1;i++) {
			values[i] = values[i+1];
			values[values.length-1] = 0;
			System.out.println(values[i]);
		}
		
		
	}
	
	public void Problem22(int[] values,int n) {
		int temp = values[n];
		for(int i=n;i<values.length-1;i++) {
			values[i] = values[i+1];
			values[values.length-1] = temp;
			System.out.println(values[i]);
		}
	}
	
	public void Problem23(int[] values,int n) {
		Problem22(values, n);
	}
	
	public int[] Problem24(int[] sortedArray, int n) {
		int temp = 0;
		for(int i=0;i<sortedArray.length;i++) {
			if(sortedArray[i]>=n) {
				temp = i;
				//sortedArray[i]= n;
				break;
			}
		}
		for(int i=sortedArray.length-1; i>temp;i--) {
			sortedArray[temp] = n;
			Problem12(sortedArray);
		}
		System.out.println(temp);
		return sortedArray;
	}
	
	public boolean Problem25(int[] values) {
		int count = 0;
		for(int i=0;i<values.length;i++) {
			for(int j=values.length-1;j>i+1;j--) {
				if(values[j]==values[i]&&values[j-1]==values[i+1]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public int Problem26(int[] values) {
		int count = 0;
		for(int i=0;i<values.length;i++) {
			for(int j=values.length-1;j>i+1;j--) {
				if(values[j]==values[i]&&values[j-1]==values[i+1]) {
					return Math.max(values[i], values[i+1]);
				}
			}
		}
		return 0;
	}
	
	public String Problem27(String[] words) {
		String maxWord = words[0];
		for(int i=1; i<words.length;i++) {
			if(words[i].length()>maxWord.length()) {
				maxWord = words[i];
			}else if(words[i].length()>maxWord.length()) {
				int temp = 0;
				for(int j=0;j<maxWord.length();j++) {
					if(Character.isUpperCase(maxWord.charAt(j))) {
						temp++;
					}
					if(Character.isUpperCase(words[i].charAt(j))) {
						temp--;
					}
				}
				if(temp<0) {
					maxWord = words[i];
				}
			}
		}
		return maxWord;
	}
	
	public int Problem28(int[] value) {
		int sumOfValues = 0;
		int temp =0;
		for(int i=0;i<value.length;i++) {
			if(value[i]!= 0) {
				sumOfValues += value[i];
				temp++;
			}
		}
		int average = sumOfValues/temp;
		return average;
	}
	
	public int[] Problem29(int[] value) {
		for(int i=0;i<value.length;i++) {
			for(int j=0;j<value.length-1;j++) {
				if(value[j]>value[j+1]) {
					int temp = value[j];
					value[j] = value[j+1];
					value[j+1]=temp;
				}
			}
		}
		return value;
	}
	
	public int[] Problem30(int[] value) {
		for(int i=0;i<value.length-1;i++) {
			int currentMin =value[i];
			int currentMinIndex = i;
			for(int j= i+1; j<value.length;j++) {
				if(currentMin>value[j]) {
					currentMin = value[j];
					currentMinIndex = j;
				}
			}
			if(currentMinIndex!=i) {
				value[currentMinIndex]=value[i];
				value[i]=currentMin;
			}
		}
		return value;
	}
}
	
	


