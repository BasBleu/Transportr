package com.basbleu.utils

import spock.lang.Specification

class LocationServicesSpec extends Specification{

    def "It should give me lat-long of a address"() {
        given:
          String address = "Kothrud"

        when:
            def result = new LocationServices().convertToLatLong(address)
            println(result)
        then:
         true
    }
}
