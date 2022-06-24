package com.tesco.ddd.domain

import spock.lang.Specification
import spock.lang.Unroll

class PriceSpec extends Specification {

    def "should display amount and currency as per inputs"() {
        given:
        def inputAmount = 10
        def inputCurrency = "USD"
        Price myPrice = new Price(inputCurrency, inputAmount)

        when:
        def actualAmount = myPrice.getAmount()
        def actualCurrency = myPrice.getCurrency()
        def actualToString = myPrice.toString()

        then:
        actualAmount == inputAmount
        actualCurrency == inputCurrency
        actualToString == "Price{" + inputAmount + " " + inputCurrency + "}"
    }

    def "should return the discounted price for a given percentage"(Float discount, Float expectedPrice) {
        given:
        def inputAmount = 100
        def priceUnderTest = new Price("EUR", inputAmount)

        expect:
        priceUnderTest.getDiscountedPrice(discount) == expectedPrice

        where:
        discount          | expectedPrice
        Float.valueOf(50) | Float.valueOf(50)
        Float.valueOf(25) | Float.valueOf(75)
        Float.valueOf(75) | Float.valueOf(25)
    }

    @Unroll
    def "should return #expectedPrice for #discount"() {
        given:
        def inputAmount = 100
        def priceUnderTest = new Price("EUR", inputAmount)

        expect:
        priceUnderTest.getDiscountedPrice(discount) == expectedPrice

        where:
        discount            | expectedPrice
        Float.valueOf("50") | Float.valueOf("50")
        Float.valueOf("25") | Float.valueOf("75")
        Float.valueOf("75") | Float.valueOf("25")
    }
}
