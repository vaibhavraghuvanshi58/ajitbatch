package org.day4;

public class Utility {
	
	/**
	 * This method will return maximum value in an int array
	 * @param inputArray
	 * @return
	 */
	public static int getMaxValueInArray(int[] inputArray){
		/*
		 * Ite`rting the Array
		 */
		int maxValue = inputArray[0];
		for(int i=0;i<inputArray.length;i++){
			if(maxValue < inputArray[i]){ //If maxValue is less then current element
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}
	/**
	 * This method will return maximum value in an float array
	 * @param inputArray
	 * @return
	 */
	public static float getMaxValueInArray(float[] inputArray){
		/*
		 * Iterting the Array
		 */
		float maxValue = inputArray[0];
		for(int i=0;i<inputArray.length;i++){
			if(maxValue < inputArray[i]){ //If maxValue is less then current element
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}
	
	/**
	 * This method will return minimum value in an float array
	 * @param inputArray
	 * @return
	 */
	public static float getMinValueInArray(float[] inputArray){
		/*
		 * Iterting the Array
		 */
		float maxValue = inputArray[0];
		for(int i=0;i<inputArray.length;i++){
			if(maxValue > inputArray[i]){ //If maxValue is less then current element
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}
	
	/**
	 * This method will return minimum value in an int array
	 * @param inputArray
	 * @return
	 */
	public static int getMinValueInArray(int[] inputArray){
		/*
		 * Iterting the Array
		 */
		int maxValue = inputArray[0];
		for(int i=0;i<inputArray.length;i++){
			if(maxValue > inputArray[i]){ //If maxValue is less then current element
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}
}
