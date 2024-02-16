package com.example.test.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DefaultSearchParam {

    @NotBlank
    protected int pageNum;

    @NotBlank
    protected int rowNum;

    protected String searchWord;

    private int getPageNum() {
        return pageNum * rowNum;
    }

}
