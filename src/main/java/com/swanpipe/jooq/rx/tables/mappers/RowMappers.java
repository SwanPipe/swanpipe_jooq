package com.swanpipe.jooq.rx.tables.mappers;

import io.reactiverse.pgclient.Row;
import java.util.function.Function;

public class RowMappers {

    private RowMappers(){}

    public static Function<Row,com.swanpipe.jooq.rx.tables.pojos.Account> getAccountMapper() {
        return row -> {
            com.swanpipe.jooq.rx.tables.pojos.Account pojo = new com.swanpipe.jooq.rx.tables.pojos.Account();
            pojo.setId(row.getInteger("id"));
            pojo.setEnabled(row.getBoolean("enabled"));
            return pojo;
        };
    }

    public static Function<Row,com.swanpipe.jooq.rx.tables.pojos.FlywaySchemaHistory> getFlywaySchemaHistoryMapper() {
        return row -> {
            com.swanpipe.jooq.rx.tables.pojos.FlywaySchemaHistory pojo = new com.swanpipe.jooq.rx.tables.pojos.FlywaySchemaHistory();
            pojo.setInstalledRank(row.getInteger("installed_rank"));
            pojo.setVersion(row.getString("version"));
            pojo.setDescription(row.getString("description"));
            pojo.setType(row.getString("type"));
            pojo.setScript(row.getString("script"));
            pojo.setChecksum(row.getInteger("checksum"));
            pojo.setInstalledBy(row.getString("installed_by"));
            // Omitting unrecognized type DataType [ t=timestamp without time zone; p=0; s=0; u="pg_catalog"."timestamp"; j=null ] (java.sql.Timestamp) for column installed_on!
            pojo.setExecutionTime(row.getInteger("execution_time"));
            pojo.setSuccess(row.getBoolean("success"));
            return pojo;
        };
    }

    public static Function<Row,com.swanpipe.jooq.rx.tables.pojos.Login> getLoginMapper() {
        return row -> {
            com.swanpipe.jooq.rx.tables.pojos.Login pojo = new com.swanpipe.jooq.rx.tables.pojos.Login();
            pojo.setId(row.getString("id"));
            pojo.setAccountId(row.getInteger("account_id"));
            pojo.setPassword(row.getString("password"));
            pojo.setEnabled(row.getBoolean("enabled"));
            // Omitting unrecognized type DataType [ t=timestamp without time zone; p=0; s=0; u="pg_catalog"."timestamp"; j=null ] (java.sql.Timestamp) for column last_successful_login!
            // Omitting unrecognized type DataType [ t=timestamp without time zone; p=0; s=0; u="pg_catalog"."timestamp"; j=null ] (java.sql.Timestamp) for column last_failed_login!
            return pojo;
        };
    }

    public static Function<Row,com.swanpipe.jooq.rx.tables.pojos.Persona> getPersonaMapper() {
        return row -> {
            com.swanpipe.jooq.rx.tables.pojos.Persona pojo = new com.swanpipe.jooq.rx.tables.pojos.Persona();
            pojo.setId(row.getString("id"));
            pojo.setAccountId(row.getInteger("account_id"));
            pojo.setDisplayName(row.getString("display_name"));
            return pojo;
        };
    }

}
