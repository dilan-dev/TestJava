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
					JOptionPane.QUESTION_MESSAGE, null, new Object [] {"Área Círculo", "Área Triángulo", "Área Cuadrado",}, "    ");
			
			switch (select)
			{
			case 0:
				{
					double radio = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL RADIO DEL CÍRCULO"));
					objOptionPane.MtdCirculo(radio);
					break;
				}
			
			case 1: 
				{
					double base = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LA BASE DEL TRIÁNGULO"));
					double altura = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE LA ALTURA DEL TRIÁNGULO"));
					double lado1 = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL LADO 1 DEL TRIÁNGULO"));
					double lado2 = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL LADP 2 DEL TRIÁNGULO"));
				
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
				selection = JOptionPane.showConfirmDialog(null, "DESEA SEGUIR EJECUTANDO LA APLICACIÓN?", "SELECCIONA UNA OPCIÓN",
				JOptionPane.YES_NO_OPTION);
		}
		System.exit(0); 
	}

}
