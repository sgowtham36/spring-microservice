package com.epharma.logservice.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Table;

import com.datastax.driver.core.DataType;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import lombok.Data;

@Data

@Table(name="log")
public class Log implements Serializable{

    private static final long serialVersionUID = 1L;

    @PrimaryKey
    @CassandraType(type = DataType.Name.UUID)
    private UUID id;

    @Column(name = "ip")
    private String ip;

    @Column(name = "article_id")
    private Long articleId;

    @Column(name = "log_date")
    private LocalDateTime logDate;


}