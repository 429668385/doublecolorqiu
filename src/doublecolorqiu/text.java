package doublecolorqiu;

import java.awt.Color;

public class text {
	public static void main(String[] args) {
		Ball ball = new Ball();
		// System.out.println("ball number "+ ball.number);
		// System.out.println("ball color "+ ball.color);
		// System.out.println("ball size "+ ball.size);

		// ���ڶ���ֵ�����ַ���
		// 1.ֱ�Ӷ���ʱ��ֵ ��������з������д����
		// 2.��ֵ��丳ֵ

		ball.setColor(Color.blue);
		ball.setNumber(5);
		ball.setSize(500);
		System.out.println("ball.color " + ball.getColor() + "; ball number " + ball.getNumber() + "; ball size "
				+ ball.getSize());

		// ֱ�ӵ������Ը�ֵ
		// ball.color = "black";
		// System.out.println("ball.color "+ball.color+"; ball number "+ball.number+";
		// ball size "+ball.size );
		// ֱ�ӵ����Ը�ֵ������JAVA���Ե�ͬ���ַ��������˽
		// ����ֱ�ӵ����Ը�ֵ����Ҫ��һ��˵��Ȩ��
		// Ȩ��˵�� ��
		// ���� public ���еİ�ʹ��
		// ˽��private ����ʹ��
		// ���� protect ��������һ�����������ʹ��
		// Ĭ�� ���� һ�����������ʹ��
	}
}
