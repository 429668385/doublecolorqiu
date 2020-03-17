package doublecolorqiu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.JPanel;//类的來源

public class myback extends JPanel {

	private Ball[] balls; // 数组 表示一组数据

	// 构造函数
	public myback() {

		balls = new Ball[7]; // 初始化 循环赋值
		for (int i = 0; i < balls.length; i++) {
			balls[i] = new Ball();
			if (i == 6) {
				balls[i].setColor(Color.blue);
			} else
				balls[i].setColor(Color.red);
		}
		// 改变数字
		for (int i = 0; i < balls.length; i++) {

			if (i == 6) {
				// random 随机产生0-1的小数 所以加1 得到1-16
				int number = (int) (Math.random() * 16 + 1);
				balls[i].setNumber(number);
			} else {
				int number = (int) (Math.random() * 33 + 1);
				int j = 0;
				for (; j < i; j++) {
					if (balls[j].getNumber() == number) {
						i--;
						break;// 如果数字相同 跳出循环 i往前调整 剔除此次数字
					}
				}
				if (j == i) {
					balls[i].setNumber(number);
				}
				// balls[i].setNumber(number);
			}
		}
		sout();
	}

	// g代表画笔
	public void paint(Graphics g) {
		super.paint(g);// 調用父類花白板 畫球
		// 画七个球
		int x = 60;
		for (int i = 0; i < balls.length; i++) {
			// 开始画圆 1.设置画的颜色 2.画圆
			g.setColor(balls[i].getColor());
			g.fillOval(x, 200, balls[i].getSize(), balls[i].getSize());
			// 画数字1.设置画笔颜色 2.设置画笔粗细
			g.setColor(Color.black);
			g.setFont(new Font("黑体", 0, 25));// 25单位是像素
			// 数字相对于圆有位置编译
			g.drawString(" " + balls[i].getNumber(), x + 20, 250);
			x = x + 100;
		}
	}

	/**
	 * 输出
	 */
	public void sout() {
		List<Ball> ballArrays = Arrays.asList(this.balls);
		Collections.sort(ballArrays, (o1, o2) -> {
			if (o1.getColor().equals(Color.blue)) {
				return 1;
			}
			if (o2.getColor().equals(Color.blue)) {
				return -1;
			}
			return o1.getNumber() > o2.getNumber() ? 1 : -1;
		});
		// 数组元素初始值和类属性初始值一样分为基本类型和引用类型
		for (Ball ball : ballArrays) {
			System.out.print(ball.getNumber() + " ");
		}
		System.out.println();
		this.balls = ballArrays.toArray(new Ball[] {});
	}
}