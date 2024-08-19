package bai1;

public class Main
{
	public static void main(String[] args)
	{
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(3);
		shapes[1] = new Rectangle(3, 5);
		shapes[2] = new Square(5);
		
		for (int i = 0; i < shapes.length; i++)
		{
//			if (shapes[i] instanceof Circle || shapes[i] instanceof Rectangle || shapes[i] instanceof Square)
//			{
			if(shapes[i] instanceof Circle){
				showAreaBeforeAndAfter(shapes, i);
			}
			if(shapes[i] instanceof Rectangle){
				showAreaBeforeAndAfter(shapes, i);
			}
			if(shapes[i] instanceof Square){
				showAreaBeforeAndAfter(shapes, i);
			}
			

//			}
		}
	}
	
	private static void showAreaBeforeAndAfter(Shape[] shapes, int i)
	{
		System.out.println("Trước khi thay đổi = " + shapes[i].getArea());
		double randomNumber = Math.floor(Math.random() * 100);
		System.out.println("Phần trăm thay đổi = " + randomNumber);
		// kiểm tra hình thứ i trien khai cua Resizeable
		if (shapes[i] instanceof Resizeable)
		{
			((Resizeable) shapes[i]).resize(randomNumber);
		}
		System.out.println("Sau khi thay đổi = " + shapes[i].getArea());
	}
}
