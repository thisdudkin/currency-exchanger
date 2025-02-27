package edu.raddan.entity;

import edu.raddan.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Table(name = "exchange_rates")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRate extends Entity {

    private Long id;
    private Currency baseCurrency;
    private Currency targetCurrency;
    private BigDecimal rate;

    public ExchangeRate(Currency currency, Currency currency1, BigDecimal rate) {
        this.baseCurrency = currency;
        this.targetCurrency = currency1;
        this.rate = rate;
    }
}
