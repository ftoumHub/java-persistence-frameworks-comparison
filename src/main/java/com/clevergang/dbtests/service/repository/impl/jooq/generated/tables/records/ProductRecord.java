/**
 * This class is generated by jOOQ
 */
package com.clevergang.dbtests.service.repository.impl.jooq.generated.tables.records;


import com.clevergang.dbtests.service.repository.impl.jooq.generated.tables.Product;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ProductRecord extends UpdatableRecordImpl<ProductRecord> implements Record6<Integer, Integer, String, String, String, BigDecimal> {

	private static final long serialVersionUID = -2045756120;

	/**
	 * Setter for <code>public.product.pid</code>.
	 */
	public void setPid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.product.pid</code>.
	 */
	public Integer getPid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.product.product_category_pid</code>.
	 */
	public void setProductCategoryPid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.product.product_category_pid</code>.
	 */
	public Integer getProductCategoryPid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.product.name</code>.
	 */
	public void setName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.product.name</code>.
	 */
	public String getName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.product.description</code>.
	 */
	public void setDescription(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.product.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.product.row_status</code>.
	 */
	public void setRowStatus(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.product.row_status</code>.
	 */
	public String getRowStatus() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>public.product.price</code>.
	 */
	public void setPrice(BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.product.price</code>.
	 */
	public BigDecimal getPrice() {
		return (BigDecimal) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, String, String, String, BigDecimal> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, String, String, String, BigDecimal> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Product.PRODUCT.PID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Product.PRODUCT.PRODUCT_CATEGORY_PID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Product.PRODUCT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Product.PRODUCT.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Product.PRODUCT.ROW_STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field6() {
		return Product.PRODUCT.PRICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getPid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getProductCategoryPid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getRowStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value6() {
		return getPrice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductRecord value1(Integer value) {
		setPid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductRecord value2(Integer value) {
		setProductCategoryPid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductRecord value3(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductRecord value4(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductRecord value5(String value) {
		setRowStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductRecord value6(BigDecimal value) {
		setPrice(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductRecord values(Integer value1, Integer value2, String value3, String value4, String value5, BigDecimal value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProductRecord
	 */
	public ProductRecord() {
		super(Product.PRODUCT);
	}

	/**
	 * Create a detached, initialised ProductRecord
	 */
	public ProductRecord(Integer pid, Integer productCategoryPid, String name, String description, String rowStatus, BigDecimal price) {
		super(Product.PRODUCT);

		setValue(0, pid);
		setValue(1, productCategoryPid);
		setValue(2, name);
		setValue(3, description);
		setValue(4, rowStatus);
		setValue(5, price);
	}
}