package demo1.util;

import java.util.Arrays;

public class MyArray {
	//����һ��������
	public int[] elements;
	
	//��Ĺ��캯��
	public MyArray(){
		elements = new int [0];
	}
	
	public int size(){
		return elements.length;
	}
	
	//���������Ԫ��
	public void add(int element){
		int[] newArr = new int[elements.length + 1];
		for(int i = 0; i < elements.length; i++){
			newArr[i] = elements[i];
		}
		newArr[elements.length] = element;
		elements = newArr;
	}
	
	//��ʾ�����е�Ԫ��
	public void show(){
		System.out.println(Arrays.toString(elements));
	}
	
	//ɾ��������ָ��λ�õ�Ԫ��
	public void delete(int index){
		if(index < 0 || index > elements.length - 1){
			throw new RuntimeException("�±�Խ��");
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
	
	//��ȡ������ָ��λ�õ�Ԫ��
	public int get(int index){
		return elements[index];
	}
	
	//�޸�������ָ��λ�õ�Ԫ��
	public void updateArr(int index, int x){
		if(index < 0 || index > elements.length - 1){
			throw new RuntimeException("�±�Խ��");
		}
		for(int i = 0; i < elements.length; i++){
			if(i == index){
				elements[i] = x;
			}
		}
	}
	
	//�������е�ָ��λ���в���һ��Ԫ��
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
