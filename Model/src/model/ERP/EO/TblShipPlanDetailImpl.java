package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jun 25 14:34:11 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblShipPlanDetailImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        ShipPlanMasterId,
        SrNo,
        ItemL4Id,
        UomId,
        Description,
        Qty,
        ShipType,
        ShipDate,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblShipPlanDetailD,
        TblShipPlanMaster;
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
    public static final int SHIPPLANMASTERID = AttributesEnum.ShipPlanMasterId.index();
    public static final int SRNO = AttributesEnum.SrNo.index();
    public static final int ITEML4ID = AttributesEnum.ItemL4Id.index();
    public static final int UOMID = AttributesEnum.UomId.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int QTY = AttributesEnum.Qty.index();
    public static final int SHIPTYPE = AttributesEnum.ShipType.index();
    public static final int SHIPDATE = AttributesEnum.ShipDate.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLSHIPPLANDETAILD = AttributesEnum.TblShipPlanDetailD.index();
    public static final int TBLSHIPPLANMASTER = AttributesEnum.TblShipPlanMaster.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblShipPlanDetailImpl() {
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
     * Gets the attribute value for ShipPlanMasterId, using the alias name ShipPlanMasterId.
     * @return the value of ShipPlanMasterId
     */
    public BigDecimal getShipPlanMasterId() {
        return (BigDecimal) getAttributeInternal(SHIPPLANMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipPlanMasterId.
     * @param value value to set the ShipPlanMasterId
     */
    public void setShipPlanMasterId(BigDecimal value) {
        setAttributeInternal(SHIPPLANMASTERID, value);
    }

    /**
     * Gets the attribute value for SrNo, using the alias name SrNo.
     * @return the value of SrNo
     */
    public Integer getSrNo() {
        return (Integer) getAttributeInternal(SRNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SrNo.
     * @param value value to set the SrNo
     */
    public void setSrNo(Integer value) {
        setAttributeInternal(SRNO, value);
    }

    /**
     * Gets the attribute value for ItemL4Id, using the alias name ItemL4Id.
     * @return the value of ItemL4Id
     */
    public BigDecimal getItemL4Id() {
        return (BigDecimal) getAttributeInternal(ITEML4ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemL4Id.
     * @param value value to set the ItemL4Id
     */
    public void setItemL4Id(BigDecimal value) {
        setAttributeInternal(ITEML4ID, value);
    }

    /**
     * Gets the attribute value for UomId, using the alias name UomId.
     * @return the value of UomId
     */
    public BigDecimal getUomId() {
        return (BigDecimal) getAttributeInternal(UOMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UomId.
     * @param value value to set the UomId
     */
    public void setUomId(BigDecimal value) {
        setAttributeInternal(UOMID, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the value of Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for Qty, using the alias name Qty.
     * @return the value of Qty
     */
    public BigDecimal getQty() {
        return (BigDecimal) getAttributeInternal(QTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Qty.
     * @param value value to set the Qty
     */
    public void setQty(BigDecimal value) {
        setAttributeInternal(QTY, value);
    }

    /**
     * Gets the attribute value for ShipType, using the alias name ShipType.
     * @return the value of ShipType
     */
    public String getShipType() {
        return (String) getAttributeInternal(SHIPTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipType.
     * @param value value to set the ShipType
     */
    public void setShipType(String value) {
        setAttributeInternal(SHIPTYPE, value);
    }

    /**
     * Gets the attribute value for ShipDate, using the alias name ShipDate.
     * @return the value of ShipDate
     */
    public Timestamp getShipDate() {
        return (Timestamp) getAttributeInternal(SHIPDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipDate.
     * @param value value to set the ShipDate
     */
    public void setShipDate(Timestamp value) {
        setAttributeInternal(SHIPDATE, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblShipPlanDetailD() {
        return (RowIterator) getAttributeInternal(TBLSHIPPLANDETAILD);
    }

    /**
     * @return the associated entity TblShipPlanMasterImpl.
     */
    public TblShipPlanMasterImpl getTblShipPlanMaster() {
        return (TblShipPlanMasterImpl) getAttributeInternal(TBLSHIPPLANMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity TblShipPlanMasterImpl.
     */
    public void setTblShipPlanMaster(TblShipPlanMasterImpl value) {
        setAttributeInternal(TBLSHIPPLANMASTER, value);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblShipPlanDetail");
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

