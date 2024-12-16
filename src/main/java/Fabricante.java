package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setPais(Pais pais) {
		this.pais=pais;
		
	}
	public Pais getPais() {
		return this.pais;
		
	}
	public static Fabricante fabricaMayorVentas() {
		ArrayList<String> fabricas= new ArrayList<>();
		for(int i = 0;i < Automovil.vehiculos.size();i++) {
			Vehiculo cuenta=Automovil.vehiculos.get(i);
			String str=cuenta.fabricante.getNombre();
			fabricas.add(str);
			
			
			
		}
		String ganador=masRepetido(fabricas);
		for(int i = 0;i < Automovil.vehiculos.size();i++) {
			Vehiculo cuenta2=Automovil.vehiculos.get(i);
			if(cuenta2.fabricante.getNombre()==ganador) {
				Fabricante winer=cuenta2.fabricante;
				return winer;
			}else {
				
			}
		}
	
		return null;
	}
	public static String masRepetido(ArrayList<String> fabricas) {
		String masRepetido = null;
        int maxRepeticiones = 0;
		for (String elemento : fabricas) {
            int repeticiones = 0;
            
            for (String comparar : fabricas) {
                if (elemento.equals(comparar)) {
                    repeticiones++;
                }
            if(repeticiones>maxRepeticiones) {
            	maxRepeticiones=repeticiones;
            	masRepetido=elemento;
            }
            
            
	}
            
}	
		return masRepetido;
	}
	}
