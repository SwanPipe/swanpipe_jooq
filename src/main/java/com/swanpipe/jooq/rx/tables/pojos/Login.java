/*
 * This file is generated by jOOQ.
 */
package com.swanpipe.jooq.rx.tables.pojos;


import com.swanpipe.jooq.rx.tables.interfaces.ILogin;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class Login implements VertxPojo, ILogin {

    private static final long serialVersionUID = 1889123819;

    private String    id;
    private Integer   accountId;
    private String    password;
    private Boolean   enabled;
    private Timestamp lastSuccessfulLogin;
    private Timestamp lastFailedLogin;

    public Login() {}

    public Login(ILogin value) {
        this.id = value.getId();
        this.accountId = value.getAccountId();
        this.password = value.getPassword();
        this.enabled = value.getEnabled();
        this.lastSuccessfulLogin = value.getLastSuccessfulLogin();
        this.lastFailedLogin = value.getLastFailedLogin();
    }

    public Login(
        String    id,
        Integer   accountId,
        String    password,
        Boolean   enabled,
        Timestamp lastSuccessfulLogin,
        Timestamp lastFailedLogin
    ) {
        this.id = id;
        this.accountId = accountId;
        this.password = password;
        this.enabled = enabled;
        this.lastSuccessfulLogin = lastSuccessfulLogin;
        this.lastFailedLogin = lastFailedLogin;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Login setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public Integer getAccountId() {
        return this.accountId;
    }

    @Override
    public Login setAccountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public Login setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public Boolean getEnabled() {
        return this.enabled;
    }

    @Override
    public Login setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public Timestamp getLastSuccessfulLogin() {
        return this.lastSuccessfulLogin;
    }

    @Override
    public Login setLastSuccessfulLogin(Timestamp lastSuccessfulLogin) {
        this.lastSuccessfulLogin = lastSuccessfulLogin;
        return this;
    }

    @Override
    public Timestamp getLastFailedLogin() {
        return this.lastFailedLogin;
    }

    @Override
    public Login setLastFailedLogin(Timestamp lastFailedLogin) {
        this.lastFailedLogin = lastFailedLogin;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Login (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(password);
        sb.append(", ").append(enabled);
        sb.append(", ").append(lastSuccessfulLogin);
        sb.append(", ").append(lastFailedLogin);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ILogin from) {
        setId(from.getId());
        setAccountId(from.getAccountId());
        setPassword(from.getPassword());
        setEnabled(from.getEnabled());
        setLastSuccessfulLogin(from.getLastSuccessfulLogin());
        setLastFailedLogin(from.getLastFailedLogin());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ILogin> E into(E into) {
        into.from(this);
        return into;
    }

    public Login(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}