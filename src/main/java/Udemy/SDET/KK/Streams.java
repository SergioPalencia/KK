package Udemy.SDET.KK;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams {
	
	@Test
	public void TC1() {	
	
		// Número de palabrs que empiezan por A
		ArrayList<String> nombres = new ArrayList<String>();
	
		nombres.add("Abhijeet");
		nombres.add("Ram");
		nombres.add("Adam");
		nombres.add("Alekya");
		nombres.add("Don");
		
		List<String> nombres2 = Arrays.asList("Abhijeetxx", "Ramxx", "Adamxx", "Alekyaxx", "Donxx");
		
		long total = nombres.stream().filter(s->s.startsWith("A")).count();
		System.out.println(total);
		
		Stream.of("Abhijeet", "Ram", "Adam", "Alekya", "Don").filter(s->s.startsWith("A")).count();
		
		// Impresion de los elementos de la lista con longitud > 3
		nombres.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		
		// Impresion de los elementos de la lista con longitud > 3, solo primer resultado
		nombres.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println(s));
		
		//Crear nueva lista con los elementos que acaban por 'a' en mayúsculas
		nombres.stream().filter(s->s.endsWith("m")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Crear nueva lista ordenada con los elementos que acaban por 'a' en mayúsculas
		nombres2.stream().filter(s->s.endsWith("m")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		
		// Imprimir por orden el acumulado de 2 streams
		Stream.concat(nombres.stream(), nombres2.stream()).sorted().forEach(s->System.out.println(s));;
		
		// componer un stream entre 2 y comprobar si está el nombre Don
		Assert.assertTrue(Stream.concat(nombres.stream(), nombres2.stream()).anyMatch(s->s.equalsIgnoreCase("Don")));
		
		List<String> listaFiltrada = Stream.of("Abhijeet", "Ram", "Adam", "Alekya", "Don").filter(s->s.startsWith("A")).collect(Collectors.toList());
		System.out.println(listaFiltrada.get(0));
		
		// Imprimir ordenados solo los numeros que aparecen una vez
		List<Integer> numeros = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
		numeros.stream().distinct().sorted().forEach(s->System.out.println(s));
	}
	
}
