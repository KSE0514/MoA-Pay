package com.moa.moapay.domain.card.model.dto;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecomendCardToPayementDto {
    private List<UUID> cardId;
}