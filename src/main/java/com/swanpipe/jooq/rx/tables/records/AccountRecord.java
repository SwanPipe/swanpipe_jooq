/*
 * This file is generated by jOOQ.
 */
package com.swanpipe.jooq.rx.tables.records;


import com.swanpipe.jooq.rx.tables.Account;
import com.swanpipe.jooq.rx.tables.interfaces.IAccount;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AccountRecord extends UpdatableRecordImpl<AccountRecord> implements VertxPojo, Record2<Integer, Boolean>, IAccount {

    private static final long serialVersionUID = 2113047536;

    /**
     * Setter for <code>public.account.id</code>.
     */
    @Override
    public AccountRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.account.id</code>.
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.account.enabled</code>.
     */
    @Override
    public AccountRecord setEnabled(Boolean value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.account.enabled</code>.
     */
    @Override
    public Boolean getEnabled() {
        return (Boolean) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Boolean> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Boolean> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Account.ACCOUNT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return Account.ACCOUNT.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component2() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord value2(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountRecord values(Integer value1, Boolean value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IAccount from) {
        setId(from.getId());
        setEnabled(from.getEnabled());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IAccount> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountRecord
     */
    public AccountRecord() {
        super(Account.ACCOUNT);
    }

    /**
     * Create a detached, initialised AccountRecord
     */
    public AccountRecord(Integer id, Boolean enabled) {
        super(Account.ACCOUNT);

        set(0, id);
        set(1, enabled);
    }

    public AccountRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
