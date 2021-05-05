package demo1.util;

import java.util.Arrays;

public class MyArray {
	//创建一个空数组
	public int[] elements;
	
	//类的构造函数
	public MyArray(){
		elements = new int [0];
	}
	
	public int size(){
		return elements.length;
	}
	
	//数组中添加元素
	public void add(int element){
		int[] newArr = new int[elements.length + 1];
		for(int i = 0; i < elements.length; i++){
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;
		elements = newArr;
	}
	
	//显示数组中的元素
	public void show(){
		System.out.println(Arrays.toString(elements));
	}
	
	//删除数组中指定位置的元素
	public void delete(int index){
		if(index < 0 || index > elements.length - 1){
			throw new RuntimeException("下标越界");
		}
		
		int[] deleteArr = new int[elements.length - 1];
		for(int i = 0; i < deleteArr.length; i++){
			if( i < index ){
				deleteArr[i] = elements[i];
			} else{
				deleteArr[i] = elements[i + 1];
			}
			
		}
		elements = deleteArr;
	}
	
	//获取数组中指定位置的元素
	public int get(int index){
		return elements[index];
	}
	
	//修改数组中指定位置的元素
	public void updateArr(int index, int x){
		if(index < 0 || index > elements.length - 1){
			throw new RuntimeException("下标越界");
		}
		for(int i = 0; i < elements.length; i++){
			if(i == index){
				elements[i] = x;
			}
		}
	}
	
	//在数组中的指定位置中插入一个元素
	public void insertArr(int index, int element){
		int[] newArr = new int[elements.length + 1];
		for(int i = 0; i < elements.length; i++){
			if(i < index){
				newArr[i] = elements[i];
			} else{
				newArr[i+1] = elements[i];
			}
		}
		newArr[index] = element;
		elements = newArr;
	}
	
}
