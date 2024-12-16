package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre=nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public static Pais paisMasVendedor() {
		ArrayList<String> paises= new ArrayList<>();
		for(int i = 0;i < Automovil.vehiculos.size();i++) {
			Vehiculo cuenta=Automovil.vehiculos.get(i);
			String str=cuenta.fabricante.getPais().getNombre();
			paises.add(str);
			
			
			
		}
		String ganador=masRepetido(paises);
		for(int i = 0;i < Automovil.vehiculos.size();i++) {
			Vehiculo cuenta2=Automovil.vehiculos.get(i);
			if(cuenta2.fabricante.getPais().getNombre()==ganador) {
				Pais winer=cuenta2.fabricante.getPais();
				return winer;
			}else {
				
			}
		}
	
		return null;
	}
	public static String masRepetido(ArrayList<String> paises) {
		String masRepetido = null;
        int maxRepeticiones = 0;
		for (String elemento : paises) {
            int repeticiones = 0;
            
            for (String comparar : paises) {
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