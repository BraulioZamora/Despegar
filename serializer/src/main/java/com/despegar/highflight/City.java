package com.despegar.highflight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import au.com.bytecode.opencsv.CSVWriter;

public class City implements Comparable <City>
	{
		static public void main(String[]args) throws IOException{
			City c1 =new City();
			c1.setName ("NYC");
			c1.setPopulation (new Integer (7500000));
			c1.setCountryname("EEUU");
			c1.setArea(2.1);
			c1.setDistanceToBA(2.1);
			City c2 = new City();
			c2.setName ("Paris");
			c2.setPopulation (new Integer (5500000));
			c2.setCountryname("Francia");
			c2.setArea(3.4);
			c2.setDistanceToBA(3.4);
			
			List<City> l = new ArrayList <City>(); 
			l.add(c1);
			l.add(c2);
		    Collections.sort(1);
		    
            for(City city:1){
            	System.out.println(city);
            }
			
			File f = new File("C:/cities.csv");
			Writer w = new FileWriter(f);
			CSVWriter writer = new CSVWriter(w,CSWriter.DEFAULT_SEPARATOR,CSWriter.DEFAULT_QUOTE_CHARACTER,"\c\r");
			for(City city:1){
		    String[] repr = city.toArray();
			writer.writeNext(repr);
			}
			}
		
	   

		private Integer population;
		 private String name;
		 private Double area;
		 private String countryname;
		 private Double distanceToBA;
		 
     public Integer getPopulation() {
			return population;
		}

		public void setPopulation(Integer population) {
			this.population = population;
		}

		public String getName() {
			return name;
		}
		
		public String[] toArray(){
			String[] array = new String[3];
			array[0] = this.name;
			array[1] = String.valueOf(this.population);
			array[2] = String.valueOf(this.area);
			return array;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getArea() {
			return area;
		}

		public void setArea(Double area) {
			this.area = area;
		}

		public String getCountryname() {
			return countryname;
		}

		public void setCountryname(String countryname) {
			this.countryname = countryname;
		}

		public Double getDistanceToBA() {
			return distanceToBA;
		}

		public void setDistanceToBA(Double distanceToBA) {
			this.distanceToBA = distanceToBA;
		}
     
		public int compareTo(City o) {
			// TODO Auto-generated method stub
			return 0;
		}

}


    

