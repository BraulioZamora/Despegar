package comdespegarcurso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

	 
	@Override
	public int compareTo(City o) {
		// TODO Auto-generated method stub
		return 0;
	}
	}


    

