package com.example.OpenFeign.entity;

import com.example.OpenFeign.entity.Cashi;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mgni {

    private String id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime time;
    private String type;
    private String cmNo;
    private String kacType;
    private String bankNo;
    private String ccy;
    private String pvType;
    private String bicaccNo;
    private String iTYPE;
    private String pReason;
    private BigDecimal amt;
    private String ctName;
    private String ctTel;
    private String status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime uTime;
    private List<Cashi> cashiList;
}
