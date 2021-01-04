package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jul 06 17:15:45 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblDiscSetupDetailImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        DiscSetupMasterId,
        Name,
        FeeTypeId,
        OrderNo,
        MinPerc,
        MaxPerc,
        MinAmount,
        MaxAmount,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblDiscSetupMaster;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ID = AttributesEnum.Id.index();
    public static final int DISCSETUPMASTERID = AttributesEnum.DiscSetupMasterId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int FEETYPEID = AttributesEnum.FeeTypeId.index();
    public static final int ORDERNO = AttributesEnum.OrderNo.index();
    public static final int MINPERC = AttributesEnum.MinPerc.index();
    public static final int MAXPERC = AttributesEnum.MaxPerc.index();
    public static final int MINAMOUNT = AttributesEnum.MinAmount.index();
    public static final int MAXAMOUNT = AttributesEnum.MaxAmount.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLDISCSETUPMASTER = AttributesEnum.TblDiscSetupMaster.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblDiscSetupDetailImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblDiscSetupDetail");
    }


    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public BigDecimal getId() {
        return (BigDecimal) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(BigDecimal value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for DiscSetupMasterId, using the alias name DiscSetupMasterId.
     * @return the value of DiscSetupMasterId
     */
    public BigDecimal getDiscSetupMasterId() {
        return (BigDecimal) getAttributeInternal(DISCSETUPMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DiscSetupMasterId.
     * @param value value to set the DiscSetupMasterId
     */
    public void setDiscSetupMasterId(BigDecimal value) {
        setAttributeInternal(DISCSETUPMASTERID, value);
    }

    /**
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for FeeTypeId, using the alias name FeeTypeId.
     * @return the value of FeeTypeId
     */
    public BigDecimal getFeeTypeId() {
        return (BigDecimal) getAttributeInternal(FEETYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FeeTypeId.
     * @param value value to set the FeeTypeId
     */
    public void setFeeTypeId(BigDecimal value) {
        setAttributeInternal(FEETYPEID, value);
    }

    /**
     * Gets the attribute value for OrderNo, using the alias name OrderNo.
     * @return the value of OrderNo
     */
    public BigDecimal getOrderNo() {
        return (BigDecimal) getAttributeInternal(ORDERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderNo.
     * @param value value to set the OrderNo
     */
    public void setOrderNo(BigDecimal value) {
        setAttributeInternal(ORDERNO, value);
    }

    /**
     * Gets the attribute value for MinPerc, using the alias name MinPerc.
     * @return the value of MinPerc
     */
    public BigDecimal getMinPerc() {
        return (BigDecimal) getAttributeInternal(MINPERC);
    }

    /**
     * Sets <code>value</code> as the attribute value for MinPerc.
     * @param value value to set the MinPerc
     */
    public void setMinPerc(BigDecimal value) {
        setAttributeInternal(MINPERC, value);
    }

    /**
     * Gets the attribute value for MaxPerc, using the alias name MaxPerc.
     * @return the value of MaxPerc
     */
    public BigDecimal getMaxPerc() {
        return (BigDecimal) getAttributeInternal(MAXPERC);
    }

    /**
     * Sets <code>value</code> as the attribute value for MaxPerc.
     * @param value value to set the MaxPerc
     */
    public void setMaxPerc(BigDecimal value) {
        setAttributeInternal(MAXPERC, value);
    }

    /**
     * Gets the attribute value for MinAmount, using the alias name MinAmount.
     * @return the value of MinAmount
     */
    public BigDecimal getMinAmount() {
        return (BigDecimal) getAttributeInternal(MINAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for MinAmount.
     * @param value value to set the MinAmount
     */
    public void setMinAmount(BigDecimal value) {
        setAttributeInternal(MINAMOUNT, value);
    }

    /**
     * Gets the attribute value for MaxAmount, using the alias name MaxAmount.
     * @return the value of MaxAmount
     */
    public BigDecimal getMaxAmount() {
        return (BigDecimal) getAttributeInternal(MAXAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for MaxAmount.
     * @param value value to set the MaxAmount
     */
    public void setMaxAmount(BigDecimal value) {
        setAttributeInternal(MAXAMOUNT, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedDate.
     * @param value value to set the UpdatedDate
     */
    public void setUpdatedDate(Timestamp value) {
        setAttributeInternal(UPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * @return the associated entity TblDiscSetupMasterImpl.
     */
    public TblDiscSetupMasterImpl getTblDiscSetupMaster() {
        return (TblDiscSetupMasterImpl) getAttributeInternal(TBLDISCSETUPMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity TblDiscSetupMasterImpl.
     */
    public void setTblDiscSetupMaster(TblDiscSetupMasterImpl value) {
        setAttributeInternal(TBLDISCSETUPMASTER, value);
    }


    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
         try {
             loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessRID"));
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         
         if (operation == DML_INSERT) {
             setCreatedBy(loginId);
             setUpdatedBy(loginId);
             } else if(operation == DML_UPDATE) {
             setUpdatedBy(loginId);
         }
        super.doDML(operation, e);
    }
}

