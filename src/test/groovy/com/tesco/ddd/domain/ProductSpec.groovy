package com.tesco.ddd.domain

import spock.lang.Specification

class ProductSpec extends Specification {

    def "should accept a product name to create a Product"() {
        given:
        def inputProductName = "Apple iPencil"
        Product applePencilProduct = new Product(inputProductName)

        when:
        def actualProductName = applePencilProduct.getName()

        then:
        actualProductName == inputProductName
    }
}
