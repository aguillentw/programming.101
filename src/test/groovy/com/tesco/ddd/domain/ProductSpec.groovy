package com.tesco.ddd.domain

import spock.lang.Specification

class ProductSpec extends Specification {

    def "should accept a product name to create a Product"() {
        given:
        def inputBrand = "Apple"
        def inputProductName = "iPencil"
        Product applePencilProduct = new Product(inputBrand, inputProductName)

        when:
        def actualProductName = applePencilProduct.getName()

        then:
        actualProductName == inputProductName
    }

    def "should accept a product brand to create a Product"() {
        given:
        def inputBrand = "Apple"
        def inputProductName = "iPencil"
        Product applePencilProduct = new Product(inputBrand, inputProductName)

        when:
        def actualBrand = applePencilProduct.getBrand()

        then:
        actualBrand == inputBrand
    }
}
