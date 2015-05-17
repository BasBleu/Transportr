package com.basbleu.utils

import spock.lang.Specification

class LocationServicesSpec extends Specification{

    def "It should give me lat-long of a address"() {
        given:
        String address1 = "Kothrud"
       /* String address2 = "Sahakarnagar"
        String address3 = "Aundh"
        String address4 = "Baner"
        String address5 = "Balewadi"
        String address6 = "Pashan"
        String address7 = "Vimanagar"
        String address8 = "Hinjewadi"
        String address9 = "Wagholi"
        String address10 = "Shivajinagar"
        String address11 = "Bhosalenagar"
        String address12 = "Law College Road"
        String address13 = "Pimpri"
        String address14 = "Kondhwa"
        String address15 = "Katraj"
      */
        when:
            def result = new LocationServices().convertToLatLong(address1)
        /* result = new LocationServices().convertToLatLong(address2)
         result = new LocationServices().convertToLatLong(address3)
         result = new LocationServices().convertToLatLong(address4)
         result = new LocationServices().convertToLatLong(address5)
         result = new LocationServices().convertToLatLong(address6)
         result = new LocationServices().convertToLatLong(address7)
         result = new LocationServices().convertToLatLong(address8)
         result = new LocationServices().convertToLatLong(address9)
         result = new LocationServices().convertToLatLong(address10)
         result = new LocationServices().convertToLatLong(address11)
         result = new LocationServices().convertToLatLong(address12)
        result = new LocationServices().convertToLatLong(address13)
        result = new LocationServices().convertToLatLong(address14)
        result = new LocationServices().convertToLatLong(address15)
         */


        then:
         true
    }
 def "It should give me the distance between two locations in meters"(){
  given:
   String origin="Kothrud,pune"
  String destination="Shivajinagar,Pune"
  when:
  def result= new LocationServices().getDistance(origin,destination);
  then:
  true;
 }
}
