package com.example.sample.vo;

import com.example.sample.vo.id.TieRsltPickWcsRID;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode // 필수
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tie_rslt_pick_wcs_r")
@IdClass(TieRsltPickWcsRID.class)
public class TieRsltPickWcsRVO implements Serializable {

    @Id
    private Integer if_no;

    @Id
    @Column(length = 30, nullable = false)
    private String reg_ymd;

    @Column(length = 30, nullable = false)
    private String if_stat;

    @Column(length = 30, nullable = false)
    private String center_cd;

    @Column(length = 30, nullable = false)
    private String ord_no;

    @Column(length = 30, nullable = false)
    private String ord_line_no;

    @Column(length = 30, nullable = false)
    private Integer sku_qty;



}
