//面向对象中数组的使用方法
import demo1.util.MyArray;
public class TestMyArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray ma = new MyArray();
		int size = ma.size();
		ma.show();
		ma.add(10);
		ma.add(11);
		ma.add(12);
		ma.show();
		ma.delete(1);
		ma.show();
		System.out.println(ma.get(0));
		ma.updateArr(1, 5);
		ma.show();
		ma.insertArr(2, 6);
		ma.show();
	}

}
