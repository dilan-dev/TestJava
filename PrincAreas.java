package Areas3;
import javax.swing.JOptionPane;

public class PrincAreas 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		CalAreas objOptionPane = new CalAreas();
		
		int selection = JOptionPane.showConfirmDialog(null, "DESEA EJECUTAR LA APLICACION?", "SELECCIONA UNA OPCION: ",
				JOptionPane.YES_NO_OPTION);
		
		while (selection == 0)
		{
			int select = JOptionPane.showOptionDialog(null, "SELECCIONA UNA OPCION", "SELECTOR DE OPCIONES", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, new Object [] {"�rea C�rculo", "�rea Tri�ngulo", "�rea Cuadrado",}, "    ");
			
			switch (select)
			{
			case 0:
				{
					double radio = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL RADIO DEL C�RCULO"));
					objOptionPane.MtdCirculo(radio);
					break;
				}
			
			case 1: 
				{
					double base = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LA BASE DEL TRI�NGULO"));
					double altura = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LA ALTURA DEL TRI�NGULO"));
					double lado1 = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL LADO 1 DEL TRI�NGULO"));
					double lado2 = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL LADP 2 DEL TRI�NGULO"));
				
					objOptionPane.MtdTriangulo(base, altura, lado1, lado2);
					break;
				}
			
			case 2: 
				{
					double lado = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL LADO DEL CUADRADO"));
					objOptionPane.MtdCuadrado(lado);
					break;
				}
			
			}	
				selection = JOptionPane.showConfirmDialog(null, "DESEA SEGUIR EJECUTANDO LA APLICACI�N?", "SELECCIONA UNA OPCI�N",
				JOptionPane.YES_NO_OPTION);
		}
		System.exit(0); 
	}

}
