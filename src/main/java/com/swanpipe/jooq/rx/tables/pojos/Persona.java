/*
 * This file is generated by jOOQ.
 */
package com.swanpipe.jooq.rx.tables.pojos;


import com.swanpipe.jooq.rx.tables.interfaces.IPersona;

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
public class Persona implements VertxPojo, IPersona {

    private static final long serialVersionUID = 817710526;

    private String    id;
    private Integer   accountId;
    private String    displayName;
    private Timestamp created;

    public Persona() {}

    public Persona(IPersona value) {
        this.id = value.getId();
        this.accountId = value.getAccountId();
        this.displayName = value.getDisplayName();
        this.created = value.getCreated();
    }

    public Persona(
        String    id,
        Integer   accountId,
        String    displayName,
        Timestamp created
    ) {
        this.id = id;
        this.accountId = accountId;
        this.displayName = displayName;
        this.created = created;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Persona setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public Integer getAccountId() {
        return this.accountId;
    }

    @Override
    public Persona setAccountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }

    @Override
    public String getDisplayName() {
        return this.displayName;
    }

    @Override
    public Persona setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @Override
    public Timestamp getCreated() {
        return this.created;
    }

    @Override
    public Persona setCreated(Timestamp created) {
        this.created = created;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Persona (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(displayName);
        sb.append(", ").append(created);

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
    public void from(IPersona from) {
        setId(from.getId());
        setAccountId(from.getAccountId());
        setDisplayName(from.getDisplayName());
        setCreated(from.getCreated());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IPersona> E into(E into) {
        into.from(this);
        return into;
    }

    public Persona(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
