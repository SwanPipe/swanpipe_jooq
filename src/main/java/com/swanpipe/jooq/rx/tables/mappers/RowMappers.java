package com.swanpipe.jooq.rx.tables.mappers;

import io.reactiverse.pgclient.Row;

import java.sql.Timestamp;
import java.util.function.Function;

public class RowMappers {

    private RowMappers(){}

    public static Function<Row,com.swanpipe.jooq.rx.tables.pojos.Account> getAccountMapper() {
        return row -> {
            com.swanpipe.jooq.rx.tables.pojos.Account pojo = new com.swanpipe.jooq.rx.tables.pojos.Account();
            pojo.setId(row.getInteger("id"));
            pojo.setEnabled(row.getBoolean("enabled"));
            pojo.setCreated(Timestamp.from(row.getOffsetDateTime( "created" ).toInstant()));
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
            pojo.setInstalledOn(Timestamp.from(row.getOffsetDateTime("installed_on").toInstant()));
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
            pojo.setCreated(Timestamp.from(row.getOffsetDateTime( "created" ).toInstant()));
            pojo.setLastSuccessfulLogin(Timestamp.from(row.getOffsetDateTime("last_successful_login").toInstant()));
            pojo.setLastFailedLogin(Timestamp.from(row.getOffsetDateTime("last_failed_login").toInstant()));
            return pojo;
        };
    }

    public static Function<Row,com.swanpipe.jooq.rx.tables.pojos.Persona> getPersonaMapper() {
        return row -> {
            com.swanpipe.jooq.rx.tables.pojos.Persona pojo = new com.swanpipe.jooq.rx.tables.pojos.Persona();
            pojo.setId(row.getString("id"));
            pojo.setAccountId(row.getInteger("account_id"));
            pojo.setDisplayName(row.getString("display_name"));
            pojo.setCreated(Timestamp.from(row.getOffsetDateTime( "created" ).toInstant()));
            return pojo;
        };
    }

}
