/**
 * This class is generated by jOOQ
 */
package com.clevergang.dbtests.service.repository.impl.jooq.generated.tables;


import com.clevergang.dbtests.service.repository.impl.jooq.generated.Keys;
import com.clevergang.dbtests.service.repository.impl.jooq.generated.Public;
import com.clevergang.dbtests.service.repository.impl.jooq.generated.tables.records.EmployeeRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Employee extends TableImpl<EmployeeRecord> {

	private static final long serialVersionUID = 1707869980;

	/**
	 * The reference instance of <code>public.employee</code>
	 */
	public static final Employee EMPLOYEE = new Employee();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EmployeeRecord> getRecordType() {
		return EmployeeRecord.class;
	}

	/**
	 * The column <code>public.employee.pid</code>.
	 */
	public final TableField<EmployeeRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.employee.company_pid</code>.
	 */
	public final TableField<EmployeeRecord, Integer> COMPANY_PID = createField("company_pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.employee.name</code>.
	 */
	public final TableField<EmployeeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>public.employee.surname</code>.
	 */
	public final TableField<EmployeeRecord, String> SURNAME = createField("surname", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>public.employee.mail</code>.
	 */
	public final TableField<EmployeeRecord, String> MAIL = createField("mail", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>public.employee.salary</code>.
	 */
	public final TableField<EmployeeRecord, BigDecimal> SALARY = createField("salary", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2), this, "");

	/**
	 * Create a <code>public.employee</code> table reference
	 */
	public Employee() {
		this("employee", null);
	}

	/**
	 * Create an aliased <code>public.employee</code> table reference
	 */
	public Employee(String alias) {
		this(alias, EMPLOYEE);
	}

	private Employee(String alias, Table<EmployeeRecord> aliased) {
		this(alias, aliased, null);
	}

	private Employee(String alias, Table<EmployeeRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<EmployeeRecord, Integer> getIdentity() {
		return Keys.IDENTITY_EMPLOYEE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<EmployeeRecord> getPrimaryKey() {
		return Keys.EMPLOYEE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<EmployeeRecord>> getKeys() {
		return Arrays.<UniqueKey<EmployeeRecord>>asList(Keys.EMPLOYEE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<EmployeeRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<EmployeeRecord, ?>>asList(Keys.EMPLOYEE__EMPLOYEE_COMPANY_PID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Employee as(String alias) {
		return new Employee(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Employee rename(String name) {
		return new Employee(name, null);
	}
}