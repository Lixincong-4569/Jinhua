package cn.itcast.fruitstore.test;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import cn.itcast.fruitstore.view.AbstractAdminDialog;
/*
 * ������������
 */
@SuppressWarnings("serial")
public class AbstractAdminDialogTest extends AbstractAdminDialog{
	//���幹�캯����ʼ������
	public AbstractAdminDialogTest() {
		super();
		queryFruitItem();//��������
	}	
	//�������table����
	@Override
	public void queryFruitItem() {
		String[] thead = new String[]{"ˮ�����","ˮ������","ˮ������(/Ԫ)","�Ƽ۵�λ"};
		String[][] tbody = new String[][]{
				{"1","ƻ��","5.0","kg"},
				{"2","����","3.2","��"},
				{"3","ѩ��","3.8","��"},
				{"4","̩��������","120","��"}
				};
		TableModel data = new DefaultTableModel(tbody,thead);
		table.setModel(data);
	}
	@Override
	public void addFruitItem() {
	}
	@Override
	public void updateFruitItem() {
	}
	@Override
	public void delFruitItem() {
	}
    //�������������г���
	public static void main(String[] args) {
		//�������沢��ʾ
		new AbstractAdminDialogTest().setVisible(true);
	}
}
��������������������������������
��Ȩ����������ΪCSDN��������ɽ����ԭ�����£���ѭCC 4.0 BY-SA��ȨЭ�飬ת���븽��ԭ�ĳ������Ӽ���������
ԭ�����ӣ�https://blog.csdn.net/weixin_43837863/java/article/details/88804457