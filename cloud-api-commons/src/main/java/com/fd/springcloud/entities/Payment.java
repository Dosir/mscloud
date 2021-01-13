package com.fd.springcloud.entities;

import lombok.Data;

import java.io.Serializable;

@Data
public class Payment implements Serializable{
    private static final long serialVersionUID = -3959808611929470109L;

    private Long id;

    private String serial;
}
