package com.example.sample.vo.id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode // 필수
public class TieRsltPickWcsRID implements Serializable {

    private Integer if_no;
    private String reg_ymd;
}
