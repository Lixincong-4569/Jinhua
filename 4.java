package cn.itcast.fruitstore.tools;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.JFrame;
/*
 * ������
 */
public class GUITools {
	//JAVA�ṩ��GUIĬ�Ϲ��������
	static Toolkit kit = Toolkit.getDefaultToolkit();
	//��ָ�������Ļ����
	public static void center(Component c) {
		int x = (kit.getScreenSize().width - c.getWidth()) / 2;
		int y = (kit.getScreenSize().height - c.getHeight()) / 2;
		c.setLocation(x, y);
	}
	//Ϊָ����������ͼ�����
	public static void setTitleImage(JFrame frame,String titleIconPath) {
		frame.setIconImage(kit.createImage(titleIconPath));
	} 
}
��������������������������������
��Ȩ����������ΪCSDN��������ɽ����ԭ�����£���ѭCC 4.0 BY-SA��ȨЭ�飬ת���븽��ԭ�ĳ������Ӽ���������
ԭ�����ӣ�https://blog.csdn.net/weixin_43837863/java/article/details/88804457