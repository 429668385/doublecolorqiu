package doublecolorqiu;

import java.awt.Color;

public class Ball {

	private Color color; // ���� ��ɫ
	private int number; // ���� ����
	private int size;// ���� ��С

	// ���캯�� ����������һ��
	public Ball() {

		color = color.green;
		number = 2;
		size = 80;
	}

	// �������Եķ�������
	// public void setColor(String color) {
	// this.color = color;
	// color = color;���Ͼ�ͬ�� ���Ͼ������׼ȷ ��������
	// this����������
	// }
	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

}
