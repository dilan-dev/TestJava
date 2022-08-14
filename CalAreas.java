package Areas3;
import javax.swing.JOptionPane;

public class CalAreas 
{
	
	public void MtdCirculo(double radio)
	{
		double areaCirculo = Math.PI*Math.pow(radio, 2);
		
		double finalArea = Math.round(areaCirculo * 100.0 / 100.0);
		
		JOptionPane.showMessageDialog(null, "El área del circulo es: "+finalArea, "AREA C", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public void MtdTriangulo(double base, double altura, double lado1, double lado2)
	{
		double areaTriangulo = (base * altura)/2;
		

			if (base != lado1 & base !=lado2 & lado1 != lado2)
			{
				JOptionPane.showMessageDialog(null, "El área del triángulo es: "+areaTriangulo + "y es Escaleno", "AREA T", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(base == lado1 & base == lado2)
			{
				JOptionPane.showMessageDialog(null, "El área del triángulo es: "+areaTriangulo+ "y es Equilatero", "AREA T", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(base == lado1 || base == lado2 || lado1 == lado2)
			{
				JOptionPane.showMessageDialog(null, "El área del triángulo es: "+areaTriangulo +"y es Isósceles", "AREA T", JOptionPane.INFORMATION_MESSAGE);
			}
	}
	
	public void MtdCuadrado(double lado)
	{
		double areaCuadrado = Math.pow(lado, 2);
		JOptionPane.showMessageDialog(null, "El área del circulo es: "+areaCuadrado, "AREA CUADRADO", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
