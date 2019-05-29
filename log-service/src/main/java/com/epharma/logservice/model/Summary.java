package com.epharma.logservice.model;

import java.io.Serializable;

import javax.persistence.Table;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import lombok.Data;

@Data
@Table(name = "summary")
public class Summary implements Serializable{

    private static final long serialVersionUID = 1L;

    @PrimaryKeyColumn(name = "article_id",type = PrimaryKeyType.PARTITIONED)
    private Long articleId;

    @PrimaryKeyColumn(name = "hit_count",ordinal = 0,type = PrimaryKeyType.CLUSTERED,ordering = Ordering.DESCENDING)
    private Long hitCount;
}