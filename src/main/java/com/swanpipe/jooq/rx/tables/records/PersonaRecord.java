/*
 * This file is generated by jOOQ.
 */
package com.swanpipe.jooq.rx.tables.records;


import com.swanpipe.jooq.rx.tables.Persona;
import com.swanpipe.jooq.rx.tables.interfaces.IPersona;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PersonaRecord extends UpdatableRecordImpl<PersonaRecord> implements VertxPojo, Record3<String, Integer, String>, IPersona {

    private static final long serialVersionUID = -1043718876;

    /**
     * Setter for <code>public.persona.id</code>.
     */
    @Override
    public PersonaRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.persona.id</code>.
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.persona.account_id</code>.
     */
    @Override
    public PersonaRecord setAccountId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.persona.account_id</code>.
     */
    @Override
    public Integer getAccountId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.persona.display_name</code>.
     */
    @Override
    public PersonaRecord setDisplayName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.persona.display_name</code>.
     */
    @Override
    public String getDisplayName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Persona.PERSONA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Persona.PERSONA.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Persona.PERSONA.DISPLAY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDisplayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDisplayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonaRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonaRecord value2(Integer value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonaRecord value3(String value) {
        setDisplayName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonaRecord values(String value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IPersona> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PersonaRecord
     */
    public PersonaRecord() {
        super(Persona.PERSONA);
    }

    /**
     * Create a detached, initialised PersonaRecord
     */
    public PersonaRecord(String id, Integer accountId, String displayName) {
        super(Persona.PERSONA);

        set(0, id);
        set(1, accountId);
        set(2, displayName);
    }

    public PersonaRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}