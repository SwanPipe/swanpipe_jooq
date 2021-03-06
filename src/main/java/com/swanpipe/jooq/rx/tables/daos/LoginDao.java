/*
 * This file is generated by jOOQ.
 */
package com.swanpipe.jooq.rx.tables.daos;


import com.swanpipe.jooq.rx.tables.Login;
import com.swanpipe.jooq.rx.tables.records.LoginRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;


import io.reactivex.Single;
import java.util.Optional;
import io.github.jklingsporn.vertx.jooq.rx.reactivepg.ReactiveRXQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LoginDao extends AbstractReactiveVertxDAO<LoginRecord, com.swanpipe.jooq.rx.tables.pojos.Login, String, Single<List<com.swanpipe.jooq.rx.tables.pojos.Login>>, Single<Optional<com.swanpipe.jooq.rx.tables.pojos.Login>>, Single<Integer>, Single<String>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<LoginRecord,com.swanpipe.jooq.rx.tables.pojos.Login,String> {

    /**
     * @param configuration The Configuration used for rendering and query execution.
     * @param vertx the vertx instance
     */
    public LoginDao(Configuration configuration, io.reactiverse.reactivex.pgclient.PgClient delegate) {
        super(Login.LOGIN, com.swanpipe.jooq.rx.tables.pojos.Login.class, new ReactiveRXQueryExecutor<LoginRecord,com.swanpipe.jooq.rx.tables.pojos.Login,String>(configuration,delegate,com.swanpipe.jooq.rx.tables.mappers.RowMappers.getLoginMapper()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.swanpipe.jooq.rx.tables.pojos.Login object) {
        return object.getId();
    }

    /**
     * Find records that have <code>account_id IN (values)</code> asynchronously
     */
    public Single<List<com.swanpipe.jooq.rx.tables.pojos.Login>> findManyByAccountId(List<Integer> values) {
        return findManyByCondition(Login.LOGIN.ACCOUNT_ID.in(values));
    }

    /**
     * Find records that have <code>password IN (values)</code> asynchronously
     */
    public Single<List<com.swanpipe.jooq.rx.tables.pojos.Login>> findManyByPassword(List<String> values) {
        return findManyByCondition(Login.LOGIN.PASSWORD.in(values));
    }

    /**
     * Find records that have <code>enabled IN (values)</code> asynchronously
     */
    public Single<List<com.swanpipe.jooq.rx.tables.pojos.Login>> findManyByEnabled(List<Boolean> values) {
        return findManyByCondition(Login.LOGIN.ENABLED.in(values));
    }

    /**
     * Find records that have <code>created IN (values)</code> asynchronously
     */
    public Single<List<com.swanpipe.jooq.rx.tables.pojos.Login>> findManyByCreated(List<Timestamp> values) {
        return findManyByCondition(Login.LOGIN.CREATED.in(values));
    }

    /**
     * Find records that have <code>last_successful_login IN (values)</code> asynchronously
     */
    public Single<List<com.swanpipe.jooq.rx.tables.pojos.Login>> findManyByLastSuccessfulLogin(List<Timestamp> values) {
        return findManyByCondition(Login.LOGIN.LAST_SUCCESSFUL_LOGIN.in(values));
    }

    /**
     * Find records that have <code>last_failed_login IN (values)</code> asynchronously
     */
    public Single<List<com.swanpipe.jooq.rx.tables.pojos.Login>> findManyByLastFailedLogin(List<Timestamp> values) {
        return findManyByCondition(Login.LOGIN.LAST_FAILED_LOGIN.in(values));
    }

    @Override
    public ReactiveRXQueryExecutor<LoginRecord,com.swanpipe.jooq.rx.tables.pojos.Login,String> queryExecutor(){
        return (ReactiveRXQueryExecutor<LoginRecord,com.swanpipe.jooq.rx.tables.pojos.Login,String>) super.queryExecutor();
    }
}
