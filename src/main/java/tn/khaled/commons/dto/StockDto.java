package tn.khaled.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StockDto {
    private String adresse;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private List<ArticleDto> articleDtoList;
}
