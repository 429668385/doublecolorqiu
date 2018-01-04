package doublecolorqiu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;//��ā�Դ

public class myback extends JPanel {

	private Ball[] balls; // ���� ��ʾһ������

	// ���캯��
	public myback() {

		balls = new Ball[7]; // ��ʼ�� ѭ����ֵ
		for (int i = 0; i < balls.length; i++) {
			balls[i] = new Ball();
			if (i == 6) {
				balls[i].setColor(Color.blue);
			} else
				balls[i].setColor(Color.red);
		}
		// �ı�����
		for (int i = 0; i < balls.length; i++) {

			if (i == 6) {
				// random �������0-1��С�� ���Լ�1 �õ�1-16
				int number = (int) (Math.random() * 16 + 1);
				balls[i].setNumber(number);
			} else {
				int number = (int) (Math.random() * 33 + 1);
				int j = 0;
				for (; j < i; j++) {
					if (balls[j].getNumber() == number) {
						i--;
						break;// ���������ͬ ����ѭ�� i��ǰ���� �޳��˴�����
					}
				}
				if (j==i) {
					balls[i].setNumber(number);
				}
				//balls[i].setNumber(number);
			}
		}
	}

	// g������
	public void paint(Graphics g) {
		super.paint(g);// �{�ø���װ� ����
		// ���߸���
		int x = 60;
		for (int i = 0; i < balls.length; i++) {
			// ��ʼ��Բ 1.���û�����ɫ 2.��Բ
			g.setColor(balls[i].getColor());
			g.fillOval(x, 200, balls[i].getSize(), balls[i].getSize());
			// ������1.���û�����ɫ 2.���û��ʴ�ϸ
			g.setColor(Color.black);
			g.setFont(new Font("����", 0, 25));// 25��λ������
			// ���������Բ��λ�ñ���
			g.drawString(" " + balls[i].getNumber(), x + 20, 250);
			x = x + 100;
		}
	}

	// public static void main(String[] args) {
	// myback myback = new myback();
	// System.out.println(myback.balls);
	// System.out.println(myback.balls[0]);
	// ����Ԫ�س�ʼֵ�������Գ�ʼֵһ����Ϊ�������ͺ���������
	// }
}
