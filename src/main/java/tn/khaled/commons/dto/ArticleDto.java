package tn.khaled.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDto {
    private String nom;
    private int qte;
    private StockDto stockDto;
    private OrderDto orderDto;
}
